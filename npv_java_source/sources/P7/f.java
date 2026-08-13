package P7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p138n8.f f8379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p138n8.f f8380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p138n8.f f8381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p138n8.f f8382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p138n8.f f8383e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ L7.g f8384D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L7.g gVar) {
            super(1);
            this.f8384D = gVar;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F8.E l(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "module");
            F8.M mL = g6.t().l(F8.u0.INVARIANT, this.f8384D.W());
            p247y7.AbstractC7350t.e(mL, "getArrayType(...)");
            return mL;
        }
    }

    static {
        p138n8.f fVarO = p138n8.f.o("message");
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        f8379a = fVarO;
        p138n8.f fVarO2 = p138n8.f.o("replaceWith");
        p247y7.AbstractC7350t.e(fVarO2, "identifier(...)");
        f8380b = fVarO2;
        p138n8.f fVarO3 = p138n8.f.o("level");
        p247y7.AbstractC7350t.e(fVarO3, "identifier(...)");
        f8381c = fVarO3;
        p138n8.f fVarO4 = p138n8.f.o("expression");
        p247y7.AbstractC7350t.e(fVarO4, "identifier(...)");
        f8382d = fVarO4;
        p138n8.f fVarO5 = p138n8.f.o("imports");
        p247y7.AbstractC7350t.e(fVarO5, "identifier(...)");
        f8383e = fVarO5;
    }

    public static final P7.c a(L7.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(str, "message");
        p247y7.AbstractC7350t.f(str2, "replaceWith");
        p247y7.AbstractC7350t.f(str3, "level");
        P7.j jVar = new P7.j(gVar, L7.j.a.f6329B, p097j7.S.k(p087i7.B.a(f8382d, new p198t8.u(str2)), p087i7.B.a(f8383e, new p198t8.b(p097j7.AbstractC6879v.m(), new P7.f.a(gVar)))), false, 8, null);
        p138n8.c cVar = L7.j.a.f6413y;
        p087i7.u uVarA = p087i7.B.a(f8379a, new p198t8.u(str));
        p087i7.u uVarA2 = p087i7.B.a(f8380b, new p198t8.C7156a(jVar));
        p138n8.f fVar = f8381c;
        p138n8.b bVarM = p138n8.b.m(L7.j.a.f6327A);
        p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
        p138n8.f fVarO = p138n8.f.o(str3);
        p247y7.AbstractC7350t.e(fVarO, "identifier(...)");
        return new P7.j(gVar, cVar, p097j7.S.k(uVarA, uVarA2, p087i7.B.a(fVar, new p198t8.j(bVarM, fVarO))), z6);
    }

    public static /* synthetic */ P7.c b(L7.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            str2 = "";
        }
        if ((i6 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i6 & 8) != 0) {
            z6 = false;
        }
        return a(gVar, str, str2, str3, z6);
    }
}
