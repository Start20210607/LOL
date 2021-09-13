package com.tx.dao.impl;

import com.tx.dao.HeroDao;
import com.tx.pojo.Hero;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class HeroDaoImpl implements HeroDao {

    //使用JdbcTemplate模板对象
    private JdbcTemplate jdbcTemplate;

    public  void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Hero> findAll() {
        return jdbcTemplate.query("select name,gender,Rskill from t_hero",
                new BeanPropertyRowMapper<Hero>(Hero.class));
    }
}
