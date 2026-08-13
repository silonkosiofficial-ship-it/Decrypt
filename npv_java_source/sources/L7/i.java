package L7;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.J f6283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f6284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L7.i.a f6285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L7.i.a f6286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L7.i.a f6287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final L7.i.a f6288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L7.i.a f6289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L7.i.a f6290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final L7.i.a f6291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L7.i.a f6292j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f6282l = {p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), p247y7.P.j(new p247y7.G(p247y7.P.b(L7.i.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final L7.i.b f6281k = new L7.i.b(null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6293a;

        public a(int i6) {
            this.f6293a = i6;
        }

        public final O7.InterfaceC1424e a(L7.i iVar, F7.k kVar) {
            p247y7.AbstractC7350t.f(iVar, "types");
            p247y7.AbstractC7350t.f(kVar, "property");
            return iVar.b(N8.a.a(kVar.getName()), this.f6293a);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final F8.E a(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "module");
            O7.InterfaceC1424e interfaceC1424eA = O7.AbstractC1442x.a(g6, L7.j.a.f6406u0);
            if (interfaceC1424eA == null) {
                return null;
            }
            F8.a0 a0VarI = F8.a0.f2872D.i();
            java.util.List listX = interfaceC1424eA.p().x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            java.lang.Object objG0 = p097j7.AbstractC6879v.G0(listX);
            p247y7.AbstractC7350t.e(objG0, "single(...)");
            return F8.F.g(a0VarI, interfaceC1424eA, p097j7.AbstractC6879v.e(new F8.T((O7.f0) objG0)));
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.G f6294D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(O7.G g6) {
            super(0);
            this.f6294D = g6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p248y8.h b() {
            return this.f6294D.s0(L7.j.f6322v).u();
        }
    }

    public i(O7.G g6, O7.J j6) {
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        this.f6283a = j6;
        this.f6284b = p087i7.AbstractC6669o.a(p087i7.r.PUBLICATION, new L7.i.c(g6));
        this.f6285c = new L7.i.a(1);
        this.f6286d = new L7.i.a(1);
        this.f6287e = new L7.i.a(1);
        this.f6288f = new L7.i.a(2);
        this.f6289g = new L7.i.a(3);
        this.f6290h = new L7.i.a(1);
        this.f6291i = new L7.i.a(2);
        this.f6292j = new L7.i.a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O7.InterfaceC1424e b(java.lang.String str, int i6) {
        p138n8.f fVarO = p138n8.f.o(str);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        O7.InterfaceC1427h interfaceC1427hG = d().g(fVarO, W7.d.FROM_REFLECTION);
        O7.InterfaceC1424e interfaceC1424e = interfaceC1427hG instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG : null;
        return interfaceC1424e == null ? this.f6283a.d(new p138n8.b(L7.j.f6322v, fVarO), p097j7.AbstractC6879v.e(java.lang.Integer.valueOf(i6))) : interfaceC1424e;
    }

    private final p248y8.h d() {
        return (p248y8.h) this.f6284b.getValue();
    }

    public final O7.InterfaceC1424e c() {
        return this.f6285c.a(this, f6282l[0]);
    }
}
