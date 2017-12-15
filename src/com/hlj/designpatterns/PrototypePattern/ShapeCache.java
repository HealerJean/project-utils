package com.hlj.designpatterns.PrototypePattern;

import java.util.Hashtable;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����2:56:28 
 * @Description:
 */

public class ShapeCache {
    
   private static Hashtable<String, Shape> shapeMap 
      = new Hashtable<String, Shape>();

   public static Shape getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);
      return (Shape) cachedShape.clone();
   }

   // ��ÿ����״���������ݿ��ѯ������������״
   // shapeMap.put(shapeKey, shape);
   // ���磬����Ҫ���������״
   public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
      shapeMap.put(circle.getId(),circle);

      Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(),rectangle);
   }
}
