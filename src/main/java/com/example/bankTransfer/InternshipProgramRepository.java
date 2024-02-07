package com.example.bankTransfer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InternshipProgramRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> select() {
        return jdbcTemplate.query("""
                    SELECT * FROM bankTransfer_table
                    """,
                new DataClassRowMapper<>(User.class));
    }

}