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
@RequestMapping(path = "/unsecure")
public class NoSecurityController {

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }
}
