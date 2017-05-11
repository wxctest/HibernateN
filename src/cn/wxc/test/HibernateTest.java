package cn.wxc.test;

import cn.wxc.entity.Customer;
import cn.wxc.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * Created by W on 2017/5/11.
 */
public class HibernateTest {
    @Test
    public void testSelect() {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        try {
            sessionFactory = HibernateUtils.getSessionFactory();
            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            Query query = session.createQuery("from cn.wxc.entity.Customer");
            List<Customer> list = query.list();
            for (Customer customer : list) {
                System.out.println(customer.getCid() + ":" + customer.getCustName());
                System.out.println("asdfasf");
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }
}
