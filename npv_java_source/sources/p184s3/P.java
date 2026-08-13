package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.Q {
    public P() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        p184s3.H f6 = null;
        p184s3.C7113m0 c7113m0 = null;
        switch (i6) {
            case 1:
                p184s3.N nD = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, nD);
                return true;
            case 2:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    f6 = iInterfaceQueryLocalInterface instanceof p184s3.H ? (p184s3.H) iInterfaceQueryLocalInterface : new p184s3.F(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                A4(f6);
                break;
            case 3:
                com.google.android.gms.internal.ads.InterfaceC2572Lh interfaceC2572LhO6 = com.google.android.gms.internal.ads.AbstractBinderC2535Kh.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                k1(interfaceC2572LhO6);
                break;
            case 4:
                com.google.android.gms.internal.ads.InterfaceC2682Oh interfaceC2682OhO6 = com.google.android.gms.internal.ads.AbstractBinderC2645Nh.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c4(interfaceC2682OhO6);
                break;
            case 5:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2938Vh interfaceC2938VhO6 = com.google.android.gms.internal.ads.AbstractBinderC2902Uh.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2830Sh interfaceC2830ShO6 = com.google.android.gms.internal.ads.AbstractBinderC2756Qh.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l3(string, interfaceC2938VhO6, interfaceC2830ShO6);
                break;
            case 6:
                com.google.android.gms.internal.ads.C3505dh c3505dh = (com.google.android.gms.internal.ads.C3505dh) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C3505dh.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                U4(c3505dh);
                break;
            case 7:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c7113m0 = iInterfaceQueryLocalInterface2 instanceof p184s3.C7113m0 ? (p184s3.C7113m0) iInterfaceQueryLocalInterface2 : new p184s3.C7113m0(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l6(c7113m0);
                break;
            case 8:
                com.google.android.gms.internal.ads.InterfaceC3082Zh interfaceC3082ZhO6 = com.google.android.gms.internal.ads.AbstractBinderC3046Yh.o6(parcel.readStrongBinder());
                p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                f5(interfaceC3082ZhO6, c2Var);
                break;
            case 9:
                p134n3.f fVar = (p134n3.f) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p134n3.f.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                g6(fVar);
                break;
            case 10:
                com.google.android.gms.internal.ads.InterfaceC3397ci interfaceC3397ciO6 = com.google.android.gms.internal.ads.AbstractBinderC3288bi.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                U5(interfaceC3397ciO6);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                com.google.android.gms.internal.ads.C4498mk c4498mk = (com.google.android.gms.internal.ads.C4498mk) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C4498mk.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                z2(c4498mk);
                break;
            case 14:
                com.google.android.gms.internal.ads.InterfaceC5597wk interfaceC5597wkO6 = com.google.android.gms.internal.ads.AbstractBinderC5487vk.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                x2(interfaceC5597wkO6);
                break;
            case 15:
                p134n3.a aVar = (p134n3.a) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p134n3.a.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                E5(aVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
