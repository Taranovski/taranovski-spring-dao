/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import java.util.List;

/**
 *
 * @author Oleksandr_Taranovsky
 */
public interface CheckDocumentRepository {

    CheckDocument getById(int id);

    List<CheckDocument> getAll();

    boolean create(CheckDocument checkDocument);

    boolean update(CheckDocument checkDocument);

    boolean delete(CheckDocument checkDocument);
}
