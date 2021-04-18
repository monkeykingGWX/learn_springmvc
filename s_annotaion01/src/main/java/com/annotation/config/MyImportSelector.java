package com.annotation.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-18 19:29
 */


public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.third.controller.Apple", "com.third.controller.Banana"};
    }
}
