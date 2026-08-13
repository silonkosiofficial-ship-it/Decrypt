package B3;

/* JADX INFO: loaded from: classes.dex */
public final class L implements com.google.android.gms.internal.ads.InterfaceC5268tk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.Executor f549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.QQ f550b;

    public L(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.QQ qq) {
        this.f549a = executor;
        this.f550b = qq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
    public final /* bridge */ /* synthetic */ P4.d b(java.lang.Object obj) {
        final com.google.android.gms.internal.ads.C2730Po c2730Po = (com.google.android.gms.internal.ads.C2730Po) obj;
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(this.f550b.c(c2730Po), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: B3.K
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj2) {
                com.google.android.gms.internal.ads.BR br = (com.google.android.gms.internal.ads.BR) obj2;
                B3.N n6 = new B3.N(new android.util.JsonReader(new java.io.InputStreamReader(br.b())), br.a());
                com.google.android.gms.internal.ads.C2730Po c2730Po2 = c2730Po;
                try {
                    n6.f553b = p184s3.C7147y.b().k(c2730Po2.f30793C).toString();
                } catch (org.json.JSONException unused) {
                    n6.f553b = "{}";
                }
                if (!c2730Po2.f30806P.isEmpty()) {
                    try {
                        n6.f554c = p184s3.C7147y.b().k(c2730Po2.f30806P).toString();
                    } catch (org.json.JSONException unused2) {
                    }
                }
                return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(n6);
            }
        }, this.f549a);
    }
}
