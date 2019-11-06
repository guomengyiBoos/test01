package com.bw.movie.service;

import java.util.List;

import com.bw.movie.domain.Movie;
import com.bw.movie.vo.MovieVo;

public interface MovieService {
	List<Movie> list(MovieVo MovieVo);
}
