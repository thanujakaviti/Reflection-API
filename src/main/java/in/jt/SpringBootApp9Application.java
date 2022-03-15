package in.jt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp9Application {

	public static void main(String[] args) 
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		SpringApplication.run(SpringBootApp9Application.class, args);
		/*
		 * 	how can we load bytecode
		 *  by using forName(-)
		 */
		
		Class cls = java.lang.Class.forName("in.jt.A");
		Class superclass1 = cls.getSuperclass();  //B
		Class superclass2 = superclass1.getSuperclass(); //C
		System.out.println(superclass1);
		
		
		
		System.out.println(superclass2);
		Object obj = cls.newInstance();
		
		
		System.out.println("cls: "+cls);
		System.out.println("obj: "+obj);
		
		//getting variable information from byte code
		System.out.println("==============variables information======================");
		Field [] f = cls.getDeclaredFields();  // f[0]=b  f[1]=a
		
		for(Field f1 : f) {
			int modifier = f1.getModifiers();	//b: 1 --> public
												//a: 2 --> private
			String modifierName = Modifier.toString(modifier);
		
			System.out.println(f1);
			System.out.println(f1.getType());
			System.out.println(f1.getModifiers());
			System.out.println("modifier: "+modifierName);
			//System.out.println("\t"+f1.get(obj));
			
			if(modifierName.equals("private")) {
				f1.setAccessible(true);
				System.out.println("\t"+f1.get(obj));
			}
			else {
				System.out.println("\t"+f1.get(obj));
			}
		}
		System.out.println("===============constructors information=====================");
		Constructor [] c = cls.getDeclaredConstructors();
		for(Constructor c1: c) {
			System.out.println(c1);
		}
		
		
		System.out.println("===============methods information=====================");
		Method[] m = cls.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println(m1);
			Class[] ec = m1.getExceptionTypes();
			for(Class ec1 : ec) {
				System.out.println(ec1);
			}
		}
	}
}
