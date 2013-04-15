Estructura de presentacion de patrones
===================


Estructura
------------

![factoryMethod.png](/home/pablo/workspace/filminas/MDfactroy/factoryMethod.png "")

Problema
--------
Una clase necesita instanciar otra clase derivada de una tercera clase, pero no sabe cuál. Factory Method permite a la clase derivada tomar esta decisión.

Solución
--------
Una clase derivada toma la decisión sobre qué clase instanciar y cómo instanciarla 

Participantes
-------------
* Producto: Define la interfaz de los objetos que crea el método de fabricación.
* ProductoConcreto: Implementa la interfaz Producto.
* Creador: Declara el método de fabricación, el cual devuelve un objeto del tipo Producto. También puede definir una implementación predeterminada del método de fabricación que devuelve un objeto ProductoConcreto. Puede llamar al método de fabricación para crear un objeto Producto.
Cualquier otro método implementado en el abtract Creator están escritos para operar en productos por el factory method.Sólo las subclases implementan el factory method y crean productos
*CreadorConcreto: Redefine el método de fabricación para devolver una instancia de Producto Concreto.

Aplicabilidad
-------------
Usar cuando: 
* Una clase no puede prever la clase de objetos que debe crear.
Una clase quiere que sean sus subclases quienes especifiquen los objetos que ésta crea.
* Las clases delegan la responsabilidad en una de entre varias clases auxiliares, y queremos localizar concretamente en qué subclase de auxiliar se delega.

Consecuencias
-------------
Proporciona enganches para las subclases. Crear objetos dentro de una clase con un método de fabricación es siempre más flexible que hacerlo directamente. Conecta jerarquías de clases paralelas.

Principio de la inversión de dependencias
-----------------------------------------
Debería ser claro que la reducción de las dependencias para crear clases en nuestro código es una cosa buena. De hecho tenemos principio de diseño objetos que formaliza esta noción; aunque tiene un gran nombre formal: Dependancy Inversion Principle (Principio de inversión de dependencia)

**Principio**: dependa de abstracciones, no dependa de clases concretas.

Al principio suena como “programa a una interface no a una implementación”.
Es similar sin embargo el principio de inversión de dependencia hace una declaración más fuerte en cuanto abstracción.
Sugiere que los componentes de alto nivel no deben depender en los de bajo nivel, ya que ambos deben depender de abstracciones.

Un componente de alto nivel es una clase con comportamiento definido en términos de otra “la de bajo nivel”.
Por ejemplo PizzaStore es un componente de alto nivel porque su comportamiento está definido en de pizzas, crea todos los objetos pizzas, los prepara, los cocina, etc mientras las pizzas que usan son de bajo nivel.

### Algunas guias para seguir el principio de inversión de dependencias ###
* Ninguna variable debe referenciar a una clase concreta
Si uno usa new estas referenciando a una clase concreta. Usar factory para hacer esto.
* Ninguna clase debe derivar de una clase concreta
Si uno deriva de una clase concreta, estas dependiendo de una clase concreta.
* Ningun metodo deberia sobreescribir un método implementado de ninguna de sus clases bases.

~~~java
import time
# Quick, count to ten!
public class NYPizzaStore extends PizzaStore {
Pizza createPizza(String item) {
    if (item.equals("cheese")) {
        return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
~~~
