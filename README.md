# Makitoo android with flavors example

## Introduction
Makitoo is a technology for monitoring Android applications in production. It allows you to :
- Remotely monitor your application. Each exception at runtime is automatically monitored in the Makitoo dashboard.
- Diagnostic all your bugs with automatically collected information.
- Fix some bugs at runtime with hot patching, without recompiling and re-deploing your application.

This repository is an example Android built with gradle. This app has one single screen with two buttons, we inserted on purpose a bug causing a crash in the "back-up notes" button.

## Usage

First, you should create a Makitoo account : <https://dashboard.makitoo.com/>

When you are successfully logged in, you can create an application, it gives you get an ID and TOKEN of your application.

Then, edit file `app/src/main/java/com/github/flavors/sample/application/MyApplication.java` to insert your application id and token in onCreate() method as follows.

    com.makitoo.MakitooAndroid.init(this,
      "https://dashboard.makitoo.com/rest",
      "APPLICATION_ID",
      "TOKEN");


## Execution

You can install two flavors for this project with :
`$ ./gradlew clean installLinuxDebug

`$ ./gradlew clean installWindowsDebug