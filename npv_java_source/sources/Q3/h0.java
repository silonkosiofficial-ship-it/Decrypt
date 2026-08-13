package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.h0> CREATOR = new Q3.i0();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.os.Bundle f8971C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    N3.C1391d[] f8972D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f8973E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    Q3.C1466e f8974F;

    h0(android.os.Bundle bundle, N3.C1391d[] c1391dArr, int i6, Q3.C1466e c1466e) {
        this.f8971C = bundle;
        this.f8972D = c1391dArr;
        this.f8973E = i6;
        this.f8974F = c1466e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.e(parcel, 1, this.f8971C, false);
        R3.c.t(parcel, 2, this.f8972D, i6, false);
        R3.c.k(parcel, 3, this.f8973E);
        R3.c.p(parcel, 4, this.f8974F, i6, false);
        R3.c.b(parcel, iA);
    }
}
