package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2576Lj extends p174r3.c {
    C2576Lj(android.content.Context context, android.os.Looper looper, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar) {
        super(com.google.android.gms.internal.ads.AbstractC3092Zo.a(context), looper, 166, aVar, bVar, null);
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final com.google.android.gms.internal.ads.C2870Tj j0() {
        return (com.google.android.gms.internal.ads.C2870Tj) super.D();
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C2870Tj ? (com.google.android.gms.internal.ads.C2870Tj) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2870Tj(iBinder);
    }
}
