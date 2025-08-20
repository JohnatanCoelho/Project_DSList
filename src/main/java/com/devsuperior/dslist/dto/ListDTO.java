package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import org.hibernate.mapping.List;
import org.springframework.beans.BeanUtils;

public class ListDTO {

    private Long id;
    private String name;

    public ListDTO(){
    }

    public ListDTO(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
