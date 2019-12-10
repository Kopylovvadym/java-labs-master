package ua.kpi.tef.ti71.lab2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Animal animal = new Animal("dog", 4, 1);
        HomeAnimal homeanimal = new HomeAnimal("Jojo", animal);
        Class clss = homeanimal.getClass();

        Method[] method = clss.getDeclaredMethods();
        for(Method md: method){
            System.out.println(md.getName());
            MyAnnotation annotation = (MyAnnotation) md.getAnnotation(MyAnnotation.class);
            if(annotation != null) {
                try {
                    System.out.println(md.toString());
                    Method startEngineMethod = clss.getDeclaredMethod(md.getName());
                    startEngineMethod.setAccessible(true);
                    startEngineMethod.invoke(homeanimal);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Interfaces:");
        Class[] interfaces = clss.getInterfaces();
        for (Class cInterface : interfaces) {
            System.out.println(cInterface.toString());
        }

        System.out.println("Fields:");
        Field[] fields = clss.getDeclaredFields();
        for (Field fld : fields) {
            System.out.println("Name: " + fld.getName());
            System.out.println("Type: " + fld.getType().getName());
            System.out.println("Annotation: " + fld.getAnnotatedType());
        }


        MyInterface homeanimal1 = (MyInterface) Proxy.newProxyInstance(HomeAnimal.class.getClassLoader(), HomeAnimal.class.getInterfaces(), new MyProxy(homeanimal));
        homeanimal1.getNick();
        homeanimal1.setNick("Jojo");
    }
}
