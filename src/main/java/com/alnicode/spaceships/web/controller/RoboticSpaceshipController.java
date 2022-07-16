package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipResponse;
import com.alnicode.spaceships.domain.service.RoboticSpaceshipService;
import com.alnicode.spaceships.domain.service.ThrustSpaceshipService;
import com.alnicode.spaceships.persistence.entity.RoboticSpaceship;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The robotic spaceship rest controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RestController
@RequestMapping("/robotic")
public class RoboticSpaceshipController extends ThrustSpaceshipController<RoboticSpaceship, RoboticSpaceshipRequest, RoboticSpaceshipResponse> {

    @Autowired
    private RoboticSpaceshipService service;

    @Override
    protected ThrustSpaceshipService<RoboticSpaceship, RoboticSpaceshipRequest, RoboticSpaceshipResponse> thrustService() {
        return service;
    }

    @GetMapping("/image-status/{imageStatus}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getByImageStatus(@PathVariable("imageStatus") boolean imageStatus) {
        return ResponseEntity.of(service.getByImageStatus(imageStatus));
    }

    @GetMapping("/speed/{speed}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getBySpeed(@PathVariable("speed") String speed) {
        return ResponseEntity.of(service.getBySpeed(speed));
    }

    @GetMapping("/destiny/{destinyOrbit}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getByDestinyOrbit(@PathVariable("destinyOrbit") String destinyOrbit) {
        return ResponseEntity.of(service.getByDestinyOrbit(destinyOrbit));
    }

    @GetMapping("/touch/{name}")
    public ResponseEntity<Object> touchDown(@PathVariable("name") String name) {
        return null;
    }

    @GetMapping("/")
    public ResponseEntity<Object> sendImages() {
        return null;
    }

}
