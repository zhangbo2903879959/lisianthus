# maven 构建spring boot 项目
1.引导类
java文件夹下@SpringBootApplication 主方法写
`````public static void main(String[] args) {
SpringApplication.run(lisiathusStart.class, args);
}
`````
2.controller
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