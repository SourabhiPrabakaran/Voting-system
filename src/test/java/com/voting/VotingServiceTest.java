package com.voting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VotingServiceTest {

    @Test
    void testValidVote() {
        VotingService service = new VotingService();
        String result = service.castVote("v1", "Alice");
        assertEquals("SUCCESS: Vote counted!", result);
    }

    @Test
    void testDuplicateVote() {
        VotingService service = new VotingService();
        service.castVote("v1", "Alice");
        String result = service.castVote("v1", "Alice");
        assertEquals("DUPLICATE: Already voted!", result);
    }

    @Test
    void testVoteCount() {
        VotingService service = new VotingService();
        service.castVote("v1", "Alice");
        service.castVote("v2", "Alice");
        service.castVote("v3", "Bob");
        assertEquals(2, service.getResults().get("Alice"));
        assertEquals(1, service.getResults().get("Bob"));
    }
}