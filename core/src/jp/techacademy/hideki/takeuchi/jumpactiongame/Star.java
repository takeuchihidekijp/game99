package jp.techacademy.hideki.takeuchi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by OWNER on 2017/02/08.
 */

public class Star extends Sprite {
    // 横幅、高さ
    public static final float STAR_WIDTH = 0.8f;
    public static final float STAR_HEIGHT = 0.8f;

    // 状態
    public static final int STAR_EXIST = 0;
    public static final int STAR_NONE = 1;

    int mState;

    public Star(Texture texture, int srcX, int srcY, int srcWidth, int srcHeght){
        super(texture, srcX, srcY, srcWidth, srcHeght);
        setSize(STAR_WIDTH,STAR_HEIGHT);
        mState = STAR_EXIST;
    }

    public void get(){
        mState = STAR_NONE;
        setAlpha(0);
    }


}
