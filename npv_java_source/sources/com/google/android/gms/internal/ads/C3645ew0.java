package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ew0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3645ew0 implements com.google.android.gms.internal.ads.Fw0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.InterfaceC4303kw0 f35230b = new com.google.android.gms.internal.ads.C3426cw0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4303kw0 f35231a;

    public C3645ew0() {
        com.google.android.gms.internal.ads.Ev0 ev0A = com.google.android.gms.internal.ads.Ev0.a();
        int i6 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        com.google.android.gms.internal.ads.C3535dw0 c3535dw0 = new com.google.android.gms.internal.ads.C3535dw0(ev0A, f35230b);
        byte[] bArr = com.google.android.gms.internal.ads.Tv0.f32042b;
        this.f35231a = c3535dw0;
    }

    @Override // com.google.android.gms.internal.ads.Fw0
    public final com.google.android.gms.internal.ads.Ew0 a(java.lang.Class cls) {
        int i6 = com.google.android.gms.internal.ads.Gw0.f27921b;
        if (!com.google.android.gms.internal.ads.Jv0.class.isAssignableFrom(cls)) {
            int i10 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        }
        com.google.android.gms.internal.ads.InterfaceC4083iw0 interfaceC4083iw0B = this.f35231a.b(cls);
        if (interfaceC4083iw0B.b()) {
            int i11 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
            return com.google.android.gms.internal.ads.C4963qw0.k(com.google.android.gms.internal.ads.Gw0.w(), com.google.android.gms.internal.ads.Av0.a(), interfaceC4083iw0B.a());
        }
        int i12 = com.google.android.gms.internal.ads.C5512vw0.f39479d;
        return com.google.android.gms.internal.ads.C4853pw0.G(cls, interfaceC4083iw0B, com.google.android.gms.internal.ads.AbstractC5182sw0.a(), com.google.android.gms.internal.ads.AbstractC3207aw0.a(), com.google.android.gms.internal.ads.Gw0.w(), interfaceC4083iw0B.c() + (-1) != 1 ? com.google.android.gms.internal.ads.Av0.a() : null, com.google.android.gms.internal.ads.AbstractC3975hw0.a());
    }
}
