package Q3;

/* JADX INFO: loaded from: classes.dex */
final class U implements Q3.InterfaceC1473l {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f8878C;

    U(android.os.IBinder iBinder) {
        this.f8878C = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f8878C;
    }

    @Override // Q3.InterfaceC1473l
    public final void k4(Q3.InterfaceC1472k interfaceC1472k, Q3.C1467f c1467f) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC1472k != null ? interfaceC1472k.asBinder() : null);
            if (c1467f != null) {
                parcelObtain.writeInt(1);
                Q3.k0.a(c1467f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f8878C.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
