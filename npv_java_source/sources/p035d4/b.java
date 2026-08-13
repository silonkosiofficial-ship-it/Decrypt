package p035d4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends android.os.Binder implements android.os.IInterface {
    protected b(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }

    protected abstract boolean c2(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10);

    @Override // android.os.Binder
    public final boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i10)) {
            return true;
        }
        return c2(i6, parcel, parcel2, i10);
    }
}
