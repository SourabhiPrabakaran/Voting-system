package com.voting;

import java.util.*;

public class VotingService {

    private Set<String> votedIds = new HashSet<>();
    private Map<String, Integer> results = new HashMap<>();

    public String castVote(String voterId, String candidate) {
        if (votedIds.contains(voterId)) {
            return "DUPLICATE: Already voted!";
        }
        votedIds.add(voterId);
        results.put(candidate, results.getOrDefault(candidate, 0) + 1);
        return "SUCCESS: Vote counted!";
    }

    public Map<String, Integer> getResults() {
        return results;
    }
}