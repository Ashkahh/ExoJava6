package Partie3;

public class exo1 {
  public static <T> T alea(T[] tableau){
    return tableau[(int) (Math.random() * (tableau.length - 1))];
  } 
}