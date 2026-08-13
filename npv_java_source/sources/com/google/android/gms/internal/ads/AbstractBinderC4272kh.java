package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4272kh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC4382lh {
    public AbstractBinderC4272kh() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        float fD;
        android.os.IInterface iInterfaceH;
        com.google.android.gms.internal.ads.C2974Wh c2974Wh;
        int iL;
        switch (i6) {
            case 2:
                fD = d();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 3:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c0(aVarY0);
                parcel2.writeNoException();
                return true;
            case 4:
                iInterfaceH = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceH);
                return true;
            case 5:
                fD = i();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 6:
                fD = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 7:
                iInterfaceH = g();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceH);
                return true;
            case 8:
                iL = l();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(iL);
                return true;
            case 9:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2974Wh = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c2974Wh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.C2974Wh ? (com.google.android.gms.internal.ads.C2974Wh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2974Wh(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                q3(c2974Wh);
                parcel2.writeNoException();
                return true;
            case 10:
                iL = k();
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(iL);
                return true;
            default:
                return false;
        }
    }
}
