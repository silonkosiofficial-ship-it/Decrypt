package p035d4;

/* JADX INFO: loaded from: classes3.dex */
public class h extends android.os.Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Looper f44297a;

    public h(android.os.Looper looper) {
        super(looper);
        this.f44297a = android.os.Looper.getMainLooper();
    }

    public h(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.f44297a = android.os.Looper.getMainLooper();
    }
}
