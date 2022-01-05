package com.ssafy.vue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.HouseDealDto;
import com.ssafy.vue.model.service.HouseDealService;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/search")
public class HouseDealController {

	@Autowired
	private HouseDealService houseDealService;
	
	@GetMapping("/searchByAptName")
	public @ResponseBody List<HouseDealDto> searchByAptName(@RequestParam("keyName") @ApiParam(value="keyName", required = true) String aptName) throws Exception {
		return houseDealService.searchByAptName(aptName);
	}
	
	@GetMapping("/searchByDongName")
	public @ResponseBody List<HouseDealDto> searchByDongName(@RequestParam("keyName") @ApiParam(value="keyName", required = true) String dongName) throws Exception {
		return houseDealService.searchByDongName(dongName);
	}
	
	@GetMapping("/searchByAptNameJaeum")
	public @ResponseBody List<HouseDealDto> searchByAptNameJaeum(@RequestParam("keyName") @ApiParam(value="keyName", required = true) String aptNameJaeum) throws Exception {
		return houseDealService.searchByAptNameJaeum(aptNameJaeum);
	}
	
	@GetMapping("/searchByDongNameJaeum")
	public @ResponseBody List<HouseDealDto> searchByDongNameJaeum(@RequestParam("keyName") @ApiParam(value="keyName", required = true) String dongNameJaeum) throws Exception {
		return houseDealService.searchByDongNameJaeum(dongNameJaeum);
	}
}
