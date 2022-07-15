package com.alnicode.spaceships.persistence.repository;

import com.alnicode.spaceships.persistence.entity.MannedSpaceship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The {@link MannedSpaceship} repository.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Repository
public interface MannedSpaceshipRepository extends JpaRepository<MannedSpaceship, Long> {
}
