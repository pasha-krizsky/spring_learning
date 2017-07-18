package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Контроллер, обрабатывающий запросы. Содержит методы, помеченные аннотацией "@RequestMapping",
 * данные методы возвращают экземпляр соответствующего класса-модели. Важно!!! Возвращается объект вместо представления.
 */
@RestController
public class GreetingController {

    /** Шаблон ответа */
    private static final String template = "Hello, %s";
    /** Счетчик для создания id приветствия */
    private AtomicLong counter = new AtomicLong();

    /** Маппинг для /greeting */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        return new Greeting(counter.getAndIncrement(),
                String.format(template, name));
    }
}
