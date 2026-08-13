package p089i9;

/* JADX INFO: renamed from: i9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6684o {

    /* JADX INFO: renamed from: i9.o$a */
    public interface a extends p089i9.InterfaceC6684o {

        /* JADX INFO: renamed from: i9.o$a$a, reason: collision with other inner class name */
        public static final class C0604a {
            public static /* synthetic */ void a(p089i9.InterfaceC6684o.a aVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                aVar.o(k6);
            }

            public static /* synthetic */ void b(p089i9.InterfaceC6684o.a aVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                aVar.d(k6);
            }

            public static /* synthetic */ void c(p089i9.InterfaceC6684o.a aVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                aVar.b(k6);
            }
        }

        void b(p089i9.K k6);

        void d(p089i9.K k6);

        void f(p089i9.C6687s c6687s);

        void n(p089i9.I i6);

        void o(p089i9.K k6);

        void q(int i6);

        void s(p089i9.InterfaceC6683n interfaceC6683n);
    }

    /* JADX INFO: renamed from: i9.o$b */
    public interface b extends p089i9.InterfaceC6684o.a, p089i9.InterfaceC6684o.d {
    }

    /* JADX INFO: renamed from: i9.o$c */
    public interface c extends p089i9.InterfaceC6684o.b, p089i9.InterfaceC6684o.e {
        void g();
    }

    /* JADX INFO: renamed from: i9.o$d */
    public interface d extends p089i9.InterfaceC6684o {

        /* JADX INFO: renamed from: i9.o$d$a */
        public static final class a {
            public static /* synthetic */ void a(p089i9.InterfaceC6684o.d dVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                dVar.y(k6);
            }

            public static /* synthetic */ void b(p089i9.InterfaceC6684o.d dVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                dVar.m(k6);
            }

            public static /* synthetic */ void c(p089i9.InterfaceC6684o.d dVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                dVar.z(k6);
            }

            public static void d(p089i9.InterfaceC6684o.d dVar, int i6) {
                dVar.j(i6, i6);
            }
        }

        void j(int i6, int i10);

        void k(p089i9.InterfaceC6683n interfaceC6683n);

        void m(p089i9.K k6);

        void x(int i6);

        void y(p089i9.K k6);

        void z(p089i9.K k6);
    }

    /* JADX INFO: renamed from: i9.o$e */
    public interface e extends p089i9.InterfaceC6684o {

        /* JADX INFO: renamed from: i9.o$e$a */
        public static final class a {
            public static /* synthetic */ void a(p089i9.InterfaceC6684o.e eVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                eVar.e(k6);
            }

            public static /* synthetic */ void b(p089i9.InterfaceC6684o.e eVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                eVar.r(k6);
            }

            public static /* synthetic */ void c(p089i9.InterfaceC6684o.e eVar, p089i9.K k6, int i6, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
                }
                if ((i6 & 1) != 0) {
                    k6 = p089i9.K.ZERO;
                }
                eVar.h(k6);
            }
        }

        void A(p089i9.InterfaceC6683n interfaceC6683n);

        void e(p089i9.K k6);

        void h(p089i9.K k6);

        void r(p089i9.K k6);
    }

    void c(java.lang.String str);
}
