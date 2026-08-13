package N;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7360b;

    private J(long j6, long j10) {
        this.f7359a = j6;
        this.f7360b = j10;
    }

    public /* synthetic */ J(long j6, long j10, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10);
    }

    public final long a() {
        return this.f7360b;
    }

    public final long b() {
        return this.f7359a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N.J)) {
            return false;
        }
        N.J j6 = (N.J) obj;
        return p141o0.C7016y0.o(this.f7359a, j6.f7359a) && p141o0.C7016y0.o(this.f7360b, j6.f7360b);
    }

    public int hashCode() {
        return (p141o0.C7016y0.u(this.f7359a) * 31) + p141o0.C7016y0.u(this.f7360b);
    }

    public java.lang.String toString() {
        return "SelectionColors(selectionHandleColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f7359a)) + ", selectionBackgroundColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f7360b)) + ')';
    }
}
