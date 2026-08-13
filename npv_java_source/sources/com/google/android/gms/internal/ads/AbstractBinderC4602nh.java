package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4602nh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4712oh {
    public AbstractBinderC4602nh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static com.google.android.gms.internal.ads.InterfaceC4712oh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4712oh ? (com.google.android.gms.internal.ads.InterfaceC4712oh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4492mh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        int iF;
        if (i6 == 1) {
            X3.a aVarE = e();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, aVarE);
        } else if (i6 == 2) {
            android.net.Uri uriD = d();
            parcel2.writeNoException();
            com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, uriD);
        } else if (i6 != 3) {
            if (i6 == 4) {
                iF = f();
            } else {
                if (i6 != 5) {
                    return false;
                }
                iF = c();
            }
            parcel2.writeNoException();
            parcel2.writeInt(iF);
        } else {
            double dB = b();
            parcel2.writeNoException();
            parcel2.writeDouble(dB);
        }
        return true;
    }
}
