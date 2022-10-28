package com.cedaniel200.todolist.domain.lists;

import com.cedaniel200.todolist.domain.model.ToDoList;
import com.cedaniel200.todolist.domain.persistence.ListRepository;

import static com.cedaniel200.todolist.domain.util.StringUtils.*;

public class ListMediatorDefault implements ListMediador {

    private ListRepository listRepository;

    public ListMediatorDefault(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    //HAcer que este reciba el metodo extraido por constructor e inyectarlo a infraestructura
    public ToDoList create(ToDoList toDoList){
        validate(toDoList);
        ToDoList listSaved = ListRepository.save(toDoList);
        return toDoList;
    }


   //Extraer el metodo
    private void validate(ToDoList toDoList) {
        StringBuilder details=new StringBuilder();
        if(isNullOrBlank(toDoList.getName()))details.append("Name is empty").append("\n");
        if(isNullOrBlank(toDoList.getUser()))details.append("User is empty").append("\n");

        if(!isNotNullOrBlank(toDoList.getUser()) &&
                isNotEmail(toDoList.getUser())) details.append("The user does not have the email format").append("\n");


        if(details.length() != 0 )
            throw new IllegalArgumentException(details.toString());
    }


}
