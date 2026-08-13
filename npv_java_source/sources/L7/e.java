package L7;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends L7.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L7.e.b f6245h = new L7.e.b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f6246i = p087i7.AbstractC6669o.b(L7.e.a.f6247D);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final L7.e.a f6247D = new L7.e.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L7.e b() {
            return new L7.e(false, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final L7.e a() {
            return (L7.e) L7.e.f6246i.getValue();
        }
    }

    public e(boolean z6) {
        super(new E8.f("DefaultBuiltIns"));
        if (z6) {
            f(false);
        }
    }

    public /* synthetic */ e(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }
}
