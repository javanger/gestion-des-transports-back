/**
 * 
 */
package dev.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Axel B.
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				// .antMatchers("/collaborateur/**")
				// .access("hasRole('ROLE_COLLABORATEUR') and
				// hasRole('ROLE_ADMIN')").antMatchers("/admin/**")
				// .hasRole("ADMINISTRATEUR").antMatchers("/chauffeur/**")
				// .access("hasRole('ROLE_CHAUFFEUR') and
				// hasRole('ROLE_ADMIN')")
				.anyRequest().authenticated().and().formLogin().permitAll();

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception

	{
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select c.email, c.mot_de_passe , 'true' from collaborateur c where c.email=?")
				.authoritiesByUsernameQuery(
						"select ch.email,ch.mot_de_passe, 'true' from chauffeur ch  where ch.email=?");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
