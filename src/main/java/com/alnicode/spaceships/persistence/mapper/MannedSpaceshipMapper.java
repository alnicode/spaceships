package com.alnicode.spaceships.persistence.mapper;

import com.alnicode.spaceships.util.constants.MannedSpaceshipConstants;
import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.manned.MannedSpaceshipResponse;
import com.alnicode.spaceships.persistence.entity.MannedSpaceship;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The robotic spaceship entity/dto mapper.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface MannedSpaceshipMapper extends BaseMapper<MannedSpaceship, MannedSpaceshipResponse> {

    /**
     * Map a manned spaceship entity to the response dto.
     *
     * @param entity the entity to map.
     * @return the response mapped.
     */
    MannedSpaceshipResponse toResponse(MannedSpaceship entity);

    /**
     * Map manned spaceship request dto to the entity.
     *
     * @param request the request to map.
     * @return the entity mapped.
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "inventory", ignore = true)
    @Mapping(target = "weight", expression = MannedSpaceshipConstants.MAP_WEIGHT)
    @Mapping(target = "height", expression = MannedSpaceshipConstants.MAP_HEIGHT)
    @Mapping(target = "earthOrbit", expression = MannedSpaceshipConstants.MAP_EARTH_ORBIT)
    @Mapping(target = "peopleCapacity", expression = MannedSpaceshipConstants.MAP_PEOPLE_CAPACITY)
    MannedSpaceship toEntity(MannedSpaceshipRequest request);

}
