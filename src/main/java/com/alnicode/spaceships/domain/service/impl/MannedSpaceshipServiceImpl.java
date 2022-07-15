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
        return null;
    }

    @Override
    public List<MannedSpaceshipResponse> getAll() {
        return null;
    }

    @Override
    public Optional<MannedSpaceshipResponse> get(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<MannedSpaceshipResponse>> findByEarthOrbit(String earthOrbit) {
        return Optional.empty();
    }

    @Override
    public Optional<List<MannedSpaceshipResponse>> findByPeopleCapacity(String peopleCapacity) {
        return Optional.empty();
    }

    @Override
    public BaseMapper<MannedSpaceship, MannedSpaceshipResponse> mapper() {
        return null;
    }

    @Override
    public SpacecraftRepository<MannedSpaceship> repository() {
        return null;
    }
}
