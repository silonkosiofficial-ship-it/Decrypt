package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends R3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new com.google.android.gms.common.api.a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f24842C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f24843D;

    Scope(int i6, java.lang.String str) {
        Q3.AbstractC1477p.g(str, "scopeUri must not be null or empty");
        this.f24842C = i6;
        this.f24843D = str;
    }

    public Scope(java.lang.String str) {
        this(1, str);
    }

    public java.lang.String e() {
        return this.f24843D;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.api.Scope) {
            return this.f24843D.equals(((com.google.android.gms.common.api.Scope) obj).f24843D);
        }
        return false;
    }

    public int hashCode() {
        return this.f24843D.hashCode();
    }

    public java.lang.String toString() {
        return this.f24843D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i6) {
        int i10 = this.f24842C;
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, i10);
        R3.c.q(parcel, 2, e(), false);
        R3.c.b(parcel, iA);
    }
}
