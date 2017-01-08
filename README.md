
#### 1.3 Consuming a RESTful Web Service
运行方式cmd,  
`mvn clean package` 或 `./mvnw clean package`
在target目录构建jar包  
`java -jar target/gs-consuming-rest-0.1.0.jar`
运行jar包  
 注:此应用可以在命令行打印api提供的消息,建议在Idea终端执行
#### 1.4 Managing Transactions
管理事务,个人已验证,命令行输出与代码逻辑无误
#### 1.5 Accessing Relational Data using JDBC with Spring
#### 1.6 Scheduling Tasks
#### 1.7 Serving Web Content with Spring MVC
坑:pom.xml的依赖下不下来,最后用同事的做的镜像setting.xml代替原文件,
发现maven工具栏提示缺少groovy-2.4.7.jar手动安装,谷歌下载jar包后,  
`mvn install:install-file -Dfile=D:\_java\myJars\groovy-2.4.7.jar
  -DgroupId=org.codehaus.groovy -DartifactId=groovy -Dversion=2.4.7 -Dpackaging=j
 ar`  
 最后成功,参考<http://www.blogjava.net/fancydeepin/archive/2016/08/16/380605.html>
#### 1.8 Validating Form Input
#### 2.1 Uploading Files
#### 2.2 Authenticating a User with LDAP
#### 2.3 Integrating Data  
uses Spring Integration to fetch data, process it, and write it to a file
#### 3.1 Messaging with Redis
#### 3.2 Building a RESTful Web Service with Spring Boot Actuator
监控应用 如 curl localhost:9001/health
#### 3.3 Messaging with JMS
Java Message Service, 处理Email
#### 3.4 Creating a Batch Service
使用spring-batch-core依赖,顺序执行操作,从csv文档读取数据,转化处理,存储
#### 3.5 Securing a Web Application
实现用户登录推出
#### 3.6 Building a Hypermedia-Driven RESTful Web Service
返回的资源包含可以变化参数的链接url,用来指向本条目,(格式可以是json,xml等格式)
#### 3.7 Accessing Data with GemFire
增强版的Redis
#### 3.8 Accessing Data with JPA
JPA全称为Java Persistence API,Java持久化接口
[JPA入门例子](http://blog.csdn.net/hmk2011/article/details/6289151)  
使用JPA持久化对象，并不是依赖于某一个ORM框架  
本例使用javax.persistence.Entity注释customer模型
#### 3.9 Converting a Spring Boot JAR Application to a WAR
使用jar时,`mvn clean package && java -jar target/gs-accessing-data-jpa-0.1.0.jar`
使用war包,在pom.xml添加`<packaging>war</packaging>`,
 在内嵌容器依赖spring-boot-starter-tomcat下添加`<scope>provided</scope>`(本例无)
 然后执行`mvn clean package && java -jar target/gs-accessing-data-jpa-0.1.0.war`
成功
#### 4.1 Creating Asynchronous Methods
使用异步方法访问GitHub的Api得到数据
#### 4.2 Handling Form Submission
#### 4.3 Using WebSocket to build an interactive web application
通过EnableWebSocketMessageBroker发送name到server,一秒后返回hello name!
前端逻辑在app.js里
#### 4.4 Consuming a RESTful Web Service with jQuery
使用public目录里hello.js
#### 4.4 Enabling Cross Origin Requests for a RESTful Web Service
跨域测试:设置跨域@CrossOrigin后,通过mvn spring-boot:run和mvn spring-boot:run -Dserver.port=9000
启动两个应用,8080端口无法通过首页访问GreetingController,成功
