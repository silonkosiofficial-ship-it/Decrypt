package p141o0;

/* JADX INFO: renamed from: o0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6963g0 extends p141o0.AbstractC7019z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f52224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52225d;

    private C6963g0(long j6, int i6) {
        this(j6, i6, p141o0.I.a(j6, i6), null);
    }

    private C6963g0(long j6, int i6, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.f52224c = j6;
        this.f52225d = i6;
    }

    public /* synthetic */ C6963g0(long j6, int i6, android.graphics.ColorFilter colorFilter, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, i6, colorFilter);
    }

    public /* synthetic */ C6963g0(long j6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(j6, i6);
    }

    public final int b() {
        return this.f52225d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p141o0.C6963g0)) {
            return false;
        }
        p141o0.C6963g0 c6963g0 = (p141o0.C6963g0) obj;
        return p141o0.C7016y0.o(this.f52224c, c6963g0.f52224c) && p141o0.AbstractC6960f0.E(this.f52225d, c6963g0.f52225d);
    }

    public int hashCode() {
        return (p141o0.C7016y0.u(this.f52224c) * 31) + p141o0.AbstractC6960f0.F(this.f52225d);
    }

    public java.lang.String toString() {
        return "BlendModeColorFilter(color=" + ((java.lang.Object) p141o0.C7016y0.v(this.f52224c)) + ", blendMode=" + ((java.lang.Object) p141o0.AbstractC6960f0.G(this.f52225d)) + ')';
    }
}
