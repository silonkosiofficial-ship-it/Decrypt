package M1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M1.g.a f6779a = new M1.g.a(null);

    public static final class a {

        /* JADX INFO: renamed from: M1.g$a$a, reason: collision with other inner class name */
        static final class C0163a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f6780G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f6781H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ java.util.List f6782I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0163a(java.util.List list, p127m7.e eVar) {
                super(2, eVar);
                this.f6782I = list;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f6780G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    M1.m mVar = (M1.m) this.f6781H;
                    M1.g.a aVar = M1.g.f6779a;
                    java.util.List list = this.f6782I;
                    this.f6780G = 1;
                    if (aVar.c(list, mVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(M1.m mVar, p127m7.e eVar) {
                return ((M1.g.a.C0163a) x(mVar, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                M1.g.a.C0163a c0163a = new M1.g.a.C0163a(this.f6782I, eVar);
                c0163a.f6781H = obj;
                return c0163a;
            }
        }

        static final class b extends p147o7.d {

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            java.lang.Object f6783F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f6784G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f6785H;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            int f6787J;

            b(p127m7.e eVar) {
                super(eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                this.f6785H = obj;
                this.f6787J |= Integer.MIN_VALUE;
                return M1.g.a.this.c(null, null, this);
            }
        }

        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            java.lang.Object f6788G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            java.lang.Object f6789H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            java.lang.Object f6790I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            int f6791J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            /* synthetic */ java.lang.Object f6792K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ java.util.List f6793L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ java.util.List f6794M;

            /* JADX INFO: renamed from: M1.g$a$c$a, reason: collision with other inner class name */
            static final class C0164a extends p147o7.l implements p237x7.l {

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f6795G;

                C0164a(M1.f fVar, p127m7.e eVar) {
                    super(1, eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    p137n7.b.g();
                    int i6 = this.f6795G;
                    if (i6 == 0) {
                        p087i7.x.b(obj);
                        this.f6795G = 1;
                        throw null;
                    }
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                    return p087i7.M.f46721a;
                }

                @Override // p237x7.l
                /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object l(p127m7.e eVar) {
                    return ((M1.g.a.c.C0164a) y(eVar)).B(p087i7.M.f46721a);
                }

                @Override // p147o7.a
                public final p127m7.e y(p127m7.e eVar) {
                    return new M1.g.a.c.C0164a(null, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(java.util.List list, java.util.List list2, p127m7.e eVar) {
                super(2, eVar);
                this.f6793L = list;
                this.f6794M = list2;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.util.List list;
                java.util.Iterator it;
                p137n7.b.g();
                int i6 = this.f6791J;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    obj = this.f6792K;
                    java.util.List list2 = this.f6793L;
                    list = this.f6794M;
                    it = list2.iterator();
                } else if (i6 == 1) {
                    java.lang.Object obj2 = this.f6790I;
                    androidx.appcompat.app.D.a(this.f6789H);
                    java.util.Iterator it2 = (java.util.Iterator) this.f6788G;
                    java.util.List list3 = (java.util.List) this.f6792K;
                    p087i7.x.b(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        list3.add(new M1.g.a.c.C0164a(null, null));
                        this.f6792K = list3;
                        this.f6788G = it2;
                        this.f6789H = null;
                        this.f6790I = null;
                        this.f6791J = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) this.f6788G;
                    list = (java.util.List) this.f6792K;
                    p087i7.x.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                androidx.appcompat.app.D.a(it.next());
                this.f6792K = list;
                this.f6788G = it;
                this.f6789H = null;
                this.f6790I = obj;
                this.f6791J = 1;
                throw null;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(java.lang.Object obj, p127m7.e eVar) {
                return ((M1.g.a.c) x(obj, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                M1.g.a.c cVar = new M1.g.a.c(this.f6793L, this.f6794M, eVar);
                cVar.f6792K = obj;
                return cVar;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x009d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006b->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        public final java.lang.Object c(java.util.List list, M1.m mVar, p127m7.e eVar) throws java.lang.Throwable {
            M1.g.a.b bVar;
            java.util.List list2;
            p247y7.O o6;
            java.util.Iterator it;
            java.lang.Throwable th;
            p237x7.l lVar;
            if (eVar instanceof M1.g.a.b) {
                bVar = (M1.g.a.b) eVar;
                int i6 = bVar.f6787J;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    bVar.f6787J = i6 - Integer.MIN_VALUE;
                } else {
                    bVar = new M1.g.a.b(eVar);
                }
            } else {
                bVar = new M1.g.a.b(eVar);
            }
            java.lang.Object obj = bVar.f6785H;
            java.lang.Object objG = p137n7.b.g();
            int i10 = bVar.f6787J;
            if (i10 != 0) {
                if (i10 == 1) {
                    list2 = (java.util.List) bVar.f6783F;
                    p087i7.x.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) bVar.f6784G;
                    o6 = (p247y7.O) bVar.f6783F;
                    try {
                        p087i7.x.b(obj);
                    } catch (java.lang.Throwable th2) {
                        java.lang.Object obj2 = o6.f57254C;
                        if (obj2 == null) {
                            o6.f57254C = th2;
                        } else {
                            p247y7.AbstractC7350t.c(obj2);
                            p087i7.AbstractC6661g.a((java.lang.Throwable) obj2, th2);
                        }
                    }
                }
                while (it.hasNext()) {
                    lVar = (p237x7.l) it.next();
                    bVar.f6783F = o6;
                    bVar.f6784G = it;
                    bVar.f6787J = 2;
                    if (lVar.l(bVar) == objG) {
                        return objG;
                    }
                }
                th = (java.lang.Throwable) o6.f57254C;
                if (th == null) {
                    return p087i7.M.f46721a;
                }
                throw th;
            }
            p087i7.x.b(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p237x7.p cVar = new M1.g.a.c(list, arrayList, null);
            bVar.f6783F = arrayList;
            bVar.f6787J = 1;
            if (mVar.a(cVar, bVar) == objG) {
                return objG;
            }
            list2 = arrayList;
            o6 = new p247y7.O();
            it = list2.iterator();
            while (it.hasNext()) {
                lVar = (p237x7.l) it.next();
                bVar.f6783F = o6;
                bVar.f6784G = it;
                bVar.f6787J = 2;
                if (lVar.l(bVar) == objG) {
                    return objG;
                }
            }
            th = (java.lang.Throwable) o6.f57254C;
            if (th == null) {
                return p087i7.M.f46721a;
            }
            throw th;
        }

        public final p237x7.p b(java.util.List list) {
            p247y7.AbstractC7350t.f(list, "migrations");
            return new M1.g.a.C0163a(list, null);
        }
    }
}
