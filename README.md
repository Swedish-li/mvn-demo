# Maven Demo

Archetype: [archetype-quickstart-jdk8:1.0.29](https://github.com/ngeor/archetype-quickstart-jdk8)

## 相关文档

* [插件文档][1]
* [JAR File Specification][2]
* [Maven变量及常见插件配置详解][3]

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

打包或安装为可执行项目需要在pom.xml中添加如下配置

``` xml
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-shade-plugin</artifactId>
                    <version>3.0.0</version>
                    <configuration>  
                        <transformers>  
                            <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                <manifestEntries>
                                    <Main-Class>com.lrs.example.HelloWorld</Main-Class>
                                    <X-Compile-Source-JDK>${maven.compile.source}</X-Compile-Source-JDK>
                                    <X-Compile-Target-JDK>${maven.compile.target}</X-Compile-Target-JDK>
                                </manifestEntries>
                            </transformer>
                        </transformers>
                    </configuration>  
                    <executions>  
                        <execution>  
                            <phase>package</phase>  
                            <goals>  
                                <goal>shade</goal>  
                            </goals>  
                        </execution>  
                    </executions>  
            </plugin>
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