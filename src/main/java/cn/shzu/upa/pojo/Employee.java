package cn.shzu.upa.pojo;

import lombok.Data;

/**
 * @author soya
 * @version 1.0
 * @project Java_8Test
 * @description 雇员
 * @date 2025/5/6 22:58:59
 */

@Data
public class Employee {
    private String name;
    private String department;
    private int age;
    private double salary;

    public Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }


}

