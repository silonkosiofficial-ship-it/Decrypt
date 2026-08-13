package p012b1;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.C.a f24008b = new b1.C.a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p012b1.C f24009c = new p012b1.C("visible");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p012b1.C f24010d = new p012b1.C("invisible");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p012b1.C f24011e = new p012b1.C("gone");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f24012a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p012b1.C a() {
            return p012b1.C.f24009c;
        }
    }

    public C(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        this.f24012a = str;
    }

    public final java.lang.String b() {
        return this.f24012a;
    }
}
