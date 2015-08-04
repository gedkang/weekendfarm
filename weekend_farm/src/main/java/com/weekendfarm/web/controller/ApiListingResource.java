package com.weekendfarm.web.controller;

import com.wordnik.swagger.annotations.*;
import com.wordnik.swagger.jaxrs.JavaApiListing;

import javax.ws.rs.*;

@Path("/resources.json")
@Api("/resources")
@Produces({"application/json"})
public class ApiListingResource extends JavaApiListing {}
