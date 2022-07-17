package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.model.domain.dto.robotic.RoboticSpaceshipRequest;
import com.alnicode.spaceships.model.domain.dto.robotic.RoboticSpaceshipResponse;
import com.alnicode.spaceships.model.domain.service.RoboticSpaceshipService;
import com.alnicode.spaceships.model.domain.service.ThrustSpaceshipService;
import com.alnicode.spaceships.model.persistence.entity.robotic.RoboticSpaceship;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
public class RoboticSpaceshipRest extends ThrustSpaceshipRest<RoboticSpaceship, RoboticSpaceshipRequest, RoboticSpaceshipResponse> {

    @Autowired
    private RoboticSpaceshipService service;

    @Override
    protected ThrustSpaceshipService<RoboticSpaceship, RoboticSpaceshipRequest, RoboticSpaceshipResponse> thrustService() {
        return service;
    }

    /**
     * Get all the spaceships with the same image status.
     *
     * @param imageStatus the image status to search.
     * @return a response entity with the spaceships.
     */
    @GetMapping("/image-status/{imageStatus}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getByImageStatus(@PathVariable("imageStatus") boolean imageStatus) {
        return ResponseEntity.of(service.getByImageStatus(imageStatus));
    }

    /**
     * Get all the spaceships with the same speed.
     *
     * @param speed the speed to search.
     * @return a response entity with the spaceships.
     */
    @GetMapping("/speed/{speed}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getBySpeed(@PathVariable("speed") String speed) {
        return ResponseEntity.of(service.getBySpeed(speed));
    }

    /**
     * Get all the spaceships with the same destiny orbit.
     *
     * @param destinyOrbit the destiny orbit to search.
     * @return a response entity with the spaceships.
     */
    @GetMapping("/destiny/{destinyOrbit}")
    public ResponseEntity<List<RoboticSpaceshipResponse>> getByDestinyOrbit(@PathVariable("destinyOrbit") String destinyOrbit) {
        return ResponseEntity.of(service.getByDestinyOrbit(destinyOrbit));
    }

    /**
     * The spaceship lands.
     *
     * @param id the spaceship id to land.
     * @return an empty response entity.
     */
    @PostMapping("/{id}/touch-down")
    public ResponseEntity<Object> touchDown(@PathVariable("id") long id) {
        service.touchDown(id);
        return ResponseEntity.noContent().build();
    }

    /**
     * The spaceship send images.
     *
     * @param id the spaceship id for send the images.
     * @return an empty response entity.
     */
    @PostMapping("/{id}/send-images")
    public ResponseEntity<Object> sendImages(@PathVariable("id") long id) {
        service.sendImages(id);
        return ResponseEntity.noContent().build();
    }

}
