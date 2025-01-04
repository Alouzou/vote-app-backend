package com.voting.voteapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class OptionVote {

    @Column
    private String optionText;

    @Column
    private Long voteCount = 0L;

    public OptionVote() {
    }


    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String option) {
        this.optionText = option;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }
}
