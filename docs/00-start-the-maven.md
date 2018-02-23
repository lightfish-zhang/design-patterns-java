## 使用maven初始化项目

### reference

- 参考maven的官方文档 [maven-document]，本篇仅仅只个人笔记，maven更多内容直接看官方文档最好

### 快速开始

- 光鱼的开发环境是Linux 4.14, Java 8, maven 3.5
- 使用maven的archetype构建项目，有个小技巧，提前下载archetype-catalog.xml文件到本地

```s
curl http://repo.maven.apache.org/maven2/archetype-catalog.xml -o ~/.m2/repository/catalog.xml
```

- 在你的工作目录下执行快速创建的命令，当然使用本地下载好的archetype-catalog.xml，添加`-DarchetypeCatalog=local`，另外设置好自己项目的artifactId与groupId

```s
mvn -B archetype:generate \
  -DarchetypeGroupId=org.apache.maven.archetypes \
  -DgroupId=cn.lightfish.design_patterns \
  -DartifactId=design-patterns-java \
  -DarchetypeCatalog=local

```

- 项目执行完生成以下目录结构

```
design-patterns-java
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── cn
│   │           └── lightfish
│   │               └── design_patterns
│   │                   └── App.java
│   └── test
│       └── java
│           └── cn
│               └── lightfish
│                   └── design_patterns
│                       └── AppTest.java
```

- maven遵循约定优于配置的原则，`src/main/java`存放源代码，`src/test/java`存放测试代码，强约定无可改
- 现在项目可以执行的命令是

```
mvn package
java -cp target/design-patterns-java-1.0-SNAPSHOT.jar cn.lightfish.design_patterns.App
```

- 显示hello world

### maven的常用命令是

```
validate: validate the project is correct and all necessary information is available
compile: compile the source code of the project
test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package: take the compiled code and package it in its distributable format, such as a JAR.
integration-test: process and deploy the package if necessary into an environment where integration tests can be run
verify: run any checks to verify the package is valid and meets quality criteria
install: install the package into the local repository, for use as a dependency in other projects locally
deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

clean: cleans up artifacts created by prior builds
site: generates site documentation for this project
```

[maven-document]:http://maven.apache.org/guides/getting-started/index.html#How_do_I_make_my_first_Maven_project