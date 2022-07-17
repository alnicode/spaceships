package com.alnicode.spaceships.model.domain.service;

import com.alnicode.spaceships.model.domain.dto.shuttle.SpaceShuttleRequest;
import com.alnicode.spaceships.model.domain.dto.shuttle.SpaceShuttleResponse;
import com.alnicode.spaceships.model.persistence.entity.SpaceShuttle;
import java.util.List;
import java.util.Optional;

/**
 * The space shuttle service template.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface SpaceShuttleService extends ThrustSpaceshipService<SpaceShuttle, SpaceShuttleRequest, SpaceShuttleResponse> {

    /**
     * Find a space shuttle by the transport.
     *
     * @param transport the transport to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<SpaceShuttleResponse>> getByTransport(String transport);

    /**
     * Find a space shuttle by the power.
     *
     * @param power the power to search.
     * @return an optional of the spaceships found.
     */
    Optional<List<SpaceShuttleResponse>> getByPower(String power);

}
