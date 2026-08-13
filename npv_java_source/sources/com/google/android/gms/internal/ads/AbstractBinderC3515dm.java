package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3515dm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3624em {
    public static com.google.android.gms.internal.ads.InterfaceC3624em o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3624em ? (com.google.android.gms.internal.ads.InterfaceC3624em) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3405cm(iBinder);
    }
}
