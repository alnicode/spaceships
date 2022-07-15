package com.alnicode.spaceships.domain.service;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftResponse;
import java.util.List;
import java.util.Optional;

/**
 * The spacecraft service interface.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface SpacecraftService<Request extends SpacecraftRequest, Response extends SpacecraftResponse> extends GenericService<Request, Response> {

    /**
     * Find an element by the weight.
     *
     * @param weight the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Response>> findByWeight(String weight);

    /**
     * Find an element by the height.
     *
     * @param height the height to search.
     * @return an optional of the elements found.
     */
    Optional<List<Response>> findByHeight(String height);

    /**
     * Find an element by the fuel.
     *
     * @param fuel the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Response>> findByFuel(String fuel);

    /**
     * Find an element by the state.
     *
     * @param state the state to search.
     * @return an optional of the elements found.
     */
    Optional<List<Response>> findByState(String state);

    /**
     * Find an element by the inventory id.
     *
     * @param inventoryId the inventory to search.
     * @return an optional of the elements found.
     */
    Optional<List<Response>> findByInventoryId(long inventoryId);

}
