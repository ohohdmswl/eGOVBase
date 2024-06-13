package projectNm.user.board.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;
import projectNm.cmmn.model.BoardVO;
import projectNm.user.board.service.BoardService;


@Controller
@RequestMapping(value = "/board/")
public class BoardController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);
	
	/** EgovService */
	@Resource(name = "boardService")
	private BoardService boardService;
	
	
	@ApiOperation(value="게시판 목록 조회", notes="게시판 목록을 조회한다.")
	@RequestMapping(value = "boardListView.do")
	public String boardListView(@ModelAttribute("searchVO") BoardVO searchVO, HttpServletRequest request, 
			HttpServletResponse response, ModelMap model) throws IOException, SQLException, Exception {
		System.out.println("확인1");
		
		//DB연결 test
		model.addAttribute("testBoard",boardService.selectTestBoard(searchVO));
		
		System.out.println("확인2");
		//eGov 페이징 설정
		
		
		
		return "board/boardList";
	}//boardListView
	
	
}
