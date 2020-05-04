package com.revature.rekognition.model;

import java.io.Serializable;
import com.amazonaws.services.rekognition.model.CompareFacesMatch;
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
public class MatchedFace implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = 1462097994727116185L;

  @JsonProperty("SourceImage")
  private String sourceImage;

  @JsonProperty("TargetImage")
  private String targetImage;

  @JsonProperty("Face")
  private CompareFacesMatch face;
}
