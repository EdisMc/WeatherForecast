package com.example.forecastbyplaceproject.api.models;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class WeatherResponse {
    private String placeName;
    private String typeName;
    private String temp;
}
