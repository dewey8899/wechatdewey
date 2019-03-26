package proxy;

/**
 * Author: Administrator
 * Date 2018/12/26 0026 下午 9:48
 */
public class RealSubject implements Subject {

    private String name = "duwei";

    @Override
    public void visit() {
        System.out.println(name);
    }
}
