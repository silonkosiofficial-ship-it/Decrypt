package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class A extends com.google.android.gms.internal.ads.C4984r7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f55816c;

    private A(android.content.Context context, com.google.android.gms.internal.ads.AbstractC4875q7 abstractC4875q7) {
        super(abstractC4875q7);
        this.f55816c = context;
    }

    public static com.google.android.gms.internal.ads.C3557e7 b(android.content.Context context) {
        com.google.android.gms.internal.ads.C3557e7 c3557e7 = new com.google.android.gms.internal.ads.C3557e7(new com.google.android.gms.internal.ads.C5754y7(new java.io.File(com.google.android.gms.internal.ads.AbstractC4267ke0.a(com.google.android.gms.internal.ads.AbstractC4157je0.a(), context.getCacheDir(), "admob_volley")), 20971520), new p214v3.A(context, new com.google.android.gms.internal.ads.D7(null, null)), 4);
        c3557e7.d();
        return c3557e7;
    }

    @Override // com.google.android.gms.internal.ads.C4984r7, com.google.android.gms.internal.ads.W6
    public final com.google.android.gms.internal.ads.Z6 a(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7) throws com.google.android.gms.internal.ads.C4215k7 {
        if (abstractC3448d7.a() == 0) {
            if (java.util.regex.Pattern.matches((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25736x4), abstractC3448d7.t())) {
                android.content.Context context = this.f55816c;
                p184s3.C7147y.b();
                if (p224w3.g.u(context, 13400000)) {
                    com.google.android.gms.internal.ads.Z6 z6A = new com.google.android.gms.internal.ads.C3086Zj(this.f55816c).a(abstractC3448d7);
                    if (z6A != null) {
                        p214v3.AbstractC7265q0.k("Got gmscore asset response: ".concat(java.lang.String.valueOf(abstractC3448d7.t())));
                        return z6A;
                    }
                    p214v3.AbstractC7265q0.k("Failed to get gmscore asset response: ".concat(java.lang.String.valueOf(abstractC3448d7.t())));
                }
            }
        }
        return super.a(abstractC3448d7);
    }
}
