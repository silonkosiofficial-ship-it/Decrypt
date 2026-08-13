package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0 {
    private static final float a(float f6) {
        return (float) (f6 >= 0.0f ? java.lang.Math.ceil(f6) : java.lang.Math.floor(f6));
    }

    public static final int b(float f6) {
        return ((int) a(f6)) * (-1);
    }
}
