package com.hlj.designpatterns.Builder.Item;

import com.hlj.designpatterns.Builder.Packing.Bottle;
import com.hlj.designpatterns.Builder.Packing.Packing;

/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����2:03:47 
 * @Description:
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
       return new Bottle();
    }

    @Override
    public abstract float price();
}