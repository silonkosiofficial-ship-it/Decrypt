package B3;

/* JADX INFO: loaded from: classes.dex */
public final class P implements com.google.android.gms.internal.ads.ZG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final B3.C f562C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f563D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f564E;

    public P(B3.C c6, int i6, java.lang.String str) {
        this.f562C = c6;
        this.f563D = i6;
        this.f564E = str;
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void G(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.ZG
    public final void a(final B3.N n6) {
        if (n6 == null || this.f563D != 2 || android.text.TextUtils.isEmpty(this.f564E)) {
            return;
        }
        p214v3.E0.M(new java.lang.Runnable() { // from class: B3.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f560C.b(n6);
            }
        });
    }

    final /* synthetic */ void b(B3.N n6) {
        this.f562C.d(this.f564E, n6);
    }
}
