package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2510Jp extends com.google.android.gms.internal.ads.AbstractBinderC2214Bp {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final E3.d f28758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final E3.c f28759D;

    public BinderC2510Jp(E3.d dVar, E3.c cVar) {
        this.f28758C = dVar;
        this.f28759D = cVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void F(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void i() {
        E3.d dVar = this.f28758C;
        if (dVar != null) {
            dVar.b(this.f28759D);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2251Cp
    public final void x(p184s3.W0 w6) {
        if (this.f28758C != null) {
            this.f28758C.a(w6.f());
        }
    }
}
