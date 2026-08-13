package p045e4;

/* JADX INFO: loaded from: classes3.dex */
public class e extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Looper f44672a;

    public e(android.os.Looper looper) {
        super(looper);
        this.f44672a = android.os.Looper.getMainLooper();
    }

    public e(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.f44672a = android.os.Looper.getMainLooper();
    }
}
