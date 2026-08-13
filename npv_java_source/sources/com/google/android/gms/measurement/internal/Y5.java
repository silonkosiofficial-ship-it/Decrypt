package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class Y5 extends R3.a {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.Y5> CREATOR = new com.google.android.gms.measurement.internal.b6();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f42229C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.lang.String f42230D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f42231E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.Long f42232F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final java.lang.String f42233G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final java.lang.String f42234H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final java.lang.Double f42235I;

    Y5(int i6, java.lang.String str, long j6, java.lang.Long l6, java.lang.Float f6, java.lang.String str2, java.lang.String str3, java.lang.Double d6) {
        this.f42229C = i6;
        this.f42230D = str;
        this.f42231E = j6;
        this.f42232F = l6;
        if (i6 == 1) {
            this.f42235I = f6 != null ? java.lang.Double.valueOf(f6.doubleValue()) : null;
        } else {
            this.f42235I = d6;
        }
        this.f42233G = str2;
        this.f42234H = str3;
    }

    Y5(com.google.android.gms.measurement.internal.a6 a6Var) {
        this(a6Var.f42262c, a6Var.f42263d, a6Var.f42264e, a6Var.f42261b);
    }

    Y5(java.lang.String str, long j6, java.lang.Object obj, java.lang.String str2) {
        Q3.AbstractC1477p.f(str);
        this.f42229C = 2;
        this.f42230D = str;
        this.f42231E = j6;
        this.f42234H = str2;
        if (obj == null) {
            this.f42232F = null;
            this.f42235I = null;
            this.f42233G = null;
            return;
        }
        if (obj instanceof java.lang.Long) {
            this.f42232F = (java.lang.Long) obj;
            this.f42235I = null;
            this.f42233G = null;
        } else if (obj instanceof java.lang.String) {
            this.f42232F = null;
            this.f42235I = null;
            this.f42233G = (java.lang.String) obj;
        } else {
            if (!(obj instanceof java.lang.Double)) {
                throw new java.lang.IllegalArgumentException("User attribute given of un-supported type");
            }
            this.f42232F = null;
            this.f42235I = (java.lang.Double) obj;
            this.f42233G = null;
        }
    }

    public final java.lang.Object e() {
        java.lang.Long l6 = this.f42232F;
        if (l6 != null) {
            return l6;
        }
        java.lang.Double d6 = this.f42235I;
        if (d6 != null) {
            return d6;
        }
        java.lang.String str = this.f42233G;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f42229C);
        R3.c.q(parcel, 2, this.f42230D, false);
        R3.c.n(parcel, 3, this.f42231E);
        R3.c.o(parcel, 4, this.f42232F, false);
        R3.c.i(parcel, 5, null, false);
        R3.c.q(parcel, 6, this.f42233G, false);
        R3.c.q(parcel, 7, this.f42234H, false);
        R3.c.g(parcel, 8, this.f42235I, false);
        R3.c.b(parcel, iA);
    }
}
