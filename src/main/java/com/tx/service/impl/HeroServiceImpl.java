package com.tx.service.impl;

import com.tx.service.HeroService;
import com.tx.dao.HeroDao;
import com.tx.pojo.Hero;

import java.util.List;

public class HeroServiceImpl implements HeroService {

    private HeroDao heroDao;

    public  void  setUserDao(HeroDao heroDao){
        this.heroDao = heroDao;
    }
    @Override
    public List<Hero> findAll() {
        return heroDao.findAll();
    }
}
