package com.example.tut9.to_do.to_do.adapter.adapter;

import tuts.tut9.complete.adapter.round.RoundPeg;
import tuts.tut9.complete.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
	//TO-DO: Declare an attribute: name = peg, type = SquarePeg

    //TO-DO: Declare the constructor with a parameter

    //TO-DO: Implement getRadius() method
    @Override
    public double getRadius() {
        double result = 0;
        // Calculate a minimum circle radius, which can fit this peg.
        //TO-DO: result = Square Root [(getWidth() of SquarePeg/2)^2) * 2)]
        
        return result;
    }
}