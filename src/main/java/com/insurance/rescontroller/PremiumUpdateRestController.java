package com.insurance.rescontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumUpdateService;

@RestController
public class PremiumUpdateRestController {

	/*PremiumUpdateService reference is injected into PremiumUpdateRestController class
	 * with the help of @Autowired annotation
	 */

	@Autowired
	private PremiumUpdateService premiumUpdateService;
	//Design API to update premium details into database

	@PutMapping("/updatePremiumDetails")
	public Premium updatePremiumDetails(@RequestBody Premium premium) {
		Premium premium2 = premiumUpdateService.updatePremiumDetails(premium);
		return premium2;
	}

}
