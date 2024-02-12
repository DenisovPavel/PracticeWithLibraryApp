package LibraryRegisterVer1;
// Вы реализуете библиотечный реестр - абстракция предназначенная для описания библиотечного фонда муниципалитета
// вашего города. В этом фонде хранятся разные объекты: книги, журналы, письма, микрофильмы и т.д.
// Также вам необходимо будет реализовать сервис обеспечивающий поиск среди всех объектов по инвентарному
// номеру и/или автору. Ваш main класс должен инициализировать реестр (генерировать экземпляры объектов),
// инициализировать сервис поиска и выводить на экран найденные элементы.
/**
 * @params LibraryRegisterVer1.BaseLibraryObject - базовый класс для создания обьекта Библиотечный реестр;
 */
public class BaseLibraryObject {
    /**
     * typeOfObject - тип обьекта Библиотечного реестра;
     */
    private String typeOfObject;
    /**
     * title - название  обьекта Библиотечного реестра;
     */
    private String title;
    /**
     * author - автор обьекта Библиотечного реестра;
     */
    private String author;
    /**
     * getTypeOfObject() метод получения параметра "тип обьекта" Библиотечного реестра;
     */
    public String getTypeOfObject() {
        return typeOfObject;
    }
    /**
     * getTitle() метод получения параметра "названия  обьекта" Библиотечного реестра;
     */
    public String getTitle() {
        return title;
    }
    /**
     * getAuthor() - метод получения параметра "автор обьекта" Библиотечного реестра
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями;
     *
     * @param typeOfObject - тип обьекта Библиотечного реестра;
     * @param title        - название  обьекта Библиотечного реестра;
     * @param author       -  автор  обьекта Библиотечного реестра;
     */
    public BaseLibraryObject(String typeOfObject, String title, String author) {
        this.typeOfObject = typeOfObject;
        this.title = title;
        this.author = author;
    }
    /**
     * toString() - метод вывода параметров обьекта;
     */
    @Override
    public String toString() {
        return "Найденый экземпляр в реестре: " +
                "Type/Тип = " + typeOfObject  +
                ", Title/Название = " + title +
                ", Author/Автор = " + author;
    }
}