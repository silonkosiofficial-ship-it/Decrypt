package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
final class a implements androidx.recyclerview.widget.h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B1.f f23288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.util.ArrayList f23289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.ArrayList f23290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.recyclerview.widget.a.InterfaceC0436a f23291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Runnable f23292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f23293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.h f23294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23295h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0436a {
        void a(int i6, int i10);

        void b(androidx.recyclerview.widget.a.b bVar);

        void c(int i6, int i10, java.lang.Object obj);

        void d(androidx.recyclerview.widget.a.b bVar);

        androidx.recyclerview.widget.RecyclerView.D e(int i6);

        void f(int i6, int i10);

        void g(int i6, int i10);

        void h(int i6, int i10);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.lang.Object f23298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f23299d;

        b(int i6, int i10, int i11, java.lang.Object obj) {
            this.f23296a = i6;
            this.f23297b = i10;
            this.f23299d = i11;
            this.f23298c = obj;
        }

        java.lang.String a() {
            int i6 = this.f23296a;
            if (i6 == 1) {
                return "add";
            }
            if (i6 == 2) {
                return "rm";
            }
            if (i6 != 4) {
                return i6 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.recyclerview.widget.a.b)) {
                return false;
            }
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) obj;
            int i6 = this.f23296a;
            if (i6 != bVar.f23296a) {
                return false;
            }
            if (i6 == 8 && java.lang.Math.abs(this.f23299d - this.f23297b) == 1 && this.f23299d == bVar.f23297b && this.f23297b == bVar.f23299d) {
                return true;
            }
            if (this.f23299d != bVar.f23299d || this.f23297b != bVar.f23297b) {
                return false;
            }
            java.lang.Object obj2 = this.f23298c;
            java.lang.Object obj3 = bVar.f23298c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f23296a * 31) + this.f23297b) * 31) + this.f23299d;
        }

        public java.lang.String toString() {
            return java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + "[" + a() + ",s:" + this.f23297b + "c:" + this.f23299d + ",p:" + this.f23298c + "]";
        }
    }

    a(androidx.recyclerview.widget.a.InterfaceC0436a interfaceC0436a) {
        this(interfaceC0436a, false);
    }

    a(androidx.recyclerview.widget.a.InterfaceC0436a interfaceC0436a, boolean z6) {
        this.f23288a = new B1.g(30);
        this.f23289b = new java.util.ArrayList();
        this.f23290c = new java.util.ArrayList();
        this.f23295h = 0;
        this.f23291d = interfaceC0436a;
        this.f23293f = z6;
        this.f23294g = new androidx.recyclerview.widget.h(this);
    }

    private void c(androidx.recyclerview.widget.a.b bVar) {
        r(bVar);
    }

    private void d(androidx.recyclerview.widget.a.b bVar) {
        r(bVar);
    }

    private void f(androidx.recyclerview.widget.a.b bVar) {
        boolean z6;
        byte b6;
        int i6 = bVar.f23297b;
        int i10 = bVar.f23299d + i6;
        byte b10 = -1;
        int i11 = i6;
        int i12 = 0;
        while (i11 < i10) {
            if (this.f23291d.e(i11) != null || h(i11)) {
                if (b10 == 0) {
                    k(b(2, i6, i12, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                b6 = 1;
            } else {
                if (b10 == 1) {
                    r(b(2, i6, i12, null));
                    z6 = true;
                } else {
                    z6 = false;
                }
                b6 = 0;
            }
            if (z6) {
                i11 -= i12;
                i10 -= i12;
                i12 = 1;
            } else {
                i12++;
            }
            i11++;
            b10 = b6;
        }
        if (i12 != bVar.f23299d) {
            a(bVar);
            bVar = b(2, i6, i12, null);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(androidx.recyclerview.widget.a.b bVar) {
        int i6 = bVar.f23297b;
        int i10 = bVar.f23299d + i6;
        int i11 = 0;
        byte b6 = -1;
        int i12 = i6;
        while (i6 < i10) {
            if (this.f23291d.e(i6) != null || h(i6)) {
                if (b6 == 0) {
                    k(b(4, i12, i11, bVar.f23298c));
                    i12 = i6;
                    i11 = 0;
                }
                b6 = 1;
            } else {
                if (b6 == 1) {
                    r(b(4, i12, i11, bVar.f23298c));
                    i12 = i6;
                    i11 = 0;
                }
                b6 = 0;
            }
            i11++;
            i6++;
        }
        if (i11 != bVar.f23299d) {
            java.lang.Object obj = bVar.f23298c;
            a(bVar);
            bVar = b(4, i12, i11, obj);
        }
        if (b6 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i6) {
        int size = this.f23290c.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23290c.get(i10);
            int i11 = bVar.f23296a;
            if (i11 == 8) {
                if (n(bVar.f23299d, i10 + 1) == i6) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = bVar.f23297b;
                int i13 = bVar.f23299d + i12;
                while (i12 < i13) {
                    if (n(i12, i10 + 1) == i6) {
                        return true;
                    }
                    i12++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(androidx.recyclerview.widget.a.b bVar) {
        int i6;
        int i10 = bVar.f23296a;
        if (i10 == 1 || i10 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iV = v(bVar.f23297b, i10);
        int i11 = bVar.f23297b;
        int i12 = bVar.f23296a;
        if (i12 == 2) {
            i6 = 0;
        } else {
            if (i12 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + bVar);
            }
            i6 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < bVar.f23299d; i14++) {
            int iV2 = v(bVar.f23297b + (i6 * i14), bVar.f23296a);
            int i15 = bVar.f23296a;
            if (i15 == 2 ? iV2 != iV : !(i15 == 4 && iV2 == iV + 1)) {
                androidx.recyclerview.widget.a.b bVarB = b(i15, iV, i13, bVar.f23298c);
                l(bVarB, i11);
                a(bVarB);
                if (bVar.f23296a == 4) {
                    i11 += i13;
                }
                i13 = 1;
                iV = iV2;
            } else {
                i13++;
            }
        }
        java.lang.Object obj = bVar.f23298c;
        a(bVar);
        if (i13 > 0) {
            androidx.recyclerview.widget.a.b bVarB2 = b(bVar.f23296a, iV, i13, obj);
            l(bVarB2, i11);
            a(bVarB2);
        }
    }

    private void r(androidx.recyclerview.widget.a.b bVar) {
        this.f23290c.add(bVar);
        int i6 = bVar.f23296a;
        if (i6 == 1) {
            this.f23291d.g(bVar.f23297b, bVar.f23299d);
            return;
        }
        if (i6 == 2) {
            this.f23291d.f(bVar.f23297b, bVar.f23299d);
            return;
        }
        if (i6 == 4) {
            this.f23291d.c(bVar.f23297b, bVar.f23299d, bVar.f23298c);
        } else {
            if (i6 == 8) {
                this.f23291d.a(bVar.f23297b, bVar.f23299d);
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    private int v(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        for (int size = this.f23290c.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23290c.get(size);
            int i17 = bVar.f23296a;
            if (i17 == 8) {
                int i18 = bVar.f23297b;
                int i19 = bVar.f23299d;
                if (i18 < i19) {
                    i13 = i18;
                    i12 = i19;
                } else {
                    i12 = i18;
                    i13 = i19;
                }
                if (i6 < i13 || i6 > i12) {
                    if (i6 < i18) {
                        if (i10 == 1) {
                            bVar.f23297b = i18 + 1;
                            i14 = i19 + 1;
                        } else if (i10 == 2) {
                            bVar.f23297b = i18 - 1;
                            i14 = i19 - 1;
                        }
                        bVar.f23299d = i14;
                    }
                } else if (i13 == i18) {
                    if (i10 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i10 == 2) {
                            i16 = i19 - 1;
                        }
                        i6++;
                    }
                    bVar.f23299d = i16;
                    i6++;
                } else {
                    if (i10 == 1) {
                        i15 = i18 + 1;
                    } else {
                        if (i10 == 2) {
                            i15 = i18 - 1;
                        }
                        i6--;
                    }
                    bVar.f23297b = i15;
                    i6--;
                }
            } else {
                int i20 = bVar.f23297b;
                if (i20 > i6) {
                    if (i10 == 1) {
                        i11 = i20 + 1;
                    } else if (i10 == 2) {
                        i11 = i20 - 1;
                    }
                    bVar.f23297b = i11;
                } else if (i17 == 1) {
                    i6 -= bVar.f23299d;
                } else if (i17 == 2) {
                    i6 += bVar.f23299d;
                }
            }
        }
        for (int size2 = this.f23290c.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.a.b bVar2 = (androidx.recyclerview.widget.a.b) this.f23290c.get(size2);
            if (bVar2.f23296a == 8) {
                int i21 = bVar2.f23299d;
                if (i21 == bVar2.f23297b || i21 < 0) {
                    this.f23290c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f23299d <= 0) {
                this.f23290c.remove(size2);
                a(bVar2);
            }
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(androidx.recyclerview.widget.a.b bVar) {
        if (this.f23293f) {
            return;
        }
        bVar.f23298c = null;
        this.f23288a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public androidx.recyclerview.widget.a.b b(int i6, int i10, int i11, java.lang.Object obj) {
        androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23288a.b();
        if (bVar == null) {
            return new androidx.recyclerview.widget.a.b(i6, i10, i11, obj);
        }
        bVar.f23296a = i6;
        bVar.f23297b = i10;
        bVar.f23299d = i11;
        bVar.f23298c = obj;
        return bVar;
    }

    public int e(int i6) {
        int size = this.f23289b.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23289b.get(i10);
            int i11 = bVar.f23296a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = bVar.f23297b;
                    if (i12 <= i6) {
                        int i13 = bVar.f23299d;
                        if (i12 + i13 > i6) {
                            return -1;
                        }
                        i6 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = bVar.f23297b;
                    if (i14 == i6) {
                        i6 = bVar.f23299d;
                    } else {
                        if (i14 < i6) {
                            i6--;
                        }
                        if (bVar.f23299d <= i6) {
                            i6++;
                        }
                    }
                }
            } else if (bVar.f23297b <= i6) {
                i6 += bVar.f23299d;
            }
        }
        return i6;
    }

    void i() {
        int size = this.f23290c.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f23291d.d((androidx.recyclerview.widget.a.b) this.f23290c.get(i6));
        }
        t(this.f23290c);
        this.f23295h = 0;
    }

    void j() {
        i();
        int size = this.f23289b.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23289b.get(i6);
            int i10 = bVar.f23296a;
            if (i10 == 1) {
                this.f23291d.d(bVar);
                this.f23291d.g(bVar.f23297b, bVar.f23299d);
            } else if (i10 == 2) {
                this.f23291d.d(bVar);
                this.f23291d.h(bVar.f23297b, bVar.f23299d);
            } else if (i10 == 4) {
                this.f23291d.d(bVar);
                this.f23291d.c(bVar.f23297b, bVar.f23299d, bVar.f23298c);
            } else if (i10 == 8) {
                this.f23291d.d(bVar);
                this.f23291d.a(bVar.f23297b, bVar.f23299d);
            }
            java.lang.Runnable runnable = this.f23292e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f23289b);
        this.f23295h = 0;
    }

    void l(androidx.recyclerview.widget.a.b bVar, int i6) {
        this.f23291d.b(bVar);
        int i10 = bVar.f23296a;
        if (i10 == 2) {
            this.f23291d.h(i6, bVar.f23299d);
        } else {
            if (i10 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f23291d.c(i6, bVar.f23299d, bVar.f23298c);
        }
    }

    int m(int i6) {
        return n(i6, 0);
    }

    int n(int i6, int i10) {
        int size = this.f23290c.size();
        while (i10 < size) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23290c.get(i10);
            int i11 = bVar.f23296a;
            if (i11 == 8) {
                int i12 = bVar.f23297b;
                if (i12 == i6) {
                    i6 = bVar.f23299d;
                } else {
                    if (i12 < i6) {
                        i6--;
                    }
                    if (bVar.f23299d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i13 = bVar.f23297b;
                if (i13 > i6) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = bVar.f23299d;
                    if (i6 < i13 + i14) {
                        return -1;
                    }
                    i6 -= i14;
                } else if (i11 == 1) {
                    i6 += bVar.f23299d;
                }
            }
            i10++;
        }
        return i6;
    }

    boolean o(int i6) {
        return (i6 & this.f23295h) != 0;
    }

    boolean p() {
        return this.f23289b.size() > 0;
    }

    boolean q() {
        return (this.f23290c.isEmpty() || this.f23289b.isEmpty()) ? false : true;
    }

    void s() {
        this.f23294g.b(this.f23289b);
        int size = this.f23289b.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.recyclerview.widget.a.b bVar = (androidx.recyclerview.widget.a.b) this.f23289b.get(i6);
            int i10 = bVar.f23296a;
            if (i10 == 1) {
                c(bVar);
            } else if (i10 == 2) {
                f(bVar);
            } else if (i10 == 4) {
                g(bVar);
            } else if (i10 == 8) {
                d(bVar);
            }
            java.lang.Runnable runnable = this.f23292e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f23289b.clear();
    }

    void t(java.util.List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a((androidx.recyclerview.widget.a.b) list.get(i6));
        }
        list.clear();
    }

    void u() {
        t(this.f23289b);
        t(this.f23290c);
        this.f23295h = 0;
    }
}
