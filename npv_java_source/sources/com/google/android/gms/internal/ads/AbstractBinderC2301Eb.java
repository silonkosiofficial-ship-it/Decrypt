package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2301Eb extends android.os.Binder implements android.os.IInterface {
    protected AbstractBinderC2301Eb(java.lang.String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    protected abstract boolean n6(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10);

    @Override // android.os.Binder
    public boolean onTransact(int i6, android.os.Parcel parcel, android.os.Parcel parcel2, int i10) {
        if (i6 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i6, parcel, parcel2, i10)) {
            return true;
        }
        return n6(i6, parcel, parcel2, i10);
    }
}
