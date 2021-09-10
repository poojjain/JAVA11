import java.lang.reflect.Method;

public class NestBasedAccess {

    public void outerPublic() {
        System.out.println("outer public method");
    }

    private void outerPrivate() {
        System.out.println("outer private method");
    }

    class Inner {

        public void innerPublic() {
            System.out.println("inner public method");
            outerPrivate();
        }

        public void innerPublicWithReflection(Object obj) throws Exception {
            System.out.println("inner public with reflection method");
            Method method = obj.getClass().getDeclaredMethod("outerPrivate");
            method.invoke(obj);
        }

    }

    public static void main(String[] args) throws Exception {
        NestBasedAccess nba = new NestBasedAccess();
        NestBasedAccess.Inner inner = nba.new Inner();
        inner.innerPublic();
        inner.innerPublicWithReflection(nba);
    }

}
