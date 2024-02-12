package LibraryRegisterVer1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LibraryRegisterVer1.LibraryObjectRepository - Хранилище всех типов обьектов Библиотечного реестра;
 */
public class LibraryObjectRepository implements FinderLibraryObject {
    /**
     * simpleLibraryObject - интерфейс, хранящий все обьекты Библиотечного реестра: в формате ID & Обьект;
     * @see BaseLibraryObject
     */
    private final Map<Integer, BaseLibraryObject> simpleLibraryObject;
    /**
     * LibraryRegisterVer1.LibraryObjectRepository() - Конструктор, создающий хэштаблицу наполненую обьектами
     * разных типов общего класса LibraryRegisterVer1.BaseLibraryObject;
     * @see BaseLibraryObject
     */
    public LibraryObjectRepository() {
        this.simpleLibraryObject = new HashMap<>();
        simpleLibraryObject.put(1, new BaseLibraryObject("Book", "The Great Gatsby", " F. Scott Fitzgerald"));
        simpleLibraryObject.put(2, new BaseLibraryObject("Book", "1984", "George Orwell"));
        simpleLibraryObject.put(3, new BaseLibraryObject("Book", "The Lord of the Rings", "JRR Tolkien"));
        simpleLibraryObject.put(4, new BaseLibraryObject("Book", "One Hundred Years of Solitude", "Gabriel García Márquez "));
        simpleLibraryObject.put(5, new BaseLibraryObject("Book", "Don Quixote", " Miguel de Cervantes"));

        simpleLibraryObject.put(6, new BaseLibraryObject("LibraryRegisterVer1.Movie", "The Great Gatsby", " F. Scott Fitzgerald"));
        simpleLibraryObject.put(7, new BaseLibraryObject("LibraryRegisterVer1.Movie", "1984", "George Orwell"));
        simpleLibraryObject.put(8, new BaseLibraryObject("LibraryRegisterVer1.Movie", "The Lord of the Rings", "JRR Tolkien"));
        simpleLibraryObject.put(9, new BaseLibraryObject("LibraryRegisterVer1.Movie", "One Hundred Years of Solitude", "Gabriel García Márquez "));
        simpleLibraryObject.put(10, new BaseLibraryObject("LibraryRegisterVer1.Movie", "Titanic", "James Cameron"));

        simpleLibraryObject.put(11, new BaseLibraryObject("LibraryRegisterVer1.Newspaper", "Aviso", "L.A.Smith"));
        simpleLibraryObject.put(12, new BaseLibraryObject("LibraryRegisterVer1.Newspaper", "Le jorval des Cavas", "Tim Cock"));
        simpleLibraryObject.put(13, new BaseLibraryObject("LibraryRegisterVer1.Newspaper", "The Electronic Trib", "Mary Bart"));
        simpleLibraryObject.put(14, new BaseLibraryObject("LibraryRegisterVer1.Newspaper", "Standart Evenings", "Piter Jackson "));
        simpleLibraryObject.put(15, new BaseLibraryObject("LibraryRegisterVer1.Newspaper", "LiveJournal", " Bob Clancy"));

        simpleLibraryObject.put(16, new BaseLibraryObject("LibraryRegisterVer1.Letter", "I miss your,Dad", "Your Son"));
        simpleLibraryObject.put(17, new BaseLibraryObject("LibraryRegisterVer1.Letter", "I count every second to see your", "Your Husband,John"));
        simpleLibraryObject.put(18, new BaseLibraryObject("LibraryRegisterVer1.Letter", "GoodLuck my dear", "Your Mother"));
        simpleLibraryObject.put(19, new BaseLibraryObject("LibraryRegisterVer1.Letter", "8th March", "Your Best Friend"));
        simpleLibraryObject.put(20, new BaseLibraryObject("LibraryRegisterVer1.Letter", "Happy New Year", " Miguel de Cervantes"));
    }
    /**
     * findLibraryObject() переопределенный  метод поиска элемента по параметру ID Библиотечного реестра;;
     * @return обьект хранящийся в simpleLibraryObject;
     */
    @Override
    public BaseLibraryObject findLibraryObject(int numberId) {
        return simpleLibraryObject.get(numberId);
    }
    /**
     * findAllLibraryObjects() переопределенный  метод поиска всех элементов Библиотечного реестра;;
     * @return все обьекты хранящийся в simpleLibraryObject;
     */
    @Override
    public List<BaseLibraryObject> findAllLibraryObjects() {
        return new ArrayList<>(simpleLibraryObject.values());
    }
}
