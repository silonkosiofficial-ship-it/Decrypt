package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5719xq extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5829yq {
    public AbstractBinderC5719xq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 == 1) {
            parcel.readString();
            parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
        } else if (i6 == 2) {
            java.lang.String string = parcel.readString();
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            y(string);
        } else {
            if (i6 != 3) {
                return false;
            }
            java.lang.String string2 = parcel.readString();
            java.lang.String string3 = parcel.readString();
            android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
            com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
            M1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
