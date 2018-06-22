package com.logistics.alucard.javaplayground;

public class Player {

    private String name;
    private int lives;
    private int level;
    private int score;

    Player(String name, int lives, int level, int score) {
        this.name = name;
        this.lives = lives;
        this.level = level;
        this.score = score;
    }

    Player() {
        name = "New Player";
        lives  = 3;
        level = 1;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lives=" + lives +
                ", level=" + level +
                ", score=" + score +
                '}';
    }
}
