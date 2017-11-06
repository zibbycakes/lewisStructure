import java.io.*;
import java.util.*;

public class lewisMain
{
    public static void main(String[] args)
    {
        Atom h = new Atom(1,"H",1,2.2);

        System.out.println(h.sym() + " is atomic # " + h.atomicNumber() + " with " + h.valence()+ " valence electrons.");
    }
}