package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7083a;

    public static final class a extends M8.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.g.a f7084b = new M8.g.a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends M8.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.lang.String f7085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str) {
            super(false, null);
            p247y7.AbstractC7350t.f(str, "error");
            this.f7085b = str;
        }
    }

    public static final class c extends M8.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.g.c f7086b = new M8.g.c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z6) {
        this.f7083a = z6;
    }

    public /* synthetic */ g(boolean z6, p247y7.AbstractC7342k abstractC7342k) {
        this(z6);
    }

    public final boolean a() {
        return this.f7083a;
    }
}
