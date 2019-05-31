package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudDAOimpl;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class CustomerDAOImpl extends CrudDAOimpl<Customer,String> implements CustomerDAO {

    public CustomerDAOImpl(){
        super();
    }

    @Override
    public int count() throws Exception {
        return (int) em.createNativeQuery("SELECT COUNT(*) FROM Customer", Integer.class).getSingleResult();
    }


}
