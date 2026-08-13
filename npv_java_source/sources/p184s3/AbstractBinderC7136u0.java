package p184s3;

/* JADX INFO: renamed from: s3.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC7136u0 extends com.google.android.gms.internal.ads.AbstractBinderC2301Eb implements p184s3.InterfaceC7139v0 {
    public AbstractBinderC7136u0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2301Eb
    protected final boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        p184s3.H0 f6;
        switch (i6) {
            case 1:
                k();
                break;
            case 2:
                float f10 = parcel.readFloat();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                w0(f10);
                break;
            case 3:
                java.lang.String string = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                W4(string);
                break;
            case 4:
                boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                j6(zG);
                break;
            case 5:
                X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                java.lang.String string2 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                p5(aVarY0, string2);
                break;
            case 6:
                java.lang.String string3 = parcel.readString();
                X3.a aVarY1 = X3.a.AbstractBinderC0301a.y0(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                P4(string3, aVarY1);
                break;
            case 7:
                float fD = d();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 8:
                boolean zV = v();
                parcel2.writeNoException();
                int i11 = com.google.android.gms.internal.ads.AbstractC2338Fb.f27410b;
                parcel2.writeInt(zV ? 1 : 0);
                return true;
            case 9:
                java.lang.String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 10:
                java.lang.String string4 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                a0(string4);
                break;
            case 11:
                com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO6 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                Y0(interfaceC2945VlO6);
                break;
            case 12:
                com.google.android.gms.internal.ads.InterfaceC3950hk interfaceC3950hkO6 = com.google.android.gms.internal.ads.AbstractBinderC3840gk.o6(parcel.readStrongBinder());
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                y2(interfaceC3950hkO6);
                break;
            case 13:
                java.util.List listI = i();
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 14:
                p184s3.K1 k6 = (p184s3.K1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcel, p184s3.K1.CREATOR);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                B5(k6);
                break;
            case 15:
                h();
                break;
            case 16:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    f6 = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    f6 = iInterfaceQueryLocalInterface instanceof p184s3.H0 ? (p184s3.H0) iInterfaceQueryLocalInterface : new p184s3.F0(strongBinder);
                }
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                e2(f6);
                break;
            case 17:
                boolean zG2 = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcel);
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                l0(zG2);
                break;
            case 18:
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.ads.AbstractC2338Fb.c(parcel);
                R0(string5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
