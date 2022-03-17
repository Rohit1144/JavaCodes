package com.demo.serviceipl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.productrepository.RatingRepositary;
import com.demo.service.RatingService;

@Component
public class RatingServiceImp implements RatingService {
	
	
	@Autowired
	RatingRepositary rateRepos;

	@Override
	public Rating addRatingDetails(Rating rate) {
		
		return rateRepos.save(rate);
	}
	
	public Rating saveRating(Rating rate) {
        Product product = rate.getProduct();
        product.setRatings(rate);
        rate = rateRepos.save(rate);
        return rate;
    }

}
