package com.revature.rekognition.model;

import java.io.Serializable;
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
public class UnmatchedFace implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = -5971466186342251832L;

  @JsonProperty("SourceImage")
  private String sourceImage;

  @JsonProperty("TargetImage")
  private String targetImage;

  @JsonProperty("UnmatchedFace")
  private ComparedFace unmatchedFace;
}