# Multi Module Spring Boot Project Demo

## Description:
This project illustrates a small demo for a Spring Boot multi-module project using Gradle.   
It includes two modules: lib and app. The lib module has one service in it. The app module has a controller and a Spring Boot app.   
This is to illustrate that you can separate your services and your controllers into different modules; the same applies for entities and repositories as well.

## To run the project:
    $ ./gradlew build && ./gradlew :app:bootRun
