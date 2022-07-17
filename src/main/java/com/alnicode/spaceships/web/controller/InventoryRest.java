package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.model.domain.dto.inventory.InventoryRequest;
import com.alnicode.spaceships.model.domain.dto.inventory.InventoryResponse;
import com.alnicode.spaceships.model.domain.service.GenericService;
import com.alnicode.spaceships.model.domain.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The inventory rest controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RestController
@RequestMapping("/inventories")
public class InventoryRest extends GenericRest<InventoryRequest, InventoryResponse> {

    @Autowired
    private InventoryService service;

    @Override
    protected GenericService<InventoryRequest, InventoryResponse> service() {
        return service;
    }

    /**
     * Get a inventory by the name.
     *
     * @param name the name to search.
     * @return a response entity with the response found.
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<InventoryResponse> getByName(@PathVariable("name") String name) {
        return ResponseEntity.of(service.getByName(name));
    }

}
