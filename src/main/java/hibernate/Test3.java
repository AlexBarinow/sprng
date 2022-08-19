package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();


            List<Employee> emps = session.createQuery("from Employee "
                    + "where name like 'Ihor'"
                    + "and salary >= 4000")
                    .getResultList();

            for (Employee employee : emps)
                System.out.println(employee);
            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
