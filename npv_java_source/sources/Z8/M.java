package Z8;

/* JADX INFO: loaded from: classes2.dex */
final class M implements Z8.I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f16773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16774c;

    static final class a extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16775G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f16776H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ int f16777I;

        a(p127m7.e eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x009b A[RETURN] */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Z8.InterfaceC1870g interfaceC1870g;
            Z8.G g6;
            long j6;
            Z8.G g10;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f16775G;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f16776H;
                        p087i7.x.b(obj);
                        if (Z8.M.this.f16774c > 0) {
                            g6 = Z8.G.STOP;
                            this.f16776H = interfaceC1870g;
                            this.f16775G = 3;
                            if (interfaceC1870g.a(g6, this) == objG) {
                                return objG;
                            }
                            j6 = Z8.M.this.f16774c;
                            this.f16776H = interfaceC1870g;
                            this.f16775G = 4;
                            if (W8.Y.a(j6, this) == objG) {
                                return objG;
                            }
                        }
                    } else if (i6 == 3) {
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f16776H;
                        p087i7.x.b(obj);
                        j6 = Z8.M.this.f16774c;
                        this.f16776H = interfaceC1870g;
                        this.f16775G = 4;
                        if (W8.Y.a(j6, this) == objG) {
                            return objG;
                        }
                    } else if (i6 == 4) {
                        interfaceC1870g = (Z8.InterfaceC1870g) this.f16776H;
                        p087i7.x.b(obj);
                    } else if (i6 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g10 = Z8.G.STOP_AND_RESET_REPLAY_CACHE;
                    this.f16776H = null;
                    this.f16775G = 5;
                    if (interfaceC1870g.a(g10, this) == objG) {
                        return objG;
                    }
                }
                p087i7.x.b(obj);
            } else {
                p087i7.x.b(obj);
                interfaceC1870g = (Z8.InterfaceC1870g) this.f16776H;
                if (this.f16777I > 0) {
                    Z8.G g11 = Z8.G.START;
                    this.f16775G = 1;
                    if (interfaceC1870g.a(g11, this) == objG) {
                        return objG;
                    }
                } else {
                    long j10 = Z8.M.this.f16773b;
                    this.f16776H = interfaceC1870g;
                    this.f16775G = 2;
                    if (W8.Y.a(j10, this) == objG) {
                        return objG;
                    }
                    if (Z8.M.this.f16774c > 0) {
                        g6 = Z8.G.STOP;
                        this.f16776H = interfaceC1870g;
                        this.f16775G = 3;
                        if (interfaceC1870g.a(g6, this) == objG) {
                            return objG;
                        }
                        j6 = Z8.M.this.f16774c;
                        this.f16776H = interfaceC1870g;
                        this.f16775G = 4;
                        if (W8.Y.a(j6, this) == objG) {
                            return objG;
                        }
                    }
                    g10 = Z8.G.STOP_AND_RESET_REPLAY_CACHE;
                    this.f16776H = null;
                    this.f16775G = 5;
                    if (interfaceC1870g.a(g10, this) == objG) {
                        return objG;
                    }
                }
            }
            return p087i7.M.f46721a;
        }

        public final java.lang.Object H(Z8.InterfaceC1870g interfaceC1870g, int i6, p127m7.e eVar) {
            Z8.M.a aVar = Z8.M.this.new a(eVar);
            aVar.f16776H = interfaceC1870g;
            aVar.f16777I = i6;
            return aVar.B(p087i7.M.f46721a);
        }

        @Override // p237x7.q
        public /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return H((Z8.InterfaceC1870g) obj, ((java.lang.Number) obj2).intValue(), (p127m7.e) obj3);
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f16779G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f16780H;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f16779G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            return p147o7.b.a(((Z8.G) this.f16780H) != Z8.G.START);
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Z8.G g6, p127m7.e eVar) {
            return ((Z8.M.b) x(g6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            Z8.M.b bVar = new Z8.M.b(eVar);
            bVar.f16780H = obj;
            return bVar;
        }
    }

    public M(long j6, long j10) {
        this.f16773b = j6;
        this.f16774c = j10;
        if (j6 < 0) {
            throw new java.lang.IllegalArgumentException(("stopTimeout(" + j6 + " ms) cannot be negative").toString());
        }
        if (j10 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // Z8.I
    public Z8.InterfaceC1869f a(Z8.N n6) {
        return Z8.AbstractC1871h.n(Z8.AbstractC1871h.p(Z8.AbstractC1871h.N(n6, new Z8.M.a(null)), new Z8.M.b(null)));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof Z8.M) {
            Z8.M m6 = (Z8.M) obj;
            if (this.f16773b == m6.f16773b && this.f16774c == m6.f16774c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (p170r.r.a(this.f16773b) * 31) + p170r.r.a(this.f16774c);
    }

    public java.lang.String toString() {
        java.util.List listD = p097j7.AbstractC6879v.d(2);
        if (this.f16773b > 0) {
            listD.add("stopTimeout=" + this.f16773b + "ms");
        }
        if (this.f16774c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f16774c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + p097j7.AbstractC6879v.r0(p097j7.AbstractC6879v.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
