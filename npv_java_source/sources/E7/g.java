package E7;

/* JADX INFO: loaded from: classes3.dex */
public class g implements java.lang.Iterable, p256z7.a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final E7.g.a f2258F = new E7.g.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f2259C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f2260D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f2261E;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final E7.g a(int i6, int i10, int i11) {
            return new E7.g(i6, i10, i11);
        }
    }

    public g(int i6, int i10, int i11) {
        if (i11 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2259C = i6;
        this.f2260D = p167q7.c.b(i6, i10, i11);
        this.f2261E = i11;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof E7.g) {
            if (!isEmpty() || !((E7.g) obj).isEmpty()) {
                E7.g gVar = (E7.g) obj;
                if (this.f2259C != gVar.f2259C || this.f2260D != gVar.f2260D || this.f2261E != gVar.f2261E) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f2259C;
    }

    public final int g() {
        return this.f2260D;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2259C * 31) + this.f2260D) * 31) + this.f2261E;
    }

    public boolean isEmpty() {
        if (this.f2261E > 0) {
            if (this.f2259C <= this.f2260D) {
                return false;
            }
        } else if (this.f2259C >= this.f2260D) {
            return false;
        }
        return true;
    }

    public final int o() {
        return this.f2261E;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p097j7.O iterator() {
        return new E7.h(this.f2259C, this.f2260D, this.f2261E);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        int i6;
        if (this.f2261E > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(this.f2259C);
            sb.append("..");
            sb.append(this.f2260D);
            sb.append(" step ");
            i6 = this.f2261E;
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(this.f2259C);
            sb.append(" downTo ");
            sb.append(this.f2260D);
            sb.append(" step ");
            i6 = -this.f2261E;
        }
        sb.append(i6);
        return sb.toString();
    }
}
