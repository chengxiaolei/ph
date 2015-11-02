package com.pose.po.ph.web.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.pose.po.ph.model.User;
import com.pose.po.ph.service.UserService;

public class DictionaryDisplayTag extends TagSupport {
	private int code;
	private UserService userService;
	private String dataType;

	private static final long serialVersionUID = 7849807473932337047L;
	private WebApplicationContext webApplicationContext;

	@Override
	public int doStartTag() throws JspException {
		webApplicationContext = RequestContextUtils.getWebApplicationContext(pageContext.getRequest(), pageContext.getServletContext());
		userService = webApplicationContext.getBean(UserService.class);
		User byCode = userService.findOne(code);
		if (byCode != null) {
			try {
				pageContext.getOut().write(byCode.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return EVAL_BODY_INCLUDE;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

}
