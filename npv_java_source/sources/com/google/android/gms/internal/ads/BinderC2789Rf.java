package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2789Rf extends com.google.android.gms.internal.ads.AbstractBinderC2826Sf {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p174r3.g f31302C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f31303D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f31304E;

    public BinderC2789Rf(p174r3.g gVar, java.lang.String str, java.lang.String str2) {
        this.f31302C = gVar;
        this.f31303D = str;
        this.f31304E = str2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862Tf
    public final java.lang.String b() {
        return this.f31303D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862Tf
    public final java.lang.String c() {
        return this.f31304E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862Tf
    public final void d() {
        this.f31302C.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862Tf
    public final void e() {
        this.f31302C.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862Tf
    public final void s0(X3.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f31302C.a((android.view.View) X3.b.L0(aVar));
    }
}
