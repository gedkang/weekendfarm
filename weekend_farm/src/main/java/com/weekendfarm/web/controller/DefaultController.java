/**
 * 
 */
package com.weekendfarm.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weekendfarm.exception.UnknownResourceException;

/**
 * @author scall1st
 *
 */
@Controller("defaultController")
public class DefaultController {
	
	@RequestMapping("/**")
    public void unmappedRequest(HttpServletRequest request) {
        String uri = request.getRequestURI();
        throw new UnknownResourceException("There is no resource for path " + uri);
    }
}
