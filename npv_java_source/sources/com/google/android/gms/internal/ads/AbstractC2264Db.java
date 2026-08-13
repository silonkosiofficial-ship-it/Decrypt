package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2264Db implements android.os.IInterface {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.IBinder f26742C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f26743D;

    protected AbstractC2264Db(android.os.IBinder iBinder, java.lang.String str) {
        this.f26742C = iBinder;
        this.f26743D = str;
    }

    protected final void L0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.f26742C.transact(i6, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f26742C;
    }

    protected final void c2(int i6, android.os.Parcel parcel) {
        try {
            this.f26742C.transact(i6, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final android.os.Parcel q0() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f26743D);
        return parcelObtain;
    }

    protected final android.os.Parcel y0(int i6, android.os.Parcel parcel) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.f26742C.transact(i6, parcel, parcelObtain, 0);
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
