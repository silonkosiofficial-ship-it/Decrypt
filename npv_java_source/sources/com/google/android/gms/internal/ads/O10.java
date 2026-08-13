package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class O10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.String f30426d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f30427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f30428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f30429c;

    public O10(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context, java.util.Set set) {
        this.f30427a = yk0;
        this.f30428b = context;
        this.f30429c = set;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f30427a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.N10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f30139a.c();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.Q10 c() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.rf r0 = com.google.android.gms.internal.ads.AbstractC2161Af.f25519c5
            com.google.android.gms.internal.ads.yf r1 = p184s3.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            com.google.android.gms.internal.ads.rf r0 = com.google.android.gms.internal.ads.AbstractC2161Af.f25637n5
            com.google.android.gms.internal.ads.yf r1 = p184s3.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.f30429c
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L80
        L46:
            com.google.android.gms.internal.ads.rf r0 = com.google.android.gms.internal.ads.AbstractC2161Af.f25647o5
            com.google.android.gms.internal.ads.yf r1 = p184s3.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            java.lang.String r0 = com.google.android.gms.internal.ads.O10.f30426d
            if (r0 != 0) goto L68
            android.content.Context r0 = r3.f30428b
            com.google.android.gms.internal.ads.LT r1 = p174r3.v.b()
            java.lang.String r0 = r1.a(r0)
            com.google.android.gms.internal.ads.O10.f30426d = r0
        L68:
            com.google.android.gms.internal.ads.Q10 r0 = new com.google.android.gms.internal.ads.Q10
            java.lang.String r1 = com.google.android.gms.internal.ads.O10.f30426d
            r0.<init>(r1)
            return r0
        L70:
            android.content.Context r0 = r3.f30428b
            com.google.android.gms.internal.ads.Q10 r1 = new com.google.android.gms.internal.ads.Q10
            com.google.android.gms.internal.ads.LT r2 = p174r3.v.b()
            java.lang.String r0 = r2.a(r0)
            r1.<init>(r0)
            return r1
        L80:
            com.google.android.gms.internal.ads.Q10 r0 = new com.google.android.gms.internal.ads.Q10
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O10.c():com.google.android.gms.internal.ads.Q10");
    }
}
