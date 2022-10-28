package com.cedaniel200.todolist.domain.lists;

import com.cedaniel200.todolist.domain.model.ToDoList;
import com.cedaniel200.todolist.domain.persistence.ListRepository;
import org.junit.jupiter.api.Test;

public class ListMediatorDefaultTest {
    @Test
    void shouldCreateAListSuccessful(){
        ToDoList toDoList = ToDoList.builder()
                .name("Cosas por hacer")
                .descripcion("Mis cosas por hacer esta semana")
                .user("wceballosh@devco.com")
                .build();

        ListMediador mediator = new ListMediatorDefault(new ListRepository() {
            @Override
            public ToDoList save(ToDoList toDoList1){
                toDoList.setId(1);
                return toDoList;
            }
        });

    }

    @Test
    void shouldThrowAnIlegalArgumentExceptionWhenFieldsAreNotCorrect(){

    }

}
