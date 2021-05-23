/*
 * Copyright (C) Lowe's Companies, Inc. All rights reserved.
 * This file is for internal use only at Lowe's Companies, Inc.
 */

package com.spring.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author msharan
 */
@RestController
@RequestMapping(path = "/api")
public class TestController {

    @GetMapping(path = "/test")
    public String testDefaultSecurity() {
        return "test successful";
    }
}
