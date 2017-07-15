package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Контроллер, содержащий методы, обрабатывающие определенные запросы.
 */
@Controller
public class GreetingController {

    /** Маппинг на /greeting */
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        // Добавляем в модель параметр "name"
        model.addAttribute("name", name);
        // Возвращаем имя представления, которое отвечает за рендеринг страницы HTML
        return "greeting";
    }
}
