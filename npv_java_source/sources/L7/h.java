package L7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 L7.h, still in use, count: 1, list:
  (r0v1 L7.h) from 0x0074: FILLED_NEW_ARRAY (r0v1 L7.h), (r3v2 L7.h), (r5v1 L7.h), (r7v1 L7.h), (r9v1 L7.h), (r11v1 L7.h), (r13v1 L7.h) A[WRAPPED] elemType: L7.h
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p138n8.f f6275C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p138n8.f f6276D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f6277E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f6278F;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final /* synthetic */ p157p7.a f6274R = p157p7.b.a(e());

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final L7.h.a f6263G = new L7.h.a(null);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final java.util.Set f6264H = p097j7.Z.g(new L7.h("Char"), new L7.h("Byte"), new L7.h("Short"), new L7.h("Int"), new L7.h("Float"), new L7.h("Long"), new L7.h("Double"));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {
        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p138n8.c b() {
            p138n8.c cVarC = L7.j.f6325y.c(L7.h.this.i());
            p247y7.AbstractC7350t.e(cVarC, "child(...)");
            return cVarC;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p138n8.c b() {
            p138n8.c cVarC = L7.j.f6325y.c(L7.h.this.n());
            p247y7.AbstractC7350t.e(cVarC, "child(...)");
            return cVarC;
        }
    }

    static {
    }

    private h(java.lang.String str) {
        super(str, i);
        p138n8.f fVarO = p138n8.f.o(str);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        this.f6275C = fVarO;
        p138n8.f fVarO2 = p138n8.f.o(str + "Array");
        p247y7.AbstractC7350t.e(fVarO2, "identifier(...)");
        this.f6276D = fVarO2;
        p087i7.r rVar = p087i7.r.PUBLICATION;
        this.f6277E = p087i7.AbstractC6669o.a(rVar, new L7.h.c());
        this.f6278F = p087i7.AbstractC6669o.a(rVar, new L7.h.b());
    }

    public static L7.h valueOf(java.lang.String str) {
        return (L7.h) java.lang.Enum.valueOf(L7.h.class, str);
    }

    public static L7.h[] values() {
        return (L7.h[]) f6273Q.clone();
    }

    public final p138n8.c g() {
        return (p138n8.c) this.f6278F.getValue();
    }

    public final p138n8.f i() {
        return this.f6276D;
    }

    public final p138n8.c m() {
        return (p138n8.c) this.f6277E.getValue();
    }

    public final p138n8.f n() {
        return this.f6275C;
    }
}
