# Tutorial: How to build a Maven Plugin

This repository contains example code for an Apache Maven Plugin.  

**Prerequisites:**

- [Java 8](https://adoptopenjdk.net/)
- [Maven 3](https://maven.apache.org/download.cgi)

## Example Maven Plugin

To see see how this was build, take a look at the corresponding blog posts: 
- [How to Build a Maven Plugin](https://developer.okta.com/blog/2019/09/23/tutorial-build-a-maven-plugin)
- [Tutorial: How to Create a Maven Plugin](https://dzone.com/articles/tutorial-create-a-maven-plugin)



### Getting Started

To install this example, run the following commands:
```bash
mvn install
```

### Run it

```bash
mvn com.okta.example:example-maven-plugin:version
mvn package -file usage-example\pom.xml
```

## First Maven Plugin & Second Maven Plugin

These plugins are written for Maven 2.0 
From a book [Maven: The Complete Reference - Chapter 11. Writing Plugins](https://books.sonatype.com/mvnref-book/reference/writing-plugins.html)