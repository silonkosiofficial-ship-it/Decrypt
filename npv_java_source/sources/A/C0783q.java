package A;

/* JADX INFO: renamed from: A.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0783q implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f147e;

    public C0783q(int i6, int i10, int i11, int i12) {
        this.f144b = i6;
        this.f145c = i10;
        this.f146d = i11;
        this.f147e = i12;
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return this.f146d;
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return this.f147e;
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return this.f145c;
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return this.f144b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0783q)) {
            return false;
        }
        A.C0783q c0783q = (A.C0783q) obj;
        return this.f144b == c0783q.f144b && this.f145c == c0783q.f145c && this.f146d == c0783q.f146d && this.f147e == c0783q.f147e;
    }

    public int hashCode() {
        return (((((this.f144b * 31) + this.f145c) * 31) + this.f146d) * 31) + this.f147e;
    }

    public java.lang.String toString() {
        return "Insets(left=" + this.f144b + ", top=" + this.f145c + ", right=" + this.f146d + ", bottom=" + this.f147e + ')';
    }
}
