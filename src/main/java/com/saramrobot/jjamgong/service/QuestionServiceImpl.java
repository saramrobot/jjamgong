package com.saramrobot.jjamgong.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.saramrobot.jjamgong.dao.QuestionDAO;
import com.saramrobot.jjamgong.model.AnswerVO;
import com.saramrobot.jjamgong.model.Question;
import com.saramrobot.jjamgong.model.QuestionVO;

@Service
public class QuestionServiceImpl implements QuestionService {	
	@Inject
	private QuestionDAO questionDAO;
	
	@Override
	public Question getQuestion(int bundle) throws Exception {		
		QuestionVO question = questionDAO.getQuestionByBundle(bundle);
		
		if(question != null) {			
			List<AnswerVO> answers = questionDAO.getAnswerList(question.getQ_uid());
			
			if(answers.size() < 1) {
				return null;
			}
			
			return new Question( question, answers );

		} else {
			return null;
		}
	}

}
