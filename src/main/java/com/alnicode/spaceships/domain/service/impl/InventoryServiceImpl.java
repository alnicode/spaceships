package com.alnicode.spaceships.domain.service.impl;

import com.alnicode.spaceships.domain.dto.inventory.InventoryRequest;
import com.alnicode.spaceships.domain.dto.inventory.InventoryResponse;
import com.alnicode.spaceships.domain.service.InventoryService;
import com.alnicode.spaceships.persistence.mapper.InventoryMapper;
import com.alnicode.spaceships.persistence.repository.InventoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The inventory service implementation.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository repository;

    @Autowired
    private InventoryMapper mapper;

    @Override
    public InventoryResponse create(InventoryRequest inventoryRequest) {
        return mapper.toResponse(repository.save(mapper.toEntity(inventoryRequest)));
    }

    @Override
    public List<InventoryResponse> getAll() {
        return mapper.toResponses(repository.findAll());
    }

    @Override
    public Optional<InventoryResponse> get(long id) {
        return repository.findById(id).map(mapper::toResponse);
    }

    @Override
    public Optional<InventoryResponse> getByName(String name) {
        return repository.findByName(name).map(mapper::toResponse);
    }

    @Override
    public Optional<InventoryResponse> getBySpacecraftsId(long spacecraftId) {
        return repository.findBySpacecraftsId(spacecraftId).map(mapper::toResponse);
    }

}
