package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5701xh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5811yh {
    public AbstractBinderC5701xh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            X3(aVarY0);
        } else if (i6 == 2) {
            f();
        } else {
            if (i6 != 3) {
                return false;
            }
            X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            H4(aVarY1);
        }
        parcel2.writeNoException();
        return true;
    }
}
