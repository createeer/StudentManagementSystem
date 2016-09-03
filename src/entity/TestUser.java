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
        // 配置对象
        Configuration config = new Configuration().configure();
        // 服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
                .build();
        SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
        // Session对象
        Session session = sessionFactory.getCurrentSession();
        // 创建schemaExport对象
        SchemaExport export = new SchemaExport();

    }
}
