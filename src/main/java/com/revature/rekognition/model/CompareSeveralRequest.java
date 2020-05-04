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
public class CompareSeveralRequest implements Serializable {
  @JsonIgnore
  private static final long serialVersionUID = 8784715647868326950L;

  @JsonProperty("QualityFilter")
  private String qualityFilter;

  @JsonProperty("SimilarityThreshold")
  private Float similarityThreshold;

  @JsonProperty("Images")
  private List<String> images;

  @JsonProperty("Local")
  private boolean local = false;

  @JsonProperty("Url")
  private boolean url = false;
}
