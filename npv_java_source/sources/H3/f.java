package H3;

/* JADX INFO: loaded from: classes.dex */
public final class f extends R3.a {
    public static final android.os.Parcelable.Creator<H3.f> CREATOR = new H3.g();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f4362C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f4363D;

    public f(java.lang.String str, int i6) {
        this.f4362C = str;
        this.f4363D = i6;
    }

    public final int e() {
        return this.f4363D;
    }

    public final java.lang.String f() {
        return this.f4362C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.q(parcel, 1, this.f4362C, false);
        R3.c.k(parcel, 2, this.f4363D);
        R3.c.b(parcel, iA);
    }
}
