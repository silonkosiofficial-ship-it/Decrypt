package p040e;

/* JADX INFO: renamed from: e.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6525b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p040e.C6525b.a f44361e = new p040e.C6525b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f44362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f44363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f44364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44365d;

    /* JADX INFO: renamed from: e.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public C6525b(float f6, float f10, float f11, int i6) {
        this.f44362a = f6;
        this.f44363b = f10;
        this.f44364c = f11;
        this.f44365d = i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6525b(android.window.BackEvent backEvent) {
        p247y7.AbstractC7350t.f(backEvent, "backEvent");
        p040e.C6524a c6524a = p040e.C6524a.f44360a;
        this(c6524a.d(backEvent), c6524a.e(backEvent), c6524a.b(backEvent), c6524a.c(backEvent));
    }

    public final float a() {
        return this.f44364c;
    }

    public java.lang.String toString() {
        return "BackEventCompat{touchX=" + this.f44362a + ", touchY=" + this.f44363b + ", progress=" + this.f44364c + ", swipeEdge=" + this.f44365d + '}';
    }
}
