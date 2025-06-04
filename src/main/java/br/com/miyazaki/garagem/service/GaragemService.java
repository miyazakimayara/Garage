/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.miyazaki.garagem.service;

import br.com.miyazaki.garagem.DTO.VeiculoMinDTO;
import br.com.miyazaki.garagem.entities.Veiculo;
import br.com.miyazaki.garagem.repositories.GaragemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<Veiculo> findAll(){
        
        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }
    
    public Veiculo findById(long id){
        Veiculo result = garagemRepository.findById(id);
        return result;
    }
    
    public List<VeiculoMinDTO> findByCor(String cor){
        List<Veiculo> resultVeiculo = garagemRepository.findByCorIgnoreCase(cor);
              
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream()
                .map(x -> new VeiculoMinDTO(x)).toList();
    
    return resultDTO;
    }
    
    public List<VeiculoMinDTO> findByAno(int ano){
        List<Veiculo> resultVeiculo = garagemRepository.findByAno(ano);
              
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream()
                .map(x -> new VeiculoMinDTO(x)).toList();
    
    return resultDTO;
    }
}
