package com.alnicode.spaceships.model.persistence.mapper;

import java.util.List;

/**
 * The base entity/dto mapper.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public interface BaseMapper<Entity, Response> {

    /**
     * Map an entity list to the response list.
     *
     * @param entities the list to map.
     * @return the list mapped.
     */
    List<Response> toResponses(List<Entity> entities);

}
