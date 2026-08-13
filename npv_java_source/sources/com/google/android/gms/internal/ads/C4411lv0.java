package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4411lv0 implements com.google.android.gms.internal.ads.InterfaceC5842yw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC4301kv0 f37252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37255d = 0;

    private C4411lv0(com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0) {
        com.google.android.gms.internal.ads.Tv0.c(abstractC4301kv0, "input");
        this.f37252a = abstractC4301kv0;
        abstractC4301kv0.f37033c = this;
    }

    private final void N(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        int i6 = this.f37254c;
        this.f37254c = ((this.f37253b >>> 3) << 3) | 4;
        try {
            ew0.j(obj, this, c5730xv0);
            if (this.f37253b != this.f37254c) {
                throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
            }
            this.f37254c = i6;
        } catch (java.lang.Throwable th) {
            this.f37254c = i6;
            throw th;
        }
    }

    private final void O(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
        int iQ = abstractC4301kv0.q();
        if (abstractC4301kv0.f37031a >= abstractC4301kv0.f37032b) {
            throw new com.google.android.gms.internal.ads.Vv0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = abstractC4301kv0.j(iQ);
        this.f37252a.f37031a++;
        ew0.j(obj, this, c5730xv0);
        this.f37252a.z(0);
        com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
        abstractC4301kv1.f37031a--;
        abstractC4301kv1.A(iJ);
    }

    private final void P(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if (this.f37252a.i() != i6) {
            throw new com.google.android.gms.internal.ads.Vv0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void Q(int i6) throws com.google.android.gms.internal.ads.Uv0 {
        if ((this.f37253b & 7) != i6) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
    }

    private static final void R(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if ((i6 & 3) != 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
        }
    }

    private static final void S(int i6) throws com.google.android.gms.internal.ads.Vv0 {
        if ((i6 & 7) != 0) {
            throw new com.google.android.gms.internal.ads.Vv0("Failed to parse the message.");
        }
    }

    public static com.google.android.gms.internal.ads.C4411lv0 T(com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0) {
        com.google.android.gms.internal.ads.C4411lv0 c4411lv0 = abstractC4301kv0.f37033c;
        return c4411lv0 != null ? c4411lv0 : new com.google.android.gms.internal.ads.C4411lv0(abstractC4301kv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void A(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.C3317bw0) {
            com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f37252a.q();
                S(iQ);
                int i10 = iQ + this.f37252a.i();
                do {
                    c3317bw0.g(this.f37252a.t());
                } while (this.f37252a.i() < i10);
                return;
            }
            do {
                c3317bw0.g(this.f37252a.t());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f37252a.q();
                S(iQ2);
                int i12 = iQ2 + this.f37252a.i();
                do {
                    list.add(java.lang.Long.valueOf(this.f37252a.t()));
                } while (this.f37252a.i() < i12);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.f37252a.t()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void B(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 == 2) {
                int iQ = this.f37252a.q();
                R(iQ);
                int i10 = this.f37252a.i() + iQ;
                do {
                    kv0.K(this.f37252a.n());
                } while (this.f37252a.i() < i10);
                return;
            }
            if (i6 != 5) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            do {
                kv0.K(this.f37252a.n());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 == 2) {
                int iQ2 = this.f37252a.q();
                R(iQ2);
                int i12 = this.f37252a.i() + iQ2;
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.n()));
                } while (this.f37252a.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.n()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void C(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 == 2) {
                int iQ = this.f37252a.q();
                R(iQ);
                int i10 = this.f37252a.i() + iQ;
                do {
                    kv0.K(this.f37252a.l());
                } while (this.f37252a.i() < i10);
                return;
            }
            if (i6 != 5) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            do {
                kv0.K(this.f37252a.l());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 == 2) {
                int iQ2 = this.f37252a.q();
                R(iQ2);
                int i12 = this.f37252a.i() + iQ2;
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.l()));
                } while (this.f37252a.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.l()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void D(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.C3317bw0) {
            com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    c3317bw0.g(this.f37252a.u());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                c3317bw0.g(this.f37252a.u());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Long.valueOf(this.f37252a.u()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.f37252a.u()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void E(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.C3317bw0) {
            com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                int iQ = this.f37252a.q();
                S(iQ);
                int i10 = iQ + this.f37252a.i();
                do {
                    c3317bw0.g(this.f37252a.r());
                } while (this.f37252a.i() < i10);
                return;
            }
            do {
                c3317bw0.g(this.f37252a.r());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                int iQ2 = this.f37252a.q();
                S(iQ2);
                int i12 = iQ2 + this.f37252a.i();
                do {
                    list.add(java.lang.Long.valueOf(this.f37252a.r()));
                } while (this.f37252a.i() < i12);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.f37252a.r()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void F(java.util.List list, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Uv0 {
        int iP;
        int i6 = this.f37253b;
        if ((i6 & 7) != 3) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        do {
            java.lang.Object objD = ew0.d();
            N(objD, ew0, c5730xv0);
            ew0.a(objD);
            list.add(objD);
            if (this.f37252a.a() || this.f37255d != 0) {
                return;
            } else {
                iP = this.f37252a.p();
            }
        } while (iP == i6);
        this.f37255d = iP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void G(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    kv0.K(this.f37252a.o());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                kv0.K(this.f37252a.o());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.o()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.o()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void H(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    kv0.K(this.f37252a.q());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                kv0.K(this.f37252a.q());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.q()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.q()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void I(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        if (list instanceof com.google.android.gms.internal.ads.Uu0) {
            androidx.appcompat.app.D.a(list);
            int i6 = this.f37253b & 7;
            if (i6 == 0) {
                this.f37252a.b();
                throw null;
            }
            if (i6 != 2) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
            abstractC4301kv0.q();
            abstractC4301kv0.i();
            this.f37252a.b();
            throw null;
        }
        int i10 = this.f37253b & 7;
        if (i10 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.f37252a.b()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            this.f37255d = iP;
            return;
        }
        if (i10 != 2) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
        int i11 = abstractC4301kv1.i() + abstractC4301kv1.q();
        do {
            list.add(java.lang.Boolean.valueOf(this.f37252a.b()));
        } while (this.f37252a.i() < i11);
        P(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void J(java.util.List list, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int i6 = this.f37253b;
        if ((i6 & 7) != 2) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        do {
            java.lang.Object objD = ew0.d();
            O(objD, ew0, c5730xv0);
            ew0.a(objD);
            list.add(objD);
            if (this.f37252a.a() || this.f37255d != 0) {
                return;
            } else {
                iP = this.f37252a.p();
            }
        } while (iP == i6);
        this.f37255d = iP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void K(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        if (list instanceof com.google.android.gms.internal.ads.Cv0) {
            androidx.appcompat.app.D.a(list);
            int i6 = this.f37253b & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                this.f37252a.h();
                throw null;
            }
            R(this.f37252a.q());
            this.f37252a.i();
            this.f37252a.h();
            throw null;
        }
        int i10 = this.f37253b & 7;
        if (i10 == 2) {
            int iQ = this.f37252a.q();
            R(iQ);
            int i11 = this.f37252a.i() + iQ;
            do {
                list.add(java.lang.Float.valueOf(this.f37252a.h()));
            } while (this.f37252a.i() < i11);
            return;
        }
        if (i10 != 5) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(java.lang.Float.valueOf(this.f37252a.h()));
            if (this.f37252a.a()) {
                return;
            } else {
                iP = this.f37252a.p();
            }
        } while (iP == this.f37253b);
        this.f37255d = iP;
    }

    public final void L(java.util.List list, boolean z6) throws com.google.android.gms.internal.ads.Uv0 {
        int iP;
        int iP2;
        if ((this.f37253b & 7) != 2) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof com.google.android.gms.internal.ads.Yv0) && !z6) {
            com.google.android.gms.internal.ads.Yv0 yv0 = (com.google.android.gms.internal.ads.Yv0) list;
            do {
                q();
                yv0.b();
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            do {
                list.add(z6 ? u() : t());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final boolean M() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final double a() throws com.google.android.gms.internal.ads.Uv0 {
        Q(1);
        return this.f37252a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final float b() throws com.google.android.gms.internal.ads.Uv0 {
        Q(5);
        return this.f37252a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int c() {
        int iP = this.f37255d;
        if (iP != 0) {
            this.f37253b = iP;
            this.f37255d = 0;
        } else {
            iP = this.f37252a.p();
            this.f37253b = iP;
        }
        if (iP == 0 || iP == this.f37254c) {
            return Integer.MAX_VALUE;
        }
        return iP >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int d() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int e() throws com.google.android.gms.internal.ads.Uv0 {
        Q(5);
        return this.f37252a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int f() {
        return this.f37253b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int g() throws com.google.android.gms.internal.ads.Uv0 {
        Q(5);
        return this.f37252a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int h() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int i() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final int j() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final long k() throws com.google.android.gms.internal.ads.Uv0 {
        Q(1);
        return this.f37252a.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final long l() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final long m() throws com.google.android.gms.internal.ads.Uv0 {
        Q(1);
        return this.f37252a.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final long n() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void o(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    kv0.K(this.f37252a.k());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                kv0.K(this.f37252a.k());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.k()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.k()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final long p() throws com.google.android.gms.internal.ads.Uv0 {
        Q(0);
        return this.f37252a.v();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final com.google.android.gms.internal.ads.AbstractC3753fv0 q() throws com.google.android.gms.internal.ads.Uv0 {
        Q(2);
        return this.f37252a.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void r(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.C3317bw0) {
            com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    c3317bw0.g(this.f37252a.s());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                c3317bw0.g(this.f37252a.s());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Long.valueOf(this.f37252a.s()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.f37252a.s()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void s(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.C3317bw0) {
            com.google.android.gms.internal.ads.C3317bw0 c3317bw0 = (com.google.android.gms.internal.ads.C3317bw0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    c3317bw0.g(this.f37252a.v());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                c3317bw0.g(this.f37252a.v());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Long.valueOf(this.f37252a.v()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(this.f37252a.v()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final java.lang.String t() throws com.google.android.gms.internal.ads.Uv0 {
        Q(2);
        return this.f37252a.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final java.lang.String u() throws com.google.android.gms.internal.ads.Uv0 {
        Q(2);
        return this.f37252a.y();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void v(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Vv0 {
        Q(2);
        O(obj, ew0, c5730xv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void w(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        if (list instanceof com.google.android.gms.internal.ads.AbstractC5290tv0) {
            androidx.appcompat.app.D.a(list);
            int i6 = this.f37253b & 7;
            if (i6 == 1) {
                this.f37252a.g();
                throw null;
            }
            if (i6 != 2) {
                throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
            }
            S(this.f37252a.q());
            this.f37252a.i();
            this.f37252a.g();
            throw null;
        }
        int i10 = this.f37253b & 7;
        if (i10 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.f37252a.g()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            this.f37255d = iP;
            return;
        }
        if (i10 != 2) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        int iQ = this.f37252a.q();
        S(iQ);
        int i11 = iQ + this.f37252a.i();
        do {
            list.add(java.lang.Double.valueOf(this.f37252a.g()));
        } while (this.f37252a.i() < i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void x(java.util.List list) throws com.google.android.gms.internal.ads.Uv0 {
        int iP;
        if ((this.f37253b & 7) != 2) {
            throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(q());
            if (this.f37252a.a()) {
                return;
            } else {
                iP = this.f37252a.p();
            }
        } while (iP == this.f37253b);
        this.f37255d = iP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void y(java.util.List list) throws com.google.android.gms.internal.ads.Vv0 {
        int iP;
        int iP2;
        if (list instanceof com.google.android.gms.internal.ads.Kv0) {
            com.google.android.gms.internal.ads.Kv0 kv0 = (com.google.android.gms.internal.ads.Kv0) list;
            int i6 = this.f37253b & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv0 = this.f37252a;
                int i10 = abstractC4301kv0.i() + abstractC4301kv0.q();
                do {
                    kv0.K(this.f37252a.m());
                } while (this.f37252a.i() < i10);
                P(i10);
                return;
            }
            do {
                kv0.K(this.f37252a.m());
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP2 = this.f37252a.p();
                }
            } while (iP2 == this.f37253b);
        } else {
            int i11 = this.f37253b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new com.google.android.gms.internal.ads.Uv0("Protocol message tag had invalid wire type.");
                }
                com.google.android.gms.internal.ads.AbstractC4301kv0 abstractC4301kv1 = this.f37252a;
                int i12 = abstractC4301kv1.i() + abstractC4301kv1.q();
                do {
                    list.add(java.lang.Integer.valueOf(this.f37252a.m()));
                } while (this.f37252a.i() < i12);
                P(i12);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(this.f37252a.m()));
                if (this.f37252a.a()) {
                    return;
                } else {
                    iP = this.f37252a.p();
                }
            } while (iP == this.f37253b);
            iP2 = iP;
        }
        this.f37255d = iP2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5842yw0
    public final void z(java.lang.Object obj, com.google.android.gms.internal.ads.Ew0 ew0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) throws com.google.android.gms.internal.ads.Uv0 {
        Q(3);
        N(obj, ew0, c5730xv0);
    }
}
