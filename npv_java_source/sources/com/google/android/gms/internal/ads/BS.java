package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class BS implements com.google.android.gms.internal.ads.InterfaceC5326uD, com.google.android.gms.internal.ads.HC {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final java.lang.Object f25965E = new java.lang.Object();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static int f25966F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f25967C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.LS f25968D;

    public BS(com.google.android.gms.internal.ads.LS ls, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f25968D = ls;
        this.f25967C = interfaceC7268s0;
    }

    private final void a(boolean z6) {
        int i6;
        int iIntValue;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue() && !this.f25967C.M()) {
            java.lang.Object obj = f25965E;
            synchronized (obj) {
                i6 = f25966F;
                iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.c6)).intValue();
            }
            if (i6 < iIntValue) {
                this.f25968D.e(z6);
                synchronized (obj) {
                    f25966F++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5326uD
    public final void u() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void u0(p184s3.W0 w6) {
        a(false);
    }
}
