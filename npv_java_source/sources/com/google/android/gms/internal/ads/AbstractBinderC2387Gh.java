package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2387Gh extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2424Hh {
    public AbstractBinderC2387Gh() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2424Hh o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2424Hh ? (com.google.android.gms.internal.ads.InterfaceC2424Hh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2350Fh(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        java.lang.String strG0;
        android.os.IInterface iInterfaceS;
        boolean zS;
        int i11;
        boolean zC0;
        switch (i6) {
            case 1:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                strG0 = G0(string);
                parcel2.writeNoException();
                parcel2.writeString(strG0);
                return true;
            case 2:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceS = S(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 3:
                java.util.List<java.lang.String> listK = k();
                parcel2.writeNoException();
                parcel2.writeStringList(listK);
                return true;
            case 4:
                strG0 = h();
                parcel2.writeNoException();
                parcel2.writeString(strG0);
                return true;
            case 5:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p0(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                p();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterfaceS = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterfaceS = g();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 10:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                zC0 = C0(aVarY0);
                parcel2.writeNoException();
                i11 = zC0;
                parcel2.writeInt(i11);
                return true;
            case 11:
                parcel2.writeNoException();
                iInterfaceS = null;
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 12:
                zS = s();
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zS;
                parcel2.writeInt(i11);
                return true;
            case 13:
                zS = w();
                parcel2.writeNoException();
                int i13 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zS;
                parcel2.writeInt(i11);
                return true;
            case 14:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                a1(aVarY1);
                parcel2.writeNoException();
                return true;
            case 15:
                m();
                parcel2.writeNoException();
                return true;
            case 16:
                iInterfaceS = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 17:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                zC0 = g0(aVarY2);
                parcel2.writeNoException();
                i11 = zC0;
                parcel2.writeInt(i11);
                return true;
            default:
                return false;
        }
    }
}
