package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }
}
