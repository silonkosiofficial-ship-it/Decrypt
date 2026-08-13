package p082i1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p082i1.b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final p082i1.a.C0567a f46632N = new p082i1.a.C0567a(null);

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    public static final class C0567a {
        private C0567a() {
        }

        public /* synthetic */ C0567a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p082i1.a aVar) {
        super(aVar);
        p247y7.AbstractC7350t.f(aVar, "clArray");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(char[] cArr) {
        super(cArr);
        p247y7.AbstractC7350t.f(cArr, "content");
    }

    @Override // p082i1.c
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public p082i1.b d() {
        return new p082i1.a(this);
    }
}
