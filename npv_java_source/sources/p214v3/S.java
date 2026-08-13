package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class S extends com.google.android.gms.internal.ads.AbstractC2264Db implements p214v3.U {
    S(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p214v3.U
    public final void zze(X3.a aVar) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        L0(2, parcelQ0);
    }

    @Override // p214v3.U
    public final boolean zzf(X3.a aVar, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        android.os.Parcel parcelY0 = y0(1, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }

    @Override // p214v3.U
    public final boolean zzg(X3.a aVar, p194t3.a aVar2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.ads.AbstractC2338Fb.f(parcelQ0, aVar);
        com.google.android.gms.internal.ads.AbstractC2338Fb.d(parcelQ0, aVar2);
        android.os.Parcel parcelY0 = y0(3, parcelQ0);
        boolean zG = com.google.android.gms.internal.ads.AbstractC2338Fb.g(parcelY0);
        parcelY0.recycle();
        return zG;
    }
}
