package LibraryRegisterVer1;

/**
 * LibraryRegisterVer1.Movie - обьект "Микрофильм", унаследованный от LibraryRegisterVer1.BaseLibraryObject;
 * @see BaseLibraryObject
 */

public class Movie extends BaseLibraryObject {
    /**
     * LibraryRegisterVer1.Movie - Конструктор, создание нового объекта с определенными значениями;
     *
     * @param typeOfObject тип обьекта Библиотечного реестра;
     * @param title название обьекта Библиотечного реестра;
     * @param author автор обьекта Библиотечного реестра;
     */
    public Movie(String typeOfObject, String title, String author) {
        super(typeOfObject, title, author);
    }
}
