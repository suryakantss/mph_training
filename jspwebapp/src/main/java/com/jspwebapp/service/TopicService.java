package com.jspwebapp.service;

import java.util.ArrayList;
import java.util.List;

public class TopicService {

	public List<String> getAllTopics(){
		List<String> topics = new ArrayList<String>();
		topics.add("Java");
		topics.add("Spring");
		topics.add("JSP");
		return topics;
	}
}
