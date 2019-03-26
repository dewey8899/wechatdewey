package proxy;

/**
 * Author: Administrator
 * Date 2018/12/26 0026 下午 9:49
 */
public class Client {

    public static void main(String[] args) {
        ProxySubject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
}