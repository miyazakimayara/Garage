/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.miyazaki.garagem.repositories;

import br.com.miyazaki.garagem.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjatb
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long>{
    
}
    

