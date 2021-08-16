package com.saramrobot.jjamgong;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.saramrobot.jjamgong.dao.QuestionDAO;
import com.saramrobot.jjamgong.model.AnswerVO;
import com.saramrobot.jjamgong.model.QuestionVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:spring/root-context.xml",
		"classpath:spring/dataSource-context.xml"
		})
public class QuestionDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(QuestionDAOTest.class);
	
	@Inject
	private QuestionDAO questionDAO;
	
	@Test
	public void testGetNoteList() throws Exception {
		QuestionVO question = questionDAO.getQuestionByBundle(1);
		logger.info("\n Question List \n " );
		if(question != null) {
			logger.info(question.getQ_question());
			
			List<AnswerVO> answers = questionDAO.getAnswerList(question.getQ_uid());
			
			if(answers.size() > 0) {
				for(AnswerVO list : answers) {
					logger.info(list.getA_answer());
				}
			} else {
				logger.info("답변 데이터가 없습니다.");
			}
		} else {
			logger.info("문제 데이터가 없습니다.");
		}
	}

}