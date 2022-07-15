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
    public Optional<List<RoboticSpaceshipResponse>> getByImageStatus(boolean imageStatus) {
        return repository.findByImageStatus(imageStatus).map(mapper::toResponses);
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> getBySpeed(String speed) {
        return repository.findBySpeed(speed).map(mapper::toResponses);
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> getByDestinyOrbit(String destinyOrbit) {
        return repository.findByDestinyOrbit(destinyOrbit).map(mapper::toResponses);
    }

    @Override
    public void touchDown(RoboticSpaceshipRequest request) {
        final var entity = repository.findByName(request.getName());

        if (entity.isPresent()) {
            request.touchDown();

            final var spaceship = mapper.toEntity(request);
            spaceship.setId(entity.get().getId());

            repository.save(spaceship);
        }
    }

    @Override
    public void sendImages(RoboticSpaceshipRequest request) {
        final var entity = repository.findByName(request.getName());

        if (entity.isPresent()) {
            request.sendImages();

            final var spaceship = mapper.toEntity(request);
            spaceship.setId(entity.get().getId());

            repository.save(spaceship);
        }
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
    public Optional<RoboticSpaceshipResponse> getByName(String name) {
        return repository.findByName(name).map(mapper::toResponse);
    }

    @Override
    public Optional<List<RoboticSpaceshipResponse>> getByThrust(String thrust) {
        return repository.findByThrust(thrust).map(mapper::toResponses);
    }

}
