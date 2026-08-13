package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f47321a = p087i7.AbstractC6669o.b(i9.A.a.f47324D);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p087i7.InterfaceC6668n f47322b = p087i7.AbstractC6669o.b(i9.A.b.f47326D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p089i9.C6690v f47323c = new p089i9.C6690v(null, null, null, null, 15, null);

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final i9.A.a f47324D = new i9.A.a();

        /* JADX INFO: renamed from: i9.A$a$a, reason: collision with other inner class name */
        static final class C0575a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final i9.A.a.C0575a f47325D = new i9.A.a.C0575a();

            C0575a() {
                super(1);
            }

            public final void a(p089i9.InterfaceC6684o.a aVar) {
                p247y7.AbstractC7350t.f(aVar, "$this$build");
                p089i9.InterfaceC6684o.a.C0604a.c(aVar, null, 1, null);
                p089i9.AbstractC6685p.b(aVar, '-');
                p089i9.InterfaceC6684o.a.C0604a.b(aVar, null, 1, null);
                p089i9.AbstractC6685p.b(aVar, '-');
                p089i9.InterfaceC6684o.a.C0604a.a(aVar, null, 1, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p089i9.InterfaceC6684o.a) obj);
                return p087i7.M.f46721a;
            }
        }

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p089i9.InterfaceC6683n b() {
            return p089i9.C6694z.f47592b.a(i9.A.a.C0575a.f47325D);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final i9.A.b f47326D = new i9.A.b();

        static final class a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final i9.A.b.a f47327D = new i9.A.b.a();

            a() {
                super(1);
            }

            public final void a(p089i9.InterfaceC6684o.a aVar) {
                p247y7.AbstractC7350t.f(aVar, "$this$build");
                p089i9.InterfaceC6684o.a.C0604a.c(aVar, null, 1, null);
                p089i9.InterfaceC6684o.a.C0604a.b(aVar, null, 1, null);
                p089i9.InterfaceC6684o.a.C0604a.a(aVar, null, 1, null);
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p089i9.InterfaceC6684o.a) obj);
                return p087i7.M.f46721a;
            }
        }

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p089i9.InterfaceC6683n b() {
            return p089i9.C6694z.f47592b.a(i9.A.b.a.f47327D);
        }
    }

    public static final p089i9.InterfaceC6683n b() {
        return (p089i9.InterfaceC6683n) f47321a.getValue();
    }

    public static final p089i9.InterfaceC6683n c() {
        return (p089i9.InterfaceC6683n) f47322b.getValue();
    }

    public static final java.lang.Object d(java.lang.Object obj, java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "name");
        if (obj != null) {
            return obj;
        }
        throw new p079h9.c("Can not create a " + str + " from the given input: the field " + str + " is missing");
    }

    public static final void e(p089i9.InterfaceC6684o.a aVar, p089i9.K k6) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        p247y7.AbstractC7350t.f(k6, "padding");
        if (aVar instanceof p089i9.InterfaceC6672c) {
            ((p089i9.InterfaceC6672c) aVar).v(new p109k9.C6919e(new p089i9.c0(k6, true)));
        }
    }

    public static final void f(p089i9.InterfaceC6684o.a aVar, int i6) {
        p247y7.AbstractC7350t.f(aVar, "<this>");
        if (aVar instanceof p089i9.InterfaceC6672c) {
            ((p089i9.InterfaceC6672c) aVar).v(new p109k9.C6919e(new p089i9.L(i6, true)));
        }
    }
}
