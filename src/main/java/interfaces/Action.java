/*
 *    Rizat.Orazalina created on 27.11.2021
 */

package interfaces;

public interface Action extends Runable, Jumpable {
    public String getName();
    public int getMaxDistance();
}
