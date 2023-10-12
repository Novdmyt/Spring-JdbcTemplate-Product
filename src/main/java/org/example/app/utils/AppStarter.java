package org.example.app.utils;

import org.example.app.conf.AppConfig;
import org.example.app.controller.ProductControllerImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppStarter {
    public static void startApp() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        ProductControllerImpl productControllerController = context.getBean(ProductControllerImpl.class);
        productControllerController.getOption();

        context.close();
    }
}
