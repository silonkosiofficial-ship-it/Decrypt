package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2377Gc extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2414Hc {
    public AbstractBinderC2377Gc() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceD;
        com.google.android.gms.internal.ads.InterfaceC2672Oc c2598Mc;
        switch (i6) {
            case 2:
                iInterfaceD = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceD);
                return true;
            case 3:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2562Lc) {
                    }
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c2598Mc = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c2598Mc = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.InterfaceC2672Oc ? (com.google.android.gms.internal.ads.InterfaceC2672Oc) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.C2598Mc(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                M3(aVarY0, c2598Mc);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterfaceD = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceD);
                return true;
            case 6:
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                K0(zG);
                parcel2.writeNoException();
                return true;
            case 7:
                p184s3.N0 n0O6 = p184s3.M0.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                z1(n0O6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
