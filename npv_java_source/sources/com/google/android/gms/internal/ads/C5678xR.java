package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5678xR implements com.google.android.gms.internal.ads.InterfaceC5898zR {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f39851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3352cE f39853c;

    public C5678xR(java.util.Map map, com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C3352cE c3352cE) {
        this.f39851a = map;
        this.f39852b = yk0;
        this.f39853c = c3352cE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5898zR
    public final P4.d a(final com.google.android.gms.internal.ads.C2730Po c2730Po) {
        this.f39853c.B(c2730Po);
        P4.d dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.g(new com.google.android.gms.internal.ads.C4688oQ(3));
        for (java.lang.String str : ((java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25532d8)).split(",")) {
            final com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0 = (com.google.android.gms.internal.ads.InterfaceC5078rz0) this.f39851a.get(str.trim());
            if (interfaceC5078rz0 != null) {
                dVarG = com.google.android.gms.internal.ads.AbstractC2652Nk0.f(dVarG, com.google.android.gms.internal.ads.C4688oQ.class, new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.vR
                    @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
                    public final P4.d b(java.lang.Object obj) {
                        return ((com.google.android.gms.internal.ads.InterfaceC5898zR) interfaceC5078rz0.b()).a(c2730Po);
                    }
                }, this.f39852b);
            }
        }
        com.google.android.gms.internal.ads.AbstractC2652Nk0.r(dVarG, new com.google.android.gms.internal.ads.C5568wR(this), com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        return dVarG;
    }
}
