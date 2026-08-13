package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f28378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.Context f28379b;

    I20(com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f28378a = yk0;
        this.f28379b = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f28378a.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.G20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f27627a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.H20 c() {
        return new com.google.android.gms.internal.ads.H20(p214v3.AbstractC7240e.b(this.f28379b, (java.lang.String) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25465X5)));
    }
}
