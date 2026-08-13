package p184s3;

/* JADX INFO: renamed from: s3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7107k0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7110l0 {
    public AbstractBinderC7107k0() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        android.os.IInterface iInterfaceH6;
        switch (i6) {
            case 1:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO6 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = h6(aVarY0, c2Var, string, interfaceC2945VlO6, i11);
                break;
            case 2:
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var2 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO7 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = v5(aVarY1, c2Var2, string2, interfaceC2945VlO7, i12);
                break;
            case 3:
                X3.a aVarY2 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string3 = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO8 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = B4(aVarY2, string3, interfaceC2945VlO8, i13);
                break;
            case 4:
            case 7:
                X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                parcel2.writeNoException();
                com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, null);
                return true;
            case 5:
                X3.a aVarY3 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY4 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = J4(aVarY3, aVarY4);
                break;
            case 6:
                X3.a aVarY5 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO9 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = b2(aVarY5, interfaceC2945VlO9, i14);
                break;
            case 8:
                X3.a aVarY6 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = m0(aVarY6);
                break;
            case 9:
                X3.a aVarY7 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = E3(aVarY7, i15);
                break;
            case 10:
                X3.a aVarY8 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var3 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                java.lang.String string4 = parcel.readString();
                int i16 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = F4(aVarY8, c2Var3, string4, i16);
                break;
            case 11:
                X3.a aVarY9 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY10 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                X3.a aVarY11 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = f1(aVarY9, aVarY10, aVarY11);
                break;
            case 12:
                X3.a aVarY12 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO10 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = f2(aVarY12, string5, interfaceC2945VlO10, i17);
                break;
            case 13:
                X3.a aVarY13 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                p184s3.c2 c2Var4 = (p184s3.c2) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.c2.CREATOR);
                java.lang.String string6 = parcel.readString();
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO11 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = i1(aVarY13, c2Var4, string6, interfaceC2945VlO11, i18);
                break;
            case 14:
                X3.a aVarY14 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO12 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = I3(aVarY14, interfaceC2945VlO12, i19);
                break;
            case 15:
                X3.a aVarY15 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO13 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = Z0(aVarY15, interfaceC2945VlO13, i20);
                break;
            case 16:
                X3.a aVarY16 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO14 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                com.google.android.gms.internal.ads.InterfaceC2465Ij interfaceC2465IjO6 = com.google.android.gms.internal.ads.AbstractBinderC2428Hj.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = S3(aVarY16, interfaceC2945VlO14, i21, interfaceC2465IjO6);
                break;
            case 17:
                X3.a aVarY17 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO15 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = b6(aVarY17, interfaceC2945VlO15, i22);
                break;
            case 18:
                X3.a aVarY18 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO16 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                iInterfaceH6 = D4(aVarY18, interfaceC2945VlO16, i23);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcel2, iInterfaceH6);
        return true;
    }
}
