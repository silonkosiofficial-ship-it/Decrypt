package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.We0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2969We0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3005Xe0 {
    public static com.google.android.gms.internal.ads.InterfaceC3005Xe0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3005Xe0 ? (com.google.android.gms.internal.ads.InterfaceC3005Xe0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2933Ve0(iBinder);
    }
}
