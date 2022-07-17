package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.model.domain.dto.inventory.InventoryResponse;
import com.alnicode.spaceships.model.domain.dto.spacecraft.SpacecraftRequest;
import com.alnicode.spaceships.model.domain.dto.spacecraft.SpacecraftResponse;
import com.alnicode.spaceships.model.domain.service.GenericService;
import com.alnicode.spaceships.model.domain.service.InventoryService;
import com.alnicode.spaceships.model.domain.service.SpacecraftService;
import com.alnicode.spaceships.model.persistence.entity.Spacecraft;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * The abstract and abstract spacecraft controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public abstract class SpacecraftController<Entity extends Spacecraft, Request extends SpacecraftRequest,
        Response extends SpacecraftResponse> extends GenericController<Request, Response> {

    @Autowired
    private InventoryService inventoryService;

    /**
     * Set the spacecraft service.
     *
     * @return the service.
     */
    protected abstract SpacecraftService<Entity, Request, Response> spacecraftService();

    @Override
    protected GenericService<Request, Response> service() {
        return spacecraftService();
    }

    /**
     * Get a spaceship by the name.
     *
     * @param name the name to search.
     * @return a response entity with the response found.
     */
    @GetMapping("/name/{name}")
    public ResponseEntity<Response> getByName(@PathVariable("name") String name) {
        return ResponseEntity.of(spacecraftService().getByName(name));
    }

    /**
     * Get a spaceship by the weight.
     *
     * @param weight the weight to search.
     * @return a response entity with the responses found.
     */
    @GetMapping("/weight/{weight}")
    public ResponseEntity<List<Response>> getByWeight(@PathVariable("weight") String weight) {
        return ResponseEntity.of(spacecraftService().getByWeight(weight));
    }

    /**
     * Get a spaceship by the height.
     *
     * @param height the height to search.
     * @return a response entity with the responses found.
     */
    @GetMapping("/height/{height}")
    public ResponseEntity<List<Response>> getByHeight(@PathVariable("height") String height) {
        return ResponseEntity.of(spacecraftService().getByHeight(height));
    }

    /**
     * Get a spaceship by the fuel.
     *
     * @param fuel the fuel to search.
     * @return a response entity with the responses found.
     */
    @GetMapping("/fuel/{fuel}")
    public ResponseEntity<List<Response>> getByFuel(@PathVariable("fuel") String fuel) {
        return ResponseEntity.of(spacecraftService().getByFuel(fuel));
    }

    /**
     * Get a spaceship by the state.
     *
     * @param state the state to search.
     * @return a response entity with the responses found.
     */
    @GetMapping("/state/{state}")
    public ResponseEntity<List<Response>> getByState(@PathVariable("state") String state) {
        return ResponseEntity.of(spacecraftService().getByState(state));
    }

    /**
     * Get a spaceship by the inventory id.
     *
     * @param inventoryId the inventory ID to search.
     * @return a response entity with the responses found.
     */
    @GetMapping("/inventory/{inventoryId}")
    public ResponseEntity<List<Response>> getByInventory(@PathVariable("inventoryId") long inventoryId) {
        return ResponseEntity.of(spacecraftService().getByInventoryId(inventoryId));
    }

    /**
     * Get the spaceship's inventory.
     *
     * @param spaceshipId the spaceship ID to search.
     * @return a response entity with the inventory found.
     */
    @GetMapping("/{id}/inventory")
    public ResponseEntity<InventoryResponse> getInventory(@PathVariable("id") long spaceshipId) {
        return ResponseEntity.of(inventoryService.getBySpacecraftsId(spaceshipId));
    }

}
