package p103k2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2.a.b f49424a = new k2.a.b(null);

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    private static final class C0620a extends p103k2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p123m2.n f49425b;

        /* JADX INFO: renamed from: k2.a$a$a, reason: collision with other inner class name */
        static final class C0621a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49426G;

            C0621a(p123m2.a aVar, p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49426G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    this.f49426G = 1;
                    if (nVar.a(null, this) == objG) {
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.C0621a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new C0621a(null, eVar);
            }
        }

        /* JADX INFO: renamed from: k2.a$a$b */
        static final class b extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49428G;

            b(p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49428G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    this.f49428G = 1;
                    obj = nVar.b(this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.b) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new b(eVar);
            }
        }

        /* JADX INFO: renamed from: k2.a$a$c */
        static final class c extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49430G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ android.net.Uri f49432I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ android.view.InputEvent f49433J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(android.net.Uri uri, android.view.InputEvent inputEvent, p127m7.e eVar) {
                super(2, eVar);
                this.f49432I = uri;
                this.f49433J = inputEvent;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49430G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    android.net.Uri uri = this.f49432I;
                    android.view.InputEvent inputEvent = this.f49433J;
                    this.f49430G = 1;
                    if (nVar.c(uri, inputEvent, this) == objG) {
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.c) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new c(this.f49432I, this.f49433J, eVar);
            }
        }

        /* JADX INFO: renamed from: k2.a$a$d */
        static final class d extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49434G;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ android.net.Uri f49436I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(android.net.Uri uri, p127m7.e eVar) {
                super(2, eVar);
                this.f49436I = uri;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49434G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    android.net.Uri uri = this.f49436I;
                    this.f49434G = 1;
                    if (nVar.d(uri, this) == objG) {
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.d) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new d(this.f49436I, eVar);
            }
        }

        /* JADX INFO: renamed from: k2.a$a$e */
        static final class e extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49437G;

            e(p123m2.o oVar, p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49437G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    this.f49437G = 1;
                    if (nVar.e(null, this) == objG) {
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.e) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new e(null, eVar);
            }
        }

        /* JADX INFO: renamed from: k2.a$a$f */
        static final class f extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f49439G;

            f(p123m2.p pVar, p127m7.e eVar) {
                super(2, eVar);
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f49439G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    p123m2.n nVar = p103k2.a.C0620a.this.f49425b;
                    this.f49439G = 1;
                    if (nVar.f(null, this) == objG) {
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
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p103k2.a.C0620a.f) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return p103k2.a.C0620a.this.new f(null, eVar);
            }
        }

        public C0620a(p123m2.n nVar) {
            p247y7.AbstractC7350t.f(nVar, "mMeasurementManager");
            this.f49425b = nVar;
        }

        @Override // p103k2.a
        public P4.d b() {
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.b(null), 3, null), null, 1, null);
        }

        @Override // p103k2.a
        public P4.d c(android.net.Uri uri, android.view.InputEvent inputEvent) {
            p247y7.AbstractC7350t.f(uri, "attributionSource");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // p103k2.a
        public P4.d d(android.net.Uri uri) {
            p247y7.AbstractC7350t.f(uri, "trigger");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.d(uri, null), 3, null), null, 1, null);
        }

        public P4.d f(p123m2.a aVar) {
            p247y7.AbstractC7350t.f(aVar, "deletionRequest");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.C0621a(aVar, null), 3, null), null, 1, null);
        }

        public P4.d g(p123m2.o oVar) {
            p247y7.AbstractC7350t.f(oVar, "request");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.e(oVar, null), 3, null), null, 1, null);
        }

        public P4.d h(p123m2.p pVar) {
            p247y7.AbstractC7350t.f(pVar, "request");
            return p093j2.b.c(W8.AbstractC1788i.b(W8.O.a(W8.C1779d0.a()), null, null, new p103k2.a.C0620a.f(pVar, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p103k2.a a(android.content.Context context) {
            p247y7.AbstractC7350t.f(context, "context");
            p123m2.n nVarA = p123m2.n.f50472a.a(context);
            if (nVarA != null) {
                return new p103k2.a.C0620a(nVarA);
            }
            return null;
        }
    }

    public static final p103k2.a a(android.content.Context context) {
        return f49424a.a(context);
    }

    public abstract P4.d b();

    public abstract P4.d c(android.net.Uri uri, android.view.InputEvent inputEvent);

    public abstract P4.d d(android.net.Uri uri);
}
