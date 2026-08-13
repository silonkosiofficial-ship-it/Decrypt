package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12571d;

    public u(java.lang.String str, int i6, int i10, boolean z6) {
        p247y7.AbstractC7350t.f(str, "processName");
        this.f12568a = str;
        this.f12569b = i6;
        this.f12570c = i10;
        this.f12571d = z6;
    }

    public final int a() {
        return this.f12570c;
    }

    public final int b() {
        return this.f12569b;
    }

    public final java.lang.String c() {
        return this.f12568a;
    }

    public final boolean d() {
        return this.f12571d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.u)) {
            return false;
        }
        S5.u uVar = (S5.u) obj;
        return p247y7.AbstractC7350t.b(this.f12568a, uVar.f12568a) && this.f12569b == uVar.f12569b && this.f12570c == uVar.f12570c && this.f12571d == uVar.f12571d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((((this.f12568a.hashCode() * 31) + this.f12569b) * 31) + this.f12570c) * 31;
        boolean z6 = this.f12571d;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public java.lang.String toString() {
        return "ProcessDetails(processName=" + this.f12568a + ", pid=" + this.f12569b + ", importance=" + this.f12570c + ", isDefaultProcess=" + this.f12571d + ')';
    }
}
