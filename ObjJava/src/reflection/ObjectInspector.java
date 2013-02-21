package reflection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ObjectInspector {
	
	 private void inspectObject (Object o) {
	       
	        //1.Obtenemos la clase
	        Class clazz = o.getClass();
	        
	        //2.recorremos sus methods
	        for (int i=0; i< clazz.getMethods().length;i++){
	            System.out.println("/************************************/");
	            Method mthd = clazz.getMethods()[i]; //obtenemos la info del metodo
	            String mthd_name = mthd.getName();
	            //Que retorno tiene
	            String mthd_return_type = mthd.getReturnType().getName();
	            //Modificadores de acceso que tiene
	            String mthd_modifiers = Modifier.toString(mthd.getModifiers());
	            //Args que acepta, si no es getter
	            Class[] params = mthd.getParameterTypes();
	            StringBuffer lst_params = new StringBuffer();
	            for(int z=0;z < params.length;z++){
	                lst_params.append(params[z].getName() + " ");
	            }
	            //Trazas
	            System.out.println("Method--> "+mthd_modifiers+ " " +mthd_return_type  +" " + mthd_name +"("+ lst_params +")");
	           
	            //ejecutamos el metodo pasandole el objeto en el que queremos
	            //invocarlo (o), como args paso null,porque no tenemos args ya que
	            //solo nos interesan los getters 
	           
	           
	            try {
	                Object value = (Object)mthd.invoke(o, null);
	                System.out.println("returns --> " + value);
	            } catch (IllegalArgumentException e) {
	                System.out.println("Argumentos al metodo no validos, acepta "+ lst_params);
	               
	            } catch (IllegalAccessException e) {
	                System.out.println("Este metodo no es accesible " + mthd_modifiers);
	            } catch (InvocationTargetException e) {
	                System.out.println("Error al invocar, no devuelve valor , es  "+ mthd_return_type);
	            }
	           
	        }
	 }
}

