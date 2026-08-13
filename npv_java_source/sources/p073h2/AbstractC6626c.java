package p073h2;

/* JADX INFO: renamed from: h2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6626c {

    /* JADX INFO: renamed from: h2.c$a */
    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46115C;

        /* JADX INFO: renamed from: h2.c$a$a, reason: collision with other inner class name */
        public static final class C0542a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46116C;

            /* JADX INFO: renamed from: h2.c$a$a$a, reason: collision with other inner class name */
            public static final class C0543a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46117F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46118G;

                public C0543a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46117F = obj;
                    this.f46118G |= Integer.MIN_VALUE;
                    return p073h2.AbstractC6626c.a.C0542a.this.a(null, this);
                }
            }

            public C0542a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f46116C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                p073h2.AbstractC6626c.a.C0542a.C0543a c0543a;
                if (eVar instanceof p073h2.AbstractC6626c.a.C0542a.C0543a) {
                    c0543a = (p073h2.AbstractC6626c.a.C0542a.C0543a) eVar;
                    int i6 = c0543a.f46118G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0543a.f46118G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0543a = new p073h2.AbstractC6626c.a.C0542a.C0543a(eVar);
                    }
                } else {
                    c0543a = new p073h2.AbstractC6626c.a.C0542a.C0543a(eVar);
                }
                java.lang.Object obj2 = c0543a.f46117F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0543a.f46118G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f46116C;
                    p073h2.F fB = ((p073h2.C6643u) obj).b();
                    c0543a.f46118G = 1;
                    if (interfaceC1870g.a(fB, c0543a) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj2);
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f) {
            this.f46115C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f46115C.b(new p073h2.AbstractC6626c.a.C0542a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: h2.c$b */
    public static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46120G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f46121H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46122I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ W8.N f46123J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p127m7.e eVar, W8.N n6, p073h2.InterfaceC6624a interfaceC6624a) {
            super(3, eVar);
            this.f46123J = n6;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46120G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Z8.InterfaceC1870g interfaceC1870g = (Z8.InterfaceC1870g) this.f46121H;
                p073h2.C6643u c6643u = new p073h2.C6643u(this.f46123J, (p073h2.F) this.f46122I, null);
                this.f46120G = 1;
                if (interfaceC1870g.a(c6643u, this) == objG) {
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

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Object obj, p127m7.e eVar) {
            p073h2.AbstractC6626c.b bVar = new p073h2.AbstractC6626c.b(eVar, this.f46123J, null);
            bVar.f46121H = interfaceC1870g;
            bVar.f46122I = obj;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: h2.c$c, reason: collision with other inner class name */
    static final class C0544c extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46124G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46125H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f46126I;

        C0544c(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f46124G;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p073h2.C6643u c6643u = (p073h2.C6643u) this.f46125H;
                p087i7.x.b(obj);
                return c6643u;
            }
            p087i7.x.b(obj);
            p073h2.C6643u c6643u2 = (p073h2.C6643u) this.f46125H;
            p073h2.C6643u c6643u3 = (p073h2.C6643u) this.f46126I;
            this.f46125H = c6643u3;
            this.f46124G = 1;
            return c6643u2.c(this) == objG ? objG : c6643u3;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p073h2.C6643u c6643u, p073h2.C6643u c6643u2, p127m7.e eVar) {
            p073h2.AbstractC6626c.C0544c c0544c = new p073h2.AbstractC6626c.C0544c(eVar);
            c0544c.f46125H = c6643u;
            c0544c.f46126I = c6643u2;
            return c0544c.B(p087i7.M.f46721a);
        }
    }

    /* JADX INFO: renamed from: h2.c$d */
    static final class d extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46127G;

        d(p073h2.InterfaceC6624a interfaceC6624a, p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f46127G;
            if (i6 != 0 && i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            return ((p073h2.AbstractC6626c.d) x(interfaceC1870g, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return new p073h2.AbstractC6626c.d(null, eVar);
        }
    }

    /* JADX INFO: renamed from: h2.c$e */
    static final class e extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f46128G;

        e(p073h2.InterfaceC6624a interfaceC6624a, p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            int i6 = this.f46128G;
            if (i6 != 0 && i6 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(Z8.InterfaceC1870g interfaceC1870g, java.lang.Throwable th, p127m7.e eVar) {
            return new p073h2.AbstractC6626c.e(null, eVar).B(p087i7.M.f46721a);
        }
    }

    public static final Z8.InterfaceC1869f a(Z8.InterfaceC1869f interfaceC1869f, W8.N n6) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "<this>");
        p247y7.AbstractC7350t.f(n6, "scope");
        return b(interfaceC1869f, n6, null);
    }

    public static final Z8.InterfaceC1869f b(Z8.InterfaceC1869f interfaceC1869f, W8.N n6, p073h2.InterfaceC6624a interfaceC6624a) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "<this>");
        p247y7.AbstractC7350t.f(n6, "scope");
        return Z8.AbstractC1871h.K(Z8.AbstractC1871h.F(Z8.AbstractC1871h.H(new p073h2.AbstractC6626c.a(p073h2.AbstractC6634k.b(p073h2.AbstractC6634k.d(interfaceC1869f, new p073h2.AbstractC6626c.b(null, n6, interfaceC6624a)), new p073h2.AbstractC6626c.C0544c(null))), new p073h2.AbstractC6626c.d(interfaceC6624a, null)), new p073h2.AbstractC6626c.e(interfaceC6624a, null)), n6, Z8.I.f16761a.d(), 1);
    }
}
