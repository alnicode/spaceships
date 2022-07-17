package com.alnicode.spaceships.model.domain.service;

import com.alnicode.spaceships.model.domain.dto.thrust.ThrustSpaceshipRequest;
import com.alnicode.spaceships.model.domain.dto.thrust.ThrustSpaceshipResponse;
import com.alnicode.spaceships.model.persistence.entity.ThrustSpaceship;
import java.util.List;
import java.util.Optional;

public interface ThrustSpaceshipService<Entity extends ThrustSpaceship, Request extends ThrustSpaceshipRequest,
        Response extends ThrustSpaceshipResponse> extends SpacecraftService<Entity, Request, Response> {

    /**
     * Find an element by the thrust.
     *
     * @param thrust the thrust to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<Response>> getByThrust(String thrust);

}
