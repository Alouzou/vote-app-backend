package com.voting.voteapp.request;

public class Vote {
    private Long pollId;
    private int optionIndex;

    public Long getPollId() {
        return pollId;
    }

    public Vote() {
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public int getOptionIndex() {
        return optionIndex;
    }

    public void setOptionIndex(int optionIndex) {
        this.optionIndex = optionIndex;
    }
}