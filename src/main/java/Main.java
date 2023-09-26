import dto.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        /*========================Save a record in a table========================*/
        /*dto.Customer customer = new dto.Customer("C002", "Sihan", "Kandy", 95000);
        Configuration configuration = new Configuration()
                .configure("hibernate.clg.xml")
                .addAnnotatedClass(dto.Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        sessionFactory.close();*/
        /*======================================================================*/

        /*=======================Find a record in a table=======================*/
        /* Configuration configuration = new Configuration()
                .configure("hibernate.clg.xml")
                .addAnnotatedClass(dto.Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        dto.Customer customer = session.find(dto.Customer.class, "C001");
        System.out.println(customer);
        dto.Customer cust = session.find(dto.Customer.class, "C003");
        System.out.println(cust);
        session.close();
        sessionFactory.close();*/
        /*======================================================================*/

        /*=======================Find all records in a table=======================*/
        /*Configuration configuration = new Configuration()
                .configure("hibernate.clg.xml")
                .addAnnotatedClass(dto.Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM dto.Customer");
        List<dto.Customer> list = query.list();
        System.out.println(list);
        session.close();
        sessionFactory.close();*/
        /*========================================================================*/

        /*========================Update a record in a table========================*/
        /*Configuration configuration = new Configuration()
                .configure("hibernate.clg.xml")
                .addAnnotatedClass(dto.Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        dto.Customer customer = session.find(dto.Customer.class, "C001");
        System.out.println(customer);
        customer.setSalary(99000);
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        System.out.println(customer);
        session.close();
        sessionFactory.close();*/
        /*=========================================================================*/

        /*========================Delete a record in a table========================*/
        /*Configuration configuration = new Configuration()
                .configure("hibernate.clg.xml")
                .addAnnotatedClass(Customer.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();*/
        Session session = HibernateUtil.getSession(); //Calling HibernateUtil class for above process
        Transaction transaction = session.beginTransaction();
        session.delete(session.find(Customer.class, "C002"));
        transaction.commit();
        session.close();
        /*=========================================================================*/
    }
}