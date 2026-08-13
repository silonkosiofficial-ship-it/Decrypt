package Z3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f16700C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f16701D = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f16700C = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f16700C;
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f16701D);
        return parcelObtain;
    }

    protected final android.os.Parcel y0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f16700C.transact(i6, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e6) {
                parcelObtain.recycle();
                throw e6;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
