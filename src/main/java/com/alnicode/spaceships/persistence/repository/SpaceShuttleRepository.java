package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.SpaceShuttle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The {@link SpaceShuttle} repository.
 *
 * @author Alben Bustamante
 * @version 1.0
 * @since 1.0
 */
public interface SpaceShuttleRepository extends JpaRepository<SpaceShuttle, Long> {
}
