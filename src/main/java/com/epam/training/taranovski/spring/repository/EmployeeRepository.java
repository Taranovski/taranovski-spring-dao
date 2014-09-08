/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.taranovski.spring.repository;

import com.epam.training.taranovski.spring.domain.CheckDocument;
import com.epam.training.taranovski.spring.domain.Employee;
import com.epam.training.taranovski.spring.domain.Skill;
import java.util.List;

/**
 *
 * @author Oleksandr_Taranovsky
 */
public interface EmployeeRepository extends TemplateRepository<Employee> {

    Employee getByCredentials(String firstName, String lastName, String patronymic);

    boolean addSkill(Employee employee, Skill skill);

    boolean removeSkill(Employee employee, Skill skill);

    boolean clearSkills(Employee employee);

    List<Skill> getSkills(Employee employee);

    CheckDocument getCheckDocument(Employee employee);
}
