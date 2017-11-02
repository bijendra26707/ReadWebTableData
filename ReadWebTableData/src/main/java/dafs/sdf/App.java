package dafs.sdf;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import dafs.sdf.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        try {
			Class c=Class.forName("dafs.sdf.Test");
			Constructor[] constructor=c.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			constructor[0].newInstance(null);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}
