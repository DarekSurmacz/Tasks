package com.crud.tasks.trello.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class TrelloConfigTest {

    @Test
    void gettersShouldBeNullTest() {

        //Given
        TrelloConfig trelloConfig = new TrelloConfig();
        //When
        String token = trelloConfig.getTrelloToken();
        String key = trelloConfig.getTrelloAppKey();
        String user = trelloConfig.getTrelloUser();
        String endpoint = trelloConfig.getTrelloApiEndpoint();
        //Then
        assertNull(token);
        assertNull(key);
        assertNull(user);
        assertNull(endpoint);
    }
}