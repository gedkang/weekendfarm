/**
 * 
 */
package com.weekendfarm.domain;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * @author scall1st
 *
 */
@JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7544504143728173035L;
	
	private String name;
    private String username;

    public User(){}

    public User(String name, String username) {
        this.username = username;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
