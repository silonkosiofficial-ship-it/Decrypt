package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2582Ln extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2618Mn {
    public AbstractBinderC2582Ln() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2618Mn o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2618Mn ? (com.google.android.gms.internal.ads.InterfaceC2618Mn) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2545Kn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 1:
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W3(bundle);
                break;
            case 2:
                break;
            case 3:
                w();
                break;
            case 4:
                t();
                break;
            case 5:
                p();
                break;
            case 6:
                android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                z0(bundle2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, bundle2);
                return true;
            case 7:
                A();
                break;
            case 8:
                m();
                break;
            case 9:
                C();
                break;
            case 10:
                h();
                break;
            case 11:
                boolean zT = T();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(zT ? 1 : 0);
                return true;
            case 12:
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j2(i12, i13, intent);
                break;
            case 13:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                b0(aVarY0);
                break;
            case 14:
                v();
                break;
            case 15:
                int i14 = parcel.readInt();
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                N2(i14, strArrCreateStringArray, iArrCreateIntArray);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
