package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.O> CREATOR = new Q3.P();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final int f8870C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final android.os.IBinder f8871D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final N3.C1389b f8872E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f8873F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f8874G;

    O(int i6, android.os.IBinder iBinder, N3.C1389b c1389b, boolean z6, boolean z10) {
        this.f8870C = i6;
        this.f8871D = iBinder;
        this.f8872E = c1389b;
        this.f8873F = z6;
        this.f8874G = z10;
    }

    public final N3.C1389b e() {
        return this.f8872E;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q3.O)) {
            return false;
        }
        Q3.O o6 = (Q3.O) obj;
        return this.f8872E.equals(o6.f8872E) && Q3.AbstractC1475n.a(f(), o6.f());
    }

    public final Q3.InterfaceC1471j f() {
        android.os.IBinder iBinder = this.f8871D;
        if (iBinder == null) {
            return null;
        }
        return Q3.InterfaceC1471j.a.y0(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f8870C);
        R3.c.j(parcel, 2, this.f8871D, false);
        R3.c.p(parcel, 3, this.f8872E, i6, false);
        R3.c.c(parcel, 4, this.f8873F);
        R3.c.c(parcel, 5, this.f8874G);
        R3.c.b(parcel, iA);
    }
}
