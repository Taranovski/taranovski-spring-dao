/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import com.epam.training.taranovski.spring.repository.CheckDocumentRepository;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("checkDocumentRepository")
public class CheckDocumentRepositoryOracle implements CheckDocumentRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public CheckDocumentRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public CheckDocument getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<CheckDocument> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param checkDocument
     * @return
     */
    @Override
    public boolean create(CheckDocument checkDocument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param checkDocument
     * @return
     */
    @Override
    public boolean update(CheckDocument checkDocument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param checkDocument
     * @return
     */
    @Override
    public boolean delete(CheckDocument checkDocument) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
