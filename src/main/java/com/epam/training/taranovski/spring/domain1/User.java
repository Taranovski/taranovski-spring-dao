/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.taranovski.spring.domain1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alyx
 */
@Entity
@Table(name = "User", catalog = "", schema = "C##TARANOVSKI_USER")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByLogin", query = "SELECT u FROM User u WHERE u.login = :login"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByType", query = "SELECT u FROM User u WHERE u.type = :type"),
    @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId"),
    @NamedQuery(name = "User.findByTypeId", query = "SELECT u FROM User u WHERE u.typeId = :typeId")})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 25)
    @Column(name = "login")
    private String login;
    @Size(max = 25)
    @Column(name = "password")
    private String password;
    @Size(max = 25)
    @Column(name = "type")
    private String type;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "userId")
    private BigDecimal userId;
    @Column(name = "typeId")
    private BigInteger typeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Employer> employerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Employee> employeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Admin> adminCollection;

    public User() {
    }

    public User(BigDecimal userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigInteger getTypeId() {
        return typeId;
    }

    public void setTypeId(BigInteger typeId) {
        this.typeId = typeId;
    }

    public Collection<Employer> getEmployerCollection() {
        return employerCollection;
    }

    public void setEmployerCollection(Collection<Employer> employerCollection) {
        this.employerCollection = employerCollection;
    }

    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public Collection<Admin> getAdminCollection() {
        return adminCollection;
    }

    public void setAdminCollection(Collection<Admin> adminCollection) {
        this.adminCollection = adminCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.epam.training.taranovski.spring.domain1.User[ userId=" + userId + " ]";
    }
    
}
