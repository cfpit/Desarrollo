package ar.edu.centro8.daw.dinamico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.centro8.daw.dinamico.model.Cliente;

@RestController
public class ClienteController {
    // endpoint: http://localhost:8080
    @GetMapping("/")
    public String saludar() {
        return "Hola Mundo!";
    }

    // endpoint: http://localhost:8080/Juan
    @GetMapping("/{nombre}")
    public String saludar2(@PathVariable String nombre) {
        return "Hola " + nombre + ", como estas loco!";
    }

    // endpoint: http://localhost:8080/Juan/35
    @GetMapping("/{nombre}/{edad}")
    public String saludar3(@PathVariable String nombre, @PathVariable int edad) {
        return "Hola " + nombre + ", como estas! Veo que tenes " + edad + " años.";
    }

    // RequestParam
    // endpoint: http://localhost:8080/cliente?nombre=Maria&edad=40
    @GetMapping("/cliente")
    public String saludar4(@RequestParam String nombre, @RequestParam int edad) {
        return "Hola " + nombre + ", como estas! Asi que tenes " + edad + " años.";
    }

    // endpoint:
    /*
     * {
     * "nombre":"Pedro",
     * "edad":28
     * }
     */
    @PostMapping("/cliente")
    public String saludar5(@RequestBody Cliente c) {
        return "Hola " + c.getNombre() + ", como estas! Asi que tenes " + c.getEdad() + " años.";
    }

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerCliente() {
        List<Cliente> clientes = new ArrayList<>();
        
        clientes.add(new Cliente("Juan", 25));
        clientes.add(new Cliente("Maria", 30));
        clientes.add(new Cliente("Luis", 20));

        return clientes;
    }

}
