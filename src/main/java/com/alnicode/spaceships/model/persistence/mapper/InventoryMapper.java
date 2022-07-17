package com.alnicode.spaceships.model.persistence.mapper;

import com.alnicode.spaceships.model.domain.dto.inventory.InventoryRequest;
import com.alnicode.spaceships.model.domain.dto.inventory.InventoryResponse;
import com.alnicode.spaceships.model.persistence.entity.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * The inventory entity/dto mapper.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Mapper(componentModel = "spring")
public interface InventoryMapper extends BaseMapper<Inventory, InventoryResponse> {

    /**
     * Map an inventory entity to the response dto.
     *
     * @param entity the entity to map.
     * @return the response mapped.
     */
    InventoryResponse toResponse(Inventory entity);

    /**
     * Map an inventory request dto to the entity.
     *
     * @param request the request to map.
     * @return the entity mapped.
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "spacecrafts", ignore = true)
    Inventory toEntity(InventoryRequest request);

}
