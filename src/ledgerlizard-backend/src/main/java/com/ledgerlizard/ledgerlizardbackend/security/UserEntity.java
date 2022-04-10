package com.ledgerlizard.ledgerlizardbackend.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "user", schema = "identity", catalog = "ledgerlizard")
public class UserEntity implements UserDetails {
    private int userId;
    private String username;
    //TODO: Hash, salt, secure etc. - right now just plaintext in DB
    private String password;

    @Id
    @Column(name = "user_id")
    public int getUserId() { return userId; }

    public void setUserId(int userId) { this.userId = userId; }

    @Basic
    @Column(name = "username")
    public String getUsername() { return username; }

    @Override
    @Transient
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    @Transient
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    @Transient
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) { this.username = username; } //Might need to check unique here or set a key in the database.

    @Override
    @Transient
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

    @Basic
    @Column(name = "password")
    public String getPassword() { return password; } //Should this even be a method? Almost certainly not, right?

    public void setPassword(String password) {this.password = password; }
}
