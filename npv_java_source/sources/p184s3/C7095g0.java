package p184s3;

/* JADX INFO: renamed from: s3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7095g0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7101i0 {
    C7095g0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // p184s3.InterfaceC7101i0
    public final void E0(java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        L0(1, parcelQ0);
    }
}
