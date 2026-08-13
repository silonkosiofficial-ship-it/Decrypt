package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class HB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Zz0 f27991a;

    public HB0(android.content.Context context, com.google.android.gms.internal.ads.C5395ut c5395ut) {
        this.f27991a = new com.google.android.gms.internal.ads.Zz0(context, c5395ut);
    }

    public final com.google.android.gms.internal.ads.HB0 a(final com.google.android.gms.internal.ads.WA0 wa0) {
        com.google.android.gms.internal.ads.Zz0 zz0 = this.f27991a;
        com.google.android.gms.internal.ads.LC.f(!zz0.f33971r);
        wa0.getClass();
        zz0.f33959f = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.Rz0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return wa0;
            }
        };
        return this;
    }

    public final com.google.android.gms.internal.ads.HB0 b(final com.google.android.gms.internal.ads.PJ0 pj0) {
        com.google.android.gms.internal.ads.Zz0 zz0 = this.f27991a;
        com.google.android.gms.internal.ads.LC.f(!zz0.f33971r);
        pj0.getClass();
        zz0.f33958e = new com.google.android.gms.internal.ads.InterfaceC2865Tg0() { // from class: com.google.android.gms.internal.ads.Yz0
            @Override // com.google.android.gms.internal.ads.InterfaceC2865Tg0
            public final java.lang.Object a() {
                return pj0;
            }
        };
        return this;
    }

    public final com.google.android.gms.internal.ads.IB0 c() {
        com.google.android.gms.internal.ads.Zz0 zz0 = this.f27991a;
        com.google.android.gms.internal.ads.LC.f(!zz0.f33971r);
        zz0.f33971r = true;
        return new com.google.android.gms.internal.ads.IB0(zz0);
    }
}
