package com.microservice.beer.beer.controller;

import com.microservice.beer.beer.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@RestController
public class BeerController{

	private static final Integer DEFAULT_PAGE_NUMBER = 0;
	private static final Integer DEFAULT_PAGE_SIZE = 25;

	private final BeerService beerService;

}