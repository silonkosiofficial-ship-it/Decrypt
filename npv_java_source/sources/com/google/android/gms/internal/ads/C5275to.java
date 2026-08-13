package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5275to extends p174r3.c {
    public C5275to(android.content.Context context, android.os.Looper looper, Q3.AbstractC1464c.a aVar, Q3.AbstractC1464c.b bVar) {
        super(com.google.android.gms.internal.ads.AbstractC3092Zo.a(context), looper, 8, aVar, bVar, null);
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String E() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // Q3.AbstractC1464c
    protected final java.lang.String F() {
        return "com.google.android.gms.ads.service.START";
    }

    public final com.google.android.gms.internal.ads.InterfaceC2250Co j0() {
        return (com.google.android.gms.internal.ads.InterfaceC2250Co) super.D();
    }

    @Override // Q3.AbstractC1464c
    protected final /* synthetic */ android.os.IInterface s(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2250Co ? (com.google.android.gms.internal.ads.InterfaceC2250Co) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2176Ao(iBinder);
    }
}
