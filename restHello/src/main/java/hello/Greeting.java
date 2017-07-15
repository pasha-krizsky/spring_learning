package hello;

/**
 * Класс, представляющий ресурс. Для парсинга в JSON по умолчанию используется Jackson JSON.
 */
public class Greeting {
    /** id приветствия */
    private final long id;
    /** Контент - строка приветствия */
    private final String content;

    /** Каждый экземпляр парсится в JSON */
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
