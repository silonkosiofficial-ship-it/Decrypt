package N3;

/* JADX INFO: renamed from: N3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1391d extends R3.a {
    public static final android.os.Parcelable.Creator<N3.C1391d> CREATOR = new N3.q();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f7653C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f7654D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final long f7655E;

    public C1391d(java.lang.String str, int i6, long j6) {
        this.f7653C = str;
        this.f7654D = i6;
        this.f7655E = j6;
    }

    public C1391d(java.lang.String str, long j6) {
        this.f7653C = str;
        this.f7655E = j6;
        this.f7654D = -1;
    }

    public java.lang.String e() {
        return this.f7653C;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof N3.C1391d) {
            N3.C1391d c1391d = (N3.C1391d) obj;
            if (((e() != null && e().equals(c1391d.e())) || (e() == null && c1391d.e() == null)) && f() == c1391d.f()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        long j6 = this.f7655E;
        return j6 == -1 ? this.f7654D : j6;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(e(), java.lang.Long.valueOf(f()));
    }

    public final java.lang.String toString() {
        Q3.AbstractC1475n.a aVarC = Q3.AbstractC1475n.c(this);
        aVarC.a("name", e());
        aVarC.a("version", java.lang.Long.valueOf(f()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, e(), false);
        R3.c.k(parcel, 2, this.f7654D);
        R3.c.n(parcel, 3, f());
        R3.c.b(parcel, iA);
    }
}
