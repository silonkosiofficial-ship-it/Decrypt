package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6365e2 extends com.google.android.gms.internal.measurement.Y implements p085i4.InterfaceC6654f {
    C6365e2(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // p085i4.InterfaceC6654f
    public final void A1(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(18, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void C1(android.os.Bundle bundle, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(19, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void D1(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(20, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void G1(com.google.android.gms.measurement.internal.Y5 y6, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, y6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(2, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List N0(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        android.os.Parcel parcelY0 = y0(16, parcelQ0);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.measurement.internal.C6362e.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List S4(java.lang.String str, java.lang.String str2, boolean z6, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        android.os.Parcel parcelY0 = y0(14, parcelQ0);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.measurement.internal.Y5.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p085i4.InterfaceC6654f
    public final void U2(long j6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeLong(j6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        L0(10, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void U3(com.google.android.gms.measurement.internal.E e6, java.lang.String str, java.lang.String str2) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, e6);
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        L0(5, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void W5(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(6, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void X0(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(4, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void Y2(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(27, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List Z2(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        android.os.Parcel parcelY0 = y0(17, parcelQ0);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.measurement.internal.C6362e.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p085i4.InterfaceC6654f
    public final void d6(com.google.android.gms.measurement.internal.E e6, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, e6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(1, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void f4(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(25, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final void j5(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(26, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final java.lang.String k2(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        android.os.Parcel parcelY0 = y0(11, parcelQ0);
        java.lang.String string = parcelY0.readString();
        parcelY0.recycle();
        return string;
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List k5(com.google.android.gms.measurement.internal.M5 m6, android.os.Bundle bundle) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, bundle);
        android.os.Parcel parcelY0 = y0(24, parcelQ0);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.measurement.internal.B5.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p085i4.InterfaceC6654f
    public final byte[] l5(com.google.android.gms.measurement.internal.E e6, java.lang.String str) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, e6);
        parcelQ0.writeString(str);
        android.os.Parcel parcelY0 = y0(9, parcelQ0);
        byte[] bArrCreateByteArray = parcelY0.createByteArray();
        parcelY0.recycle();
        return bArrCreateByteArray;
    }

    @Override // p085i4.InterfaceC6654f
    public final void m3(com.google.android.gms.measurement.internal.C6362e c6362e) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, c6362e);
        L0(13, parcelQ0);
    }

    @Override // p085i4.InterfaceC6654f
    public final p085i4.C6650b s4(com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        android.os.Parcel parcelY0 = y0(21, parcelQ0);
        p085i4.C6650b c6650b = (p085i4.C6650b) com.google.android.gms.internal.measurement.AbstractC5960a0.a(parcelY0, p085i4.C6650b.CREATOR);
        parcelY0.recycle();
        return c6650b;
    }

    @Override // p085i4.InterfaceC6654f
    public final java.util.List w1(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        android.os.Parcel parcelQ0 = q0();
        parcelQ0.writeString(str);
        parcelQ0.writeString(str2);
        parcelQ0.writeString(str3);
        com.google.android.gms.internal.measurement.AbstractC5960a0.e(parcelQ0, z6);
        android.os.Parcel parcelY0 = y0(15, parcelQ0);
        java.util.ArrayList arrayListCreateTypedArrayList = parcelY0.createTypedArrayList(com.google.android.gms.measurement.internal.Y5.CREATOR);
        parcelY0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p085i4.InterfaceC6654f
    public final void w2(com.google.android.gms.measurement.internal.C6362e c6362e, com.google.android.gms.measurement.internal.M5 m6) {
        android.os.Parcel parcelQ0 = q0();
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, c6362e);
        com.google.android.gms.internal.measurement.AbstractC5960a0.d(parcelQ0, m6);
        L0(12, parcelQ0);
    }
}
