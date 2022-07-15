package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.Spacecraft;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpacecraftRepository<Entity extends Spacecraft> extends JpaRepository<Entity, Long> {

    /**
     * Find an element by the weight.
     *
     * @param weight the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Entity>> findByWeight(String weight);

    /**
     * Find an element by the height.
     *
     * @param height the height to search.
     * @return an optional of the elements found.
     */
    Optional<List<Entity>> findByHeight(String height);

    /**
     * Find an element by the fuel.
     *
     * @param fuel the weight to search.
     * @return an optional of the elements found.
     */
    Optional<List<Entity>> findByFuel(String fuel);

    /**
     * Find an element by the state.
     *
     * @param state the state to search.
     * @return an optional of the elements found.
     */
    Optional<List<Entity>> findByState(String state);

    /**
     * Find an element by the inventory id.
     *
     * @param inventoryId the inventory to search.
     * @return an optional of the elements found.
     */
    Optional<List<Entity>> findByInventoryId(long inventoryId);

}
