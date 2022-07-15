package com.alnicode.spaceships.persistence.mapper;

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

    SpaceShuttleResponse toResponse(SpaceShuttle entity);

}
