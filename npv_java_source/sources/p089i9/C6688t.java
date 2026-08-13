package p089i9;

/* JADX INFO: renamed from: i9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6688t extends p109k9.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p089i9.C6688t.a f47570g = new p089i9.C6688t.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final java.util.List f47571h = p097j7.AbstractC6879v.p(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final java.util.List f47572i = p097j7.AbstractC6879v.p(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f47574f;

    /* JADX INFO: renamed from: i9.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6688t(int i6, int i10, java.util.List list) {
        super(p089i9.O.f47373a.a(), i6, i10, list);
        p247y7.AbstractC7350t.f(list, "zerosToAdd");
        this.f47573e = i6;
        this.f47574f = i10;
    }

    public /* synthetic */ C6688t(int i6, int i10, java.util.List list, int i11, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, i10, (i11 & 4) != 0 ? f47571h : list);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p089i9.C6688t) {
            p089i9.C6688t c6688t = (p089i9.C6688t) obj;
            if (this.f47573e == c6688t.f47573e && this.f47574f == c6688t.f47574f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47573e * 31) + this.f47574f;
    }
}
