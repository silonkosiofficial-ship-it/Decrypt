package p184s3;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends R3.a {
    public static final android.os.Parcelable.Creator<p184s3.I1> CREATOR = new p184s3.J1();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.lang.String f54130C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f54131D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final p184s3.X1 f54132E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f54133F;

    public I1(java.lang.String str, int i6, p184s3.X1 x6, int i10) {
        this.f54130C = str;
        this.f54131D = i6;
        this.f54132E = x6;
        this.f54133F = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p184s3.I1) {
            p184s3.I1 i6 = (p184s3.I1) obj;
            if (this.f54130C.equals(i6.f54130C) && this.f54131D == i6.f54131D && this.f54132E.e(i6.f54132E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.f54130C, java.lang.Integer.valueOf(this.f54131D), this.f54132E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f54130C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.k(parcel, 2, this.f54131D);
        R3.c.p(parcel, 3, this.f54132E, i6, false);
        R3.c.k(parcel, 4, this.f54133F);
        R3.c.b(parcel, iA);
    }
}
