package com.bw.movie.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.movie.domain.Movie;
import com.bw.movie.service.MovieService;
import com.bw.movie.vo.MovieVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {
	
	@Resource
	private MovieService movieService;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request,MovieVo movieVo,@RequestParam(defaultValue = "1")int pageNum,Model model) {
    if(movieVo.getOrderField()!=null) {
    	movieVo.setOrderMethod("asc");
    }
    PageHelper.startPage(pageNum, 3);
    List<Movie> list = movieService.list(movieVo);
    PageInfo<Movie> pageInfo = new PageInfo<>(list);
    model.addAttribute("pg",pageInfo);
    model.addAttribute("movieVo", movieVo);
    
	return "list";
	}
}
