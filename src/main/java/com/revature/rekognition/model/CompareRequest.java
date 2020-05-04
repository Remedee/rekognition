package com.revature.rekognition.model;

import java.io.Serializable;
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
public class CompareRequest implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = -3184984781559909440L;

  @JsonProperty("QualityFilter")
  private String qualityFilter;

  @JsonProperty("SimilarityThreshold")
  private Float similarityThreshold;

  @JsonProperty("SourceImage")
  private String sourceImage;

  @JsonProperty("TargetImage")
  private String targetImage;

  @JsonProperty("Local")
  private boolean local = false;

  @JsonProperty("Url")
  private boolean url = false;
}
