package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2535Kh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2572Lh {
    public static com.google.android.gms.internal.ads.InterfaceC2572Lh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2572Lh ? (com.google.android.gms.internal.ads.InterfaceC2572Lh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2498Jh(iBinder);
    }
}
