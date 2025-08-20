package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.services.ListService;
import com.devsuperior.dslist.dto.ListDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/list")
public class ListController {

    @Autowired
    ListService listService;

    @GetMapping
    public List<ListDTO> findall(){
        List<ListDTO> result = listService.findAll();
        return result;
    }
}
