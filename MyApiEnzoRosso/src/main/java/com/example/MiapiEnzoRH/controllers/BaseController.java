package com.example.MiapiEnzoRH.controllers;

import com.example.MiapiEnzoRH.entities.Base;
import com.example.MiapiEnzoRH.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Base")
public abstract class BaseController <E extends Base, ID extends Serializable> {

    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service){
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<E>> toList() throws Exception {
        List<E> entities = service.toList();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/{id}")
    public Optional<E> findById(@PathVariable ID id) throws Exception {
        return service.findById(id);
    }

    @PostMapping()
    public ResponseEntity<E> create(@RequestBody E entity) throws Exception {
        E createdEmtity = service.create(entity);
        return ResponseEntity.ok(createdEmtity);
    }

    @PutMapping()
    public ResponseEntity<E> update(@RequestBody E entity) throws Exception {
        E updatedEntity = service.update(entity);
        return ResponseEntity.ok(updatedEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) throws Exception {
        service.delete(id);
    }

}