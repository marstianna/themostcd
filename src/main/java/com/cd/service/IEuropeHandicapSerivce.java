package com.cd.service;

import com.cd.domain.AsiaHandicap;

import java.util.List;

/**
 * Created by zoupeng on 15/1/31.
 */
public interface IEuropeHandicapSerivce {
    List<AsiaHandicap> getHandicapsByMatchId(Integer id);
}
