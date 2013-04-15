Singleton
============
Permite la creacción de una sola instacia de una clase.
Hay muchos objetos de los cuales necesitamos que exista tan solo uno, por ejemplo, objetos para loguear, objetos que manejan preferencias, drivers, etc. En estos casos el echo de que haya mas de un objeto nos puede llevar a compartamientos incorrectos.
Una manera facil de lograr esto podria ser usando una variable estatica para referenciar el objeto. 
Si bien esto es cierto en java el patron el singleton nos da un punto de acceso global sin los problemas de una varible global como por ejemplo que hay que iniciarla a iniciar la aplicacion, ademas de que no todos los lenguajes de programación soportan varibles estaticas.

Entonces como hacemos para que haya un solo objetos de una clase.

 * Como creamos un objeto: 
 
  ~~~java
     new MyObjet();
  ~~~
  
 * Se puede crear otro objeto de la clase MyObject?
 * Y si no la declaramos publica y la dejamos protected?
 * Y si hacemos esto?
  ~~~java   
     public MyClass(){
         private MyClass(){}
     }
  ~~~
 * Se puede instanciar una clase asi?

   Se podría llamar desde la misma clase pero para esto necesitaria una instancia, y no puedo tener una instancia porque no la puedo instanciar.
   Sería como que esta primero el huevo o la gallina.
 * Y si le agregamos un metodo asi se puede llamar?
  ~~~java   
     public MyClass(){
         private MyClass(){}
         public static MyClass getInstance(){}
     }
  ~~~
  Se puede porque es un método de clase para lo cual no necesitamos una instancia de la clase para llamarlo.
  Asi sería la invocación:
  ~~~java   
     MyClass.getInstance();
  ~~~
Con esto ya casi tenemos la forma de instanciar el objeto con un constructor privado.

Escribamoslo
------------
singleton clasico
-----------------

  ~~~java
    public class Singleton {
    	private static Singleton uniqueInstance;
     
    	private Singleton() {}
     
    	public static Singleton getInstance(){
    		if (uniqueInstance == null) {
    			uniqueInstance = new Singleton();
    		}
    		return uniqueInstance;
    	}
        //resto del codigo
    }
  ~~~
  
Explicación
-----------
  ~~~java
    private static Singleton uniqueInstance;
  ~~~
  Varible estática que guarda una instancia de la clase Singleton.
  
  ~~~java
    private Singleton() {}
  ~~~
  El constructor se declara privado, solo puede ser accedido por Singleton.
  
  ~~~java
    public static Singleton getInstance(){
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
  ~~~
 getInstance() nos da una forma de instanciar la clase y devuelve la unica instncia de Singleton. Solo crea una instancia en el caso de que no haya una guardada en la varible estática y la devulve.
 
La fabrica de chocolate
-----------------------
Vamos a hacer un controlador de una parte del proceso de una fabrica de chocolate. Vamos a controlar un hervidor cuya tarea es llenarse con una mezcla de leche y chocolate y llevarlos a puto de evullicion para recien ahi poder seguir con otra parte del proceso.

El codigo previene de que se pueda vaciar cuando la mezcla todavía no esta hervida o que se pueda llenar cuando esta lleno.
  ~~~java
    public class ChocolateBoiler {
    	private boolean empty;
    	private boolean boiled;
      
    	public ChocolateBoiler() {
    		empty = true;
    		boiled = false;
    	}
      
    
    	public void fill() {
    		if (isEmpty()) {
    			empty = false;
    			boiled = false;
    			// fill the boiler with a milk/chocolate mixture
    		}
    	}
     
    	public void drain() {
    		if (!isEmpty() && isBoiled()) {
    			// drain the boiled milk and chocolate
    			empty = true;
    		}
    	}
     
    	public void boil() {
    		if (!isEmpty() && !isBoiled()) {
    			// bring the contents to a boil
    			boiled = true;
    		}
    	}
      
    	public boolean isEmpty() {
    		return empty;
    	}
     
    	public boolean isBoiled() {
    		return boiled;
    	}
    }
  ~~~

Que pasaría se instanciara mas de una instancia de la clase  **ChocolateBoiler**

pag 179

2nd paragraph. *Italic*, **bold**, `monospace`. Itemized lists
look like:

  * this one
  * that one
  * the other one

Note that --- not considering the asterisk --- the actual text
content starts at 4-columns in.

> Block quotes are
> written like so.
>
> They can span multiple paragraphs,
> if you like.

Use 3 dashes for an em-dash. Use 2 dashes for ranges (ex. "it's all in
chapters 12--14"). Three dots ... will be converted to an ellipsis.



An h2 header
------------

Here's a numbered list:

 1. first item
 2. second item
 3. third item

Note again how the actual text starts at 4 columns in (4 characters
from the left side). Here's a code sample:

    # Let me re-iterate ...
    for i in 1 .. 10 { do-something(i) }

As you probably guessed, indented 4 spaces. By the way, instead of
indenting the block, you can use delimited blocks, if you like:

~~~
define foobar() {
    print "Welcome to flavor country!";
}
~~~

(which makes copying & pasting easier). You can optionally mark the
delimited block for Pandoc to syntax highlight it:

~~~python
import time
# Quick, count to ten!
for i in range(10):
    # (but not *too* quick)
    time.sleep(0.5)
    print i
~~~



### An h3 header ###

Now a nested list:

 1. First, get these ingredients:

      * carrots
      * celery
      * lentils

 2. Boil some water.

 3. Dump everything in the pot and follow
    this algorithm:

        find wooden spoon
        uncover pot
        stir
        cover pot
        balance wooden spoon precariously on pot handle
        wait 10 minutes
        goto first step (or shut off burner when done)

    Do not bump wooden spoon or it will fall.

Notice again how text always lines up on 4-space indents (including
that last line which continues item 3 above). Here's a link to [a
website](http://foo.bar). Here's a link to a [local
doc](local-doc.html). Here's a footnote [^1].

[^1]: Footnote text goes here.

Tables can look like this:

size  material      color
----  ------------  ------------
9     leather       brown
10    hemp canvas   natural
11    glass         transparent

Table: Shoes, their sizes, and what they're made of

(The above is the caption for the table.) Here's a definition list:

apples
  : Good for making applesauce.
oranges
  : Citrus!
tomatoes
  : There's no "e" in tomatoe.

Again, text is indented 4 spaces. (Alternately, put blank lines in
between each of the above definition list lines to spread things
out more.)

Inline math equations go in like so: $\omega = d\phi / dt$. Display
math should get its own line and be put in in double-dollarsigns:

$$I = \int \rho R^{2} dV$$

Done.