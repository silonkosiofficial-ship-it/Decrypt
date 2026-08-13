package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class DA0 implements com.google.android.gms.internal.ads.InterfaceC3676fB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f26626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.AbstractC4942qm f26627b;

    public DA0(java.lang.Object obj, com.google.android.gms.internal.ads.GH0 gh0) {
        this.f26626a = obj;
        this.f26627b = gh0.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3676fB0
    public final com.google.android.gms.internal.ads.AbstractC4942qm a() {
        return this.f26627b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3676fB0
    public final java.lang.Object b() {
        return this.f26626a;
    }

    public final void c(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm) {
        this.f26627b = abstractC4942qm;
    }
}
