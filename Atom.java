import java.io.*;
import java.util.*;

public class Atom
{
    private int n;
    private int val;
    private double eN;
    private String symbol;

    public Atom() {
        n = 0;
        val = 0;
        eN = 0.0;
        symbol= "N/A";
    }

    public Atom(int atomicNumber, String sym, int valence, double electroNegativity)
    {
        n = atomicNumber;
        val = valence;
        eN = electroNegativity;
        symbol = sym;
    }

    public int atomicNumber()   {   return n;   }
    public int valence()        {   return val; }
    public double eN()          {   return eN;  }
    public String sym()         {   return symbol;  }
}