package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4604ni extends X3.c {
    public C4604ni() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // X3.c
    protected final /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2165Ah ? (com.google.android.gms.internal.ads.InterfaceC2165Ah) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5921zh(iBinder);
    }
}
