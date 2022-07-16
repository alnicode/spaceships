package com.alnicode.spaceships.persistence.mapper;

import com.alnicode.spaceships.util.constants.RoboticSpaceshipConstants;
import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipRequest;
import com.alnicode.spaceships.domain.dto.robotic.RoboticSpaceshipResponse;
import com.alnicode.spaceships.persistence.entity.robotic.RoboticSpaceship;
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
public interface RoboticSpaceshipMapper extends BaseMapper<RoboticSpaceship, RoboticSpaceshipResponse> {

    /**
     * Map a robotic spaceship entity to the response dto.
     *
     * @param entity the entity to map.
     * @return the response mapped.
     */
    RoboticSpaceshipResponse toResponse(RoboticSpaceship entity);

    /**
     * Map a robotic spaceship request dto to the entity.
     *
     * @param request the request to map.
     * @return the entity mapped.
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "inventory", ignore = true)
    @Mapping(target = "weight", expression = RoboticSpaceshipConstants.MAP_WEIGHT)
    @Mapping(target = "height", expression = RoboticSpaceshipConstants.MAP_HEIGHT)
    @Mapping(target = "thrust", expression = RoboticSpaceshipConstants.MAP_THRUST)
    @Mapping(target = "speed", expression = RoboticSpaceshipConstants.MAP_SPEED)
    RoboticSpaceship toEntity(RoboticSpaceshipRequest request);

}
