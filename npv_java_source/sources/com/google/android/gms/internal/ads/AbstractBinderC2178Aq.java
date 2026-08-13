package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2178Aq extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2215Bq {
    public AbstractBinderC2178Aq() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static com.google.android.gms.internal.ads.InterfaceC2215Bq o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2215Bq ? (com.google.android.gms.internal.ads.InterfaceC2215Bq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5939zq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC5829yq c5609wq = null;
        switch (i6) {
            case 1:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.C2363Fq c2363Fq = (com.google.android.gms.internal.ads.C2363Fq) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2363Fq.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c5609wq = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC5829yq ? (com.google.android.gms.internal.ads.InterfaceC5829yq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C5609wq(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                F3(aVarY0, c2363Fq, c5609wq);
                parcel2.writeNoException();
                return true;
            case 2:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                b0(aVarY1);
                parcel2.writeNoException();
                return true;
            case 3:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
            case 4:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, null);
                return true;
            case 5:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300boO6 = com.google.android.gms.internal.ads.AbstractBinderC3190ao.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                H1(arrayListCreateTypedArrayList, aVarY2, interfaceC3300boO6);
                parcel2.writeNoException();
                return true;
            case 6:
                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300boO7 = com.google.android.gms.internal.ads.AbstractBinderC3190ao.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                o1(arrayListCreateTypedArrayList2, aVarY3, interfaceC3300boO7);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.internal.ads.C3848go c3848go = (com.google.android.gms.internal.ads.C3848go) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C3848go.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c1(c3848go);
                parcel2.writeNoException();
                return true;
            case 8:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c0(aVarY4);
                parcel2.writeNoException();
                return true;
            case 9:
                java.util.ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300boO8 = com.google.android.gms.internal.ads.AbstractBinderC3190ao.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                N4(arrayListCreateTypedArrayList3, aVarY5, interfaceC3300boO8);
                parcel2.writeNoException();
                return true;
            case 10:
                java.util.ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(android.net.Uri.CREATOR);
                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC3300bo interfaceC3300boO9 = com.google.android.gms.internal.ads.AbstractBinderC3190ao.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                u4(arrayListCreateTypedArrayList4, aVarY6, interfaceC3300boO9);
                parcel2.writeNoException();
                return true;
            case 11:
                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                X3.a aVarX4 = X4(aVarY7, aVarY8, string, aVarY9);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, aVarX4);
                return true;
            default:
                return false;
        }
    }
}
