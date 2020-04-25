package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CeCasePatchRequest {
  @JsonProperty(required = true) private Boolean ce1Complete;
  @JsonProperty(required = true) private Integer expectedResponses;
  @JsonProperty(required = true) private Integer actualResponses;
}
