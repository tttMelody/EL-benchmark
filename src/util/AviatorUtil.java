package util;

import com.googlecode.aviator.AviatorEvaluator;
import fun.AviatorFun;

import java.util.Map;

/**
 * Created by AH on 2016/12/2.
 */
public class AviatorUtil {

    static {
        AviatorEvaluator.addFunction( new AviatorFun() );
    }

    public static boolean evaluation ( String expression, Map< String, Object > context ) {
        return ( boolean ) AviatorEvaluator.compile( expression, true ).execute( context );
    }

    public static void regAviatorUtilMethod () {
        AviatorEvaluator.addFunction( new AviatorFun() );
    }
}
