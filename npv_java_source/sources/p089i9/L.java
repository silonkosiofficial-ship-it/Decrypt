package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class L extends p109k9.y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f47371e;

    public L(int i6, boolean z6) {
        super(p089i9.C6678i.f47516a.d(), 2, i6);
        this.f47370d = i6;
        this.f47371e = z6;
    }

    public /* synthetic */ L(int i6, boolean z6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, (i10 & 2) != 0 ? false : z6);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.L) {
            p089i9.L l6 = (p089i9.L) obj;
            if (this.f47370d == l6.f47370d && this.f47371e == l6.f47371e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47370d * 31) + p190t.h.a(this.f47371e);
    }
}
