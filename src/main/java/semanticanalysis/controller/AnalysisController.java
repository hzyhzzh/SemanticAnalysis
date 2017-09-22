package semanticanalysis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import edu.hit.ir.ltp4j.Postagger;
import edu.hit.ir.ltp4j.Segmentor;

@Controller
public class AnalysisController {
	
	@RequestMapping(value = "/analysis")
	public String  doJump2Analysis(Model model, HttpServletRequest request) {
		String query = request.getParameter("query");
		if (query != null && !query.equals("")) {
			List<String> words = Segment(query);
			List<String> postags = Postags(words);
			
			model.addAttribute("words", words);
			model.addAttribute("postags", postags);
		}
		// 类所在工程根路径
//		return "forward:/WEB-INF/result.jsp";//??存疑
		
		return "result";
		
	}

	public static List<String> Segment(String sentences) {
		if (Segmentor.create("D:/ltp_data/cws.model") < 0) {// 分词
			// Segmentor.create("ltp_data/cws.model","lexicon.txt")<0
			// Segmentor.create("ltp_data/cws.model","词典");
			System.err.println("load failed");
			return null;
		}
		List<String> words = new ArrayList<String>();// 分词结果
		Segmentor.segment(sentences, words);
		Segmentor.release();
		System.out.println("words:" + words);
		return words;

	}

	public static List<String> Postags(List<String> words) {
		if (Postagger.create("D:/ltp_data/pos.model") < 0) {// 分词
			System.err.println("load failed");
			return null;
		}
		List<String> postags = new ArrayList<String>();
		Postagger.postag(words, postags);
		Postagger.release();
		return postags;
	}

}
