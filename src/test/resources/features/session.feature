#language: es
@testsession
Característica: Login
  Yo, como usuario
  Quiero, tener opción para iniciar sesión
  Para ver myStore

  Esquema del escenario: Iniciar sesión
    Dado estoy en la página de la tienda myStore
    Cuando me logueo con mi usuario "<email>" y clave "<password>"
    Entonces valido que debería aparecer nombre de usuario "<fullName>"

    Ejemplos:
      | email                  | password   | fullName        |
      | luzma.coder@gmail.com | Prueba$500 | LuzMarina Apaza |