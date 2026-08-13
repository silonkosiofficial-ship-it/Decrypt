package M2;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6989d;

    public b(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f6986a = z6;
        this.f6987b = z10;
        this.f6988c = z11;
        this.f6989d = z12;
    }

    public boolean a() {
        return this.f6986a;
    }

    public boolean b() {
        return this.f6988c;
    }

    public boolean c() {
        return this.f6989d;
    }

    public boolean d() {
        return this.f6987b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2.b)) {
            return false;
        }
        M2.b bVar = (M2.b) obj;
        return this.f6986a == bVar.f6986a && this.f6987b == bVar.f6987b && this.f6988c == bVar.f6988c && this.f6989d == bVar.f6989d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r6 = this.f6986a;
        int i6 = r6;
        if (this.f6987b) {
            i6 = r6 + 16;
        }
        int i10 = i6;
        if (this.f6988c) {
            i10 = i6 + 256;
        }
        return this.f6989d ? i10 + 4096 : i10;
    }

    public java.lang.String toString() {
        return java.lang.String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", java.lang.Boolean.valueOf(this.f6986a), java.lang.Boolean.valueOf(this.f6987b), java.lang.Boolean.valueOf(this.f6988c), java.lang.Boolean.valueOf(this.f6989d));
    }
}
