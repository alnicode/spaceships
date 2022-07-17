package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.model.domain.dto.thrust.ThrustSpaceshipRequest;
import com.alnicode.spaceships.model.domain.dto.thrust.ThrustSpaceshipResponse;
import com.alnicode.spaceships.model.domain.service.SpacecraftService;
import com.alnicode.spaceships.model.domain.service.ThrustSpaceshipService;
import com.alnicode.spaceships.model.persistence.entity.ThrustSpaceship;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * The thrust spaceship abstract and generic controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public abstract class ThrustSpaceshipRest<Entity extends ThrustSpaceship, Request extends ThrustSpaceshipRequest,
        Response extends ThrustSpaceshipResponse> extends SpacecraftRest<Entity, Request, Response> {

    protected abstract ThrustSpaceshipService<Entity, Request, Response> thrustService();

    @Override
    protected SpacecraftService<Entity, Request, Response> spacecraftService() {
        return thrustService();
    }

    /**
     * Get a spaceship by the thrust.
     *
     * @param thrust the thrust to search.
     * @return a response entity with the spaceships found.
     */
    @GetMapping("/thrust/{thrust}")
    public ResponseEntity<List<Response>> getByThrust(@PathVariable("thrust") String thrust) {
        return ResponseEntity.of(thrustService().getByThrust(thrust));
    }

}
