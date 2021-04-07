package cz.fi.muni.pa165.hockeymanager.dao;

import cz.fi.muni.pa165.hockeymanager.entity.Match;

import java.util.List;

/**
 * @author Matus Jarkovic (456441)
 */
public interface MatchDao {

    /**
     * Creates new match
     *
     * @param match Match entity
     */
    void create(Match match);

    /**
     * @return List of all matches
     */
    List<Match> findAll();

    /**
     * @param id Long ID
     * @return Match with id
     */
    Match findById(Long id);

    /**
     * Removes match
     * @param match Match entity
     */
    void remove(Match match);
}
