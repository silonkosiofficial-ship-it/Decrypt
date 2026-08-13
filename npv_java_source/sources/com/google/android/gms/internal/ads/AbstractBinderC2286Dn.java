package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2286Dn extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2323En {
    public AbstractBinderC2286Dn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2323En o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2323En ? (com.google.android.gms.internal.ads.InterfaceC2323En) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C2249Cn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        switch (i6) {
            case 1:
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                M0(intent);
                break;
            case 2:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                P0(aVarY0, string, string2);
                break;
            case 3:
                g();
                break;
            case 4:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j0(aVarY1);
                break;
            case 5:
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                i6(strArrCreateStringArray, iArrCreateIntArray, aVarY2);
                break;
            case 6:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p194t3.a aVar = (p194t3.a) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p194t3.a.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                g5(aVarY3, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
