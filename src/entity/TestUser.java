package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestUser {
    @Test
    public void testSchemaExport() {
        // ���ö���
        Configuration config = new Configuration().configure();
        // ����ע�����
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
                .build();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        // Session����
        Session session = sessionFactory.getCurrentSession();
        // ����schemaExport����
        SchemaExport export = new SchemaExport();

    }
}
