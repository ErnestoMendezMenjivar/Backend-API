/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.Backend.dao;

import com.backend.Backend.entity.Cliente;
import com.backend.Backend.entity.Region;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author duglas
 */
public interface IClienteDao extends JpaRepository<Cliente, Long>{
    
    @Query("from Region")
    public List<Region> findAllRegiones();
    
}
