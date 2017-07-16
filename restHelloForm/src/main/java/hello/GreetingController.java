package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Объект данного класса служит для обработки GET и POST запросов на "/greeting"
 */
@Controller
public class GreetingController {

    /** Обработка GET запроса */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        // Добавляем в модель пустой объект "Greeting()", который будет заполнен при POST запросе
        model.addAttribute("greeting", new Greeting());
        // Имя шаблона представления
        return "greeting";
    }

    /** Обработка POST запроса */
    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        // В данный метод приходит заполненный объект "Greeting()", который передается в модель
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
