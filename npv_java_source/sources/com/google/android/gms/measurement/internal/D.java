package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends R3.a implements java.lang.Iterable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.D> CREATOR = new com.google.android.gms.measurement.internal.F();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.os.Bundle f41750C;

    D(android.os.Bundle bundle) {
        this.f41750C = bundle;
    }

    final java.lang.Long C(java.lang.String str) {
        return java.lang.Long.valueOf(this.f41750C.getLong(str));
    }

    final java.lang.Object D(java.lang.String str) {
        return this.f41750C.get(str);
    }

    final java.lang.String E(java.lang.String str) {
        return this.f41750C.getString(str);
    }

    public final int e() {
        return this.f41750C.size();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.measurement.internal.C(this);
    }

    final java.lang.Double s(java.lang.String str) {
        return java.lang.Double.valueOf(this.f41750C.getDouble(str));
    }

    public final java.lang.String toString() {
        return this.f41750C.toString();
    }

    public final android.os.Bundle w() {
        return new android.os.Bundle(this.f41750C);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.e(parcel, 2, w(), false);
        R3.c.b(parcel, iA);
    }
}
