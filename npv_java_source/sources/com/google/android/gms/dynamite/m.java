package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p045e4.a implements android.os.IInterface {
    m(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int L0(X3.a aVar, java.lang.String str, boolean z6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(z6 ? 1 : 0);
        android.os.Parcel parcelQ0 = q0(3, parcelY0);
        int i6 = parcelQ0.readInt();
        parcelQ0.recycle();
        return i6;
    }

    public final X3.a T2(X3.a aVar, java.lang.String str, int i6, X3.a aVar2) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(i6);
        p045e4.c.d(parcelY0, aVar2);
        android.os.Parcel parcelQ0 = q0(8, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }

    public final int c2(X3.a aVar, java.lang.String str, boolean z6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(z6 ? 1 : 0);
        android.os.Parcel parcelQ0 = q0(5, parcelY0);
        int i6 = parcelQ0.readInt();
        parcelQ0.recycle();
        return i6;
    }

    public final int d() {
        android.os.Parcel parcelQ0 = q0(6, y0());
        int i6 = parcelQ0.readInt();
        parcelQ0.recycle();
        return i6;
    }

    public final X3.a d2(X3.a aVar, java.lang.String str, int i6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(i6);
        android.os.Parcel parcelQ0 = q0(2, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }

    public final X3.a f3(X3.a aVar, java.lang.String str, int i6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(i6);
        android.os.Parcel parcelQ0 = q0(4, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }

    public final X3.a p4(X3.a aVar, java.lang.String str, boolean z6, long j6) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(z6 ? 1 : 0);
        parcelY0.writeLong(j6);
        android.os.Parcel parcelQ0 = q0(7, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }
}
