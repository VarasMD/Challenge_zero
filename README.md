# Challenge Zero — Android Authentication UI

Aplicación Android que implementa un flujo de autenticación completo con pantallas de **Bienvenida**, **Login** y **Registro**, construida íntegramente con **Jetpack Compose** y **Material3**.

---

## Capturas de pantalla

|             Bienvenida             |             Login              |             Registro             |
| :--------------------------------: | :----------------------------: | :------------------------------: |
| Pantalla de inicio con ilustración | Formulario de inicio de sesión | Formulario de creación de cuenta |

---

## Estructura del proyecto

```
app/src/main/java/com/example/challenge0/
├── MainActivity.kt                  # Entry point, gestión de navegación
└── ui/
    ├── components/
    │   ├── AuthComponents.kt        # AuthTextField, TopIllustrationImage
    │   ├── PrimaryActionButton.kt   # Botón primario/secundario reutilizable
    │   └── SocialLoginRow.kt        # Fila de iconos de login social
    ├── screen/
    │   ├── WelcomeScreen.kt         # Pantalla de bienvenida
    │   ├── LoginScreen.kt           # Pantalla de inicio de sesión
    │   └── RegisterScreen.kt        # Pantalla de registro
    └── theme/
        ├── Color.kt                 # Paleta de colores
        ├── Theme.kt                 # Configuración del tema (claro/oscuro/dinámico)
        └── Type.kt                  # Tipografía
```

---

## Pantallas

### WelcomeScreen

Pantalla inicial con una ilustración decorativa, el mensaje _"Discover Your Dream Job here"_ y dos botones para navegar al Login o al Registro.

### LoginScreen

Formulario con campos de **Email** y **Contraseña**, enlace de _"Forgot your password?"_, botón de _"Sign in"_, enlace para crear cuenta nueva y la fila de login social.

### RegisterScreen

Formulario con campos de **Email**, **Contraseña** y **Confirmar Contraseña**, botón de _"Sign up"_, enlace para ir al login y la fila de login social.

---

## Componentes reutilizables

### `AuthTextField`

Campo de texto con estilo redondeado (`RoundedCornerShape(12.dp)`), soporte para modo contraseña (`PasswordVisualTransformation`) y colores diferenciados en estado enfocado/desenfocado.

### `PrimaryActionButton`

Botón configurable mediante el parámetro `isPrimary`:

- **Primario**: fondo azul (`PrimaryBlue`) con texto blanco.
- **Secundario**: fondo blanco con texto negro y sombra.

### `SocialLoginRow`

Fila con tres íconos de login social (Google, Facebook, Apple), cada uno en un contenedor cuadrado redondeado de 44dp.

---

## Cómo ejecutar el proyecto

### Prerequisitos

- Android Studio **Hedgehog** o superior
- JDK 11+
- Dispositivo/emulador con Android 7.0 (API 24) o superior

### Pasos

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/Challenge_zero.git
   ```

2. Abre el proyecto en **Android Studio**.

3. Sincroniza las dependencias de Gradle.

4. Ejecuta la aplicación en un emulador o dispositivo físico:
   ```bash
   ./gradlew installDebug
   ```

---

## Licencia

Este proyecto fue desarrollado como ejercicio/challenge de UI con Jetpack Compose.
