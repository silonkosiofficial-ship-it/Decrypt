package p184s3;

/* JADX INFO: renamed from: s3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7086d0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7089e0 {
    public AbstractBinderC7086d0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        p184s3.InterfaceC7083c0 c7080b0;
        android.os.IInterface iInterfaceS;
        int iW;
        switch (i6) {
            case 1:
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(p184s3.I1.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c7080b0 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    c7080b0 = iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7083c0 ? (p184s3.InterfaceC7083c0) iInterfaceQueryLocalInterface : new p184s3.C7080b0(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                E2(arrayListCreateTypedArrayList, c7080b0);
                parcel2.writeNoException();
                return true;
            case 2:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iW = W(string);
                parcel2.writeNoException();
                parcel2.writeInt(iW);
                return true;
            case 3:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceS = S(string2);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 4:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iW = G0(string3);
                parcel2.writeNoException();
                parcel2.writeInt(iW);
                return true;
            case 5:
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceS = o(string4);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 6:
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iW = W1(string5);
                parcel2.writeNoException();
                parcel2.writeInt(iW);
                return true;
            case 7:
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceS = G(string6);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceS);
                return true;
            case 8:
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO6 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                f6(interfaceC2945VlO6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
