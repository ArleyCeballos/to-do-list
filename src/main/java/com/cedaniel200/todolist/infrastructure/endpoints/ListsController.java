package com.cedaniel200.todolist.infrastructure.endpoints;

import com.cedaniel200.todolist.domain.lists.ListMediatorDefault;
import com.cedaniel200.todolist.domain.model.ToDoList;
import com.cedaniel200.todolist.infrastructure.model.ListError;
import com.cedaniel200.todolist.infrastructure.model.ToDoListInfra;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListsController {

    private ListMediatorDefault listCreator;

    public ListsController(ListMediatorDefault listCreator) {
        this.listCreator = listCreator;
    }

    @PostMapping(path="/Lists")
    public ResponseEntity<ToDoListInfra> create(@RequestBody ToDoListInfra toDoListInfra){
        try {
            ToDoList toDoListToCreate= null;
            ToDoList toDoListCreated = listCreator.create(toDoListToCreate);
            ToDoListInfra toDoListInfraCreated=null;
            return new ResponseEntity<>(toDoListInfra, HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
              return new ResponseEntity(new ListError("Solicitud errada",e.getMessage()), HttpStatus.BAD_REQUEST);
        }catch (Exception e){
            return new ResponseEntity(new ListError("Error inesperado",e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
