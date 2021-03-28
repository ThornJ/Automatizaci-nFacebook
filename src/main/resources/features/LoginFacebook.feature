Feature: Log In
  #descripción
@LoginFb
  Scenario Outline: Login Exitoso

    Given Usuario se encuentra en la pantalla de logeo
    When Usuario ingresa clave y contraseña "<caso_prueba>"
    Then Valida el acceso al home del Facebook


    Examples:
      | caso_prueba |
      |  1          |

