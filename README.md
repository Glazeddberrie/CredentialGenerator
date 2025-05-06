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

- Prototype es utilizado para crear multiples clones, los cuales funcionan como plantillas para las credenciales y agilizar el flujo del programa.

```
    public void saveCredentialToArray(String eventName, String name, String charge, String rut) {
    try {
        Credential cred = new Credential(
            eventName,
            charge,
            name,
            rut,
            LocalDate.now()
        );
        credentials.add(cred);
        JOptionPane.showMessageDialog(null, "Credencial guardada correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        System.out.println("Error al guardar la credencial: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "No se ha podido guardar la credencial, intentelo nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
    }}
```

- **🔒 Patrón Singleton**

- Singleton es utilizado para evitar redundancias en instancias de la clase Main y poder acceder a los metodos de control de manera mucho más eficiente.
  
```
 public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }
```

**📊 Diagrama de Clases UML**

![image](https://github.com/user-attachments/assets/f360d2f1-7fe1-4c2f-b652-6482d6bcaa82)


**📸 Capturas del Sistema**

![image](https://github.com/user-attachments/assets/41300392-aae2-432a-803b-28f0fa9989e3)

![image](https://github.com/user-attachments/assets/09c79f5a-e230-4b43-9025-ff0d411426e6)
