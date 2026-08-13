package p068g8;

/* JADX INFO: renamed from: g8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6623e extends p068g8.AbstractC6619a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O7.G f45641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O7.J f45642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final B8.C0824e f45643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p128m8.e f45644g;

    /* JADX INFO: renamed from: g8.e$a */
    private abstract class a implements g8.t.a {

        /* JADX INFO: renamed from: g8.e$a$a, reason: collision with other inner class name */
        public static final class C0519a implements g8.t.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ g8.t.a f45646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g8.t.a f45647b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p068g8.C6623e.a f45648c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p138n8.f f45649d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ java.util.ArrayList f45650e;

            C0519a(g8.t.a aVar, p068g8.C6623e.a aVar2, p138n8.f fVar, java.util.ArrayList arrayList) {
                this.f45647b = aVar;
                this.f45648c = aVar2;
                this.f45649d = fVar;
                this.f45650e = arrayList;
                this.f45646a = aVar;
            }

            @Override // g8.t.a
            public void a() {
                this.f45647b.a();
                this.f45648c.h(this.f45649d, new p198t8.C7156a((P7.c) p097j7.AbstractC6879v.G0(this.f45650e)));
            }

            @Override // g8.t.a
            public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
                p247y7.AbstractC7350t.f(bVar, "classId");
                return this.f45646a.b(fVar, bVar);
            }

            @Override // g8.t.a
            public void c(p138n8.f fVar, p198t8.f fVar2) {
                p247y7.AbstractC7350t.f(fVar2, "value");
                this.f45646a.c(fVar, fVar2);
            }

            @Override // g8.t.a
            public g8.t.b d(p138n8.f fVar) {
                return this.f45646a.d(fVar);
            }

            @Override // g8.t.a
            public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
                p247y7.AbstractC7350t.f(bVar, "enumClassId");
                p247y7.AbstractC7350t.f(fVar2, "enumEntryName");
                this.f45646a.e(fVar, bVar, fVar2);
            }

            @Override // g8.t.a
            public void f(p138n8.f fVar, java.lang.Object obj) {
                this.f45646a.f(fVar, obj);
            }
        }

        /* JADX INFO: renamed from: g8.e$a$b */
        public static final class b implements g8.t.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.util.ArrayList f45651a = new java.util.ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p068g8.C6623e f45652b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p138n8.f f45653c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p068g8.C6623e.a f45654d;

            /* JADX INFO: renamed from: g8.e$a$b$a, reason: collision with other inner class name */
            public static final class C0520a implements g8.t.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ g8.t.a f45655a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g8.t.a f45656b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ p068g8.C6623e.a.b f45657c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ java.util.ArrayList f45658d;

                C0520a(g8.t.a aVar, p068g8.C6623e.a.b bVar, java.util.ArrayList arrayList) {
                    this.f45656b = aVar;
                    this.f45657c = bVar;
                    this.f45658d = arrayList;
                    this.f45655a = aVar;
                }

                @Override // g8.t.a
                public void a() {
                    this.f45656b.a();
                    this.f45657c.f45651a.add(new p198t8.C7156a((P7.c) p097j7.AbstractC6879v.G0(this.f45658d)));
                }

                @Override // g8.t.a
                public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
                    p247y7.AbstractC7350t.f(bVar, "classId");
                    return this.f45655a.b(fVar, bVar);
                }

                @Override // g8.t.a
                public void c(p138n8.f fVar, p198t8.f fVar2) {
                    p247y7.AbstractC7350t.f(fVar2, "value");
                    this.f45655a.c(fVar, fVar2);
                }

                @Override // g8.t.a
                public g8.t.b d(p138n8.f fVar) {
                    return this.f45655a.d(fVar);
                }

                @Override // g8.t.a
                public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
                    p247y7.AbstractC7350t.f(bVar, "enumClassId");
                    p247y7.AbstractC7350t.f(fVar2, "enumEntryName");
                    this.f45655a.e(fVar, bVar, fVar2);
                }

                @Override // g8.t.a
                public void f(p138n8.f fVar, java.lang.Object obj) {
                    this.f45655a.f(fVar, obj);
                }
            }

            b(p068g8.C6623e c6623e, p138n8.f fVar, p068g8.C6623e.a aVar) {
                this.f45652b = c6623e;
                this.f45653c = fVar;
                this.f45654d = aVar;
            }

            @Override // g8.t.b
            public void a() {
                this.f45654d.g(this.f45653c, this.f45651a);
            }

            @Override // g8.t.b
            public void b(p138n8.b bVar, p138n8.f fVar) {
                p247y7.AbstractC7350t.f(bVar, "enumClassId");
                p247y7.AbstractC7350t.f(fVar, "enumEntryName");
                this.f45651a.add(new p198t8.j(bVar, fVar));
            }

            @Override // g8.t.b
            public void c(java.lang.Object obj) {
                this.f45651a.add(this.f45652b.J(this.f45653c, obj));
            }

            @Override // g8.t.b
            public g8.t.a d(p138n8.b bVar) {
                p247y7.AbstractC7350t.f(bVar, "classId");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                p068g8.C6623e c6623e = this.f45652b;
                O7.a0 a0Var = O7.a0.f8143a;
                p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
                g8.t.a aVarW = c6623e.w(bVar, a0Var, arrayList);
                p247y7.AbstractC7350t.c(aVarW);
                return new p068g8.C6623e.a.b.C0520a(aVarW, this, arrayList);
            }

            @Override // g8.t.b
            public void e(p198t8.f fVar) {
                p247y7.AbstractC7350t.f(fVar, "value");
                this.f45651a.add(new p198t8.p(fVar));
            }
        }

        public a() {
        }

        @Override // g8.t.a
        public g8.t.a b(p138n8.f fVar, p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p068g8.C6623e c6623e = p068g8.C6623e.this;
            O7.a0 a0Var = O7.a0.f8143a;
            p247y7.AbstractC7350t.e(a0Var, "NO_SOURCE");
            g8.t.a aVarW = c6623e.w(bVar, a0Var, arrayList);
            p247y7.AbstractC7350t.c(aVarW);
            return new p068g8.C6623e.a.C0519a(aVarW, this, fVar, arrayList);
        }

        @Override // g8.t.a
        public void c(p138n8.f fVar, p198t8.f fVar2) {
            p247y7.AbstractC7350t.f(fVar2, "value");
            h(fVar, new p198t8.p(fVar2));
        }

        @Override // g8.t.a
        public g8.t.b d(p138n8.f fVar) {
            return new p068g8.C6623e.a.b(p068g8.C6623e.this, fVar, this);
        }

        @Override // g8.t.a
        public void e(p138n8.f fVar, p138n8.b bVar, p138n8.f fVar2) {
            p247y7.AbstractC7350t.f(bVar, "enumClassId");
            p247y7.AbstractC7350t.f(fVar2, "enumEntryName");
            h(fVar, new p198t8.j(bVar, fVar2));
        }

        @Override // g8.t.a
        public void f(p138n8.f fVar, java.lang.Object obj) {
            h(fVar, p068g8.C6623e.this.J(fVar, obj));
        }

        public abstract void g(p138n8.f fVar, java.util.ArrayList arrayList);

        public abstract void h(p138n8.f fVar, p198t8.g gVar);
    }

    /* JADX INFO: renamed from: g8.e$b */
    public static final class b extends p068g8.C6623e.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final java.util.HashMap f45659b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1424e f45661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ p138n8.b f45662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ java.util.List f45663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ O7.a0 f45664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O7.InterfaceC1424e interfaceC1424e, p138n8.b bVar, java.util.List list, O7.a0 a0Var) {
            super();
            this.f45661d = interfaceC1424e;
            this.f45662e = bVar;
            this.f45663f = list;
            this.f45664g = a0Var;
            this.f45659b = new java.util.HashMap();
        }

        @Override // g8.t.a
        public void a() {
            if (p068g8.C6623e.this.D(this.f45662e, this.f45659b) || p068g8.C6623e.this.v(this.f45662e)) {
                return;
            }
            this.f45663f.add(new P7.d(this.f45661d.w(), this.f45659b, this.f45664g));
        }

        @Override // p068g8.C6623e.a
        public void g(p138n8.f fVar, java.util.ArrayList arrayList) {
            p247y7.AbstractC7350t.f(arrayList, "elements");
            if (fVar == null) {
                return;
            }
            O7.j0 j0VarB = Y7.a.b(fVar, this.f45661d);
            if (j0VarB != null) {
                java.util.HashMap map = this.f45659b;
                p198t8.h hVar = p198t8.h.f54633a;
                java.util.List listC = P8.a.c(arrayList);
                F8.E type = j0VarB.getType();
                p247y7.AbstractC7350t.e(type, "getType(...)");
                map.put(fVar, hVar.a(listC, type));
                return;
            }
            if (p068g8.C6623e.this.v(this.f45662e) && p247y7.AbstractC7350t.b(fVar.g(), "value")) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (obj instanceof p198t8.C7156a) {
                        arrayList2.add(obj);
                    }
                }
                java.util.List list = this.f45663f;
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add((P7.c) ((p198t8.C7156a) it.next()).b());
                }
            }
        }

        @Override // p068g8.C6623e.a
        public void h(p138n8.f fVar, p198t8.g gVar) {
            p247y7.AbstractC7350t.f(gVar, "value");
            if (fVar != null) {
                this.f45659b.put(fVar, gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6623e(O7.G g6, O7.J j6, E8.n nVar, p068g8.r rVar) {
        super(nVar, rVar);
        p247y7.AbstractC7350t.f(g6, "module");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
        this.f45641d = g6;
        this.f45642e = j6;
        this.f45643f = new B8.C0824e(g6, j6);
        this.f45644g = p128m8.e.f51215i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p198t8.g J(p138n8.f fVar, java.lang.Object obj) {
        p198t8.g gVarC = p198t8.h.f54633a.c(obj, this.f45641d);
        if (gVarC != null) {
            return gVarC;
        }
        return p198t8.k.f54637b.a("Unsupported annotation argument: " + fVar);
    }

    private final O7.InterfaceC1424e M(p138n8.b bVar) {
        return O7.AbstractC1442x.c(this.f45641d, bVar, this.f45642e);
    }

    @Override // p068g8.AbstractC6620b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public P7.c x(p088i8.b bVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(bVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        return this.f45643f.a(bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p068g8.AbstractC6619a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public p198t8.g F(java.lang.String str, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(str, "desc");
        p247y7.AbstractC7350t.f(obj, "initializer");
        if (S8.r.c0("ZBCS", str, false, 2, null)) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = java.lang.Byte.valueOf((byte) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = java.lang.Character.valueOf((char) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = java.lang.Short.valueOf((short) iIntValue);
                }
                throw new java.lang.AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = java.lang.Boolean.valueOf(iIntValue != 0);
            }
            throw new java.lang.AssertionError(str);
        }
        return p198t8.h.f54633a.c(obj, this.f45641d);
    }

    public void N(p128m8.e eVar) {
        p247y7.AbstractC7350t.f(eVar, "<set-?>");
        this.f45644g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p068g8.AbstractC6619a
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public p198t8.g H(p198t8.g gVar) {
        p198t8.g yVar;
        p247y7.AbstractC7350t.f(gVar, "constant");
        if (gVar instanceof p198t8.d) {
            yVar = new p198t8.w(((java.lang.Number) ((p198t8.d) gVar).b()).byteValue());
        } else if (gVar instanceof p198t8.t) {
            yVar = new p198t8.z(((java.lang.Number) ((p198t8.t) gVar).b()).shortValue());
        } else if (gVar instanceof p198t8.m) {
            yVar = new p198t8.x(((java.lang.Number) ((p198t8.m) gVar).b()).intValue());
        } else {
            if (!(gVar instanceof p198t8.q)) {
                return gVar;
            }
            yVar = new p198t8.y(((java.lang.Number) ((p198t8.q) gVar).b()).longValue());
        }
        return yVar;
    }

    @Override // p068g8.AbstractC6620b
    public p128m8.e t() {
        return this.f45644g;
    }

    @Override // p068g8.AbstractC6620b
    protected g8.t.a w(p138n8.b bVar, O7.a0 a0Var, java.util.List list) {
        p247y7.AbstractC7350t.f(bVar, "annotationClassId");
        p247y7.AbstractC7350t.f(a0Var, "source");
        p247y7.AbstractC7350t.f(list, "result");
        return new p068g8.C6623e.b(M(bVar), bVar, list, a0Var);
    }
}
