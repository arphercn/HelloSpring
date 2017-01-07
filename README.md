
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

