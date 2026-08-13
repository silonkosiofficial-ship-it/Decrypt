package p184s3;

/* JADX INFO: renamed from: s3.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7125q0 extends com.google.android.gms.internal.ads.AbstractC2264Db implements p184s3.InterfaceC7130s0 {
    C7125q0(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // p184s3.InterfaceC7130s0
    public final com.google.android.gms.internal.ads.InterfaceC2945Vl getAdapterCreator() {
        android.os.Parcel parcelY0 = y0(2, q0());
        com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945VlO6 = com.google.android.gms.internal.ads.AbstractBinderC2909Ul.o6(parcelY0.readStrongBinder());
        parcelY0.recycle();
        return interfaceC2945VlO6;
    }

    @Override // p184s3.InterfaceC7130s0
    public final p184s3.C7134t1 getLiteSdkVersion() {
        android.os.Parcel parcelY0 = y0(1, q0());
        p184s3.C7134t1 c7134t1 = (p184s3.C7134t1) com.google.android.gms.internal.ads.AbstractC2338Fb.a(parcelY0, p184s3.C7134t1.CREATOR);
        parcelY0.recycle();
        return c7134t1;
    }
}
