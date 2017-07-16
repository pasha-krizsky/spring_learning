package hello;

/** Объект данного класса является атрибутом модели и служит для связи контроллера с шаблоном представления */
public class Calculator {

    /** Первый операнд в выражении */
    private double firstValue;
    /** Второй операнд в выражении */
    private double secondValue;
    /** Результат выражения */
    private double result;
    /** Операция, выполняемая над операндами */
    private Operation operation;

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
