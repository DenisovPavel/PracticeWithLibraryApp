package LibraryRegisterVer1;

/**
 * LibraryRegisterVer1.Letter - обьект "Письмо", унаследованный от LibraryRegisterVer1.BaseLibraryObject;
 * @see BaseLibraryObject
 */
public class Letter extends BaseLibraryObject {
    /**
     * LibraryRegisterVer1.Letter - Конструктор, создание нового объекта с определенными значениями;
     *
     * @param typeOfObject тип обьекта Библиотечного реестра;
     * @param title  название  обьекта Библиотечного реестра;
     * @param author автор обьекта Библиотечного реестра;
     */
    public Letter(String typeOfObject, String title, String author) {
        super(typeOfObject, title, author);
    }
}
