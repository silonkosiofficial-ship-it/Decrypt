package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2359Fm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2396Gm {
    public AbstractBinderC2359Fm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            j0(aVarY0);
        } else if (i6 == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            o(string);
        } else if (i6 == 3) {
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            x(w6);
        } else {
            if (i6 != 4) {
                return false;
            }
            com.google.android.gms.internal.ads.InterfaceC3624em interfaceC3624emO6 = com.google.android.gms.internal.ads.AbstractBinderC3515dm.o6(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            d5(interfaceC3624emO6);
        }
        parcel2.writeNoException();
        return true;
    }
}
