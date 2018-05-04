/**
 * 
 */
package dev.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Axel B.
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = false)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

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
				.anyRequest().permitAll();

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception

	{
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("SELECT EMAIL, MOT_DE_PASSE, 'true' FROM COLLABORATEUR WHERE EMAIL=?")
				.authoritiesByUsernameQuery(
						"SELECT EMAIL, MOT_DE_PASSE,ADMINISTRATEUR FROM COLLABORATEUR WHERE EMAIL=?");
	}

}
