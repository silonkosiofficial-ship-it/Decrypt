package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5201t50 implements com.google.android.gms.internal.ads.F50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4115jC f38876a;

    @Override // com.google.android.gms.internal.ads.F50
    public final /* bridge */ /* synthetic */ P4.d a(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, java.lang.Object obj) {
        return c(g50, e50, null);
    }

    @Override // com.google.android.gms.internal.ads.F50
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC4115jC f() {
        return this.f38876a;
    }

    public final synchronized P4.d c(com.google.android.gms.internal.ads.G50 g50, com.google.android.gms.internal.ads.E50 e50, com.google.android.gms.internal.ads.InterfaceC4115jC interfaceC4115jC) {
        com.google.android.gms.internal.ads.LA laB;
        try {
            if (interfaceC4115jC != null) {
                this.f38876a = interfaceC4115jC;
            } else {
                this.f38876a = (com.google.android.gms.internal.ads.InterfaceC4115jC) e50.a(g50.f27676b).g();
            }
            laB = this.f38876a.b();
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return laB.h(laB.i());
    }
}
