package LibraryRegisterVer1;

/**
 * LibraryRegisterVer1.Newspaper - обьект "Журнал", унаследованный от LibraryRegisterVer1.BaseLibraryObject;
 * @see BaseLibraryObject
 */
public class Newspaper extends BaseLibraryObject {
    /**
     * LibraryRegisterVer1.Newspaper - Конструктор, создание нового объекта с определенными значениями;
     *
     * @param typeOfObject тип обьекта Библиотечного реестра;
     * @param title название обьекта Библиотечного реестра;
     * @param author автор обьекта Библиотечного реестра;
     */
    public Newspaper(String typeOfObject, String title, String author) {
        super(typeOfObject, title, author);
    }
}
