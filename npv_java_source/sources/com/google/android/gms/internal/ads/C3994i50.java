package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3994i50 implements com.google.android.gms.internal.ads.InterfaceC5537w80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.F50 f36225a;

    public C3994i50(com.google.android.gms.internal.ads.F50 f50) {
        this.f36225a = f50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5537w80
    public final P4.d a(com.google.android.gms.internal.ads.InterfaceC5647x80 interfaceC5647x80) {
        com.google.android.gms.internal.ads.C4102j50 c4102j50 = (com.google.android.gms.internal.ads.C4102j50) interfaceC5647x80;
        return ((com.google.android.gms.internal.ads.C3664f50) this.f36225a).c(c4102j50.f36562b, c4102j50.f36561a, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5537w80
    public final void b(com.google.android.gms.internal.ads.C4328l80 c4328l80) {
        c4328l80.f37093a = ((com.google.android.gms.internal.ads.C3664f50) this.f36225a).b();
    }
}
