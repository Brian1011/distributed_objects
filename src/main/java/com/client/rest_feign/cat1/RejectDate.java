package com.client.rest_feign.cat1;

public class RejectDate {
    private Long studentId;
    private String reason;

    private RejectDate(){

    }

    public RejectDate(Long studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
