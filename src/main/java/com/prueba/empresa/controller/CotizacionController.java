package com.prueba.empresa.controller;

import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.empresa.entities.Cotizacion;
import com.prueba.empresa.services.CotizacionService;


@RestController
@RequestMapping("api/cotizacion")
public class CotizacionController {

private static Logger logger = (Logger) LogManager.getLogger(CotizacionController.class);
	
	@Autowired
	CotizacionService Cotizacionservice;
	
	@GetMapping("/calcular")
	public Cotizacion getCotizacion(@RequestParam("valor")String valor) {
		Cotizacion dtoCotizacion= null;
		
		dtoCotizacion = Cotizacionservice.Cotizar(Float.parseFloat(valor));
		
		return dtoCotizacion;
	}

}
