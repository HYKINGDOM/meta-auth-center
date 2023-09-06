package com.java.meta.auth.adapter.controller;

import com.java.meta.auth.adapter.common.base.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kscs
 */
@RestController
@RequestMapping("/login")
public class LoginController {


    @PostMapping("/update")
    public Result<?> updateTitle() {
        return Result.success();
    }
}
