package com.cedaniel200.todolist.infrastructure.config;

import com.cedaniel200.todolist.domain.lists.ListMediatorDefault;
import com.cedaniel200.todolist.domain.persistence.ListRepository;
import com.cedaniel200.todolist.infrastructure.persistence.MemoryListRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListConfiguration {

    @Bean
    public MemoryListRepository providesListrepositoryInstance(){
        return new MemoryListRepository() ;
    }

    @Bean
    public ListMediatorDefault providesListInstance(ListRepository listRepository){
        return new ListMediatorDefault(listRepository);
    }
}
