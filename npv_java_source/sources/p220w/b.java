package p220w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f56082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f56084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f56085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f56086e;

    private b(long j6, long j10, long j11, long j12, long j13) {
        this.f56082a = j6;
        this.f56083b = j10;
        this.f56084c = j11;
        this.f56085d = j12;
        this.f56086e = j13;
    }

    public /* synthetic */ b(long j6, long j10, long j11, long j12, long j13, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, j10, j11, j12, j13);
    }

    public final long a() {
        return this.f56082a;
    }

    public final long b() {
        return this.f56086e;
    }

    public final long c() {
        return this.f56085d;
    }

    public final long d() {
        return this.f56084c;
    }

    public final long e() {
        return this.f56083b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p220w.b)) {
            return false;
        }
        p220w.b bVar = (p220w.b) obj;
        return p141o0.C7016y0.o(this.f56082a, bVar.f56082a) && p141o0.C7016y0.o(this.f56083b, bVar.f56083b) && p141o0.C7016y0.o(this.f56084c, bVar.f56084c) && p141o0.C7016y0.o(this.f56085d, bVar.f56085d) && p141o0.C7016y0.o(this.f56086e, bVar.f56086e);
    }

    public int hashCode() {
        return (((((((p141o0.C7016y0.u(this.f56082a) * 31) + p141o0.C7016y0.u(this.f56083b)) * 31) + p141o0.C7016y0.u(this.f56084c)) * 31) + p141o0.C7016y0.u(this.f56085d)) * 31) + p141o0.C7016y0.u(this.f56086e);
    }

    public java.lang.String toString() {
        return "ContextMenuColors(backgroundColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f56082a)) + ", textColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f56083b)) + ", iconColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f56084c)) + ", disabledTextColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f56085d)) + ", disabledIconColor=" + ((java.lang.Object) p141o0.C7016y0.v(this.f56086e)) + ')';
    }
}
