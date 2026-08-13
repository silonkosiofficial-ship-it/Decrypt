package p128m8;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends p108k8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m8.e.a f51214h = new m8.e.a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p128m8.e f51215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p128m8.e f51216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p128m8.e f51217k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f51218g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        p128m8.e eVar = new p128m8.e(1, 9, 0);
        f51215i = eVar;
        f51216j = eVar.m();
        f51217k = new p128m8.e(new int[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(int... iArr) {
        this(iArr, false);
        p247y7.AbstractC7350t.f(iArr, "numbers");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z6) {
        super(java.util.Arrays.copyOf(iArr, iArr.length));
        p247y7.AbstractC7350t.f(iArr, "versionArray");
        this.f51218g = z6;
    }

    private final boolean i(p128m8.e eVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(eVar);
    }

    private final boolean l(p128m8.e eVar) {
        if (a() > eVar.a()) {
            return true;
        }
        return a() >= eVar.a() && b() > eVar.b();
    }

    public final boolean h(p128m8.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "metadataVersionFromLanguageVersion");
        if (a() == 2 && b() == 0) {
            p128m8.e eVar2 = f51215i;
            if (eVar2.a() == 1 && eVar2.b() == 8) {
                return true;
            }
        }
        return i(eVar.k(this.f51218g));
    }

    public final boolean j() {
        return this.f51218g;
    }

    public final p128m8.e k(boolean z6) {
        p128m8.e eVar = z6 ? f51215i : f51216j;
        return eVar.l(this) ? eVar : this;
    }

    public final p128m8.e m() {
        return (a() == 1 && b() == 9) ? new p128m8.e(2, 0, 0) : new p128m8.e(a(), b() + 1, 0);
    }
}
