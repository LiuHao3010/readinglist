package com;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Collection;
//@Entity
public class User  implements UserDetails {
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getPassword(){
        return passwd;
    }
    private String username;
    private String passwd;
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return Arrays.asList(new SimpleGrantedAuthority("Admin"));
    }
    public String getUsername(){
        return username;
    }
    @Override
    public boolean isAccountNonExpired(){
        return true;
    }
    public boolean isAccountNonLocked(){
        return true;
    }
    public boolean isCredentialsNonExpired(){
        return true;
    }
    public boolean isEnabled() {
        return true;
    }
}
