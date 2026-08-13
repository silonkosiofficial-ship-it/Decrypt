package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class R20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f31111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f31112b;

    R20(android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f31111a = context;
        this.f31112b = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5369ug.f39195b.e()).booleanValue() ? this.f31112b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.Q20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f30864a.c();
            }
        }) : com.google.android.gms.internal.ads.AbstractC2652Nk0.h(new com.google.android.gms.internal.ads.S20(-1, -1));
    }

    final /* synthetic */ com.google.android.gms.internal.ads.S20 c() {
        android.content.Context context = this.f31111a;
        return new com.google.android.gms.internal.ads.S20(com.google.android.gms.internal.ads.AbstractC4158jf.b(context), com.google.android.gms.internal.ads.AbstractC4158jf.a(context));
    }
}
