# Maven Demo

Archetype: [archetype-quickstart-jdk8:1.0.29](https://github.com/ngeor/archetype-quickstart-jdk8)

[![Build Status](https://travis-ci.org/Swedish-li/mvn-demo.svg?branch=master)](https://travis-ci.org/Swedish-li/mvn-demo)

## 相关文档

* [插件文档][1]
* [JAR File Specification][2]
* [Maven变量及常见插件配置详解][3]
* [使用Travis进行持续集成][4]

## 常用命令

创建项目骨架

``` bash
$ mvn archetype:generate
```

编译项目

``` bash
$ mvn clean compile
```

打包项目

``` bash
$ mvn clean package
```

项目测试

``` bash
$ mvn clean test
```

项目安装

``` bash
$ mvn clean install
```

项目依赖解析

使用插件[maven-dependency-plugin](https://maven.apache.org/plugins/maven-dependency-plugin/)

``` bash
# 查看依赖信息列表
$ mvn dependency:list

# 查看依赖树
$ mvn dependency:tree

# 依赖分析
$ mvn dependency:analyze

# 项目依赖拷贝
$ mvn dependency:copy-dependencies
```


[1]: https://maven.apache.org/plugins/index.html
[2]: http://docs.oracle.com/javase/1.5.0/docs/guide/jar/jar.html
[3]: http://blog.csdn.net/amorym/article/details/52619402
[4]: http://www.liaoxuefeng.com/article/0014631488240837e3633d3d180476cb684ba7c10fda6f6000
