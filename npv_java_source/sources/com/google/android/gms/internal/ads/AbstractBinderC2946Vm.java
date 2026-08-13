package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2946Vm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2982Wm {
    public AbstractBinderC2946Vm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            o(string);
        } else if (i6 == 2) {
            java.lang.String string2 = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            G(string2);
        } else {
            if (i6 != 3) {
                return false;
            }
            p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            c6(w6);
        }
        parcel2.writeNoException();
        return true;
    }
}
