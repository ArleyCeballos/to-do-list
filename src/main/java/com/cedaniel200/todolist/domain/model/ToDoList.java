package com.cedaniel200.todolist.domain.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ToDoList {
    private long id;
    private String name;
    private String descripcion;
    private String user;

}
