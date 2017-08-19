package com.github.shenzhang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * User: Zhang Shen
 * Date: 05/08/2017
 * Time: 10:07 AM.
 */
@RestController
@RequestMapping("/async")
public class AsyncController {
    private static Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);

    private volatile DeferredResult<String> lastDeferredResult;

    @GetMapping("/pull")
    public DeferredResult<String> pull() {
        DeferredResult<String> result = new DeferredResult<>();
        this.lastDeferredResult = result;
        LOGGER.info("Main thread will exit");
        return result;
    }

    @GetMapping("/release")
    public void release() {
        if (this.lastDeferredResult != null) {
            lastDeferredResult.setResult("hello");
        }
    }
}
