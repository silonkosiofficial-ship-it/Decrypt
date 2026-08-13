package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class XY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f33143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.SM f33144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4797pP f33145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.ZY f33146d;

    public XY(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.SM sm, com.google.android.gms.internal.ads.C4797pP c4797pP, com.google.android.gms.internal.ads.ZY zy) {
        this.f33143a = yk0;
        this.f33144b = sm;
        this.f33145c = c4797pP;
        this.f33146d = zy;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        com.google.android.gms.internal.ads.AbstractC5037rf abstractC5037rf = com.google.android.gms.internal.ads.AbstractC2161Af.yb;
        if (((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && this.f33146d.a() != null) {
            com.google.android.gms.internal.ads.YY yyA = this.f33146d.a();
            yyA.getClass();
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(yyA);
        }
        if (com.google.android.gms.internal.ads.AbstractC2829Sg0.d((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25753z1)) || (!((java.lang.Boolean) p184s3.A.c().a(abstractC5037rf)).booleanValue() && (this.f33146d.d() || !this.f33145c.t()))) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.YY(new android.os.Bundle()));
        }
        this.f33146d.c(true);
        return this.f33143a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.WY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f32765a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.YY c() {
        java.util.List<java.lang.String> listAsList = java.util.Arrays.asList(((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25753z1)).split(";"));
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str : listAsList) {
            try {
                com.google.android.gms.internal.ads.M70 m70C = this.f33144b.c(str, new org.json.JSONObject());
                m70C.c();
                boolean zT = this.f33145c.t();
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.yb)).booleanValue() || zT) {
                    try {
                        com.google.android.gms.internal.ads.C3956hn c3956hnK = m70C.k();
                        if (c3956hnK != null) {
                            bundle2.putString("sdk_version", c3956hnK.toString());
                        }
                    } catch (com.google.android.gms.internal.ads.C5315u70 unused) {
                    }
                }
                try {
                    com.google.android.gms.internal.ads.C3956hn c3956hnJ = m70C.j();
                    if (c3956hnJ != null) {
                        bundle2.putString("adapter_version", c3956hnJ.toString());
                    }
                } catch (com.google.android.gms.internal.ads.C5315u70 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (com.google.android.gms.internal.ads.C5315u70 unused3) {
            }
        }
        com.google.android.gms.internal.ads.YY yy = new com.google.android.gms.internal.ads.YY(bundle);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.yb)).booleanValue()) {
            this.f33146d.b(yy);
        }
        return yy;
    }
}
