package com.crud.tasks.trello.validator;

import com.crud.tasks.domain.TrelloBoard;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrelloValidatorTest {

    @Test
    void validateTrelloBoardsTest() {
        //Given
        TrelloValidator trelloValidator = new TrelloValidator();
        List<TrelloBoard> trelloBoards = new ArrayList<>();
        trelloBoards.add(new TrelloBoard("1", "name1", new ArrayList<>()));
        trelloBoards.add(new TrelloBoard("2", "name2", new ArrayList<>()));
        trelloBoards.add(new TrelloBoard("3", "name3", new ArrayList<>()));

        //When
        List<TrelloBoard> resultList = trelloValidator.validateTrelloBoards(trelloBoards);

        //Then
        assertEquals(3, resultList.size());
        assertEquals("name1", resultList.get(0).getName());
    }
}