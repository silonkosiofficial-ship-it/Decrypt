package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FQ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27363d;

    public FQ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz4) {
        this.f27360a = interfaceC5078rz0;
        this.f27361b = interfaceC5078rz1;
        this.f27362c = interfaceC5078rz2;
        this.f27363d = interfaceC5078rz3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0077  */
    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006d  */
    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* synthetic */ java.lang.Object b() {
        java.util.concurrent.Callable callable;
        final com.google.android.gms.internal.ads.Z9 z10 = (com.google.android.gms.internal.ads.Z9) this.f27360a.b();
        final android.content.Context contextA = ((com.google.android.gms.internal.ads.C3204av) this.f27361b).a();
        com.google.android.gms.internal.ads.C4546n70 c4546n70A = ((com.google.android.gms.internal.ads.C5434vC) this.f27362c).a();
        long jLongValue = ((java.lang.Long) this.f27363d.b()).longValue();
        com.google.android.gms.internal.ads.Yk0 yk0C = com.google.android.gms.internal.ads.O80.c();
        int iIntValue = ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25363O2)).intValue();
        if (iIntValue != -1) {
            if (java.lang.Integer.toString(iIntValue).equals(B3.AbstractC0797c.b(B3.AbstractC0797c.c(c4546n70A.f37511d)))) {
                if (p174r3.v.c().a() - jLongValue < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25385Q2)).intValue()) {
                    callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zQ
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return z10.c().d(contextA);
                        }
                    };
                } else {
                    callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.AQ
                        @Override // java.util.concurrent.Callable
                        public final java.lang.Object call() {
                            return z10.c().a(contextA);
                        }
                    };
                }
            } else {
                callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.AQ
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return z10.c().a(contextA);
                    }
                };
            }
        } else {
            if (p174r3.v.c().a() - jLongValue < ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25385Q2)).intValue()) {
                callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zQ
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return z10.c().d(contextA);
                    }
                };
            } else {
                callable = new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.AQ
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return z10.c().a(contextA);
                    }
                };
            }
        }
        P4.d dVarH0 = yk0C.H0(callable);
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(dVarH0);
        return dVarH0;
    }
}
