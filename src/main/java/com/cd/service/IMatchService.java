package com.cd.service;

import com.cd.domain.Match;

import java.util.List;

/**
 * Created by zoupeng on 15/1/31.
 */
public interface IMatchService {
    Match getMatch(Integer matchId);

    List<Match> getMatchesByLeagueId(Integer leagueId);
}
