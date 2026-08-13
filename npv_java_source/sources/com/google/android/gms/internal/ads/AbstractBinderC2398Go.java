package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2398Go extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2435Ho {
    public AbstractBinderC2398Go() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            H3(parcelFileDescriptor);
        } else if (i6 == 2) {
            p214v3.D d6 = (p214v3.D) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p214v3.D.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            C3(d6);
        } else {
            if (i6 != 3) {
                return false;
            }
            android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
            com.google.android.gms.internal.ads.C2730Po c2730Po = (com.google.android.gms.internal.ads.C2730Po) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2730Po.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            C5(parcelFileDescriptor2, c2730Po);
        }
        parcel2.writeNoException();
        return true;
    }
}
