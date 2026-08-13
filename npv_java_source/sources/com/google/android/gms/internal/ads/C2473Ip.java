package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2473Ip {
    public static final com.google.android.gms.internal.ads.InterfaceC5497vp a(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        try {
            android.os.IBinder iBinderD2 = ((com.google.android.gms.internal.ads.C5937zp) p224w3.t.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new p224w3.r() { // from class: com.google.android.gms.internal.ads.Hp
                @Override // p224w3.r
                public final java.lang.Object b(java.lang.Object obj) {
                    android.os.IBinder iBinder = (android.os.IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C5937zp ? (com.google.android.gms.internal.ads.C5937zp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5937zp(iBinder);
                }
            })).d2(X3.b.c2(context), str, interfaceC2945Vl, 244410000);
            if (iBinderD2 == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinderD2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5497vp ? (com.google.android.gms.internal.ads.InterfaceC5497vp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5277tp(iBinderD2);
        } catch (android.os.RemoteException e6) {
            e = e6;
            p224w3.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (p224w3.s e10) {
            e = e10;
            p224w3.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
