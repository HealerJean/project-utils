package com.hlj.Optional;

import com.hlj.Optional.bean.User;
import org.junit.Test;

import java.util.Optional;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/7  ����11:29.
 */
public class MainTest {


    /**
     * get
     * ���Optional��ֵ���䷵�أ������׳�NoSuchElementException��
     */


    /**
     * 1��of����
     * ͨ��������������Optional�ࡣ
     * ��������ʱ����Ĳ�������Ϊnull������������Ϊnull�����׳�NullPointerException ��
     */
    @Test
    public void of() {
        //���ù�����������Optionalʵ��
        Optional<String> name = Optional.of("Sanaulla");
        System.out.println("name:"+name.get());         //name:Sanaulla
        //�������Ϊnull���׳�NullPointerException.
        Optional<String> someNull = Optional.of(null);// java.lang.NullPointerException
        System.out.println("someNull"+someNull);
    }

    /**
     * 2�� ofNullable (ofNullable��of�������ƣ�Ψһ�������ǿ��Խ��ܲ���Ϊnull�����)
     * Ϊָ����ֵ����һ��Optional�����ָ����ֵΪnull���򷵻�һ���յ�Optional��
     */
    @Test
    public void ofNullable() {
        //���洴����һ���������κ�ֵ��Optionalʵ��
        //���磬ֵΪ'null'
        Optional<String> empty = Optional.ofNullable(null);
        System.out.println(empty.get()); //java.util.NoSuchElementException: No value present
    }

    /**
     * 3 ��isPresent�����ֵ���ڷ���true�����򷵻�false��
     *
     */
    @Test
    public void isPresent() {

        Optional<String> name = Optional.ofNullable("HealerJean");
        Optional<String> namenull = Optional.ofNullable(null);

        //isPresent�����������Optionalʵ�����Ƿ����ֵ
        if (name.isPresent()) {
            //��Optionalʵ���ڵ���get()�����Ѵ��ڵ�ֵ
            System.out.println(name.get());//HealerJean
        }

        if (!namenull.isPresent()) {
            System.out.println("namenull Ϊ null");
        }

        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.length());
        });

    }

    /**
     * 4�� orElse
     * �����ֵ���䷵�أ����򷵻�ָ��������ֵ��
     */
    @Test
    public void orElse() {
        Optional<String> empty = Optional.empty();
        //���Ϊnull�����ش������Ϣ��
        //�����There is no value present!
        System.out.println(empty.orElse("There is no value present!"));


        Optional<String> name = Optional.of("HealerJean");
        //���ֵ��Ϊnull��orElse��������Optionalʵ����ֵ��
        //�����HealerJean
        System.out.println(name.orElse("There is some value!"));
    }


    /**
     * 5�� orElseGet
     * orElseGet��orElse�������ƣ��������ڵõ���Ĭ��ֵ��
     * orElse������������ַ�����ΪĬ��ֵ��orElseGet�������Խ���Supplier�ӿڵ�ʵ����������Ĭ��ֵ��ʾ�����£�
     */
    @Test
    public void orElseGet() {
        Optional<String> empty = Optional.empty();

        Optional<String> name = Optional.of("HealerJean");

        //orElseGet��orElse�������ƣ���������orElse�������Ĭ��ֵ��
        //orElseGet���Խ���һ��lambda���ʽ����Ĭ��ֵ��
        //�����Default Value
        System.out.println(empty.orElseGet(() -> "Default Value"));
        //�����Sanaulla
        System.out.println(name.orElseGet(() -> "Default Value"));

    }

    /**
     * �Ƚ�  orElse  orElseGet nullһ��
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
     * �Ƚ�  orElse  orElseGet  ��nullʱ��
     * orElse ��ʹ����ӡ����Ҳ��ִ��orElse����Ķ�����
     * ����orElseGet �Ͳ���ִ�У�����ֱ�ӷ���ֵ���е�ֵ
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
     * 6�� map
     * �����ֵ�������ִ�е���mapping�����õ�����ֵ��
     * �������ֵ��Ϊnull���򴴽�����mapping����ֵ��Optional��Ϊmap��������ֵ�����򷵻ؿ�Optional��
     * flatMap������map�������ƣ���������mapping�����ķ���ֵ��ͬ��map������mapping��������ֵ�������κ�����T��
     * ��flatMap������mapping����������Optional��
     */
    @Test
    public void map() {
        //map����ִ�д����lambda���ʽ������Optionalʵ����ֵ�����޸ġ�
        //Ϊlambda���ʽ�ķ���ֵ�����µ�Optionalʵ����Ϊmap�����ķ���ֵ��
        Optional<String> name = Optional.ofNullable("HealerJean");
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        System.out.println(upperName.orElse("No value found"));
    }


    /**
     * 7��filter
     * filter������ͨ�������޶�������Optionalʵ����ֵ���й��ˡ��ĵ��������£�
     */
    @Test
    public void filter() {
        //filter������������Optionֵ�Ƿ�����ĳЩ������
        //��������򷵻�ͬһ��Optionʵ�������򷵻ؿ�Optional��
        Optional<String> name = Optional.of("HealerJean");
        Optional<String> longName = name.filter((value) -> value.length() > 6);
        System.out.println(longName.orElse("The name is less than 6 characters"));//���Sanaulla

        //��һ��������Optionalֵ������filterָ����������
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter((value) -> value.length() > 6);
        //�����name���Ȳ���6�ַ�
        System.out.println(shortName.orElse("The name is less than 6 characters"));
    }
}
