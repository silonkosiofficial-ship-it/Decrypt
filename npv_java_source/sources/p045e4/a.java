package p045e4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f44668C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f44669D;

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f44668C = iBinder;
        this.f44669D = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f44668C;
    }

    protected final android.os.Parcel q0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f44668C.transact(i6, parcel, parcelObtain, 0);
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

    protected final android.os.Parcel y0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f44669D);
        return parcelObtain;
    }
}
