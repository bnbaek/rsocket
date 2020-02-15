package net.openu.server;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Coffee {
  private String name;
  private int price;
}