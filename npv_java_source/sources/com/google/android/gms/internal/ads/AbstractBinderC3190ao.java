package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3190ao extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3300bo {
    public static com.google.android.gms.internal.ads.InterfaceC3300bo o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3300bo ? (com.google.android.gms.internal.ads.InterfaceC3300bo) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3091Zn(iBinder);
    }
}
