/**
 * Author: Administrator
 * Date 2018/12/26 0026 下午 9:19
 */
interface food{}

class A implements food{}
class B implements food{}

interface produce{ food get();}

class FactoryForA implements produce{
    @Override
    public food get() {
        return new A();
    }
}
class FactoryForB implements produce{
    @Override
    public food get() {
        return new B();
    }
}
public class AbstractFactory {
    public void ClientCode(String name){
        food x= new FactoryForA().get();
        x = new FactoryForB().get();
    }

    public static void main(String[] args) {
        AbstractFactory af = new AbstractFactory();
        af.ClientCode("");

    }
}
