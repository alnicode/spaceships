package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.Spacecraft;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface SpacecraftRepository {

    /**
     * Find an element by the weight.
     *
     * @param weight the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Spacecraft>> findByWeight(String weight);

    /**
     * Find an element by the height.
     *
     * @param height the height to search.
     * @return an optional of the elements found.
     */
    Optional<List<Spacecraft>> findByHeight(String height);

    /**
     * Find an element by the fuel.
     *
     * @param fuel the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Spacecraft>> findByFuel(String fuel);

    /**
     * Find an element by the state.
     *
     * @param state the state to search.
     * @return an optional of the elements found.
     */
    Optional<List<Spacecraft>> findByState(String state);

    /**
     * Find an element by the inventory id.
     *
     * @param inventoryId the inventory to search.
     * @return an optional of the elements found.
     */
    Optional<List<Spacecraft>> findByInventoryId(long inventoryId);

}
