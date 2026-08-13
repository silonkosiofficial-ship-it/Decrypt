package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2397Gn extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2471In {
    public static com.google.android.gms.internal.ads.InterfaceC2471In o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2471In ? (com.google.android.gms.internal.ads.InterfaceC2471In) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2360Fn(iBinder);
    }
}
