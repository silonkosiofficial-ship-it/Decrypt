package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2826Sf extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2862Tf {
    public AbstractBinderC2826Sf() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strB;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                    com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                    s0(aVarY0);
                } else if (i6 == 4) {
                    d();
                } else {
                    if (i6 != 5) {
                        return false;
                    }
                    e();
                }
                parcel2.writeNoException();
            } else {
                strB = c();
            }
            return true;
        }
        strB = b();
        parcel2.writeNoException();
        parcel2.writeString(strB);
        return true;
    }
}
