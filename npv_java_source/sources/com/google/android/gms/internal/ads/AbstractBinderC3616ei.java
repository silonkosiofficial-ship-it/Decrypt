package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3616ei extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3726fi {
    public static com.google.android.gms.internal.ads.InterfaceC3726fi o6(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3726fi ? (com.google.android.gms.internal.ads.InterfaceC3726fi) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3507di(iBinder);
    }
}
