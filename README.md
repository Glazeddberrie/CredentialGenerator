# 🪪 Generador de Credenciales de Evento

![Java](https://img.shields.io/badge/Java-21%2B-green)
![License](https://img.shields.io/badge/License-GNU-green)

Sistema para generar credenciales personalizadas para eventos de todo tipo, implementando patrones de diseño avanzados.

## 👨‍🎓 Estudiante(s)
- **Gabriella Jujihara y José Diaz** - Patrones de Diseño (Sección 2)

## 🎯 Objetivo del Proyecto
Este sistema permite emitir credenciales personalizadas para eventos de todo tipo, utilizando:
- **Patrón Prototype**: Para clonar plantillas base de credenciales y personalizarlas eficientemente
- **Patrón Singleton**: Para gestionar los metodos de control de manera consistente e irredundante.

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
```
bash
git clone https://github.com/Glazeddberrie/CredentialGenerator.git
cd CredentialGenerator
```
2.Compilar y ejecutar:
```
mvn clean package
cd ./target
java -jar credentialgenerator-1.0-SNAPSHOT.jar
```
## 🧬 Patrones Implementados
- **🔄 Patrón Prototype**
```
// Ejemplo de uso:
Credencial prototipo = new CredencialPlantilla();
Credencial personalizada = prototipo.clone();
personalizada.setNombreParticipante("Juanito Lechuga");
personalizada.setTipo("Estudiante");
```
- **🔒 Patrón Singleton**
```
// Configuración global del evento
ConfiguracionEvento config = ConfiguracionEvento.getInstancia();
config.setNombreEvento("Conferencia Patrones de Diseño");
config.setFecha("15-Nov-2023");
```

📊 Diagrama de Clases UML

ayuda

📸 Capturas del Sistema

![image](https://github.com/user-attachments/assets/41300392-aae2-432a-803b-28f0fa9989e3)

![image](https://github.com/user-attachments/assets/09c79f5a-e230-4b43-9025-ff0d411426e6)
