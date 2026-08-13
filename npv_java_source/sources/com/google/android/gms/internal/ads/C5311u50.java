package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5311u50 implements com.google.android.gms.internal.ads.F50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f39110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4115jC f39111b;

    public C5311u50(com.google.android.gms.internal.ads.F50 f50) {
        this.f39110a = f50;
    }

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ P4.d a(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, java.lang.Object obj) {
        return c(g50, e50, null);
    }

    @Override // com.google.android.gms.internal.ads.F50
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC4115jC f() {
        return this.f39111b;
    }

    public final synchronized P4.d c(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC) {
        com.google.android.gms.internal.ads.C2730Po c2730Po;
        this.f39111b = interfaceC4115jC;
        if (interfaceC4115jC == null || (c2730Po = g50.f27675a) == null) {
            return ((com.google.android.gms.internal.ads.C5201t50) this.f39110a).c(g50, e50, interfaceC4115jC);
        }
        com.google.android.gms.internal.ads.LA laB = interfaceC4115jC.b();
        return laB.h(laB.j(com.google.android.gms.internal.ads.AbstractC2652Nk0.h(c2730Po)));
    }
}
