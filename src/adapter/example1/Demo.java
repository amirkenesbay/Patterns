package adapter.example1;

import adapter.example1.adapters.SquarePegAdapter;
import adapter.example1.round.RoundHole;
import adapter.example1.round.RoundPeg;
import adapter.example1.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5. " + "Radius: " + smallSqPegAdapter.getRadius());
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5. " + "Radius: " + largeSqPegAdapter.getRadius());
        }
    }
}
