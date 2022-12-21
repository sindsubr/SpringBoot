# SpringBoot

To create <b><i>standalone</b></i> spring project with <b><i>minimal Spring configuration</b></i>.
It has <b><i>Embeded Tomcat, Jetty or Undertow</b></i> directly (no need to deploy WAR files)

https://spring.io/projects/spring-boot

<h1>Topics</h1>
<ol>
<li>Quickly develop Spring Boot App </li>
<li>Rest API using Spring Boot</li>
<li>Spring Mvc app with spring boot with thymeleaf</li>
<li>CRUD development with spring boot</li>
</ol>

<h1>Spring Initializer</h1>
https://start.spring.io/ <br>
https://spring.io/quickstart

<h3>Annotations:</h3>
@SpringBootApplication : For @Configuration,@EnableAutoConfiguration,@ComponentScan<br>
If you want to scan other packages : @SpringBootApplication(ScanBasePackages = {"pkg.name",..}<br>
@RestController <br>
@Controller <br>

<b>SpringApplication</b> class creates Application context and register all bean.

<b>To create jar/war</b><br>
mvn clean compile test<br>
mvn package<br>
<b>To run</b>
mvn spring-boot:run mycoolapp(or)<br>
java >jar mycoolapp

<h1>Spring Boot Dependencies</h>
<h3>spring-boot-dev-tools</h3>
To restart server automatically if any code changes occur.<br>

<h3>spring-boot-starter-actuator</h3>
To monitor and manage applications and to check health,info of app metrics.<br>
<h3>Endpoints:</h3>
/actuator/health exposed automatically <br>
<a href="https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/html/production-ready-endpoints.html#:~:text=Actuator%20endpoints%20let%20you%20monitor,can%20be%20enabled%20or%20disabled">spring-boot-actuator endpoints</a>.

<h3>spring-boot-starter-security</h3>
To enable security for endpoints.
configure security<br>
auto generated password for development<br>

<h3>application.properties</h3>
<code>#Use wildcard '*' toexpose all endpoints
management.endpoints.web.exposure.include= *
#Use expose info endpoint
management.info.env.enabled=true
#info endpoint properties
info.app.name=Spring Sample Application
info.app.description=This is my first spring boot application
info.app.version=1.0.0
</code>
<br><br>

<b>Json view for chrome:</b><br>
https://chrome.google.com/webstore/detail/json-visualizer/dlpmomaegoaeahhajgkmfifdfdmliajd/related?hl=en





