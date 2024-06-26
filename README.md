
![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Java Add and Update (Añadir y Actualizar)

## Introducción

Acabamos de aprender a usar las solicitudes POST y PUT, así que practiquemos un poco más.

<br>

## Instrucciones

Cree las rutas a continuación de la manera más eficiente posible usando la validación donde sea apropiado.

1. **Añadir nuevo paciente**: Crea una ruta para agregar un nuevo paciente.

POST http://localhost:8080/employees/newEmployee
```JSON: 
{
   "patientName": "Lourdes Castellet",
   "dateOfBirth": "1994-09-25",
   "admittedBy": {
      "employeeId" : 564134
   }
}
```

2. **Añadir nuevo doctor**: Crea una ruta para agregar un nuevo doctor.

POST http://localhost:8080/employees/newEmployee

```JSON: 
{
"employeeId": 123456,
"department": "neurology",
"employeeName": "Leila Castellet",
"status": "ON"
}
```

3. **Cambiar el estado del doctor**: Crea una ruta para cambiar el estado de un doctor.

PUT http://localhost:8080/employees/654321/updateEmployee

```JSON: 
{
"status": "OFF"
}
```

4. **Actualizar el departamento del doctor**: Crea una ruta para actualizar el departamento de un doctor.

PUT http://localhost:8080/employees/654321/updateEmployee

```JSON: 
{
"department": "immunology"
}
```

5. **Actualizar la información del paciente**: Crea una ruta para actualizar la información del paciente (el usuario debería poder actualizar cualquier información del paciente a través de esta ruta).

PUT http://localhost:8080/patients/1/updatePatient

```
{
    "patientName": "Lorena Castellet",
    "dateOfBirth": "2000-07-26",
    "admittedBy": 156545
}
```


6. **Escribir una respuesta corta en README.md**. En su `README.md` escriba una respuesta corta a las siguientes preguntas:

   - ¿Usó el mismo tipo de ruta para actualizar la información del paciente y para actualizar un departamento de empleados?
   - ¿Por qué eligió la estrategia que eligió?
   - ¿Cuáles son las ventajas e inconvenientes de las estrategias que eligió para crear estas rutas?
   - ¿Cuáles son los compromisos entre `PUT` y `PATCH`?

**Mi respuesta:**
Elegí usar la misma ruta tanto para actualizar los datos de un paciente como para cambiar el departamento de un empleado.
La ventaja (de mi elección) es que con un método, puedo cambiar todo. La desventaja es que se tarda más en hacer, y si no se pueden/deben cambiar esos atributos, sería innecesario.
PATCH es para un cambio específico mientras que PUT es para más de un cambio.


<br>

