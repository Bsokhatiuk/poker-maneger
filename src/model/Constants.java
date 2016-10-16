package model;

/**
 * Created by lost on 27.09.2016.
 */
public class Constants {
    public static String FOLDER_PATH;


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
        calls;

    }

    enum CHECK {
        check,
        checks
    }

    enum FOLD {
        fold,
        folded,
        folds
    }

    enum REISE {
        raises,
        raise,
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

    public enum BORD {
        PREFLOP,
        FLOP,
        TURN,
        RIVER,
        SHOWDOWN
    }

}
