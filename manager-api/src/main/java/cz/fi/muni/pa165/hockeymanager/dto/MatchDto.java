package cz.fi.muni.pa165.hockeymanager.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Kristian Kosorin (456620)
 */
@Data
public class MatchDto {

    private Long id;

    private TeamDto homeTeam;

    private TeamDto visitingTeam;

    private Integer homeTeamScore;

    private Integer visitingTeamScore;

    private LocalDateTime dateTimeDto;

    public MatchDto() {}

    public MatchDto(TeamDto homeTeam, TeamDto visitingTeam, LocalDateTime dateTime) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.dateTimeDto = dateTime;
    }

    public MatchDto(TeamDto homeTeam, TeamDto visitingTeam, Integer homeTeamScore, Integer visitingTeamScore, LocalDateTime dateTime) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
        this.dateTimeDto = dateTime;
    }

    public String dateFormated() {
        return dateTimeDto.getDayOfMonth() + "." + dateTimeDto.getMonth().getValue() + "." + dateTimeDto.getYear() + " " + dateTimeDto.getHour() + ":" + dateTimeDto.getMinute();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchDto matchDto = (MatchDto) o;
        return homeTeamScore.equals(matchDto.homeTeamScore) && visitingTeamScore.equals(matchDto.visitingTeamScore) && homeTeam.equals(matchDto.homeTeam) && visitingTeam.equals(matchDto.visitingTeam) && dateTimeDto.equals(matchDto.dateTimeDto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTeam, visitingTeam, homeTeamScore, visitingTeamScore, dateTimeDto);
    }
}
