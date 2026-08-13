package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3017Xl extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements com.google.android.gms.internal.ads.InterfaceC3053Yl {
    public AbstractBinderC3017Xl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceN;
        android.os.Parcelable parcelableD;
        com.google.android.gms.internal.ads.InterfaceC3296bm c3089Zl = null;
        switch (i6) {
            case 1:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                p184s3.X1 x6 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string = parcel.readString();
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.C3089Zl(strongBinder);
                }
                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm = c3089Zl;
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                B2(aVarY0, c2Var, x6, string, interfaceC3296bm);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterfaceN = n();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 3:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x10 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string2 = parcel.readString();
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface2 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface2 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder2);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                t2(aVarY1, x10, string2, c3089Zl);
                parcel2.writeNoException();
                return true;
            case 4:
                H();
                parcel2.writeNoException();
                return true;
            case 5:
                p();
                parcel2.writeNoException();
                return true;
            case 6:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var2 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                p184s3.X1 x11 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string3 = parcel.readString();
                java.lang.String string4 = parcel.readString();
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface3 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface3 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder3);
                }
                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm2 = c3089Zl;
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                L3(aVarY2, c2Var2, x11, string3, string4, interfaceC3296bm2);
                parcel2.writeNoException();
                return true;
            case 7:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x12 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string5 = parcel.readString();
                java.lang.String string6 = parcel.readString();
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface4 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface4 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder4);
                }
                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm3 = c3089Zl;
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                b1(aVarY3, x12, string5, string6, interfaceC3296bm3);
                parcel2.writeNoException();
                return true;
            case 8:
                r0();
                parcel2.writeNoException();
                return true;
            case 9:
                N();
                parcel2.writeNoException();
                return true;
            case 10:
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x13 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string7 = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618npO6 = com.google.android.gms.internal.ads.AbstractBinderC4508mp.o6(parcel.readStrongBinder());
                java.lang.String string8 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                r3(aVarY4, x13, string7, interfaceC4618npO6, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                p184s3.X1 x14 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string9 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                S0(x14, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                P();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zM = M();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 14:
                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x15 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string10 = parcel.readString();
                java.lang.String string11 = parcel.readString();
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface5 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface5 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder5);
                }
                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm4 = c3089Zl;
                com.google.android.gms.internal.ads.C3505dh c3505dh = (com.google.android.gms.internal.ads.C3505dh) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, com.google.android.gms.internal.ads.C3505dh.CREATOR);
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                h2(aVarY5, x15, string10, string11, interfaceC3296bm4, c3505dh, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case 16:
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, null);
                return true;
            case 17:
                parcelableD = d();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableD);
                return true;
            case 18:
                parcelableD = e();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableD);
                return true;
            case 19:
                parcelableD = i();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableD);
                return true;
            case 20:
                p184s3.X1 x16 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string12 = parcel.readString();
                java.lang.String string13 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Q4(x16, string12, string13);
                parcel2.writeNoException();
                return true;
            case com.google.android.gms.internal.ads.C3040Ye.zzm /* 21 */:
                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                L1(aVarY6);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i12 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(0);
                return true;
            case 23:
                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC4618np interfaceC4618npO7 = com.google.android.gms.internal.ads.AbstractBinderC4508mp.o6(parcel.readStrongBinder());
                java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                a2(aVarY7, interfaceC4618npO7, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                iInterfaceN = h();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 25:
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                A0(zG);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceN = g();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 27:
                iInterfaceN = k();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 28:
                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x17 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string14 = parcel.readString();
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface6 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface6 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder6);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                z4(aVarY8, x17, string14, c3089Zl);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                V2(aVarY9);
                parcel2.writeNoException();
                return true;
            case 31:
                X3.a aVarY10 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC3620ek interfaceC3620ekO6 = com.google.android.gms.internal.ads.AbstractBinderC3511dk.o6(parcel.readStrongBinder());
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.internal.ads.C4278kk.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                G4(aVarY10, interfaceC3620ekO6, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                X3.a aVarY11 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x18 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string15 = parcel.readString();
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface7 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface7 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder7);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                c3(aVarY11, x18, string15, c3089Zl);
                parcel2.writeNoException();
                return true;
            case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                parcelableD = l();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableD);
                return true;
            case 34:
                parcelableD = m();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.e(parcel2, parcelableD);
                return true;
            case 35:
                X3.a aVarY12 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var3 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                p184s3.X1 x19 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string16 = parcel.readString();
                java.lang.String string17 = parcel.readString();
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface8 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface8 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder8);
                }
                com.google.android.gms.internal.ads.InterfaceC3296bm interfaceC3296bm5 = c3089Zl;
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l4(aVarY12, c2Var3, x19, string16, string17, interfaceC3296bm5);
                parcel2.writeNoException();
                return true;
            case 36:
                iInterfaceN = j();
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceN);
                return true;
            case 37:
                X3.a aVarY13 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                G3(aVarY13);
                parcel2.writeNoException();
                return true;
            case 38:
                X3.a aVarY14 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.X1 x20 = (p184s3.X1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.X1.CREATOR);
                java.lang.String string18 = parcel.readString();
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3089Zl = iInterfaceQueryLocalInterface9 instanceof com.google.android.gms.internal.ads.InterfaceC3296bm ? (com.google.android.gms.internal.ads.InterfaceC3296bm) iInterfaceQueryLocalInterface9 : new com.google.android.gms.internal.ads.C3089Zl(strongBinder9);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                w4(aVarY14, x20, string18, c3089Zl);
                parcel2.writeNoException();
                return true;
            case 39:
                X3.a aVarY15 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                T4(aVarY15);
                parcel2.writeNoException();
                return true;
        }
    }
}
