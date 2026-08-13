package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3036Yc extends p174r3.c {
    C3036Yc(android.content.Context context, android.os.Looper looper, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar) {
        super(com.google.android.gms.internal.ads.AbstractC3092Zo.a(context), looper, 123, aVar, bVar, null);
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean j0() {
        return ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25472Y1)).booleanValue() && V3.b.b(m(), p104k3.E.f49446a);
    }

    public final com.google.android.gms.internal.ads.C3278bd k0() {
        return (com.google.android.gms.internal.ads.C3278bd) super.D();
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C3278bd ? (com.google.android.gms.internal.ads.C3278bd) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3278bd(iBinder);
    }

    @Override // Q3.AbstractC1464c
    public final N3.C1391d[] v() {
        return p104k3.E.f49447b;
    }
}
