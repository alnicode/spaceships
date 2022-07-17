package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.model.domain.dto.manned.MannedSpaceshipRequest;
import com.alnicode.spaceships.model.domain.dto.manned.MannedSpaceshipResponse;
import com.alnicode.spaceships.model.domain.service.MannedSpaceshipService;
import com.alnicode.spaceships.model.domain.service.SpacecraftService;
import com.alnicode.spaceships.model.persistence.entity.MannedSpaceship;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The manned spaceship rest controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RestController
@RequestMapping("/manned")
public class MannedSpaceshipRest extends SpacecraftRest<MannedSpaceship, MannedSpaceshipRequest, MannedSpaceshipResponse> {

    @Autowired
    private MannedSpaceshipService service;

    @Override
    protected SpacecraftService<MannedSpaceship, MannedSpaceshipRequest, MannedSpaceshipResponse> spacecraftService() {
        return service;
    }

    /**
     * Get all the spaceships with the same earth orbit.
     *
     * @param earthOrbit the earth orbit to search.
     * @return a response entity with the response found.
     */
    @GetMapping("/earth-orbit/{earthOrbit}")
    public ResponseEntity<List<MannedSpaceshipResponse>> getByEarthOrbit(@PathVariable("earthOrbit") String earthOrbit) {
        return ResponseEntity.of(service.getByEarthOrbit(earthOrbit));
    }

    /**
     * Get all the spaceships with the same people capacity.
     *
     * @param peopleCapacity the people capacity to search.
     * @return a response entity with the response found.
     */
    @GetMapping("/people-capacity/{peopleCapacity}")
    public ResponseEntity<List<MannedSpaceshipResponse>> getByPeopleCapacity(@PathVariable("peopleCapacity") String peopleCapacity) {
        return ResponseEntity.of(service.getByPeopleCapacity(peopleCapacity));
    }

}
