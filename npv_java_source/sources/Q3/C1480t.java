package Q3;

/* JADX INFO: renamed from: Q3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1480t extends R3.a {
    public static final android.os.Parcelable.Creator<Q3.C1480t> CREATOR = new Q3.C1484x();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f9024C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.util.List f9025D;

    public C1480t(int i6, java.util.List list) {
        this.f9024C = i6;
        this.f9025D = list;
    }

    public final int e() {
        return this.f9024C;
    }

    public final java.util.List f() {
        return this.f9025D;
    }

    public final void s(Q3.C1474m c1474m) {
        if (this.f9025D == null) {
            this.f9025D = new java.util.ArrayList();
        }
        this.f9025D.add(c1474m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i6) {
        int iA = R3.c.a(parcel);
        R3.c.k(parcel, 1, this.f9024C);
        R3.c.u(parcel, 2, this.f9025D, false);
        R3.c.b(parcel, iA);
    }
}
