package com.voting;

public class Main {
    public static void main(String[] args) {
        VotingService service = new VotingService();

        System.out.println(service.castVote("v1", "Alice"));
        System.out.println(service.castVote("v2", "Bob"));
        System.out.println(service.castVote("v1", "Alice")); // duplicate

        System.out.println("Results: " + service.getResults());
    }
}