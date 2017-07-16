package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** Контроллер, обрабатывающий запросы */
@Controller
public class CalculatorController {

    /** Обработка GET запроса на "/", в результате которого возвращается шаблон представления "start" */
    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String start(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "start";
    }

    /** Обработка POST запроса на "/", в результате которого в случае успеха возвращается шаблон представления "result" */
    @RequestMapping(value = "/", method= RequestMethod.POST)
    public String calculate(@ModelAttribute Calculator calculator, Model model) {
        // Переменная для хранения результата
        double result;
        switch (calculator.getOperation()) {
            case ADD:
                result = calculator.getFirstValue() + calculator.getSecondValue();
                calculator.setResult(result);
                break;
            case SUBTRACT:
                result = calculator.getFirstValue() - calculator.getSecondValue();
                calculator.setResult(result);
                break;
            case MULTIPLY:
                result = calculator.getFirstValue() * calculator.getSecondValue();
                calculator.setResult(result);
                break;
            case DIVIDE:
                double e = 0.000000001;
                if (calculator.getSecondValue() < e) {
                    calculator.setResult(0.0);
                    model.addAttribute("calculator", calculator);
                    return "divide_by_zero";
                }
                result = calculator.getFirstValue() / calculator.getSecondValue();
                calculator.setResult(result);
                break;
        }

        model.addAttribute("calculator", calculator);
        return "result";
    }
}
