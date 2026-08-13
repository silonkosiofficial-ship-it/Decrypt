package N3;

/* JADX INFO: loaded from: classes.dex */
public final class E extends R3.a {
    public static final android.os.Parcelable.Creator<N3.E> CREATOR = new N3.F();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f7629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f7630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f7631E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f7632F;

    E(boolean z6, java.lang.String str, int i6, int i10) {
        this.f7629C = z6;
        this.f7630D = str;
        this.f7631E = N3.M.a(i6) - 1;
        this.f7632F = N3.r.a(i10) - 1;
    }

    public final java.lang.String e() {
        return this.f7630D;
    }

    public final boolean f() {
        return this.f7629C;
    }

    public final int s() {
        return N3.r.a(this.f7632F);
    }

    public final int w() {
        return N3.M.a(this.f7631E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.c(parcel, 1, this.f7629C);
        R3.c.q(parcel, 2, this.f7630D, false);
        R3.c.k(parcel, 3, this.f7631E);
        R3.c.k(parcel, 4, this.f7632F);
        R3.c.b(parcel, iA);
    }
}
