package me.nexters.chop.dto.url;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * @author junho.park
 */
@NoArgsConstructor
@Getter
public class UrlRequestDto {
    private String originUrl;

    @Builder
    public UrlRequestDto(String originUrl) {
        this.originUrl = originUrl;
    }
}
