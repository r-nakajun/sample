 package org.app;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class SampleEchoController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
		SampleForm form = new SampleForm();
		model.addAttribute(form);
		return "views/echo/input";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String echo(@Valid SampleForm sampleForm, BindingResult result) {
		if (result.hasErrors()) {
			return "echo/input";
		}
		return "views/echo/output";
	}

}