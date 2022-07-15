package com.alnicode.spaceships.web.controller;

import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftRequest;
import com.alnicode.spaceships.domain.dto.spacecraft.SpacecraftResponse;
import com.alnicode.spaceships.domain.service.GenericService;
import com.alnicode.spaceships.domain.service.SpacecraftService;
import com.alnicode.spaceships.persistence.entity.Spacecraft;

/**
 * The abstract and abstract spacecraft controller.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public abstract class SpacecraftController<Entity extends Spacecraft, Request extends SpacecraftRequest,
        Response extends SpacecraftResponse> extends GenericController<Request, Response> {

    protected abstract SpacecraftService<Entity, Request, Response> spacecraftService();

    @Override
    protected GenericService<Request, Response> service() {
        return spacecraftService();
    }

}
