package exception;

public class NoExceptionUtil {

    public static <P,R> R  get(P p, IExceptionHandler<P,R> function){
        try {
            return function.transfer(p);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}