/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import com.epam.training.taranovski.spring.domain.Employer;
import com.epam.training.taranovski.spring.domain.Vacancy;
import com.epam.training.taranovski.spring.repository.EmployerRepository;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("employerRepository")
public class EmployerRepositoryOracle implements EmployerRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public EmployerRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Employer getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Employer> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public boolean create(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public boolean update(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public boolean delete(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @param vacancy
     * @return
     */
    @Override
    public boolean addVacancy(Employer employer, Vacancy vacancy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @param vacancy
     * @return
     */
    @Override
    public boolean removeVacancy(Employer employer, Vacancy vacancy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public boolean clearVacancies(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public List<Vacancy> getVacancys(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @param checkDocument
     * @return
     */
    @Override
    public boolean addCheckDocument(Employer employer, CheckDocument checkDocument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @param checkDocument
     * @return
     */
    @Override
    public boolean removeCheckDocument(Employer employer, CheckDocument checkDocument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public boolean clearCheckDocuments(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param employer
     * @return
     */
    @Override
    public List<CheckDocument> getCheckDocuments(Employer employer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
