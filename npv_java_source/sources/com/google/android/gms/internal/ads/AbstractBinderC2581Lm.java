package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2581Lm extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2617Mm {
    public AbstractBinderC2581Lm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            com.google.android.gms.internal.ads.InterfaceC4282km interfaceC4282kmO6 = com.google.android.gms.internal.ads.AbstractBinderC4172jm.o6(parcel.readStrongBinder());
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            H2(interfaceC4282kmO6);
        } else if (i6 == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            o(string);
        } else {
            if (i6 != 3) {
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
