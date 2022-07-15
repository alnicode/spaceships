package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.Inventory;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The {@link Inventory} repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    /**
     * Find an inventory by the name.
     *
     * @param name the name to search.
     * @return an optional of the inventory found.
     */
    Optional<Inventory> findByName(String name);

    /**
     * Find an inventory by the spacecraft id.
     *
     * @param id the spacecraft id to search.
     * @return an optional of the inventory found.
     */
    Optional<Inventory> findBySpacecraftsId(long id);

}
