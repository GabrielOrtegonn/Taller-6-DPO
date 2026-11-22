# Taller 6 – GUIs con Swing y Java2D (Restaurantes)

Aplicación para llevar un diario de restaurantes visitados y por visitar: lista con detalles, ventana para agregar restaurantes marcando su ubicación en un mapa y ventana con el mapa de todos los restaurantes (o sólo los visitados).

## Contenido de la entrega
- `src/` – código fuente (proyecto Eclipse completo con `.project` y `.classpath`).
- `imagenes/` – mapa y estrellas que usa la interfaz.
- `diagrama_clases.png` – diagrama de clases de la aplicación completa.

## Cómo ejecutar

**Con Eclipse**
1. `File > Import > General > Existing Projects into Workspace` y seleccionar esta carpeta.
2. Clic derecho sobre `uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal` > `Run As > Java Application`.

**Desde la terminal** (Java 11 o superior). Hay que ejecutar desde la carpeta raíz del proyecto, porque las imágenes se cargan con rutas relativas (`./imagenes/...`):
```
javac -encoding UTF-8 -d bin $(find src -name "*.java")
java -cp bin uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal
```

## Uso
- **Lista de restaurantes:** al seleccionar uno se muestran su nombre, calificación (estrellas) y si fue visitado.
- **Nuevo:** abre la ventana para crear un restaurante (nombre, calificación, visitado y clic en el mapa para marcar la ubicación). El nombre es obligatorio.
- **Ver todos:** abre el mapa con los nombres de los restaurantes; los radio buttons permiten ver "Todos" o sólo los "Visitados".
