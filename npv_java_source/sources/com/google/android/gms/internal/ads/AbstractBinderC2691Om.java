package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2691Om extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2765Qm {
    public AbstractBinderC2691Om() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 2) {
            i();
        } else if (i6 == 3) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            o(string);
        } else {
            if (i6 != 4) {
                return false;
            }
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            x(w6);
        }
        parcel2.writeNoException();
        return true;
    }
}
