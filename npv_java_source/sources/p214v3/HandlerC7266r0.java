package p214v3;

/* JADX INFO: renamed from: v3.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC7266r0 extends com.google.android.gms.internal.ads.HandlerC2345Fe0 {
    public HandlerC7266r0(android.os.Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.HandlerC2345Fe0
    protected final void a(android.os.Message message) {
        try {
            super.a(message);
        } catch (java.lang.Throwable th) {
            p174r3.v.t();
            p214v3.E0.n(p174r3.v.s().e(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        try {
            super.handleMessage(message);
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "AdMobHandler.handleMessage");
        }
    }
}
