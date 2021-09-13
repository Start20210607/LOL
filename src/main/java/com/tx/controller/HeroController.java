package com.tx.controller;

import com.tx.pojo.Hero;
import com.tx.service.HeroService;

import java.util.List;

public class HeroController {
    private HeroService heroService;

    public void setUserService(HeroService heroService){
        this.heroService = heroService;
    }

    //查询所有用户
    public List<Hero> findAll(){
        return heroService.findAll();
    }
}
