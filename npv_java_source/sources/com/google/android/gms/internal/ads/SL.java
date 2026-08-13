package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SL extends com.google.android.gms.internal.ads.BL implements com.google.android.gms.internal.ads.MG {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private com.google.android.gms.internal.ads.MG f31685H;

    @Override // com.google.android.gms.internal.ads.MG
    public final synchronized void A() {
        com.google.android.gms.internal.ads.MG mg = this.f31685H;
        if (mg != null) {
            mg.A();
        }
    }

    protected final synchronized void b(p184s3.InterfaceC7076a interfaceC7076a, com.google.android.gms.internal.ads.InterfaceC5483vi interfaceC5483vi, p204u3.z zVar, com.google.android.gms.internal.ads.InterfaceC5703xi interfaceC5703xi, p204u3.InterfaceC7202d interfaceC7202d, com.google.android.gms.internal.ads.MG mg) {
        super.a(interfaceC7076a, interfaceC5483vi, zVar, interfaceC5703xi, interfaceC7202d);
        this.f31685H = mg;
    }

    @Override // com.google.android.gms.internal.ads.MG
    public final synchronized void p0() {
        com.google.android.gms.internal.ads.MG mg = this.f31685H;
        if (mg != null) {
            mg.p0();
        }
    }
}
