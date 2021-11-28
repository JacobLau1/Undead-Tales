import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{

    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public Lvl1()
    {    
        // size 
        super(5000, 560, 1); 
        
        //add background 1
        Lvl1Bg lvl1Bg = new Lvl1Bg();
        addObject(lvl1Bg, 500 * 0, 560 / 2);
        //duplicating background 1
        Lvl1Bg lvl1Bg01 = new Lvl1Bg();
        addObject(lvl1Bg01, 500 * 1, 560 / 2);
        Lvl1Bg lvl1Bg02 = new Lvl1Bg();
        addObject(lvl1Bg02, 500 * 2, 560 / 2);
        Lvl1Bg lvl1Bg03 = new Lvl1Bg();
        addObject(lvl1Bg03, 500 * 3, 560 / 2);
        Lvl1Bg lvl1Bg05 = new Lvl1Bg();
        addObject(lvl1Bg05, 500 * 4, 560 / 2);
        Lvl1Bg lvl1Bg06 = new Lvl1Bg();
        addObject(lvl1Bg06, 500 * 5, 560 / 2);
        Lvl1Bg lvl1Bg07 = new Lvl1Bg();
        addObject(lvl1Bg07, 500 * 6, 560 / 2);
        Lvl1Bg lvl1Bg08 = new Lvl1Bg();
        addObject(lvl1Bg08, 500 * 7, 560 / 2);
        Lvl1Bg lvl1Bg09 = new Lvl1Bg();
        addObject(lvl1Bg09, 500 * 8, 560 / 2);
        Lvl1Bg lvl1Bg010 = new Lvl1Bg();
        addObject(lvl1Bg010, 500 * 9, 560 / 2);
        Lvl1Bg lvl1Bg011 = new Lvl1Bg();
        addObject(lvl1Bg011, 500 * 10, 560 / 2);
        
        //add background 2
        Lvl1bg2 lvl1Bg2 = new Lvl1bg2();
        addObject(lvl1Bg2,500 * 0, 271);
        //duplicating background 2
        Lvl1bg2 lvl1Bg201 = new Lvl1bg2();
        addObject(lvl1Bg201, 500 * 1, 271);
        Lvl1bg2 lvl1Bg202 = new Lvl1bg2();
        addObject(lvl1Bg202, 500 * 2, 271);
        Lvl1bg2 lvl1Bg203 = new Lvl1bg2();
        addObject(lvl1Bg203, 500 * 3, 271);
        Lvl1bg2 lvl1Bg204 = new Lvl1bg2();
        addObject(lvl1Bg204, 500 * 4, 271);
        Lvl1bg2 lvl1Bg205 = new Lvl1bg2();
        addObject(lvl1Bg205, 500 * 5, 271);
        Lvl1bg2 lvl1Bg206 = new Lvl1bg2();
        addObject(lvl1Bg206, 500 * 6, 271);
        Lvl1bg2 lvl1Bg207 = new Lvl1bg2();
        addObject(lvl1Bg207, 500 * 7, 271);
        Lvl1bg2 lvl1Bg208 = new Lvl1bg2();
        addObject(lvl1Bg208, 500 * 8, 271);
        Lvl1bg2 lvl1Bg209 = new Lvl1bg2();
        addObject(lvl1Bg209, 500 * 9, 271);
        Lvl1bg2 lvl1Bg2010 = new Lvl1bg2();
        addObject(lvl1Bg2010, 500 * 10, 271);
        
        //add background 3
        Lvl1Bg3 lvl1Bg3 = new Lvl1Bg3();
        addObject(lvl1Bg3, 500 * 0, 271);
        //duplicating background 3
        Lvl1Bg3 lvl1Bg302 = new Lvl1Bg3();
        addObject(lvl1Bg302, 500 * 1, 271);
        Lvl1Bg3 lvl1Bg303 = new Lvl1Bg3();
        addObject(lvl1Bg303, 500 * 2, 271);
        Lvl1Bg3 lvl1Bg304 = new Lvl1Bg3();
        addObject(lvl1Bg304, 500 * 3, 271);
        Lvl1Bg3 lvl1Bg305 = new Lvl1Bg3();
        addObject(lvl1Bg305, 500 * 4, 271);
        Lvl1Bg3 lvl1Bg306 = new Lvl1Bg3();
        addObject(lvl1Bg306, 500 * 5, 271);
        Lvl1Bg3 lvl1Bg307 = new Lvl1Bg3();
        addObject(lvl1Bg307, 500 * 6, 271);
        Lvl1Bg3 lvl1Bg308 = new Lvl1Bg3();
        addObject(lvl1Bg308, 500 * 7, 271);
        Lvl1Bg3 lvl1Bg309 = new Lvl1Bg3();
        addObject(lvl1Bg309, 500 * 8, 271);
        Lvl1Bg3 lvl1Bg3010 = new Lvl1Bg3();
        addObject(lvl1Bg3010, 500 * 9, 271);
        Lvl1Bg3 lvl1Bg3011 = new Lvl1Bg3();
        addObject(lvl1Bg3011, 500 * 10, 271);
        
        //add background 4
        Lvl1Bg4 lvl1Bg4 = new Lvl1Bg4();
        addObject(lvl1Bg4, 500 * 0, 271);
        //duplicating background 4
        Lvl1Bg4 lvl1Bg402 = new Lvl1Bg4();
        addObject(lvl1Bg402, 500 * 1, 271);
        Lvl1Bg4 lvl1Bg403 = new Lvl1Bg4();
        addObject(lvl1Bg403, 500 * 2, 271);
        Lvl1Bg4 lvl1Bg404 = new Lvl1Bg4();
        addObject(lvl1Bg404, 500 * 3, 271);
        Lvl1Bg4 lvl1Bg405 = new Lvl1Bg4();
        addObject(lvl1Bg405, 500 * 4, 271);
        Lvl1Bg4 lvl1Bg406 = new Lvl1Bg4();
        addObject(lvl1Bg406, 500 * 5, 271);
        Lvl1Bg4 lvl1Bg407 = new Lvl1Bg4();
        addObject(lvl1Bg407, 500 * 6, 271);
        Lvl1Bg4 lvl1Bg408 = new Lvl1Bg4();
        addObject(lvl1Bg408, 500 * 7, 271);
        Lvl1Bg4 lvl1Bg409 = new Lvl1Bg4();
        addObject(lvl1Bg409, 500 * 8, 271);
        Lvl1Bg4 lvl1Bg4010 = new Lvl1Bg4();
        addObject(lvl1Bg4010, 500 * 9, 271);
        Lvl1Bg4 lvl1Bg4011 = new Lvl1Bg4();
        addObject(lvl1Bg4011, 500 * 10, 271);
    }
}
