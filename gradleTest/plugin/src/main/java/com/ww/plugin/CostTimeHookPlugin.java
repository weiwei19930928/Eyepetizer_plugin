package com.ww.plugin;

import com.android.build.gradle.AppExtension;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CostTimeHookPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("apply");

        project.getExtensions().create("testParams", TestBean.class);//使用自己的配置
//        project.getExtensions().create("android", AppExtension.class);//系统是这么配置的  android{} 就是他的自定义bean
        TestBean params = project.getExtensions().getByType(TestBean.class);
//        project.getExtensions().getByName("android")


        project.afterEvaluate(new Action<Project>() {
            @Override
            public void execute(Project project) {
                System.out.println("gradle cancel 哈哈");
                System.out.println("TestBean =  name:" + params.name + "----age:" + params.age);

            }
        });
    }

}