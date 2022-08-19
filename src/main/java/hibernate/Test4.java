package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            System.out.println(employee);

            employee.setSalary(5432);
            session.save(employee);


            Employee e = session.get(Employee.class, 2);
            System.out.println(e);




            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
