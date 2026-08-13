package p073h2;

/* JADX INFO: renamed from: h2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6645w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p073h2.r f46268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p073h2.r f46269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p073h2.r f46270c;

    /* JADX INFO: renamed from: h2.w$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46271a;

        static {
            int[] iArr = new int[p073h2.EnumC6642t.values().length];
            try {
                iArr[p073h2.EnumC6642t.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p073h2.EnumC6642t.APPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p073h2.EnumC6642t.PREPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f46271a = iArr;
        }
    }

    public C6645w() {
        h2.r.c.a aVar = h2.r.c.f46235b;
        this.f46268a = aVar.b();
        this.f46269b = aVar.b();
        this.f46270c = aVar.b();
    }

    public final p073h2.r a(p073h2.EnumC6642t enumC6642t) {
        p247y7.AbstractC7350t.f(enumC6642t, "loadType");
        int i6 = p073h2.C6645w.a.f46271a[enumC6642t.ordinal()];
        if (i6 == 1) {
            return this.f46268a;
        }
        if (i6 == 2) {
            return this.f46270c;
        }
        if (i6 == 3) {
            return this.f46269b;
        }
        throw new p087i7.s();
    }

    public final void b(p073h2.C6641s c6641s) {
        p247y7.AbstractC7350t.f(c6641s, "states");
        this.f46268a = c6641s.f();
        this.f46270c = c6641s.d();
        this.f46269b = c6641s.e();
    }

    public final void c(p073h2.EnumC6642t enumC6642t, p073h2.r rVar) {
        p247y7.AbstractC7350t.f(enumC6642t, "type");
        p247y7.AbstractC7350t.f(rVar, "state");
        int i6 = p073h2.C6645w.a.f46271a[enumC6642t.ordinal()];
        if (i6 == 1) {
            this.f46268a = rVar;
        } else if (i6 == 2) {
            this.f46270c = rVar;
        } else {
            if (i6 != 3) {
                throw new p087i7.s();
            }
            this.f46269b = rVar;
        }
    }

    public final p073h2.C6641s d() {
        return new p073h2.C6641s(this.f46268a, this.f46269b, this.f46270c);
    }
}
