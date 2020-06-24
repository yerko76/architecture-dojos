package com.layered.demo.application.service;

import com.layered.demo.application.controller.FeedbackRequest;
import com.layered.demo.application.controller.FeedbackResponse;
import com.layered.demo.application.persistence.FeedBackJpa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeedbackMapper {

    public List<FeedbackResponse> toResponse(List<FeedBackJpa> results){
        List<FeedbackResponse> responses = new ArrayList<>();
        results.forEach(jpa -> responses.add(new FeedbackResponse(jpa.getId(), jpa.getGivenBy(), jpa.getFeedback())));
        return responses;
    }

    public FeedBackJpa toJpa(FeedbackRequest feedbackRequest){
        var feebackJpa = new FeedBackJpa();
        feebackJpa.setId(feedbackRequest.getId());
        feebackJpa.setGivenBy(feedbackRequest.getGivenBy());
        feebackJpa.setFeedback(feedbackRequest.getFeedback());
        return feebackJpa;
    }

}
