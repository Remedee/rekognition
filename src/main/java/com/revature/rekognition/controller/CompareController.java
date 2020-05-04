package com.revature.rekognition.controller;

import com.revature.rekognition.model.CompareRequest;
import com.revature.rekognition.model.CompareResult;
import com.revature.rekognition.model.CompareSeveralRequest;
import com.revature.rekognition.model.CompareSeveralResult;
import com.revature.rekognition.service.CompareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compare")
public class CompareController {
  @Autowired
  CompareService compareService;

  private static final Logger LOG = LoggerFactory.getLogger(CompareController.class);

  /**
   * Compare the faces of the images given in the compare request.
   * 
   * @param compareRequest The object containing the images.
   * @return The results of the compare.
   */
  @PostMapping
  public CompareResult compareFaces(@RequestBody CompareRequest compareRequest) {
    LOG.info("Compare Request");
    return compareService.compareFaces(compareRequest);
  }

  /**
   * Compare the faces of the images given in the compare several request against the first image.
   * 
   * @param compareSeveralRequest The object containing the images.
   * @return The results of the compares.
   */
  @PostMapping("/several")
  public CompareSeveralResult compareSeveralFaces(
      @RequestBody CompareSeveralRequest compareSeveralRequest) {
    LOG.info("Compare Several Request");
    return compareService.compareSeveralFaces(compareSeveralRequest);
  }
}
