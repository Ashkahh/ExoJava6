package Partie3;

public class exo2 {
  public static <T> T alea(T un, T deux){
    return Math.random() > 0.5? un : deux;
  }
}