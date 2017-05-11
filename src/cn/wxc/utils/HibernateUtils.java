package cn.wxc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final Configuration CONFIGURATION;
    private static final SessionFactory SESSION_FACTORY;

    static {
        CONFIGURATION = new Configuration().configure();
        SESSION_FACTORY = CONFIGURATION.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void main(String[] args) {
    }
}
