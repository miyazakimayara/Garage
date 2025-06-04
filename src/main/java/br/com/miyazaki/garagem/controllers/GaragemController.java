/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.miyazaki.garagem.controllers;

import br.com.miyazaki.garagem.entities.Veiculo;
import br.com.miyazaki.garagem.service.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjatb
 */
@RestController
public class GaragemController {
   
    @Autowired
    private GaragemService garagemService;
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll(){
       List<Veiculo> result = garagemService.findAll();
       return result;
    }
}
