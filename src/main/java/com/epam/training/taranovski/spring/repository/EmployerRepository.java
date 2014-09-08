/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import com.epam.training.taranovski.spring.domain.Employer;
import com.epam.training.taranovski.spring.domain.Vacancy;
import java.util.List;

/**
 *
 * @author Oleksandr_Taranovsky
 */
public interface EmployerRepository {

    Employer getById(int id);

    List<Employer> getAll();

    boolean create(Employer employer);

    boolean update(Employer employer);

    boolean delete(Employer employer);

    boolean addVacancy(Employer employer, Vacancy vacancy);

    boolean removeVacancy(Employer employer, Vacancy vacancy);

    boolean clearVacancies(Employer employer);

    List<Vacancy> getVacancys(Employer employer);

    boolean addCheckDocument(Employer employer, CheckDocument checkDocument);

    boolean removeCheckDocument(Employer employer, CheckDocument checkDocument);

    boolean clearCheckDocuments(Employer employer);

    List<CheckDocument> getCheckDocuments(Employer employer);

}
