package p058f8;

/* JADX INFO: loaded from: classes2.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f45374a = new java.util.LinkedHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f45375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p058f8.m f45376b;

        /* JADX INFO: renamed from: f8.m$a$a, reason: collision with other inner class name */
        public final class C0507a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.lang.String f45377a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.util.List f45378b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private p087i7.u f45379c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f8.m.a f45380d;

            public C0507a(f8.m.a aVar, java.lang.String str) {
                p247y7.AbstractC7350t.f(str, "functionName");
                this.f45380d = aVar;
                this.f45377a = str;
                this.f45378b = new java.util.ArrayList();
                this.f45379c = p087i7.B.a("V", null);
            }

            public final p087i7.u a() {
                p068g8.A a6 = p068g8.A.f45591a;
                java.lang.String strB = this.f45380d.b();
                java.lang.String str = this.f45377a;
                java.util.List list = this.f45378b;
                java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((p087i7.u) it.next()).c());
                }
                java.lang.String strK = a6.k(strB, a6.j(str, arrayList, (java.lang.String) this.f45379c.c()));
                p058f8.q qVar = (p058f8.q) this.f45379c.d();
                java.util.List list2 = this.f45378b;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p097j7.AbstractC6879v.x(list2, 10));
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((p058f8.q) ((p087i7.u) it2.next()).d());
                }
                return p087i7.B.a(strK, new p058f8.k(qVar, arrayList2));
            }

            public final void b(java.lang.String str, p058f8.e... eVarArr) {
                p058f8.q qVar;
                p247y7.AbstractC7350t.f(str, "type");
                p247y7.AbstractC7350t.f(eVarArr, "qualifiers");
                java.util.List list = this.f45378b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    java.lang.Iterable<p097j7.L> iterableE1 = p097j7.AbstractC6872n.e1(eVarArr);
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(iterableE1, 10)), 16));
                    for (p097j7.L l6 : iterableE1) {
                        linkedHashMap.put(java.lang.Integer.valueOf(l6.c()), (p058f8.e) l6.d());
                    }
                    qVar = new p058f8.q(linkedHashMap);
                }
                list.add(p087i7.B.a(str, qVar));
            }

            public final void c(java.lang.String str, p058f8.e... eVarArr) {
                p247y7.AbstractC7350t.f(str, "type");
                p247y7.AbstractC7350t.f(eVarArr, "qualifiers");
                java.lang.Iterable<p097j7.L> iterableE1 = p097j7.AbstractC6872n.e1(eVarArr);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E7.j.d(p097j7.S.d(p097j7.AbstractC6879v.x(iterableE1, 10)), 16));
                for (p097j7.L l6 : iterableE1) {
                    linkedHashMap.put(java.lang.Integer.valueOf(l6.c()), (p058f8.e) l6.d());
                }
                this.f45379c = p087i7.B.a(str, new p058f8.q(linkedHashMap));
            }

            public final void d(p228w8.e eVar) {
                p247y7.AbstractC7350t.f(eVar, "type");
                java.lang.String strM = eVar.m();
                p247y7.AbstractC7350t.e(strM, "getDesc(...)");
                this.f45379c = p087i7.B.a(strM, null);
            }
        }

        public a(p058f8.m mVar, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "className");
            this.f45376b = mVar;
            this.f45375a = str;
        }

        public final void a(java.lang.String str, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(str, "name");
            p247y7.AbstractC7350t.f(lVar, "block");
            java.util.Map map = this.f45376b.f45374a;
            f8.m.a.C0507a c0507a = new f8.m.a.C0507a(this, str);
            lVar.l(c0507a);
            p087i7.u uVarA = c0507a.a();
            map.put(uVarA.c(), uVarA.d());
        }

        public final java.lang.String b() {
            return this.f45375a;
        }
    }

    public final java.util.Map b() {
        return this.f45374a;
    }
}
