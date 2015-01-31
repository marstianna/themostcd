package com.cd.service.impl;

import com.cd.domain.Match;
import com.cd.service.IMatchService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zoupeng on 15/1/31.
 */
@Service
public class MatchServiceImpl implements IMatchService{
    @Override
    public Match getMatch(Integer matchId) {
        return null;
    }

    @Override
    public List<Match> getMatchesByLeagueId(Integer leagueId) {
        return null;
    }
}
