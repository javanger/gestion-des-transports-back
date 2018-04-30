/**
 * 
 */
package dev.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Axel B.
 *
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/connexion").permitAll();

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception

	{
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder)
				.usersByUsernameQuery(
						"SELECT NOM_UTILISATEUR, MOT_DE_PASSE, EST_ACTIF from UTILISATEUR where NOM_UTILISATEUR=?")
				.authoritiesByUsernameQuery("select NOM_UTILISATEUR,ROLE from UTILISATEUR where NOM_UTILISATEUR = ?");
	}

}
