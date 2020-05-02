package com.revature.rekognition.model;

import java.io.Serializable;
import java.util.List;
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
public class CompareSeveralResult implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = -1577961532477604172L;

  @JsonProperty("RequestParameters")
  private CompareSeveralRequest requestParameters;

  @JsonProperty("MatchedFaces")
  private List<MatchedFace> matchedFaces;

  @JsonProperty("UnmatchedFaces")
  private List<UnmatchedFace> unmatchedFaces;
}