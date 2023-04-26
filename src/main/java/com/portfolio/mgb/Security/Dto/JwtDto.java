/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mgb.Security.Dto;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author Usuario
 */
public class JwtDto {

    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authotities;

    //CONSTRUCTOR
    
    public JwtDto(String token, String nombreUsuario, Collection<? extends GrantedAuthority> authotities) {
        this.token = token;
        this.nombreUsuario = nombreUsuario;
        this.authotities = authotities;        
    }
    
    //GETTERS AND SETTERS
    
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authotities;
    }

    public void setAuthotities(Collection<? extends GrantedAuthority>  authotities) {
        this.authotities = authotities;
    }
}
