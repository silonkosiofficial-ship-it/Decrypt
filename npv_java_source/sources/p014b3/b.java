package p014b3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p014b3.b f24142b = new b3.b.a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p014b3.e f24143a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p014b3.e f24144a = null;

        a() {
        }

        public p014b3.b a() {
            return new p014b3.b(this.f24144a);
        }

        public b3.b.a b(p014b3.e eVar) {
            this.f24144a = eVar;
            return this;
        }
    }

    b(p014b3.e eVar) {
        this.f24143a = eVar;
    }

    public static b3.b.a b() {
        return new b3.b.a();
    }

    public p014b3.e a() {
        return this.f24143a;
    }
}
