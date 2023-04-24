package com.spring;

import com.spring.annotation.ComponentScan;

import java.lang.annotation.Annotation;

public class ApexApplicationContext {

    private Class configClass;

    public ApexApplicationContext(Class configClass) {
        this.configClass = configClass;
        // 解析配置类，获取路径，扫描

        ComponentScan componentScanAnnotation = (ComponentScan) configClass.getAnnotation(ComponentScan.class);
        String path = componentScanAnnotation.value();// 扫描路径

        // 扫描


    }

    public Object getBean(String name) {
        return null;
    }
}
