/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.miyazaki.garagem.controllers;

import br.com.miyazaki.garagem.DTO.VeiculoMinDTO;
import br.com.miyazaki.garagem.entities.Veiculo;
import br.com.miyazaki.garagem.service.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<List<VeiculoMinDTO>> findAll(){
       List<VeiculoMinDTO> result = garagemService.findAll();
       if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable long id){
        Veiculo result = garagemService.findById(id);
        
        if (result == null) {
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/color/{corName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByCorIgnoreCase(@PathVariable String corName){
        
        List<VeiculoMinDTO> result = garagemService.findByCor(corName);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/year/{anoName}")
    public ResponseEntity<List<VeiculoMinDTO>> findByAno(@PathVariable int anoName){
        
        List<VeiculoMinDTO> result = garagemService.findByAno(anoName);
        if(result.isEmpty()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(result);
        }
    }
}
