/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import service.aut.Utilisateur_Type;

/**
 *
 * @author phuong
 */
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
 
    @Override
    public Authentication authenticate(Authentication a) throws AuthenticationException {
        String name = a.getName();
        String password = a.getCredentials().toString();
        if(seConnecter(name, password)!=null){
            List<GrantedAuthority> grantedAuths = new ArrayList<>();
            List<Object> roles = listerRoles(name);
            roles.forEach(role -> grantedAuths.add(new SimpleGrantedAuthority((String)role)));
            Authentication auth = new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
            return auth;
        } else {
            return null;
        }
    }
 
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    private static Utilisateur_Type seConnecter(java.lang.String username, java.lang.String mdp) {
        service.aut.Utilisateur_Service service = new service.aut.Utilisateur_Service();
        service.aut.Utilisateur port = service.getUtilisateurPort();
        return port.seConnecter(username, mdp);
    }

    private static java.util.List<java.lang.Object> listerRoles(java.lang.String username) {
        service.aut.Utilisateur_Service service = new service.aut.Utilisateur_Service();
        service.aut.Utilisateur port = service.getUtilisateurPort();
        return port.listerRoles(username);
    }    
}
