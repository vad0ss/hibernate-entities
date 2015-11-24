package developer.remarks.dao;

import developer.remarks.models.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AllDaoImpl implements AllDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getUser() throws SQLException {
        List<User> userList = null;
        userList = em.createQuery("SELECT e FROM User e", User.class).getResultList();
        return userList;
    }

}
