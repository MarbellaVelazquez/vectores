package beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class datos {

    /**
     * @return the V11
     */
    public int getV11() {
        return V11;
    }

    /**
     * @param V11 the V11 to set
     */
    public void setV11(int V11) {
        this.V11 = V11;
    }

    /**
     * @return the V12
     */
    public int getV12() {
        return V12;
    }

    /**
     * @param V12 the V12 to set
     */
    public void setV12(int V12) {
        this.V12 = V12;
    }

    /**
     * @return the V21
     */
    public int getV21() {
        return V21;
    }

    /**
     * @param V21 the V21 to set
     */
    public void setV21(int V21) {
        this.V21 = V21;
    }

    /**
     * @return the V22
     */
    public int getV22() {
        return V22;
    }

    /**
     * @param V22 the V22 to set
     */
    public void setV22(int V22) {
        this.V22 = V22;
    }

    public double Resultado() {
        this.resultado = (getV11()*getV21()+getV12()*getV22());
        return this.resultado;
    }
    
  private int V11;
  private int V12;
  private int V21;
  private int V22;

  private double resultado;

  
}
