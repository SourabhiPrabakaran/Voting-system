package com.voting;

public class Vote {
    private String voterId;
    private String candidate;

    public Vote(String voterId, String candidate) {
        this.voterId = voterId;
        this.candidate = candidate;
    }

    public String getVoterId()   { return voterId; }
    public String getCandidate() { return candidate; }
}