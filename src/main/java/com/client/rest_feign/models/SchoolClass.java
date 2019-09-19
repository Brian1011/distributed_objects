package com.client.rest_feign.models;

public class SchoolClass {
    private Long id;
    private String class_name;
    private String capacity;
    private Long class_teacher_id;
    private Long total_students;

    private SchoolClass(){}

    public SchoolClass(String class_name, String capacity, Long class_teacher_id, Long total_students) {
        this.class_name = class_name;
        this.capacity = capacity;
        this.class_teacher_id = class_teacher_id;
        this.total_students = total_students;
    }

    public SchoolClass(String class_name, String capacity, Long class_teacher_id) {
        this.class_name = class_name;
        this.capacity = capacity;
        this.class_teacher_id = class_teacher_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public Long getClass_teacher_id() {
        return class_teacher_id;
    }

    public void setClass_teacher_id(Long class_teacher_id) {
        this.class_teacher_id = class_teacher_id;
    }

    public Long getTotal_students() {
        return total_students;
    }

    public void setTotal_students(Long total_students) {
        this.total_students = total_students;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "id=" + id +
                ", class_name='" + class_name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", class_teacher_id=" + class_teacher_id +
                ", total_students=" + total_students +
                '}';
    }
}
