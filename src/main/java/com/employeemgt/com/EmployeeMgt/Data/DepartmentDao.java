package com.employeemgt.com.EmployeeMgt.Data;

import com.employeemgt.com.EmployeeMgt.Entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class DepartmentDao extends AbstractDao<Department> {

    @Autowired
    @Override
    public void setDataSource(@Qualifier(value ="mabiSqlDataSource" ) DataSource src) {
        this.jdbcTemplate = new JdbcTemplate(src);
        this.jdbcTemplate.setResultsMapCaseInsensitive(true);
        this.findall = new SimpleJdbcCall(jdbcTemplate)
                .withProcedureName("proc_find_all_departments")
                .returningResultSet(SINGLE_RESULT, (new BeanPropertyRowMapper(Department.class)));
    }

}
