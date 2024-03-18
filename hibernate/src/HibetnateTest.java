import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.*;

public class HibetnateTest {
    public static void main(String[] args) {
        // 构建session
        // 加载配置
        Configuration configuration = new Configuration().configure();
        // 构建sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();
        // 开启事务
        Transaction transaction = session.beginTransaction();

//        Phone phone = new Phone();
//        phone.setId(1);
//        phone.setPhoneType(PhoneType.MOBILE);
//        phone.setName(new Name("zhou","kangan"));
//        phone.setType("andorid");
//        phone.getList().add("17611111");
//        phone.getList().add("17622222");
//        phone.getTypeToPhone().put(0,"17611111");
//        phone.getTypeToPhone().put(1,"17622222");
//        // 保存object
//        session.save(phone);

        Book book = new Book();
        book.setIsbn("123-345");
        session.save(book);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
