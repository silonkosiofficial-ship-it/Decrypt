package N3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends R3.a {
    public static final android.os.Parcelable.Creator<N3.C> CREATOR = new N3.D();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f7623C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f7624D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f7625E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final android.content.Context f7626F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final boolean f7627G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final boolean f7628H;

    C(java.lang.String str, boolean z6, boolean z10, android.os.IBinder iBinder, boolean z11, boolean z12) {
        this.f7623C = str;
        this.f7624D = z6;
        this.f7625E = z10;
        this.f7626F = (android.content.Context) X3.b.L0(X3.a.AbstractBinderC0301a.y0(iBinder));
        this.f7627G = z11;
        this.f7628H = z12;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [X3.a, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        java.lang.String str = this.f7623C;
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, str, false);
        R3.c.c(parcel, 2, this.f7624D);
        R3.c.c(parcel, 3, this.f7625E);
        R3.c.j(parcel, 4, X3.b.c2(this.f7626F), false);
        R3.c.c(parcel, 5, this.f7627G);
        R3.c.c(parcel, 6, this.f7628H);
        R3.c.b(parcel, iA);
    }
}
