package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2502Jj extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2539Kj {
    public AbstractBinderC2502Jj() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            G(string);
        } else {
            if (i6 != 2) {
                return false;
            }
            d();
        }
        parcel2.writeNoException();
        return true;
    }
}
