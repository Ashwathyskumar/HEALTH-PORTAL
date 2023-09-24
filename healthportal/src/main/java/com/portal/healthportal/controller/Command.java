package com.portal.healthportal.controller;

import org.springframework.web.servlet.ModelAndView;

public interface Command {
    void execute(ModelAndView m, int prescription_id);
}
