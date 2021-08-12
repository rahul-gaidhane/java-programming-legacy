package classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LoadClass extends ClassLoader {
	public void loadMyClass(String targetClass, String targetMethod) {
		try {
			ClassLoader instClassLoader = this.getClass().getClassLoader();
			
			Class loadTargetClass = instClassLoader.loadClass(targetClass);
			System.out.println("Loaded target class : " + loadTargetClass.getName());
			
			Constructor targetClassConstructor = loadTargetClass.getConstructor();
			System.out.println("constructor loaded : " + targetClassConstructor.getName());
			
			Object targetClassInstance = targetClassConstructor.newInstance();
			System.out.println("Instance created : ");
			
			Method targetClassMethod = loadTargetClass.getMethod(targetMethod);
			System.out.println("Invoked method name : " + targetClassMethod.getName());
			targetClassMethod.invoke(targetClassInstance);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
