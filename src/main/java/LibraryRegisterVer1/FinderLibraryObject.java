package LibraryRegisterVer1;

import java.util.List;

/**
 * LibraryRegisterVer1.FinderLibraryObject - интрефейс поиска обьекта  Библиотечного реестра;
 */
public interface FinderLibraryObject {
    /**
     * findLibraryObject() метод поиска элемента по параметру ID  Библиотечного реестра;;
     * @see LibraryObjectRepository
     */
    BaseLibraryObject findLibraryObject(int numberId);
    /**
     *  findAllLibraryObjects() метод поиска всех элементов Библиотечного реестра; ;
     * @see LibraryObjectRepository
     */
    List<BaseLibraryObject> findAllLibraryObjects();
}
