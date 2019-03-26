package proxy;

/**
 * Author: Administrator
 * Date 2018/12/26 0026 下午 9:49
 */
public class ProxySubject implements Subject{

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
