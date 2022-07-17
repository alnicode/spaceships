package com.alnicode.spaceships.model.domain.service;

import com.alnicode.spaceships.exceptions.ItemAlreadyExistsException;
import java.util.List;
import java.util.Optional;

/**
 * The generic interface with some crud methods.
 *
 */
public interface GenericService<Request, Response> {

    /**
     * Create a new element.
     *
     * @param request the request to be saved.
     * @return the response saved.
     */
    Response create(Request request) throws ItemAlreadyExistsException;

    /**
     * Get all the registered elements.
     *
     * @return a list with the elements.
     */
    List<Response> getAll();

    /**
     * Get an element by the id.
     *
     * @param id the id to search.
     * @return an optional of the element found.
     */
    Optional<Response> get(long id);

    /**
     * Find an element by the name.
     *
     * @param name the name to search.
     * @return an optional of the element found.
     */
    Optional<Response> getByName(String name);

}
