package com.alnicode.spaceships.persistence.mapper;

import java.util.List;
import org.mapstruct.Mapper;

/**
 * The base entity/dto mapper.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface BaseMapper<Entity, Response> {

    /**
     * Map an entity list to the response list.
     *
     * @param entities the list to map.
     * @return the list mapped.
     */
    List<Response> toResponses(List<Entity> entities);

}
