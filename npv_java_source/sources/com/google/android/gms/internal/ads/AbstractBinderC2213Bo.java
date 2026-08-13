package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2213Bo extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC2250Co {
    public AbstractBinderC2213Bo() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        com.google.android.gms.internal.ads.InterfaceC2435Ho c2361Fo = null;
        com.google.android.gms.internal.ads.C2472Io c2472Io = null;
        com.google.android.gms.internal.ads.InterfaceC2435Ho c2361Fo2 = null;
        com.google.android.gms.internal.ads.InterfaceC2435Ho c2361Fo3 = null;
        com.google.android.gms.internal.ads.InterfaceC2435Ho c2361Fo4 = null;
        switch (i6) {
            case 1:
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, null);
                return true;
            case 2:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC2287Do) {
                    }
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                break;
            case 3:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.ads.C2730Po c2730Po = (com.google.android.gms.internal.ads.C2730Po) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2730Po.CREATOR);
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c2361Fo = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.InterfaceC2435Ho ? (com.google.android.gms.internal.ads.InterfaceC2435Ho) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.C2361Fo(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                I2(c2730Po, c2361Fo);
                break;
            case 5:
                com.google.android.gms.internal.ads.C2730Po c2730Po2 = (com.google.android.gms.internal.ads.C2730Po) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2730Po.CREATOR);
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c2361Fo4 = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.InterfaceC2435Ho ? (com.google.android.gms.internal.ads.InterfaceC2435Ho) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.C2361Fo(strongBinder3);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                A3(c2730Po2, c2361Fo4);
                break;
            case 6:
                com.google.android.gms.internal.ads.C2730Po c2730Po3 = (com.google.android.gms.internal.ads.C2730Po) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C2730Po.CREATOR);
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c2361Fo3 = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.InterfaceC2435Ho ? (com.google.android.gms.internal.ads.InterfaceC2435Ho) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.C2361Fo(strongBinder4);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j1(c2730Po3, c2361Fo3);
                break;
            case 7:
                java.lang.String string = parcel.readString();
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    c2361Fo2 = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.InterfaceC2435Ho ? (com.google.android.gms.internal.ads.InterfaceC2435Ho) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.ads.C2361Fo(strongBinder5);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                R3(string, c2361Fo2);
                break;
            case 8:
                com.google.android.gms.internal.ads.C5825yo c5825yo = (com.google.android.gms.internal.ads.C5825yo) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C5825yo.CREATOR);
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c2472Io = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.C2472Io ? (com.google.android.gms.internal.ads.C2472Io) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.ads.C2472Io(strongBinder6);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                s2(c5825yo, c2472Io);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
