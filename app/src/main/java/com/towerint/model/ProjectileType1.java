package com.towerint.model;

import com.towerint.controller.GameEngine;
import com.towerint.R;

public class ProjectileType1 extends Projectile {
    private final static float speed=50000;
    private final static int resource= R.drawable.projectile1;

    ProjectileType1(Way toFollow, GameEngine parent){
        super(toFollow, parent, resource, speed, 90);
        power=30;
        range=100;
    }
}
