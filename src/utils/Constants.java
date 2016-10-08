package utils;

/**
 * Created by lost on 27.09.2016.
 */
public class Constants {
    enum Action {
        CALL,
        FOLD,
        CHEACK,
        REASE,
        BET,
        SHOW
    }

    enum BET {
        bet,
        bets
    }

    enum CALL {
        call,
        calls
    }

    enum CHECK {
        check,
        checks
    }

    enum Fold {
        fold,
        folded,
        folds
    }

    enum Position {
        UTG,
        UTG1,
        UTG2,
        UTG3,
        UTG4,
        HJ,
        CO,
        BTN,
        SB,
        BB
    }

    enum Bord {
        PREFLOP,
        FLOP,
        TURN,
        RIVER,
        SHOWDOWN
    }

}
