package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2797Rj extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2834Sj {
    public AbstractBinderC2797Rj() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 != 1) {
            return false;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
        com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        T0(parcelFileDescriptor);
        return true;
    }
}
