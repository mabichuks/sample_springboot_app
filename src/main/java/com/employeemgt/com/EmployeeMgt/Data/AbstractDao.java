package com.employeemgt.com.EmployeeMgt.Data;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class AbstractDao<T> {


    protected static final String SINGLE_RESULT = "single";
    protected JdbcTemplate jdbcTemplate;
    protected SimpleJdbcCall findall;

    public  abstract  void setDataSource(DataSource src);


    @Transactional
    public List<T> findAll() {

        SqlParameterSource src = new MapSqlParameterSource();
        Map<String, Object> m = this.findall.execute(src);
        List<T> t = (List<T>) m.get(SINGLE_RESULT);
        return t;
    }

}
