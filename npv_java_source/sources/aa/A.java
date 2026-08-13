package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final S8.o f17235a = new S8.o("%(\\d)\\$[ds]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aa.C1887a f17236b = new aa.C1887a();

    static final class a extends p147o7.l implements p237x7.l {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17237G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        final /* synthetic */ aa.r f17238H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ aa.q f17239I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(aa.r rVar, aa.q qVar, p127m7.e eVar) {
            super(1, eVar);
            this.f17238H = rVar;
            this.f17239I = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17237G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                aa.r rVar = this.f17238H;
                java.lang.String strB = this.f17239I.b();
                long jA = this.f17239I.a();
                long jD = this.f17239I.d();
                this.f17237G = 1;
                obj = rVar.a(strB, jA, jD, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            java.util.List listS0 = S8.r.S0(S8.r.C((byte[]) obj), new char[]{'|'}, false, 0, 6, null);
            java.lang.String str = (java.lang.String) p097j7.AbstractC6879v.i0(listS0);
            java.lang.String str2 = (java.lang.String) p097j7.AbstractC6879v.t0(listS0);
            if (p247y7.AbstractC7350t.b(str, "plurals")) {
                return aa.A.e(str2);
            }
            return p247y7.AbstractC7350t.b(str, "string-array") ? aa.A.d(str2) : aa.A.f(str2);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object l(p127m7.e eVar) {
            return ((aa.A.a) y(eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e y(p127m7.e eVar) {
            return new aa.A.a(this.f17238H, this.f17239I, eVar);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f17240D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.util.List list) {
            super(1);
            this.f17240D = list;
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(S8.InterfaceC1639l interfaceC1639l) {
            p247y7.AbstractC7350t.f(interfaceC1639l, "matchResult");
            return (java.lang.CharSequence) this.f17240D.get(java.lang.Integer.parseInt((java.lang.String) interfaceC1639l.b().get(1)) - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aa.v d(java.lang.String str) {
        java.util.List listT0 = S8.r.T0(str, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(listT0, 10));
        java.util.Iterator it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(S8.r.C(p207u7.a.g(p207u7.a.f55545d, (java.lang.String) it.next(), 0, 0, 6, null)));
        }
        return new aa.v(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aa.w e(java.lang.String str) {
        java.util.List<java.lang.String> listT0 = S8.r.T0(str, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(listT0, 10)), 16));
        for (java.lang.String str2 : listT0) {
            java.lang.String strP1 = S8.r.p1(str2, ':', null, 2, null);
            java.lang.String strH1 = S8.r.h1(str2, ':', null, 2, null);
            ba.a aVarA = ba.a.f24392C.a(strP1);
            p247y7.AbstractC7350t.c(aVarA);
            p087i7.u uVarA = p087i7.B.a(aVarA, S8.r.C(p207u7.a.g(p207u7.a.f55545d, strH1, 0, 0, 6, null)));
            linkedHashMap.put(uVarA.c(), uVarA.d());
        }
        return new aa.w(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aa.x f(java.lang.String str) {
        return new aa.x(S8.r.C(p207u7.a.g(p207u7.a.f55545d, str, 0, 0, 6, null)));
    }

    public static final java.lang.Object g(aa.q qVar, aa.r rVar, p127m7.e eVar) {
        return f17236b.c(qVar.b() + "/" + qVar.a() + "-" + qVar.d(), new aa.A.a(rVar, qVar, null), eVar);
    }

    public static final java.lang.String h(java.lang.String str, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "<this>");
        p247y7.AbstractC7350t.f(list, "args");
        return f17235a.f(str, new aa.A.b(list));
    }
}
