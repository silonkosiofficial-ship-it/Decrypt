package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.be0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3281be0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3390ce0 {
    public AbstractBinderC3281be0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 2:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
