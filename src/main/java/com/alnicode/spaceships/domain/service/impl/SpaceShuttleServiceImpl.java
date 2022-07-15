package com.alnicode.spaceships.domain.service.impl;

import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleRequest;
import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleResponse;
import com.alnicode.spaceships.domain.service.SpaceShuttleService;
import com.alnicode.spaceships.persistence.entity.SpaceShuttle;
import com.alnicode.spaceships.persistence.mapper.BaseMapper;
import com.alnicode.spaceships.persistence.mapper.SpaceShuttleMapper;
import com.alnicode.spaceships.persistence.repository.SpaceShuttleRepository;
import com.alnicode.spaceships.persistence.repository.SpacecraftRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The space shuttle service implementation.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Service
public class SpaceShuttleServiceImpl implements SpaceShuttleService {

    @Autowired
    private SpaceShuttleRepository repository;

    @Autowired
    private SpaceShuttleMapper mapper;

    @Override
    public SpaceShuttleResponse create(SpaceShuttleRequest spaceShuttleRequest) {
        return mapper.toResponse(repository.save(mapper.toEntity(spaceShuttleRequest)));
    }

    @Override
    public List<SpaceShuttleResponse> getAll() {
        return mapper.toResponses(repository.findAll());
    }

    @Override
    public Optional<SpaceShuttleResponse> get(long id) {
        return repository.findById(id).map(mapper::toResponse);
    }

    @Override
    public Optional<List<SpaceShuttleResponse>> findByTransport(String transport) {
        return repository.findByTransport(transport).map(mapper::toResponses);
    }

    @Override
    public Optional<List<SpaceShuttleResponse>> findByPower(String power) {
        return repository.findByPower(power).map(mapper::toResponses);
    }

    @Override
    public BaseMapper<SpaceShuttle, SpaceShuttleResponse> mapper() {
        return mapper;
    }

    @Override
    public SpacecraftRepository<SpaceShuttle> repository() {
        return repository;
    }

    @Override
    public Optional<SpaceShuttleResponse> findByName(String name) {
        return repository.findByName(name).map(mapper::toResponse);
    }

    @Override
    public Optional<List<SpaceShuttleResponse>> findByThrust(String thrust) {
        return repository.findByThrust(thrust).map(mapper::toResponses);
    }
}
