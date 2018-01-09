# springboot-mongodb-demo
### springboot整合mongodb数据库demo
* develop：
 1、jdk1.8
 2、tomcat8
通过上面的例子，我们可以轻而易举的对MongoDB进行访问，但是实战中，应用服务器与MongoDB通常不会部署于同一台设备之上，这样就无法使用自动化的本地配置来进行使用。这个时候，我们也可以方便的配置来完成支持，只需要在application.properties中加入mongodb服务端的相关配置，具体示例如下：
  spring.data.mongodb.uri=mongodb://name:pass@localhost:27017/test
在尝试此配置时，记得在mongo中对test库创建具备读写权限的用户（用户名为name，密码为pass），不同版本的用户创建语句不同，注意查看文档做好准备工作
若使用mongodb 2.x，也可以通过如下参数配置，该方式不支持mongodb 3.x。
* config
    compile('org.springframework.boot:spring-boot-starter-data-mongodb') // mongodb依赖包
    具体实现在demo中可以看到


