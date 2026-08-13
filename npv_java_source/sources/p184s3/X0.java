package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class X0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.Y0 {
    public X0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static p184s3.Y0 o6(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof p184s3.Y0 ? (p184s3.Y0) iInterfaceQueryLocalInterface : new p184s3.V0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        float fI;
        p184s3.InterfaceC7081b1 z6;
        int i11;
        boolean zS;
        switch (i6) {
            case 1:
                l();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l0(zG);
                parcel2.writeNoException();
                return true;
            case 4:
                zS = s();
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zS;
                parcel2.writeInt(i11);
                return true;
            case 5:
                int iG = g();
                parcel2.writeNoException();
                i11 = iG;
                parcel2.writeInt(i11);
                return true;
            case 6:
                fI = i();
                parcel2.writeNoException();
                parcel2.writeFloat(fI);
                return true;
            case 7:
                fI = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fI);
                return true;
            case 8:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    z6 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    z6 = iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7081b1 ? (p184s3.InterfaceC7081b1) iInterfaceQueryLocalInterface : new p184s3.Z0(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                b4(z6);
                parcel2.writeNoException();
                return true;
            case 9:
                fI = d();
                parcel2.writeNoException();
                parcel2.writeFloat(fI);
                return true;
            case 10:
                zS = q();
                parcel2.writeNoException();
                int i13 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zS;
                parcel2.writeInt(i11);
                return true;
            case 11:
                p184s3.InterfaceC7081b1 interfaceC7081b1H = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, interfaceC7081b1H);
                return true;
            case 12:
                zS = p();
                parcel2.writeNoException();
                int i14 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zS;
                parcel2.writeInt(i11);
                return true;
            case 13:
                n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
