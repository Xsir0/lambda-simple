package exception;

import java.util.function.Function;

public interface IExceptionHandler<P,R> extends Function<P,R> {

    @Override
    @Deprecated
    default R apply(P p){
        throw new RuntimeException("");
    };

    default <V> IExceptionHandler<P, V> andThen(IExceptionHandler<? super R, ? extends V> after) {
        return (P p) -> after.transfer(transfer(p));
    }

    R transfer(P p) throws Exception;

}