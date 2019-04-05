package com.towerint.Model;

import com.towerint.Controller.GameEngine;

public abstract class Tower extends Printable{
    protected double radius;
    protected double range;
    protected double speedAttack;
    protected double cost;
    protected Projectile projectile;
    protected double manaMax;
    protected double probabilityLooseMana;
    // TODO Eventuellement variable qui définit quelles sont les cibles de la tour

    Tower(int posX, int posY, GameEngine parentEngine, int resource){
        super(posX,posY, parentEngine, resource);
    }

    //TODO: je ne pense pas que tous ces getters soient utiles...
    public double getRadius(){
        return radius;
    };
    public double getRange(){
        return range;
    };
    public double getSpeedAttack(){
        return speedAttack;
    };
    public double getCost(){
        return cost;
    };
    public Projectile getProjectile(){
        return projectile;
    };

    public void faceToPoint(Vector2 v){
        this.setRotation(this.getPosition().diff(v).getTheta()-90);
    }

}
