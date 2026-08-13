package p035d4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f44291C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f44292D;

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f44291C = iBinder;
        this.f44292D = str;
    }

    protected final void L0(int i6, android.os.Parcel parcel) {
        try {
            this.f44291C.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f44291C;
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f44292D);
        return parcelObtain;
    }

    protected final void y0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f44291C.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
