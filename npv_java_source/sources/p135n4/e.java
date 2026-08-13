package p135n4;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f51498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.animation.TimeInterpolator f51500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51502e;

    public e(long j6, long j10) {
        this.f51500c = null;
        this.f51501d = 0;
        this.f51502e = 1;
        this.f51498a = j6;
        this.f51499b = j10;
    }

    public e(long j6, long j10, android.animation.TimeInterpolator timeInterpolator) {
        this.f51501d = 0;
        this.f51502e = 1;
        this.f51498a = j6;
        this.f51499b = j10;
        this.f51500c = timeInterpolator;
    }

    static p135n4.e a(android.animation.ValueAnimator valueAnimator) {
        p135n4.e eVar = new p135n4.e(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        eVar.f51501d = valueAnimator.getRepeatCount();
        eVar.f51502e = valueAnimator.getRepeatMode();
        return eVar;
    }

    private static android.animation.TimeInterpolator e(android.animation.ValueAnimator valueAnimator) {
        android.animation.TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
            return p135n4.a.f51491b;
        }
        if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
            return p135n4.a.f51492c;
        }
        return interpolator instanceof android.view.animation.DecelerateInterpolator ? p135n4.a.f51493d : interpolator;
    }

    public long b() {
        return this.f51498a;
    }

    public long c() {
        return this.f51499b;
    }

    public android.animation.TimeInterpolator d() {
        android.animation.TimeInterpolator timeInterpolator = this.f51500c;
        return timeInterpolator != null ? timeInterpolator : p135n4.a.f51491b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p135n4.e)) {
            return false;
        }
        p135n4.e eVar = (p135n4.e) obj;
        if (b() == eVar.b() && c() == eVar.c() && f() == eVar.f() && g() == eVar.g()) {
            return d().getClass().equals(eVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f51501d;
    }

    public int g() {
        return this.f51502e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public java.lang.String toString() {
        return '\n' + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }
}
