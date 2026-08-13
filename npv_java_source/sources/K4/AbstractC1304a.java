package K4;

/* JADX INFO: renamed from: K4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1304a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f6103C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f6104D;

    protected AbstractC1304a(android.os.IBinder iBinder, java.lang.String str) {
        this.f6103C = iBinder;
        this.f6104D = str;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f6103C;
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6104D);
        return parcelObtain;
    }

    protected final void y0(int i6, android.os.Parcel parcel) {
        try {
            this.f6103C.transact(i6, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
