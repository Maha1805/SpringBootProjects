package Com.SpringHibernate.HibernateProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import Com.SpringHibernate.HibernateProject.model.Employee;


//@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
