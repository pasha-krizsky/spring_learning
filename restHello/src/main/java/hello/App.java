package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Данный класс является точкой входа в приложение.
 * Аннотация "@ComponentScan" указывает, что Spring рекурсивно обхойдет текущий пакет в поисках классов,
 * прямо или косвенно помеченных аннотацией "@Component".
 * Аннотация "@EnableAutoConfiguration" избавляет нас от необходимости вручную создавать "web.xml", конфигурировать
 * Tomcat и т.д.
 */
@ComponentScan
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
