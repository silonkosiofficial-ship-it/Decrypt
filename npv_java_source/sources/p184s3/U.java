package p184s3;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.V {
    public U() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceN;
        android.os.Parcelable parcelableI;
        java.lang.String strU;
        int i11;
        boolean zF0;
        p184s3.H f6 = null;
        p184s3.InterfaceC7122p0 c7116n0 = null;
        p184s3.K i12 = null;
        p184s3.N0 l6 = null;
        p184s3.InterfaceC7077a0 y6 = null;
        p184s3.C7113m0 c7113m0 = null;
        p184s3.E c6 = null;
        p184s3.InterfaceC7101i0 c7095g0 = null;
        switch (i6) {
            case 1:
                iInterfaceN = n();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 2:
                C();
                parcel2.writeNoException();
                return true;
            case 3:
                zF0 = f0();
                parcel2.writeNoException();
                int i13 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zF0;
                parcel2.writeInt(i11);
                return true;
            case 4:
                p184s3.X1 x6 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                boolean zK3 = K3(x6);
                parcel2.writeNoException();
                i11 = zK3;
                parcel2.writeInt(i11);
                return true;
            case 5:
                J();
                parcel2.writeNoException();
                return true;
            case 6:
                Y();
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    f6 = iInterfaceQueryLocalInterface instanceof p184s3.H ? (p184s3.H) iInterfaceQueryLocalInterface : new p184s3.F(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                u3(f6);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c7095g0 = iInterfaceQueryLocalInterface2 instanceof p184s3.InterfaceC7101i0 ? (p184s3.InterfaceC7101i0) iInterfaceQueryLocalInterface2 : new p184s3.C7095g0(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                i2(c7095g0);
                parcel2.writeNoException();
                return true;
            case 9:
                X();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                h0();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelableI = i();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableI);
                return true;
            case 13:
                p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                T1(c2Var);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.internal.ads.InterfaceC2947Vn interfaceC2947VnO6 = com.google.android.gms.internal.ads.AbstractBinderC2911Un.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W2(interfaceC2947VnO6);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.internal.ads.InterfaceC3055Yn interfaceC3055YnO6 = com.google.android.gms.internal.ads.AbstractBinderC3019Xn.o6(parcel.readStrongBinder());
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                X1(interfaceC3055YnO6, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strU = u();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 19:
                com.google.android.gms.internal.ads.InterfaceC2970Wf interfaceC2970WfO6 = com.google.android.gms.internal.ads.AbstractBinderC2934Vf.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                F2(interfaceC2970WfO6);
                parcel2.writeNoException();
                return true;
            case 20:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c6 = iInterfaceQueryLocalInterface3 instanceof p184s3.E ? (p184s3.E) iInterfaceQueryLocalInterface3 : new p184s3.C(strongBinder3);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                V5(c6);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c7113m0 = iInterfaceQueryLocalInterface4 instanceof p184s3.C7113m0 ? (p184s3.C7113m0) iInterfaceQueryLocalInterface4 : new p184s3.C7113m0(strongBinder4);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                v3(c7113m0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                e6(zG);
                parcel2.writeNoException();
                return true;
            case 23:
                zF0 = P5();
                parcel2.writeNoException();
                int i14 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zF0;
                parcel2.writeInt(i11);
                return true;
            case 24:
                com.google.android.gms.internal.ads.InterfaceC4069ip interfaceC4069ipO6 = com.google.android.gms.internal.ads.AbstractBinderC3960hp.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Y1(interfaceC4069ipO6);
                parcel2.writeNoException();
                return true;
            case 25:
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                r2(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceN = l();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 29:
                p184s3.Q1 q6 = (p184s3.Q1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.Q1.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j4(q6);
                parcel2.writeNoException();
                return true;
            case 30:
                p184s3.C7084c1 c7084c1 = (p184s3.C7084c1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.C7084c1.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                g3(c7084c1);
                parcel2.writeNoException();
                return true;
            case 31:
                strU = t();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 32:
                iInterfaceN = j();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                iInterfaceN = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 34:
                boolean zG2 = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Y4(zG2);
                parcel2.writeNoException();
                return true;
            case 35:
                strU = w();
                parcel2.writeNoException();
                parcel2.writeString(strU);
                return true;
            case 36:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    y6 = iInterfaceQueryLocalInterface5 instanceof p184s3.InterfaceC7077a0 ? (p184s3.InterfaceC7077a0) iInterfaceQueryLocalInterface5 : new p184s3.Y(strongBinder5);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                x4(y6);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableI = f();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableI);
                return true;
            case 38:
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W0(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                p184s3.i2 i2Var = (p184s3.i2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.i2.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                V0(i2Var);
                parcel2.writeNoException();
                return true;
            case 40:
                com.google.android.gms.internal.ads.InterfaceC2525Kc interfaceC2525KcO6 = com.google.android.gms.internal.ads.AbstractBinderC2488Jc.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                I5(interfaceC2525KcO6);
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceN = k();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 42:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    l6 = iInterfaceQueryLocalInterface6 instanceof p184s3.N0 ? (p184s3.N0) iInterfaceQueryLocalInterface6 : new p184s3.L0(strongBinder6);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l1(l6);
                parcel2.writeNoException();
                return true;
            case 43:
                p184s3.X1 x10 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    i12 = iInterfaceQueryLocalInterface7 instanceof p184s3.K ? (p184s3.K) iInterfaceQueryLocalInterface7 : new p184s3.I(strongBinder7);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                o3(x10, i12);
                parcel2.writeNoException();
                return true;
            case 44:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                m6(aVarY0);
                parcel2.writeNoException();
                return true;
            case 45:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c7116n0 = iInterfaceQueryLocalInterface8 instanceof p184s3.InterfaceC7122p0 ? (p184s3.InterfaceC7122p0) iInterfaceQueryLocalInterface8 : new p184s3.C7116n0(strongBinder8);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                F1(c7116n0);
                parcel2.writeNoException();
                return true;
            case 46:
                zF0 = H0();
                parcel2.writeNoException();
                int i15 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                i11 = zF0;
                parcel2.writeInt(i11);
                return true;
        }
    }
}
