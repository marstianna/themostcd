package com.cd.service.impl;

import com.cd.domain.AsiaHandicap;
import com.cd.domain.Match;
import com.cd.service.IAsiaHandicapService;
import com.cd.service.IEuropeHandicapSerivce;
import com.cd.service.IMatchService;
import com.cd.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoupeng on 15/1/31.
 */
@Service
public class ResultServiceImpl implements IResultService{
    @Autowired
    private IMatchService matchSerivce;
    @Autowired
    private IAsiaHandicapService asiaHandicapService;
    @Autowired
    private IEuropeHandicapSerivce europeHandicapSerivce;

    @Override
    public String getWinner(Integer matchId){
        Match thisMatch = matchSerivce.getMatch(matchId);
        String winner = null;
        return winner;
    }

    private List<Match> filterFromSameLeague(Match origMatch){
        List<Match> historyMatches = matchSerivce.getMatchesByLeagueId(origMatch.getLeagueId());
        List<Match> results = new ArrayList<>();
        return results;
    }

    private void filterFromAsia(Match origMatch,Match historyMatch){
        List<AsiaHandicap> origHandicaps = asiaHandicapService.getHandicapsByMatchId(origMatch.getId());
        List<AsiaHandicap> historyHandicaps = asiaHandicapService.getHandicapsByMatchId(historyMatch.getId());
    }

    private void filterFromEuro(Match origMatch,Match historyMatch){
        List<AsiaHandicap> origHandicaps = europeHandicapSerivce.getHandicapsByMatchId(origMatch.getId());
        List<AsiaHandicap> historyHandicaps = europeHandicapSerivce.getHandicapsByMatchId(historyMatch.getId());
    }
}
