package com.rkz.resources;

import com.rkz.bookstoredomain.Categoria;
import com.rkz.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {


        @Autowired
        private CategoriaService service;

        @GetMapping(value = "/{id}")
        public ResponseEntity<Categoria> findById(@PathVariable Integer id){
            Categoria obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        }
}




