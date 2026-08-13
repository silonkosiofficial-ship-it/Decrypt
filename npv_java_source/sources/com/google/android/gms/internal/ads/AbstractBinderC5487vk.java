package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5487vk extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5597wk {
    public static com.google.android.gms.internal.ads.InterfaceC5597wk o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5597wk ? (com.google.android.gms.internal.ads.InterfaceC5597wk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5377uk(iBinder);
    }
}
