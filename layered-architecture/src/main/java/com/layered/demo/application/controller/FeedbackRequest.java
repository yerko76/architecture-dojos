package com.layered.demo.application.controller;

public class FeedbackRequest {
    private Integer id;
    private String givenBy;
    private String feedback;

    public FeedbackRequest(Integer id, String givenBy, String feedback) {
        this.id = id;
        this.givenBy = givenBy;
        this.feedback = feedback;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGivenBy() {
        return givenBy;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

