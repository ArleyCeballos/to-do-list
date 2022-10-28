package com.cedaniel200.todolist.infrastructure.mappers;

import com.cedaniel200.todolist.domain.model.ToDoList;
import com.cedaniel200.todolist.infrastructure.model.ToDoListInfra;

public class ToDoListMapper {
    public static ToDoList toDoList(ToDoListInfra toDoListInfra){
        ToDoList toDoList=new ToDoList();
        toDoList.setId(toDoListInfra.getId());
        toDoList.setName(toDoListInfra.getName());
        toDoList.setDescripcion(toDoListInfra.getDescripcion());
        toDoList.setUser(toDoListInfra.getUser());
        return toDoList;
    }

    public static ToDoListInfra ToDoListinfra(ToDoList toDoList){
        ToDoListInfra toDoListInfra=new ToDoListInfra();
        toDoListInfra.setId(toDoList.getId());
        toDoListInfra.setName(toDoList.getName());
        toDoListInfra.setDescripcion(toDoListInfra.getDescripcion());
        toDoListInfra.setUser(toDoListInfra.getUser());
        return toDoListInfra;
    }
}
