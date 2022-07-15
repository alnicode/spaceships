package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.RoboticSpaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The {@link RoboticSpaceship} repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface RoboticSpaceshipRepository extends JpaRepository<RoboticSpaceship, Long> {
}
