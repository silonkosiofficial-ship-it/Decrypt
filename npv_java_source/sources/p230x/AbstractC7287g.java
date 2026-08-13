package p230x;

/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7287g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final V.O0 f56453a = V.AbstractC1756y.e(p230x.AbstractC7287g.a.f56455D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p230x.InterfaceC7286f f56454b = new p230x.AbstractC7287g.b();

    /* JADX INFO: renamed from: x.g$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final p230x.AbstractC7287g.a f56455D = new p230x.AbstractC7287g.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p230x.InterfaceC7286f l(V.InterfaceC1754x interfaceC1754x) {
            return !((android.content.Context) interfaceC1754x.a(androidx.compose.ui.platform.T.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? p230x.InterfaceC7286f.f56449a.b() : p230x.AbstractC7287g.b();
        }
    }

    /* JADX INFO: renamed from: x.g$b */
    public static final class b implements p230x.InterfaceC7286f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f56457c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f56456b = 0.3f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p200u.InterfaceC7175j f56458d = p200u.AbstractC7177k.l(125, 0, new p200u.C7198z(0.25f, 0.1f, 0.25f, 1.0f), 2, null);

        b() {
        }

        @Override // p230x.InterfaceC7286f
        public float a(float f6, float f10, float f11) {
            float fAbs = java.lang.Math.abs((f10 + f6) - f6);
            boolean z6 = fAbs <= f11;
            float f12 = (this.f56456b * f11) - (this.f56457c * fAbs);
            float f13 = f11 - f12;
            if (z6 && f13 < fAbs) {
                f12 = f11 - fAbs;
            }
            return f6 - f12;
        }

        @Override // p230x.InterfaceC7286f
        public p200u.InterfaceC7175j b() {
            return this.f56458d;
        }
    }

    public static final V.O0 a() {
        return f56453a;
    }

    public static final p230x.InterfaceC7286f b() {
        return f56454b;
    }
}
