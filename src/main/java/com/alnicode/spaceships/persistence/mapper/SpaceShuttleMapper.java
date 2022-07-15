package com.alnicode.spaceships.persistence.mapper;

import com.alnicode.spaceships.constants.SpaceShuttleConstants;
import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleRequest;
import com.alnicode.spaceships.domain.dto.shuttle.SpaceShuttleResponse;
import com.alnicode.spaceships.persistence.entity.SpaceShuttle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The space shuttle entity/dto mapper.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface SpaceShuttleMapper extends BaseMapper<SpaceShuttle, SpaceShuttleResponse> {

    /**
     * Map a space shuttle entity to the response dto.
     *
     * @param entity the entity to map.
     * @return the response mapped.
     */
    SpaceShuttleResponse toResponse(SpaceShuttle entity);

    /**
     * Map a space shuttle request dto to the entity.
     *
     * @param request the request to map.
     * @return the entity mapped.
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "inventory", ignore = true)
    @Mapping(target = "weight", expression = SpaceShuttleConstants.MAP_WEIGHT)
    @Mapping(target = "height", expression = SpaceShuttleConstants.MAP_HEIGHT)
    SpaceShuttle toEntity(SpaceShuttleRequest request);

}
