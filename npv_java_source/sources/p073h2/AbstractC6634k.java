package p073h2;

/* JADX INFO: renamed from: h2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6634k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f46174a = new java.lang.Object();

    /* JADX INFO: renamed from: h2.k$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46175G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46176H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46177I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f46178J;

        /* JADX INFO: renamed from: h2.k$a$a, reason: collision with other inner class name */
        static final class C0548a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.O f46179C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.q f46180D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46181E;

            /* JADX INFO: renamed from: h2.k$a$a$a, reason: collision with other inner class name */
            static final class C0549a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f46182F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f46183G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46184H;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f46186J;

                C0549a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46184H = obj;
                    this.f46186J |= Integer.MIN_VALUE;
                    return p073h2.AbstractC6634k.a.C0548a.this.a(null, this);
                }
            }

            C0548a(p247y7.O o6, p237x7.q qVar, Z8.InterfaceC1870g interfaceC1870g) {
                this.f46179C = o6;
                this.f46180D = qVar;
                this.f46181E = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                p073h2.AbstractC6634k.a.C0548a.C0549a c0549a;
                p247y7.O o6;
                p073h2.AbstractC6634k.a.C0548a c0548a;
                p247y7.O o10;
                Z8.InterfaceC1870g interfaceC1870g;
                java.lang.Object obj2;
                if (eVar instanceof p073h2.AbstractC6634k.a.C0548a.C0549a) {
                    c0549a = (p073h2.AbstractC6634k.a.C0548a.C0549a) eVar;
                    int i6 = c0549a.f46186J;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0549a.f46186J = i6 - Integer.MIN_VALUE;
                    } else {
                        c0549a = new p073h2.AbstractC6634k.a.C0548a.C0549a(eVar);
                    }
                } else {
                    c0549a = new p073h2.AbstractC6634k.a.C0548a.C0549a(eVar);
                }
                java.lang.Object obj3 = c0549a.f46184H;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0549a.f46186J;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o10 = (p247y7.O) c0549a.f46183G;
                        c0548a = (p073h2.AbstractC6634k.a.C0548a) c0549a.f46182F;
                        p087i7.x.b(obj3);
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj3);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj3);
                o6 = this.f46179C;
                if (o6.f57254C == p073h2.AbstractC6634k.f46174a) {
                    c0548a = this;
                } else {
                    p237x7.q qVar = this.f46180D;
                    java.lang.Object obj4 = this.f46179C.f57254C;
                    c0549a.f46182F = this;
                    c0549a.f46183G = o6;
                    c0549a.f46186J = 1;
                    java.lang.Object objJ = qVar.j(obj4, obj, c0549a);
                    if (objJ == objG) {
                        return objG;
                    }
                    c0548a = this;
                    obj3 = objJ;
                    o10 = o6;
                }
                o6.f57254C = obj;
                interfaceC1870g = c0548a.f46181E;
                obj2 = c0548a.f46179C.f57254C;
                c0549a.f46182F = null;
                c0549a.f46183G = null;
                c0549a.f46186J = 2;
                if (interfaceC1870g.a(obj2, c0549a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
                java.lang.Object obj5 = obj3;
                o6 = o10;
                obj = obj5;
                o6.f57254C = obj;
                interfaceC1870g = c0548a.f46181E;
                obj2 = c0548a.f46179C.f57254C;
                c0549a.f46182F = null;
                c0549a.f46183G = null;
                c0549a.f46186J = 2;
                if (interfaceC1870g.a(obj2, c0549a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46177I = interfaceC1869f;
            this.f46178J = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46175G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f46176H;
                p247y7.O o6 = new p247y7.O();
                o6.f57254C = p073h2.AbstractC6634k.f46174a;
                Z8.InterfaceC1869f interfaceC1869f = this.f46177I;
                p073h2.AbstractC6634k.a.C0548a c0548a = new p073h2.AbstractC6634k.a.C0548a(o6, this.f46178J, interfaceC1870g);
                this.f46175G = 1;
                if (interfaceC1869f.b(c0548a, this) == objG) {
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
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.AbstractC6634k.a) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.AbstractC6634k.a aVar = new p073h2.AbstractC6634k.a(this.f46177I, this.f46178J, eVar);
            aVar.f46176H = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: h2.k$b */
    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f46187G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        int f46188H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46189I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f46190J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46191K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        final /* synthetic */ p237x7.q f46192L;

        /* JADX INFO: renamed from: h2.k$b$a */
        static final class a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ p247y7.O f46193C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ p237x7.q f46194D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46195E;

            /* JADX INFO: renamed from: h2.k$b$a$a, reason: collision with other inner class name */
            static final class C0550a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                java.lang.Object f46196F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                java.lang.Object f46197G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46198H;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                int f46200J;

                C0550a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46198H = obj;
                    this.f46200J |= Integer.MIN_VALUE;
                    return p073h2.AbstractC6634k.b.a.this.a(null, this);
                }
            }

            a(p247y7.O o6, p237x7.q qVar, Z8.InterfaceC1870g interfaceC1870g) {
                this.f46193C = o6;
                this.f46194D = qVar;
                this.f46195E = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                p073h2.AbstractC6634k.b.a.C0550a c0550a;
                p073h2.AbstractC6634k.b.a aVar;
                p247y7.O o6;
                if (eVar instanceof p073h2.AbstractC6634k.b.a.C0550a) {
                    c0550a = (p073h2.AbstractC6634k.b.a.C0550a) eVar;
                    int i6 = c0550a.f46200J;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0550a.f46200J = i6 - Integer.MIN_VALUE;
                    } else {
                        c0550a = new p073h2.AbstractC6634k.b.a.C0550a(eVar);
                    }
                } else {
                    c0550a = new p073h2.AbstractC6634k.b.a.C0550a(eVar);
                }
                java.lang.Object obj2 = c0550a.f46198H;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0550a.f46200J;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o6 = (p247y7.O) c0550a.f46197G;
                        aVar = (p073h2.AbstractC6634k.b.a) c0550a.f46196F;
                        p087i7.x.b(obj2);
                    } else {
                        if (i10 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p087i7.x.b(obj2);
                    }
                    return p087i7.M.f46721a;
                }
                p087i7.x.b(obj2);
                p247y7.O o10 = this.f46193C;
                p237x7.q qVar = this.f46194D;
                java.lang.Object obj3 = o10.f57254C;
                c0550a.f46196F = this;
                c0550a.f46197G = o10;
                c0550a.f46200J = 1;
                java.lang.Object objJ = qVar.j(obj3, obj, c0550a);
                if (objJ == objG) {
                    return objG;
                }
                aVar = this;
                obj2 = objJ;
                o6 = o10;
                o6.f57254C = obj2;
                Z8.InterfaceC1870g interfaceC1870g = aVar.f46195E;
                java.lang.Object obj4 = aVar.f46193C.f57254C;
                c0550a.f46196F = null;
                c0550a.f46197G = null;
                c0550a.f46200J = 2;
                if (interfaceC1870g.a(obj4, c0550a) == objG) {
                    return objG;
                }
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Object obj, Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46190J = obj;
            this.f46191K = interfaceC1869f;
            this.f46192L = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p247y7.O o6;
            Z8.InterfaceC1870g interfaceC1870g;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46188H;
            if (i6 != 0) {
                if (i6 == 1) {
                    o6 = (p247y7.O) this.f46187G;
                    interfaceC1870g = (Z8.InterfaceC1870g) this.f46189I;
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            Z8.InterfaceC1870g interfaceC1870g2 = (Z8.InterfaceC1870g) this.f46189I;
            o6 = new p247y7.O();
            java.lang.Object obj2 = this.f46190J;
            o6.f57254C = obj2;
            this.f46189I = interfaceC1870g2;
            this.f46187G = o6;
            this.f46188H = 1;
            if (interfaceC1870g2.a(obj2, this) == objG) {
                return objG;
            }
            interfaceC1870g = interfaceC1870g2;
            Z8.InterfaceC1869f interfaceC1869f = this.f46191K;
            p073h2.AbstractC6634k.b.a aVar = new p073h2.AbstractC6634k.b.a(o6, this.f46192L, interfaceC1870g);
            this.f46189I = null;
            this.f46187G = null;
            this.f46188H = 2;
            if (interfaceC1869f.b(aVar, this) == objG) {
                return objG;
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.AbstractC6634k.b) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.AbstractC6634k.b bVar = new p073h2.AbstractC6634k.b(this.f46190J, this.f46191K, this.f46192L, eVar);
            bVar.f46189I = obj;
            return bVar;
        }
    }

    /* JADX INFO: renamed from: h2.k$c */
    static final class c extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46201G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46202H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46203I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p237x7.q f46204J;

        /* JADX INFO: renamed from: h2.k$c$a */
        static final class a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f46205G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            /* synthetic */ java.lang.Object f46206H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p237x7.q f46207I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ p073h2.C6628e f46208J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p237x7.q qVar, p073h2.C6628e c6628e, p127m7.e eVar) {
                super(2, eVar);
                this.f46207I = qVar;
                this.f46208J = c6628e;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f46205G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    java.lang.Object obj2 = this.f46206H;
                    p237x7.q qVar = this.f46207I;
                    p073h2.C6628e c6628e = this.f46208J;
                    this.f46205G = 1;
                    if (qVar.j(c6628e, obj2, this) == objG) {
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
            public final java.lang.Object u(java.lang.Object obj, p127m7.e eVar) {
                return ((p073h2.AbstractC6634k.c.a) x(obj, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                p073h2.AbstractC6634k.c.a aVar = new p073h2.AbstractC6634k.c.a(this.f46207I, this.f46208J, eVar);
                aVar.f46206H = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar, p127m7.e eVar) {
            super(2, eVar);
            this.f46203I = interfaceC1869f;
            this.f46204J = qVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46201G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p073h2.T t6 = (p073h2.T) this.f46202H;
                Z8.InterfaceC1869f interfaceC1869f = this.f46203I;
                p073h2.AbstractC6634k.c.a aVar = new p073h2.AbstractC6634k.c.a(this.f46204J, new p073h2.C6628e(t6), null);
                this.f46201G = 1;
                if (Z8.AbstractC1871h.j(interfaceC1869f, aVar, this) == objG) {
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
        public final java.lang.Object u(p073h2.T t6, p127m7.e eVar) {
            return ((p073h2.AbstractC6634k.c) x(t6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            p073h2.AbstractC6634k.c cVar = new p073h2.AbstractC6634k.c(this.f46203I, this.f46204J, eVar);
            cVar.f46202H = obj;
            return cVar;
        }
    }

    public static final Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "<this>");
        p247y7.AbstractC7350t.f(qVar, "operation");
        return Z8.AbstractC1871h.x(new p073h2.AbstractC6634k.a(interfaceC1869f, qVar, null));
    }

    public static final Z8.InterfaceC1869f c(Z8.InterfaceC1869f interfaceC1869f, java.lang.Object obj, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "<this>");
        p247y7.AbstractC7350t.f(qVar, "operation");
        return Z8.AbstractC1871h.x(new p073h2.AbstractC6634k.b(obj, interfaceC1869f, qVar, null));
    }

    public static final Z8.InterfaceC1869f d(Z8.InterfaceC1869f interfaceC1869f, p237x7.q qVar) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "<this>");
        p247y7.AbstractC7350t.f(qVar, "transform");
        return p073h2.S.a(new p073h2.AbstractC6634k.c(interfaceC1869f, qVar, null));
    }
}
