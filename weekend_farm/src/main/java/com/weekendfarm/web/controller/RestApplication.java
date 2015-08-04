package com.weekendfarm.web.controller;

import com.sun.jersey.api.core.PackagesResourceConfig;

public class RestApplication extends PackagesResourceConfig {
  public RestApplication() {
    super("com.weekendfarm.web.controller");
  }
}