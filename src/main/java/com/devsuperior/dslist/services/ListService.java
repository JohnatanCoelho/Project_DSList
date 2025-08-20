package com.devsuperior.dslist.services;
import com.devsuperior.dslist.dto.ListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class ListService {

    @Autowired
    ListRepository listRepository;

    @Transactional(readOnly = true)
    public List<ListDTO> findAll(){
        List<GameList> result = listRepository.findAll();
        List<ListDTO> dto = result.stream().map(x -> new ListDTO(x)).toList();
        return dto;
    }
}
