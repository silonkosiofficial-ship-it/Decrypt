package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p045e4.a implements android.os.IInterface {
    n(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final X3.a L0(X3.a aVar, java.lang.String str, int i6, X3.a aVar2) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(i6);
        p045e4.c.d(parcelY0, aVar2);
        android.os.Parcel parcelQ0 = q0(2, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }

    public final X3.a c2(X3.a aVar, java.lang.String str, int i6, X3.a aVar2) {
        android.os.Parcel parcelY0 = y0();
        p045e4.c.d(parcelY0, aVar);
        parcelY0.writeString(str);
        parcelY0.writeInt(i6);
        p045e4.c.d(parcelY0, aVar2);
        android.os.Parcel parcelQ0 = q0(3, parcelY0);
        X3.a aVarY0 = X3.a.AbstractBinderC0301a.y0(parcelQ0.readStrongBinder());
        parcelQ0.recycle();
        return aVarY0;
    }
}
