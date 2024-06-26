package com.hanwha.domain;

import com.hanwha.domain.Judge.Result;
import java.util.Optional;

/**
 * 투수가 던지는 공을 받아, 심판에게 판정을 받는 포수 객체
 */
public class Catcher {
    private final Judge judge;

    public Catcher(Judge judge) {
        this.judge = judge;
    }

    /**
     * 공을 받아 심판에서 판정 요청
     * @param ball
     * @return result 판정 결과
     */
    public Result catchBall(Ball ball) {
        return judge.compareBall(ball);
    }
}
