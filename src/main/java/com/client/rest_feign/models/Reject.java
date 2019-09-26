package com.client.rest_feign.models;

public class Reject {
    private Long studentId;
    private Long departmentId;
    private Long companyId;

    public Reject(Long studentId, Long departmentId, Long companyId) {
        this.studentId = studentId;
        this.departmentId = departmentId;
        this.companyId = companyId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
