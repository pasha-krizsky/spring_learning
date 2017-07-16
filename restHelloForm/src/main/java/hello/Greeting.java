package hello;

/**
 * Поля данного класса соответствуют полям HTML-формы. При GET-запросе будет создан объект данного класса,
 * а при POST-запросе данный объект заполнится данными из HTML-формы и будет передан в шаблон представления.
 */
public class Greeting {

    /** id приветствия */
    private long id;
    /** Контент приветствия */
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
