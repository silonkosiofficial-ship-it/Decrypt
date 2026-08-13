package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f17040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f17041D = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(android.os.IBinder iBinder, java.lang.String str) {
        this.f17040C = iBinder;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f17040C;
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f17041D);
        return parcelObtain;
    }

    protected final void y0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f17040C.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
