package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3343c90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f34455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f34456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC4550n90 f34457c;

    /* synthetic */ C3343c90(com.google.android.gms.internal.ads.AbstractC4550n90 abstractC4550n90, java.lang.Object obj, java.util.List list, com.google.android.gms.internal.ads.AbstractC4440m90 abstractC4440m90) {
        this.f34457c = abstractC4550n90;
        this.f34455a = obj;
        this.f34456b = list;
    }

    public final com.google.android.gms.internal.ads.C4330l90 a(java.util.concurrent.Callable callable) {
        com.google.android.gms.internal.ads.C2579Lk0 c2579Lk0B = com.google.android.gms.internal.ads.AbstractC2652Nk0.b(this.f34456b);
        P4.d dVarA = c2579Lk0B.a(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.b90
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return null;
            }
        }, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g);
        P4.d dVarA2 = c2579Lk0B.a(callable, this.f34457c.f37530a);
        return new com.google.android.gms.internal.ads.C4330l90(this.f34457c, this.f34455a, dVarA, this.f34456b, dVarA2);
    }
}
