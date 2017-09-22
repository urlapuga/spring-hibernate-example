package example;

import org.fluttercode.datafactory.impl.DataFactory;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class EmployeeBean {
    private List<example.Employee> employeeList = new ArrayList<>();

    @PostConstruct
    private void postConstruct () {
        DataFactory dataFactory = new DataFactory();
        for (int i = 1; i < 20; i++) {
            example.Employee employee = new example.Employee();
            employee.setId(i);
            employee.setName(dataFactory.getName());
            employee.setPhoneNumber(String.format("%s-%s-%s", dataFactory.getNumberText(3),
                                                  dataFactory.getNumberText(3),
                                                  dataFactory.getNumberText(4)));
            employee.setAddress(dataFactory.getAddress() + "," + dataFactory.getCity());
            employeeList.add(employee);
        }
    }

    public List<example.Employee> getEmployeeList () {
        return employeeList;
    }
}