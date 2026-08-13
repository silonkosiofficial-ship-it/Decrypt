package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5969b0 extends android.os.Binder implements android.os.IInterface {
    protected AbstractBinderC5969b0(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) throws android.os.RemoteException {
        boolean zOnTransact;
        if (i6 > 16777215) {
            zOnTransact = super.onTransact(i6, parcel, parcel2, i10);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return q0(i6, parcel, parcel2, i10);
    }

    protected abstract boolean q0(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10);
}
