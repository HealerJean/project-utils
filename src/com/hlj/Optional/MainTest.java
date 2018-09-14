package com.hlj.Optional;

import com.hlj.Optional.bean.User;
import org.junit.Test;

import java.util.Optional;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/7  上午11:29.
 */
public class MainTest {


    /**
     * get
     * 如果Optional有值则将其返回，否则抛出NoSuchElementException。
     */


    /**
     * 1、of方法
     * 通过工厂方法创建Optional类。
     * 创建对象时传入的参数不能为null。如果传入参数为null，则抛出NullPointerException 。
     */
    @Test
    public void of() {
        //调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("Sanaulla");
        System.out.println("name:"+name.get());         //name:Sanaulla
        //传入参数为null，抛出NullPointerException.
        Optional<String> someNull = Optional.of(null);// java.lang.NullPointerException
        System.out.println("someNull"+someNull);
    }

    /**
     * 2、 ofNullable (ofNullable与of方法相似，唯一的区别是可以接受参数为null的情况)
     * 为指定的值创建一个Optional，如果指定的值为null，则返回一个空的Optional。
     */
    @Test
    public void ofNullable() {
        //下面创建了一个不包含任何值的Optional实例
        //例如，值为'null'
        Optional<String> empty = Optional.ofNullable(null);
        System.out.println(empty.get()); //java.util.NoSuchElementException: No value present
    }

    /**
     * 3 、isPresent、如果值存在返回true，否则返回false。
     *
     */
    @Test
    public void isPresent() {

        Optional<String> name = Optional.ofNullable("HealerJean");
        Optional<String> namenull = Optional.ofNullable(null);

        //isPresent方法用来检查Optional实例中是否包含值
        if (name.isPresent()) {
            //在Optional实例内调用get()返回已存在的值
            System.out.println(name.get());//HealerJean
        }

        if (!namenull.isPresent()) {
            System.out.println("namenull 为 null");
        }

        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.length());
        });

    }

    /**
     * 4、 orElse
     * 如果有值则将其返回，否则返回指定的其它值。
     */
    @Test
    public void orElse() {
        Optional<String> empty = Optional.empty();
        //如果为null，返回传入的消息。
        //输出：There is no value present!
        System.out.println(empty.orElse("There is no value present!"));


        Optional<String> name = Optional.of("HealerJean");
        //如果值不为null，orElse方法返回Optional实例的值。
        //输出：HealerJean
        System.out.println(name.orElse("There is some value!"));
    }


    /**
     * 5、 orElseGet
     * orElseGet与orElse方法类似，区别在于得到的默认值。
     * orElse方法将传入的字符串作为默认值，orElseGet方法可以接受Supplier接口的实现用来生成默认值。示例如下：
     */
    @Test
    public void orElseGet() {
        Optional<String> empty = Optional.empty();

        Optional<String> name = Optional.of("HealerJean");

        //orElseGet与orElse方法类似，区别在于orElse传入的是默认值，
        //orElseGet可以接受一个lambda表达式生成默认值。
        //输出：Default Value
        System.out.println(empty.orElseGet(() -> "Default Value"));
        //输出：Sanaulla
        System.out.println(name.orElseGet(() -> "Default Value"));

    }

    /**
     * 比较  orElse  orElseGet null一致
     */
    @Test
    public void givenEmptyValue_whenCompare_thenOk() {
        User user = null;
        System.out.println("Using orElse");
        User result = Optional.ofNullable(user).orElse(createNewUser());
        System.out.println("Using orElseGet");
        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
    }

    /**
     * 比较  orElse  orElseGet  非null时候
     * orElse 即使不打印自身也会执行orElse里面的东西，
     * 但是orElseGet 就不会执行，而是直接返回值该有的值
     */
    @Test
    public void givenPresentValue_whenCompare_thenOk() {
        User user = new User("john@gmail.com", "1234");
        System.out.println("Using orElse");
        User result = Optional.ofNullable(user).orElse(createNewUser());
        System.out.println("Using orElseGet");
        User result2 = Optional.ofNullable(user).orElseGet(() -> createNewUser());
    }

    private User createNewUser() {
        System.out.println("Creating New User");
        return new User("extra@gmail.com", "1234");
    }



    /**
     * 6、 map
     * 如果有值，则对其执行调用mapping函数得到返回值。
     * 如果返回值不为null，则创建包含mapping返回值的Optional作为map方法返回值，否则返回空Optional。
     * flatMap方法与map方法类似，区别在于mapping函数的返回值不同。map方法的mapping函数返回值可以是任何类型T，
     * 而flatMap方法的mapping函数必须是Optional。
     */
    @Test
    public void map() {
        //map方法执行传入的lambda表达式参数对Optional实例的值进行修改。
        //为lambda表达式的返回值创建新的Optional实例作为map方法的返回值。
        Optional<String> name = Optional.ofNullable("HealerJean");
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("No value found"));
    }


    /**
     * 7、filter
     * filter个方法通过传入限定条件对Optional实例的值进行过滤。文档描述如下：
     */
    @Test
    public void filter() {
        //filter方法检查给定的Option值是否满足某些条件。
        //如果满足则返回同一个Option实例，否则返回空Optional。
        Optional<String> name = Optional.of("HealerJean");
        Optional<String> longName = name.filter((value) -> value.length() > 6);
        System.out.println(longName.orElse("The name is less than 6 characters"));//输出Sanaulla

        //另一个例子是Optional值不满足filter指定的条件。
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter((value) -> value.length() > 6);
        //输出：name长度不足6字符
        System.out.println(shortName.orElse("The name is less than 6 characters"));
    }
}
