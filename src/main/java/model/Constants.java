package java.model;

/**
 * Created by lost on 27.09.2016.
 */
public class Constants {
    public static String FOLDER_PATH;


    public enum Action {
        CALL,
        FOLD,
        CHEACK,
        REASE,
        BET,
        SHOW
    }

    public enum BET {
        bet,
        bets
    }

    public enum CALL {
        call,
        calls;

    }

    public enum CHECK {
        check,
        checks
    }

    public enum FOLD {
        fold,
        folded,
        folds
    }

    public enum REISE {
        raises,
        raise,
    }

    public enum Position {
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


    public enum STATISTICS{
        COUNTHAND,
        CREISE,
        CFOLD,
        C3Bet,
        CCHECK,
        CBET,
        CCHECKREISE,
        CCALL
    }


}
