package com.alnicode.spaceships.domain.service.impl;

import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipResponse;
import com.alnicode.spaceships.domain.service.RoboticSpaceshipService;
import com.alnicode.spaceships.persistence.entity.RoboticSpaceship;
import com.alnicode.spaceships.persistence.mapper.BaseMapper;
import com.alnicode.spaceships.persistence.mapper.RoboticSpaceshipMapper;
import com.alnicode.spaceships.persistence.repository.RoboticSpaceshipRepository;
import com.alnicode.spaceships.persistence.repository.SpacecraftRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The robotic spaceship service implementation.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Service
public class RoboticSpaceshipServiceImpl implements RoboticSpaceshipService {

    @Autowired
    private RoboticSpaceshipRepository repository;

    @Autowired
    private RoboticSpaceshipMapper mapper;

    @Override
    public RoboticSpaceshipResponse create(RoboticSpaceshipRequest roboticSpaceshipRequest) {
        return mapper.toResponse(repository.save(mapper.toEntity(roboticSpaceshipRequest)));
    }

    @Override
    public List<RoboticSpaceshipResponse> getAll() {
        return mapper.toResponses(repository.findAll());
    }

    @Override
    public Optional<RoboticSpaceshipResponse> get(long id) {
        return repository.findById(id).map(mapper::toResponse);
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> findBySpeed(String speed) {
        return repository.findBySpeed(speed).map(mapper::toResponses);
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> findByDestinyOrbit(String destinyOrbit) {
        return repository.findByDestinyOrbit(destinyOrbit).map(mapper::toResponses);
    }

    @Override
    public void touchDown(RoboticSpaceshipRequest request) {
    }

    @Override
    public BaseMapper<RoboticSpaceship, RoboticSpaceshipResponse> mapper() {
        return mapper;
    }

    @Override
    public SpacecraftRepository<RoboticSpaceship> repository() {
        return repository;
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> findByThrust(String thrust) {
        return repository.findByThrust(thrust).map(mapper::toResponses);
    }

}
