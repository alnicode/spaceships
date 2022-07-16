package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleRequest;
import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleResponse;
import com.alnicode.spaceships.domain.service.SpaceShuttleService;
import com.alnicode.spaceships.domain.service.ThrustSpaceshipService;
import com.alnicode.spaceships.persistence.entity.SpaceShuttle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The space shuttle rest controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RestController
@RequestMapping("/space-shuttles")
public class SpaceShuttleController extends ThrustSpaceshipController<SpaceShuttle, SpaceShuttleRequest, SpaceShuttleResponse> {

    @Autowired
    private SpaceShuttleService service;

    @Override
    protected ThrustSpaceshipService<SpaceShuttle, SpaceShuttleRequest, SpaceShuttleResponse> thrustService() {
        return service;
    }

    /**
     * Get all the spaceships with the same transport.
     *
     * @param transport the transport to search.
     * @return a response entity with the spaceships found.
     */
    @GetMapping("/transport/{transport}")
    public ResponseEntity<List<SpaceShuttleResponse>> getByTransport(@PathVariable("transport") String transport) {
        return ResponseEntity.of(service.getByTransport(transport));
    }

    /**
     * Get all the spaceships with the same power.
     *
     * @param power the power to search.
     * @return a response entity with the spaceships found.
     */
    @GetMapping("/power/{power}")
    public ResponseEntity<List<SpaceShuttleResponse>> getByPower(@PathVariable("power") String power) {
        return ResponseEntity.of(service.getByPower(power));
    }

}
