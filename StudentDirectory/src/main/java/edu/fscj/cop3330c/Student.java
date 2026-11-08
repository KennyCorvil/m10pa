/**
 * Class:       COP3330C
 * Author:      Kenny Corvil
 * Student ID:  S3522532
 * Date:        11/08/2026
 *
 */
package edu.fscj.cop3330c;

public class Student {
    private String name;
    private Integer age;
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
