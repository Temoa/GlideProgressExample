package me.temoa.glideprogressexample.progress;

/**
 * Created by lai
 * on 2018/5/3.
 */

public interface OnProgressListener {
    void progress(String url, int percent, boolean finish);
}
