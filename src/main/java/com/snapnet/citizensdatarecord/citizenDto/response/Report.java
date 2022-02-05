package com.snapnet.citizensdatarecord.citizenDto.response;

import lombok.Data;

@Data
public class Report {
    private Integer numberOfUsersInWard;
    private Integer numberOfUsersInLGA;
    private Integer numberOfUsersInState;
    private Integer numberOfUsersInCountry;
}
