package com.chibocorp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.chibocorp.model.Credential;

public class Main {
    private static Main instance;
    private final List<Credential> credentials;

    private Main() {
        credentials = new ArrayList<>();
    }

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    public void refreshTable(JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);
    credentials.forEach(cred -> model.addRow(new Object[]{
        cred.getEventName(),
        cred.getCharge(),
        cred.getName(),
        cred.getRut(),
        cred.getCreationDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    }));
    }

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
    
    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
}
