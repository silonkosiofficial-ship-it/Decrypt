package p200u;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p200u.F f54670a = new p200u.C7198z(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p200u.F f54671b = new p200u.C7198z(0.0f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p200u.F f54672c = new p200u.C7198z(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p200u.F f54673d = new p200u.F() { // from class: u.G
        @Override // p200u.F
        public final float a(float f6) {
            return p200u.H.b(f6);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f6) {
        return f6;
    }

    public static final p200u.F c() {
        return f54672c;
    }

    public static final p200u.F d() {
        return f54670a;
    }

    public static final p200u.F e() {
        return f54673d;
    }

    public static final p200u.F f() {
        return f54671b;
    }
}
