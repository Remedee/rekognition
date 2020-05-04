package com.revature.rekognition.model;

import java.io.Serializable;
import com.amazonaws.services.rekognition.model.CompareFacesMatch;
import com.amazonaws.services.rekognition.model.ComparedFace;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompareResult implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = -3468697716860306081L;

  @JsonProperty("RequestParameters")
  private CompareRequest requestParameters;

  @JsonProperty("MatchedFace")
  private CompareFacesMatch matchedFace;

  @JsonProperty("UnmatchedFace")
  private ComparedFace unmatchedFace;
}
