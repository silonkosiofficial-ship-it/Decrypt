package p230x;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7286f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p230x.InterfaceC7286f.a f56449a = p230x.InterfaceC7286f.a.f56450a;

    /* JADX INFO: renamed from: x.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ p230x.InterfaceC7286f.a f56450a = new p230x.InterfaceC7286f.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final p200u.InterfaceC7175j f56451b = p200u.AbstractC7177k.j(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final p230x.InterfaceC7286f f56452c = new p230x.InterfaceC7286f.a.C0747a();

        /* JADX INFO: renamed from: x.f$a$a, reason: collision with other inner class name */
        public static final class C0747a implements p230x.InterfaceC7286f {
            C0747a() {
            }

            @Override // p230x.InterfaceC7286f
            public /* synthetic */ float a(float f6, float f10, float f11) {
                return p230x.AbstractC7285e.a(this, f6, f10, f11);
            }

            @Override // p230x.InterfaceC7286f
            public /* synthetic */ p200u.InterfaceC7175j b() {
                return p230x.AbstractC7285e.b(this);
            }
        }

        private a() {
        }

        public final float a(float f6, float f10, float f11) {
            float f12 = f10 + f6;
            if ((f6 >= 0.0f && f12 <= f11) || (f6 < 0.0f && f12 > f11)) {
                return 0.0f;
            }
            float f13 = f12 - f11;
            return java.lang.Math.abs(f6) < java.lang.Math.abs(f13) ? f6 : f13;
        }

        public final p230x.InterfaceC7286f b() {
            return f56452c;
        }

        public final p200u.InterfaceC7175j c() {
            return f56451b;
        }
    }

    float a(float f6, float f10, float f11);

    p200u.InterfaceC7175j b();
}
