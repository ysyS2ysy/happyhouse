package com.ssafy.vue.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.vue.model.MemoDto;
import com.ssafy.vue.model.service.MemoService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/memo")
public class MemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private MemoService memoService;
	
	@GetMapping("/{articleno}")
	public ResponseEntity<List<MemoDto>> getMemoList(@PathVariable("articleno") int articleno) throws Exception{
		System.out.println("getMemoList - 호출 : "+articleno);
		logger.info("getMemoList - 호출 : "+articleno);
		return new ResponseEntity<List<MemoDto>>(memoService.getMemoList(articleno), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<String> writeMemo(@RequestBody MemoDto memoDto) throws Exception {
		logger.info("writeMemo - 호출");
		System.out.println(memoDto.getUserid() +", "+ memoDto.getComment());
		if(memoService.writeMemo(memoDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	@PutMapping("/recommend")
	public ResponseEntity<String> addRecommend(@RequestBody MemoDto memoDto) throws Exception {
		logger.info("addRecommend - 호출");
		System.out.println(memoDto.getMemono() +", "+ memoDto.getRecommend());
		memoService.addRecommend(memoDto);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}
	@DeleteMapping("/{memono}")
	public ResponseEntity<String> deleteMemo(@PathVariable("memono") int memono) throws Exception {
		logger.info("deleteMemo - 호출");
		System.out.println(memono);
		memoService.deleteMemo(memono);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}
}
