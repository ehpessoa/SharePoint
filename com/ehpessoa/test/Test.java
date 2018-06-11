package com.ehpessoa.test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import javax.xml.transform.TransformerException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;

import com.ehpessoa.service.SharePointServiceCached;

public class Test {

	public static void main(String[] args) {
		
	
		SharePointServiceCached test = new SharePointServiceCached();
		
		Long today = new Date().getTime();
		try {
			String token = test.receiveSecurityToken(today);
			System.out.println(token);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
