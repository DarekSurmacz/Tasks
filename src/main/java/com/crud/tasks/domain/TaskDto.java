package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskDto { //data transfer object
    private Long id;
    private String title;
    private String content;

}
