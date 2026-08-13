package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FY implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f27376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f27377b;

    FY(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4546n70 c4546n70, com.google.android.gms.internal.ads.C70 c70) {
        this.f27376a = yk0;
        this.f27377b = c4546n70;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f27376a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.EY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f27075a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.GY c() {
        java.lang.String strA = null;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25400R6)).booleanValue() && "requester_type_2".equals(B3.AbstractC0797c.c(this.f27377b.f37511d))) {
            strA = com.google.android.gms.internal.ads.C70.a();
        }
        return new com.google.android.gms.internal.ads.GY(strA);
    }
}
