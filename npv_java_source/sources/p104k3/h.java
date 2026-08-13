package p104k3;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f49478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f49480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f49482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f49483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f49484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f49485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p104k3.h f49467i = new p104k3.h(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p104k3.h f49468j = new p104k3.h(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p104k3.h f49469k = new p104k3.h(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p104k3.h f49470l = new p104k3.h(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p104k3.h f49471m = new p104k3.h(300, 250, "300x250_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p104k3.h f49472n = new p104k3.h(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p104k3.h f49473o = new p104k3.h(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p104k3.h f49474p = new p104k3.h(-3, -4, "fluid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p104k3.h f49475q = new p104k3.h(0, 0, "invalid");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p104k3.h f49477s = new p104k3.h(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p104k3.h f49476r = new p104k3.h(-3, 0, "search_v2");

    public h(int i6, int i10) {
        this(i6, i10, (i6 == -1 ? "FULL" : java.lang.String.valueOf(i6)) + "x" + (i10 == -2 ? "AUTO" : java.lang.String.valueOf(i10)) + "_as");
    }

    h(int i6, int i10, java.lang.String str) {
        if (i6 < 0 && i6 != -1 && i6 != -3) {
            throw new java.lang.IllegalArgumentException("Invalid width for AdSize: " + i6);
        }
        if (i10 >= 0 || i10 == -2 || i10 == -4) {
            this.f49478a = i6;
            this.f49479b = i10;
            this.f49480c = str;
        } else {
            throw new java.lang.IllegalArgumentException("Invalid height for AdSize: " + i10);
        }
    }

    public int a() {
        return this.f49479b;
    }

    public int b(android.content.Context context) {
        int i6 = this.f49479b;
        if (i6 == -4 || i6 == -3) {
            return -1;
        }
        if (i6 == -2) {
            return p184s3.c2.e(context.getResources().getDisplayMetrics());
        }
        p184s3.C7147y.b();
        return p224w3.g.z(context, i6);
    }

    public int c() {
        return this.f49478a;
    }

    public int d(android.content.Context context) {
        int i6 = this.f49478a;
        if (i6 == -3) {
            return -1;
        }
        if (i6 != -1) {
            p184s3.C7147y.b();
            return p224w3.g.z(context, i6);
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        android.os.Parcelable.Creator<p184s3.c2> creator = p184s3.c2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean e() {
        return this.f49478a == -3 && this.f49479b == -4;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p104k3.h)) {
            return false;
        }
        p104k3.h hVar = (p104k3.h) obj;
        return this.f49478a == hVar.f49478a && this.f49479b == hVar.f49479b && this.f49480c.equals(hVar.f49480c);
    }

    final int f() {
        return this.f49485h;
    }

    final int g() {
        return this.f49483f;
    }

    final void h(int i6) {
        this.f49483f = i6;
    }

    public int hashCode() {
        return this.f49480c.hashCode();
    }

    final void i(int i6) {
        this.f49485h = i6;
    }

    final void j(boolean z6) {
        this.f49482e = true;
    }

    final void k(boolean z6) {
        this.f49484g = true;
    }

    final boolean l() {
        return this.f49481d;
    }

    final boolean m() {
        return this.f49482e;
    }

    final boolean n() {
        return this.f49484g;
    }

    public java.lang.String toString() {
        return this.f49480c;
    }
}
