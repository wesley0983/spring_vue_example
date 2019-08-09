package com.example.demo.security;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomProvider implements AuthenticationProvider {

    private Logger logger = LoggerFactory.getLogger(CustomProvider.class);

    PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

//    @Autowired
//    IManagerRepository managerRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String account = authentication.getPrincipal().toString();
        String password = authentication.getCredentials().toString();

//        Manager manager = managerRepository.getManagerByAccount(account);

//        if(password == null || !encoder.matches(password,manager.getPassword())){
//            logger.info(String.format("manager %s Not found ", password));
//            throw new AuthenticationServiceException(String.format("login fail account = %s ", password));
//        }

        List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority(""));
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(account, password, grantedAuths);
        return token;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(
                UsernamePasswordAuthenticationToken.class);
    }

}
