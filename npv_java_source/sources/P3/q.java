package P3;

/* JADX INFO: loaded from: classes.dex */
public final class q extends P3.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O3.e f8317c;

    public q(O3.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f8317c = eVar;
    }

    @Override // O3.f
    public final com.google.android.gms.common.api.internal.AbstractC2147b a(com.google.android.gms.common.api.internal.AbstractC2147b abstractC2147b) {
        return this.f8317c.g(abstractC2147b);
    }

    @Override // O3.f
    public final android.os.Looper c() {
        return this.f8317c.l();
    }
}
