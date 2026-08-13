package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5041rh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC5261th {
    public AbstractBinderC5041rh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static com.google.android.gms.internal.ads.InterfaceC5261th o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5261th ? (com.google.android.gms.internal.ads.InterfaceC5261th) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4932qh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC4382lh c4162jh;
        switch (i6) {
            case 1:
                java.lang.String string = parcel.readString();
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Q1(string, aVarY0);
                break;
            case 2:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                X3.a aVarY = y(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, aVarY);
                return true;
            case 3:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                h5(aVarY1);
                break;
            case 4:
                c();
                break;
            case 5:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                break;
            case 6:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                e4(aVarY2);
                break;
            case 7:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                s0(aVarY3);
                break;
            case 8:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c4162jh = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c4162jh = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC4382lh ? (com.google.android.gms.internal.ads.InterfaceC4382lh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C4162jh(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                h1(c4162jh);
                break;
            case 9:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                v4(aVarY4);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
