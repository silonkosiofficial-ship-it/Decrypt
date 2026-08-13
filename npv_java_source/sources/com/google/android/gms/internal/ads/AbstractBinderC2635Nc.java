package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2635Nc extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2672Oc {
    public AbstractBinderC2635Nc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            e();
        } else if (i6 == 2) {
            c();
        } else if (i6 == 3) {
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            n0(w6);
        } else if (i6 == 4) {
            d();
        } else {
            if (i6 != 5) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
