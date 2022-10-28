package com.cedaniel200.todolist.infrastructure.persistence;

import com.cedaniel200.todolist.domain.model.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class MemoryListRepository {
    private List lists;

    public MemoryListRepository() {
        lists = new ArrayList();
    }


    public ToDoList save(ToDoList toDoList){
        lists.add(toDoList);
        ToDoList toDoListSaved=new ToDoList();
        toDoListSaved.setId(lists.indexOf(toDoListSaved));
        toDoListSaved.setName(toDoList.getName());
        toDoListSaved.setDescripcion(toDoList.getDescripcion());
        toDoListSaved.setUser(toDoList.getUser());
        return toDoListSaved;
    }
}
