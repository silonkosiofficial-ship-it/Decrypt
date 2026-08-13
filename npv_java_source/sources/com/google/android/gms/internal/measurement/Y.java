package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Y implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f40708C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f40709D;

    protected Y(android.os.IBinder iBinder, java.lang.String str) {
        this.f40708C = iBinder;
        this.f40709D = str;
    }

    protected final void L0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f40708C.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f40708C;
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f40709D);
        return parcelObtain;
    }

    protected final android.os.Parcel y0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f40708C.transact(i6, parcel, parcelObtain, 0);
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
