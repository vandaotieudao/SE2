package com.example.tut9.to_do.adapter;

import com.example.tut9.to_do.adapter.adapter.SquarePegAdapter;
import com.example.tut9.to_do.adapter.round.RoundHole;
import com.example.tut9.to_do.adapter.round.RoundPeg;
import com.example.tut9.to_do.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole hole = new RoundHole(15);
		RoundPeg peg = new RoundPeg(15);
		//TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
	 if (hole.fits(peg)){
		 System.out.println("OKKKKKKKKKKKKKKKK");
	 }
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
		SquarePeg peg1 = new SquarePeg(15);
		SquarePeg peg2 = new SquarePeg(5);

		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter  
		SquarePegAdapter adapter1 = new SquarePegAdapter(peg1);
		SquarePegAdapter adapter2 = new SquarePegAdapter(peg2);

		//TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance 
		//show a suitable message
	 if(hole.fits(adapter1)){
		 System.out.println("that is OKkkkkkkkk");
	 }
		//TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance 
		//show a suitable message
		if(hole.fits(adapter2)){
			System.out.println("nooooooooooooooooooooo");
		}
	}
}