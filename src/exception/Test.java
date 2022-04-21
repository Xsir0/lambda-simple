package exception;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Test {

    public List<String> te() throws Exception {
        return Arrays.asList("hello", " xsir");
    }

    public static void main(String[] args) {
        String aaa = NoExceptionUtil.get("aaa", ((IExceptionHandler<String, List<String>>) s -> new Test().te())
                .andThen(strings -> StringUtils.join(strings, ",")));
        System.out.println(aaa);
    }

}