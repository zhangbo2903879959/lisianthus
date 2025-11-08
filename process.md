# maven 构建spring boot 项目
1.引导类
java文件夹下@SpringBootApplication 主方法写
`````public static void main(String[] args) {
SpringApplication.run(lisiathusStart.class, args);
}
`````
2.controller
* 在大量返回json的Controller中使用(以后用得比较多)
* RestController是一个组合注解 它等于 (@Controller+@ResponseBody)
`````@Restcontroller 

//表示controller类


`````
3.目录结构
src-
    main-
        java-
            com-
                example-
                        appname-
                                controller.java
                                startClass.java--run

4.pom.xml

`````` <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version> <!-- 可以使用最新稳定版 -->
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <scope>true</scope>
    </dependencies>
 <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    <repositories>
        <repository>
            <id>aliyun</id>
            <url>https://maven.aliyun.com/repository/public</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
    </repositories>
``````
5.application.yml或properties
推荐yml



6.themleaf插件 显示web
