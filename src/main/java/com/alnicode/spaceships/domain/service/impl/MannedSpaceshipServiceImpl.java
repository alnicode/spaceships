package com.alnicode.spaceships.domain.service.impl;

import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipResponse;
import com.alnicode.spaceships.domain.service.MannedSpaceshipService;
import com.alnicode.spaceships.persistence.entity.MannedSpaceship;
import com.alnicode.spaceships.persistence.mapper.BaseMapper;
import com.alnicode.spaceships.persistence.mapper.MannedSpaceshipMapper;
import com.alnicode.spaceships.persistence.repository.MannedSpaceshipRepository;
import com.alnicode.spaceships.persistence.repository.SpacecraftRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The manned spaceship service implementation.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Service
public class MannedSpaceshipServiceImpl implements MannedSpaceshipService {

    @Autowired
    private MannedSpaceshipRepository repository;

    @Autowired
    private MannedSpaceshipMapper mapper;

    @Override
    public MannedSpaceshipResponse create(MannedSpaceshipRequest mannedSpaceshipRequest) {
        return mapper.toResponse(repository.save(mapper.toEntity(mannedSpaceshipRequest)));
    }

    @Override
    public List<MannedSpaceshipResponse> getAll() {
        return mapper.toResponses(repository.findAll());
    }

    @Override
    public Optional<MannedSpaceshipResponse> get(long id) {
        return repository.findById(id).map(mapper::toResponse);
    }

    @Override
    public Optional<List<MannedSpaceshipResponse>> getByEarthOrbit(String earthOrbit) {
        return repository.findByEarthOrbit(earthOrbit).map(mapper::toResponses);
    }

    @Override
    public Optional<List<MannedSpaceshipResponse>> getByPeopleCapacity(String peopleCapacity) {
        return repository.findByPeopleCapacity(peopleCapacity).map(mapper::toResponses);
    }

    @Override
    public BaseMapper<MannedSpaceship, MannedSpaceshipResponse> mapper() {
        return mapper;
    }

    @Override
    public SpacecraftRepository<MannedSpaceship> repository() {
        return repository;
    }

    @Override
    public Optional<MannedSpaceshipResponse> getByName(String name) {
        return repository.findByName(name).map(mapper::toResponse);
    }

}
