# divisor-de-cuentas

En Costa Rica, a lo que se consume en un restaurante se le suma el 13 % de IVA y el 10 % de servicio, y después hay que repartir el total entre varias personas. El programa hace todo ese cálculo.

## Qué hace

1. Pregunta cuántas personas van a pagar.
2. Pregunta cuántos productos (comidas y refrescos) se pidieron y el precio de cada uno.
3. Suma los precios para obtener el subtotal.
4. Le agrega el 13 % de IVA y el 10 % de servicio, calculados sobre el subtotal.
5. Muestra el subtotal, el total y cuánto le toca pagar a cada persona, con dos decimales.

No acepta 0 personas, 0 productos ni precios negativos. Si alguien escribe uno de esos valores, el programa lo vuelve a pedir.

## Cómo ejecutarlo

Se necesita tener instalado Java (JDK 17 o más reciente).

**En VS Code:** abra la carpeta del proyecto, abra `Divisordecuentas.java` y presione **Run** encima del método `main`.

**Desde la terminal**, dentro de la carpeta del proyecto:

```bash
javac Divisordecuentas.java
java Divisordecuentas
```

## Ejemplo

Cuatro personas que pidieron tres productos de ₡4 500, ₡6 200 y ₡2 800:

```
Bienvenido al Divisor de cuentas.

Si no sabes cuánto tienes que pagarle al restaurante,
estás en el lugar correcto

Ingrese la cantidad de personas que pagan: 
4
Ingrese la cantidad de comidas y/o refrescos que pidió: 
3
Precio del producto 1: 
4500
Precio del producto 2: 
6200
Precio del producto 3: 
2800
-----------------------------------------------
    Información de pago    

-Monto subtotal completo: CRC 13500.00

-Monto total completo: CRC 16605.00

-Monto subtotal por persona CRC 3375.00

-Monto total por persona: CRC 4151.25

-----------------------------------------------
```

## Próximos pasos

- Preguntar al final si se quiere calcular otra cuenta.
- Una versión web, con una página HTML y un servidor en Java.

## Autor

Matías Cubero ([@matiascubero24](https://github.com/matiascubero24))

Mi primer proyecto personal usando GitHub, VS Code, Java y HTML.
