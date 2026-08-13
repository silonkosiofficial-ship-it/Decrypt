package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4534n10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f37477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4546n70 f37478b;

    C4534n10(com.google.android.gms.internal.ads.Yk0 yk0, com.google.android.gms.internal.ads.C4546n70 c4546n70) {
        this.f37477a = yk0;
        this.f37478b = c4546n70;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f37477a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.m10
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f37268a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C4754p10 c() {
        return new com.google.android.gms.internal.ads.C4754p10("requester_type_2".equals(B3.AbstractC0797c.c(this.f37478b.f37511d)));
    }
}
