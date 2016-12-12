package com.livingoncodes.vboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.livingoncodes.vboard.entity.Board;
import com.livingoncodes.vboard.repository.BoardRepository;

@Controller
public class BoardController {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(BoardController.class);

	// Autowire repository
	@Autowired
	private BoardRepository boardRepository;
	
	@RequestMapping(value = "/{boardName}", method = RequestMethod.GET)
	public String showBoard(@PathVariable("boardName") String boardName, Model model) {
		
		LOGGER.debug("Rendering view for board: " + boardName);
		
		Board board = boardRepository.findByName(boardName);
		if(board == null) {
			LOGGER.debug("Board not found: " + boardName);
			return "newboard";
		}
			
		// bind board attributes to the model
		model.addAttribute("boardName", boardName);
		model.addAttribute("boardContent", board.getContent());
		
		// renders board.html
		return "board";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerBoard(WebRequest request, RedirectAttributes redirectAttributes) {
	
		System.out.println("Boardname: " + request.getParameter("boardName"));
		System.out.println("Password: " + request.getParameter("password"));
		//return null;
		return "home";		
	}

}