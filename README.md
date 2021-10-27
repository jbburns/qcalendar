# F3 Nation Q Calendar


## Building
You will need a distribution of the JVM for Java 11+.  I use [SDK Man](https://sdkman.io/) to help.

It shouldn't really matter which distribution you pick, but I use Amazon Corretto 11.0.12.7.1.
You can install it using `sdk install java 11.0.12.7.1-amzn`

Once you clone the repo, cd into it and run 
`./gradlew bootRun` or `gradlew.bat bootRun` if using Windows.

This is going to do a couple of things:
1) Download all the Java dependencies
2) Build all the Java code
3) Start the application

Once it is started, you can navigate to http://localhost:8080/swagger-ui.html and start playing around.

## Front End API CodeGen
The Java backend exposes an OpenAPI API document which describes the API.  This is what powers the Swagger UI.
This JSON document can also be used to generate client code.  In order to do that, there are two steps:
1) Run `gradlew generateOpenApiDocs`.  This is a special gradle task which will spin up the app and export the Open API spec
2) Run `gradlew openApiGenerate`.  This task reads the OpenAPI spec JSON file, then generates front end code which is saved to $buildDir/generated-js

You can modify the settings (i.e. output folder, target language and framework, etc) by modifying the openApiGenerate config in build.gradle, then rerunning the 2nd task

Once you have the generated front end code, you should be able to import into the UI and start playing around.