package com.alnicode.spaceships.domain.service;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftResponse;
import com.alnicode.spaceships.persistence.entity.Spacecraft;
import com.alnicode.spaceships.persistence.mapper.BaseMapper;
import com.alnicode.spaceships.persistence.repository.SpacecraftRepository;
import java.util.List;
import java.util.Optional;

/**
 * The spacecraft service interface.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface SpacecraftService<Entity extends Spacecraft, Request extends SpacecraftRequest, Response extends SpacecraftResponse> extends GenericService<Request, Response> {

    /**
     * Set the mapper to use.
     *
     * @return the mapper.
     */
    BaseMapper<Entity, Response> mapper();

    /**
     * Set the repository to use.
     *
     * @return the repository.
     */
    SpacecraftRepository<Entity> repository();

    /**
     * Find a spaceship by the name.
     *
     * @param name the name to search.
     * @return an optional of the spaceship found.
     */
    Optional<Response> findByName(String name);

    /**
     * Find an element by the weight.
     *
     * @param weight the weight to search.
     * @return an optional of the elements found.
     */
    default Optional<List<Response>> findByWeight(String weight) {
        return repository().findByWeight(weight).map(mapper()::toResponses);
    }

    /**
     * Find an element by the height.
     *
     * @param height the height to search.
     * @return an optional of the elements found.
     */
    default Optional<List<Response>> findByHeight(String height) {
        return repository().findByHeight(height).map(mapper()::toResponses);
    }

    /**
     * Find an element by the fuel.
     *
     * @param fuel the weight to search.
     * @return an optional of the elements found.
     */
    default Optional<List<Response>> findByFuel(String fuel) {
        return repository().findByFuel(fuel).map(mapper()::toResponses);
    }

    /**
     * Find an element by the state.
     *
     * @param state the state to search.
     * @return an optional of the elements found.
     */
    default Optional<List<Response>> findByState(String state) {
        return repository().findByState(state).map(mapper()::toResponses);
    }

    /**
     * Find an element by the inventory id.
     *
     * @param inventoryId the inventory to search.
     * @return an optional of the elements found.
     */
    default Optional<List<Response>> findByInventoryId(long inventoryId) {
        return repository().findByInventoryId(inventoryId).map(mapper()::toResponses);
    }

}
