package com.alnicode.spaceships.domain.service;

import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipResponse;
import com.alnicode.spaceships.persistence.entity.MannedSpaceship;
import java.util.List;
import java.util.Optional;

/**
 * The manned spaceship service template.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface MannedSpaceshipService extends SpacecraftService<MannedSpaceship, MannedSpaceshipRequest, MannedSpaceshipResponse> {

    /**
     * Find a manned spaceship by the earth orbit.
     *
     * @param earthOrbit the earth orbit to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<MannedSpaceshipResponse>> getByEarthOrbit(String earthOrbit);

    /**
     * Find a manned spaceship by the people capacity.
     *
     * @param peopleCapacity the capacity to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<MannedSpaceshipResponse>> getByPeopleCapacity(String peopleCapacity);

}
