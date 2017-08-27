package com.shenzhang.springboot.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * User: Zhang Shen
 * Date: 2/8/17
 * Time: 3:36 PM.
 */

@Aspect
@Component
public class PerformanceLogAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceLogAspect.class);

    @Around("@annotation(com.shenzhang.springboot.annotation.PerformanceLog)")
    public Object logPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        Object value = joinPoint.proceed();

        LOGGER.info("{} has been invoked", joinPoint.getSignature().getName());

        return value;
    }
}
