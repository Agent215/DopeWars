/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dopewars.items;

/**
 *
 * @author Brahm
 */
/**
 * Created by IntelliJ IDEA.
 * User: jfreeman
 * Date: Aug 15, 2010
 * Time: 5:45:02 PM
 * To change this template use File | Settings | File Templates.
 */
public interface item
{

    double getMinPrice();

    void setMinPrice(double value);

    double getMaxPrice();

    void setMaxPrice(double value);

    double getPrice();

    void setPrice(double value);

    String getName();

    String getDescription();

    void setDescription(String value);

    double generateNewPrice();

    int getTotal();

    void setTotal(int value);

    boolean isActive();

    void setActive(boolean visible);
}