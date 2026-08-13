package A;

/* JADX INFO: renamed from: A.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f164d;

    public C0788w(int i6, int i10, int i11, int i12) {
        this.f161a = i6;
        this.f162b = i10;
        this.f163c = i11;
        this.f164d = i12;
    }

    public final int a() {
        return this.f164d;
    }

    public final int b() {
        return this.f161a;
    }

    public final int c() {
        return this.f163c;
    }

    public final int d() {
        return this.f162b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0788w)) {
            return false;
        }
        A.C0788w c0788w = (A.C0788w) obj;
        return this.f161a == c0788w.f161a && this.f162b == c0788w.f162b && this.f163c == c0788w.f163c && this.f164d == c0788w.f164d;
    }

    public int hashCode() {
        return (((((this.f161a * 31) + this.f162b) * 31) + this.f163c) * 31) + this.f164d;
    }

    public java.lang.String toString() {
        return "InsetsValues(left=" + this.f161a + ", top=" + this.f162b + ", right=" + this.f163c + ", bottom=" + this.f164d + ')';
    }
}
