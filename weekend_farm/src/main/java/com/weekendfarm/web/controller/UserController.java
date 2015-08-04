/**
 * 
 */
package com.weekendfarm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weekendfarm.exception.UnknownResourceException;
import com.weekendfarm.domain.User;

/**
 * @author scall1st
 *
 */
@Controller
@RequestMapping("/users")
public class UserController {

	@RequestMapping(value = "/{username}", method=RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable String username) {
        return findUser(username);
    }

    /**
     * Simulates a Manager or DAO lookup for a stored user account.
     *
     * @param username the username for the user to lookup.  Supports only 'jsmith' and 'djones' for testing.
     * @return the associated user
     * @throws UnknownResourceException if there is no user with the specified username.
     */
    private User findUser(String username) throws UnknownResourceException {
        if (!StringUtils.hasText(username)) {
            throw new IllegalArgumentException("Username is required.");
        }

        if ("jsmith".equals(username)) {
            return new User("Jane Smith", username);
        }
        if ("djones".equals(username)) {
            return new User("Don Jones", null);
        }

        throw new UnknownResourceException("Unable to find user with username '" + username + "'");
    }
}
