# AOP4Permission
面向切面编程之动态赋予权限

## 介绍
在android项目中我们有很多这样的需求，在很多地方要去判断一些有无登录的操作，比方说点击个人中心。在淘宝中点击购物车，如果没有登录，我们需要先跳转，到登录页面去登录。
又比方说，有些地方，我们需要做一些网络的判断。这样，很多地方都需要写很多的if else；或者是某个按钮点击需要先申请权限赋予，这些都是用频比较高的但是单独去写有比较耗时，
因此，这里在学完享学Leo老师的用切面解决动态权限赋予一课，也写个demo，巩固学习。包括平时开发涉及到这块功能都会及时更新

————————————————

### AspectJ框架项目配置

先在app  build.gradle  引入 AspectJ

``` java
    implementation 'org.aspectj:aspectjrt:1.8.9'
```

 在项目的build.gradle中进行配置

 ``` java
 buildscript {

     repositories {
         google()
         jcenter()
     }
     dependencies {
         classpath 'com.android.tools.build:gradle:3.1.1'
         classpath 'com.hujiang.aspectjx:gradle-android-plugin-aspectjx:2.0.5'

         // NOTE: Do not place your application dependencies here; they belong
         // in the individual module build.gradle files
     }
 }

 allprojects {
     repositories {
         google()
         jcenter()
     }
 }

 task clean(type: Delete) {
     delete rootProject.buildDir
 }

 ```

