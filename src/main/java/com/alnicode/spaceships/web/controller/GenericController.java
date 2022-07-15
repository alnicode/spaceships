package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.domain.service.GenericService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * The abstract generic rest controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public abstract class GenericController<Request, Response> {

    /**
     * Set the service to use.
     *
     * @return the service.
     */
    protected abstract GenericService<Request, Response> service();

    /**
     * Register a new element.
     *
     * @param request the request to save.
     * @return a response entity of the registered element.
     */
    @PostMapping
    public ResponseEntity<Response> register(@RequestBody Request request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service().create(request));
    }

    /**
     * Get all the registered elements.
     *
     * @return a response entity of the list with the elements.
     */
    @GetMapping
    public ResponseEntity<List<Response>> getAll() {
        return ResponseEntity.ok(service().getAll());
    }

    /**
     * Get an element by the id.
     *
     * @param id the id to search.
     * @return a response entity with the response found.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Response> get(@PathVariable("id") long id) {
        return ResponseEntity.of(service().get(id));
    }

}
