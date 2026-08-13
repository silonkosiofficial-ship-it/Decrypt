package p184s3;

/* JADX INFO: renamed from: s3.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7104j0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7110l0 {
    C7104j0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.Q B4(X3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.Q o6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            o6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            o6 = iInterfaceQueryLocalInterface instanceof p184s3.Q ? (p184s3.Q) iInterfaceQueryLocalInterface : new p184s3.O(strongBinder);
        }
        parcelY0.recycle();
        return o6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.InterfaceC7139v0 E3(X3.a aVar, int i6) {
        p184s3.InterfaceC7139v0 c7133t0;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(9, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            c7133t0 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c7133t0 = iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7139v0 ? (p184s3.InterfaceC7139v0) iInterfaceQueryLocalInterface : new p184s3.C7133t0(strongBinder);
        }
        parcelY0.recycle();
        return c7133t0;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.V F4(X3.a aVar, p184s3.c2 c2Var, java.lang.String str, int i6) {
        p184s3.V t6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        parcelQ0.writeString(str);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(10, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            t6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t6 = iInterfaceQueryLocalInterface instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface : new p184s3.T(strongBinder);
        }
        parcelY0.recycle();
        return t6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final com.google.android.gms.internal.ads.InterfaceC2215Bq I3(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(14, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC2215Bq interfaceC2215BqO6 = com.google.android.gms.internal.ads.AbstractBinderC2178Aq.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC2215BqO6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final com.google.android.gms.internal.ads.InterfaceC5261th J4(X3.a aVar, X3.a aVar2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar2);
        android.os.Parcel parcelY0 = y0(5, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC5261th interfaceC5261thO6 = com.google.android.gms.internal.ads.AbstractBinderC5041rh.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC5261thO6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final com.google.android.gms.internal.ads.InterfaceC2323En Z0(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(15, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC2323En interfaceC2323EnO6 = com.google.android.gms.internal.ads.AbstractBinderC2286Dn.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC2323EnO6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.Q0 b6(X3.a aVar, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.Q0 o6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(17, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            o6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            o6 = iInterfaceQueryLocalInterface instanceof p184s3.Q0 ? (p184s3.Q0) iInterfaceQueryLocalInterface : new p184s3.O0(strongBinder);
        }
        parcelY0.recycle();
        return o6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final com.google.android.gms.internal.ads.InterfaceC5497vp f2(X3.a aVar, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(12, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC5497vp interfaceC5497vpO6 = com.google.android.gms.internal.ads.AbstractBinderC5387up.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC5497vpO6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.V h6(X3.a aVar, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.V t6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            t6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t6 = iInterfaceQueryLocalInterface instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface : new p184s3.T(strongBinder);
        }
        parcelY0.recycle();
        return t6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.V i1(X3.a aVar, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.V t6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(13, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            t6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t6 = iInterfaceQueryLocalInterface instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface : new p184s3.T(strongBinder);
        }
        parcelY0.recycle();
        return t6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final com.google.android.gms.internal.ads.InterfaceC2618Mn m0(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        android.os.Parcel parcelY0 = y0(8, parcelQ0);
        com.google.android.gms.internal.ads.InterfaceC2618Mn interfaceC2618MnO6 = com.google.android.gms.internal.ads.AbstractBinderC2582Ln.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC2618MnO6;
    }

    @Override // p184s3.InterfaceC7110l0
    public final p184s3.V v5(X3.a aVar, p184s3.c2 c2Var, java.lang.String str, com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl, int i6) {
        p184s3.V t6;
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, c2Var);
        parcelQ0.writeString(str);
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, interfaceC2945Vl);
        parcelQ0.writeInt(244410000);
        android.os.Parcel parcelY0 = y0(2, parcelQ0);
        android.os.IBinder strongBinder = parcelY0.readStrongBinder();
        if (strongBinder == null) {
            t6 = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            t6 = iInterfaceQueryLocalInterface instanceof p184s3.V ? (p184s3.V) iInterfaceQueryLocalInterface : new p184s3.T(strongBinder);
        }
        parcelY0.recycle();
        return t6;
    }
}
