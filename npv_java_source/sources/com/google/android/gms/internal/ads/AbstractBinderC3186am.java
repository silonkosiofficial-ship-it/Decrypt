package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3186am extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3296bm {
    public AbstractBinderC3186am() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static com.google.android.gms.internal.ads.InterfaceC3296bm o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3089Zl(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 1:
                d();
                parcel2.writeNoException();
                return true;
            case 2:
                e();
                parcel2.writeNoException();
                return true;
            case 3:
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                D(i11);
                parcel2.writeNoException();
                return true;
            case 4:
                n();
                parcel2.writeNoException();
                return true;
            case 5:
                q();
                parcel2.writeNoException();
                return true;
            case 6:
                p();
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.AbstractC3734fm) {
                        androidx.appcompat.app.D.a(iInterfaceQueryLocalInterface);
                    }
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                m();
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                M4(string, string2);
                parcel2.writeNoException();
                return true;
            case 10:
                com.google.android.gms.internal.ads.AbstractBinderC2387Gh.o6(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
                v();
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                V();
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.C4728op c4728op = (com.google.android.gms.internal.ads.C4728op) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C4728op.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                m4(c4728op);
                parcel2.writeNoException();
                return true;
            case 15:
                z();
                parcel2.writeNoException();
                return true;
            case 16:
                com.google.android.gms.internal.ads.InterfaceC5167sp interfaceC5167spO6 = com.google.android.gms.internal.ads.AbstractBinderC5057rp.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                O1(interfaceC5167spO6);
                parcel2.writeNoException();
                return true;
            case 17:
                int i12 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                E4(i12);
                parcel2.writeNoException();
                return true;
            case 18:
                A();
                parcel2.writeNoException();
                return true;
            case 19:
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                C();
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W(string3);
                parcel2.writeNoException();
                return true;
            case 22:
                int i13 = parcel.readInt();
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                m1(i13, string4);
                parcel2.writeNoException();
                return true;
            case 23:
                p184s3.W0 w6 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                i5(w6);
                parcel2.writeNoException();
                return true;
            case 24:
                p184s3.W0 w10 = (p184s3.W0) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.W0.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                e3(w10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
