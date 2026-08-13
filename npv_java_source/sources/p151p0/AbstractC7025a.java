package p151p0;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7025a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p151p0.AbstractC7025a.d f52609b = new p151p0.AbstractC7025a.d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p151p0.AbstractC7025a f52610c = new p151p0.AbstractC7025a.C0678a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p151p0.AbstractC7025a f52611d = new p151p0.AbstractC7025a.c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p151p0.AbstractC7025a f52612e = new p151p0.AbstractC7025a.b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f52613a;

    /* JADX INFO: renamed from: p0.a$a, reason: collision with other inner class name */
    public static final class C0678a extends p151p0.AbstractC7025a {
        C0678a(float[] fArr) {
            super(fArr, null);
        }

        public java.lang.String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: p0.a$b */
    public static final class b extends p151p0.AbstractC7025a {
        b(float[] fArr) {
            super(fArr, null);
        }

        public java.lang.String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: p0.a$c */
    public static final class c extends p151p0.AbstractC7025a {
        c(float[] fArr) {
            super(fArr, null);
        }

        public java.lang.String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: p0.a$d */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p151p0.AbstractC7025a a() {
            return p151p0.AbstractC7025a.f52610c;
        }
    }

    private AbstractC7025a(float[] fArr) {
        this.f52613a = fArr;
    }

    public /* synthetic */ AbstractC7025a(float[] fArr, p247y7.AbstractC7342k abstractC7342k) {
        this(fArr);
    }

    public final float[] b() {
        return this.f52613a;
    }
}
