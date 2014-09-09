/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository.oracle;

import com.epam.training.taranovski.spring.domain.Admin;
import com.epam.training.taranovski.spring.repository.AdminRepository;
import com.epam.training.taranovski.spring.repository.util.DAOUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alyx
 */
@Repository("adminRepository")
public class AdminRepositoryOracle implements AdminRepository {

    private DataSource ds;

    /**
     *
     * @param ds
     */
    @Autowired
    public AdminRepositoryOracle(DataSource ds) {
        this.ds = ds;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Admin getById(int id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(
                    "select * from \"Admin\" where \"adminId\" = ?"
            );
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();
            Admin admin = null;
            if (resultSet.next()) {
                admin = new Admin();
                admin.setName(resultSet.getString("name"));
                admin.setAdminId(resultSet.getInt("adminId"));
            }

            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(resultSet);
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Admin> getAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(
                    "select * from \"Admin\""
            );

            resultSet = preparedStatement.executeQuery();
            List<Admin> list = new LinkedList<>();
            Admin admin = null;
            if (resultSet.next()) {
                admin = new Admin();
                admin.setName(resultSet.getString("name"));
                admin.setAdminId(resultSet.getInt("adminId"));
                list.add(admin);
            }

            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(resultSet);
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return null;
    }

    /**
     *
     * @param name
     * @return
     */
    @Override
    public Admin getByName(String name) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(
                    "select * from \"Admin\" where name = ?"
            );
            preparedStatement.setString(1, name);

            resultSet = preparedStatement.executeQuery();
            Admin admin = null;
            if (resultSet.next()) {
                admin = new Admin();
                admin.setName(resultSet.getString("name"));
                admin.setAdminId(resultSet.getInt("adminId"));
            }

            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(resultSet);
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return null;
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean create(Admin admin) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement("insert into ");

            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return false;
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean update(Admin admin) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement("");

            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return false;
    }

    /**
     *
     * @param admin
     * @return
     */
    @Override
    public boolean delete(Admin admin) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement("");

            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AdminRepositoryOracle.class.getName()).error(ex);
        } finally {
            DAOUtil.close(preparedStatement);
            DAOUtil.close(connection);
        }
        return false;
    }

}
