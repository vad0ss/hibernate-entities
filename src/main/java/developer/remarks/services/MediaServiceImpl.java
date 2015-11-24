package developer.remarks.services;

import developer.remarks.dao.AllDao;
import developer.remarks.dao.AllDaoImpl;
import developer.remarks.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service("storageService")
public class MediaServiceImpl implements MediaService {

    @Autowired
    private AllDaoImpl dao;


   // @Override
   // public void save(Content content) {
   //     dao.save(content);
   // }

    @Override
    public List<User> getUser() throws SQLException {
        return dao.getUser();
    }
}
