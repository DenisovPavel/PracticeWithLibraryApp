package LibraryRegisterVer1;

/**
 * LibraryRegisterVer1.Magazine - обьект "Журнал", унаследованный от LibraryRegisterVer1.BaseLibraryObject;
 * @see BaseLibraryObject
 */
public class Magazine extends BaseLibraryObject {
    /**
     * LibraryRegisterVer1.Magazine - Конструктор, создание нового объекта с определенными значениями;
     *
     * @param typeOfObject тип обьекта Библиотечного реестра;
     * @param title название обьекта Библиотечного реестра;
     * @param author автор обьекта Библиотечного реестра;
     */
    public Magazine(String typeOfObject, String title, String author) {
        super(typeOfObject, title, author);
    }
}
