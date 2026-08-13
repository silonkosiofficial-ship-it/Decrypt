package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5016rP implements com.google.android.gms.internal.ads.InterfaceC4453mG {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Bundle f38489C = new android.os.Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final synchronized void E(java.lang.String str) {
        this.f38489C.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final synchronized void Z(java.lang.String str) {
        this.f38489C.putInt(str, 2);
    }

    public final synchronized android.os.Bundle a() {
        return new android.os.Bundle(this.f38489C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final void o(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4453mG
    public final synchronized void q(java.lang.String str, java.lang.String str2) {
        this.f38489C.putInt(str, 3);
    }
}
