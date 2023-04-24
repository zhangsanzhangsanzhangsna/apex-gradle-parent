package org.example;

import com.spring.ApexApplicationContext;

public class Test {

    private void run () {
        ApexApplicationContext apexApplicationContext = new ApexApplicationContext(AppConfig.class);
        Object userService = apexApplicationContext.getBean("userService");
    }
}
