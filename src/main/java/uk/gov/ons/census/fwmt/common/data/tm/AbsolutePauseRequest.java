package uk.gov.ons.census.fwmt.common.data.tm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

/**
 * Absolute pause.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AbsolutePauseRequest {
  @JsonProperty(required = true) private OffsetDateTime until;
  private String reason;
}
