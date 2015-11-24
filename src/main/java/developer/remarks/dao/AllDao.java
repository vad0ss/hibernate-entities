package developer.remarks.dao;

import developer.remarks.models.User;

import java.sql.SQLException;
import java.util.List;

public interface AllDao {

    public List<User> getUser() throws SQLException;


    //public void save(Content content);
    //public List<Content> getAll();

}
