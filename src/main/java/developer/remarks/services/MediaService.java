package developer.remarks.services;

import developer.remarks.models.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Сервис для работы с базой данных мультимедийной библиотеки
 */
public interface MediaService {

    /**
     * Сохраняет элемент в библиотеке
     * @param content Элемент библиотеки (книга или аудиозапись)
     */
   // public void save(Content content);

    /**
     * Возвращает все элементы, о которых есть данные в библиотеке
     * @return Список элементов библиотеки
     */
    public List<User> getUser() throws SQLException;

}
