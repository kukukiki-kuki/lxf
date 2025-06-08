package cn.shzu.upa.service;

import cn.shzu.upa.pojo.Employee;
import cn.shzu.upa.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author soya
 * @version 1.0
 * @project Java_8Test
 * @description Lamda测试
 * @date 2025/5/6 22:36:19
 */
public class LambdaTest {
    public void test(){
        Consumer<String> printer = msg -> System.out.println("Msg: " + msg);
        printer.accept("Lambda rocks!");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 30, 12000),
                new Employee("Bob", "HR", 45, 9000),
                new Employee("Charlie", "IT", 25, 11000),
                new Employee("David", "Sales", 40, 8500),
                new Employee("Eva", "IT", 35, 15000),
                new Employee("Frank", "HR", 28, 7000)
        );
        List<String> employeeName = employees.stream()
                .filter(e ->e.getSalary()>10000).filter(e->e.getAge()>30).map(Employee::getName).collect(Collectors.toList());
        employeeName.forEach(System.out::println);
    }
}
