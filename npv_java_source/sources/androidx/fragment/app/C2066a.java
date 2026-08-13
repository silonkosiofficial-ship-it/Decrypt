package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2066a extends androidx.fragment.app.u implements androidx.fragment.app.n.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final androidx.fragment.app.n f22380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f22381u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f22382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f22383w;

    C2066a(androidx.fragment.app.n nVar) {
        super(nVar.p0(), nVar.r0() != null ? nVar.r0().o().getClassLoader() : null);
        this.f22382v = -1;
        this.f22383w = false;
        this.f22380t = nVar;
    }

    @Override // androidx.fragment.app.n.l
    public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.f22685i) {
            return true;
        }
        this.f22380t.g(this);
        return true;
    }

    @Override // androidx.fragment.app.u
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.u
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.u
    public void h() {
        j();
        this.f22380t.Z(this, false);
    }

    @Override // androidx.fragment.app.u
    public void i() {
        j();
        this.f22380t.Z(this, true);
    }

    @Override // androidx.fragment.app.u
    void k(int i6, androidx.fragment.app.f fVar, java.lang.String str, int i10) {
        super.k(i6, fVar, str, i10);
        fVar.f22492V = this.f22380t;
    }

    @Override // androidx.fragment.app.u
    public androidx.fragment.app.u l(androidx.fragment.app.f fVar) {
        androidx.fragment.app.n nVar = fVar.f22492V;
        if (nVar == null || nVar == this.f22380t) {
            return super.l(fVar);
        }
        throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fVar.toString() + " is already attached to a FragmentManager.");
    }

    void p(int i6) {
        if (this.f22685i) {
            if (androidx.fragment.app.n.E0(2)) {
                java.lang.String str = "Bump nesting in " + this + " by " + i6;
            }
            int size = this.f22679c.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(i10);
                androidx.fragment.app.f fVar = aVar.f22697b;
                if (fVar != null) {
                    fVar.f22491U += i6;
                    if (androidx.fragment.app.n.E0(2)) {
                        java.lang.String str2 = "Bump nesting of " + aVar.f22697b + " to " + aVar.f22697b.f22491U;
                    }
                }
            }
        }
    }

    int q(boolean z6) {
        if (this.f22381u) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (androidx.fragment.app.n.E0(2)) {
            java.lang.String str = "Commit: " + this;
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.z("FragmentManager"));
            r("  ", printWriter);
            printWriter.close();
        }
        this.f22381u = true;
        this.f22382v = this.f22685i ? this.f22380t.j() : -1;
        this.f22380t.W(this, z6);
        return this.f22382v;
    }

    public void r(java.lang.String str, java.io.PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(java.lang.String str, java.io.PrintWriter printWriter, boolean z6) {
        java.lang.String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f22687k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f22382v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f22381u);
            if (this.f22684h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.f22684h));
            }
            if (this.f22680d != 0 || this.f22681e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f22680d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f22681e));
            }
            if (this.f22682f != 0 || this.f22683g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f22682f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f22683g));
            }
            if (this.f22688l != 0 || this.f22689m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f22688l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f22689m);
            }
            if (this.f22690n != 0 || this.f22691o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f22690n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f22691o);
            }
        }
        if (this.f22679c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f22679c.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(i6);
            switch (aVar.f22696a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f22696a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f22697b);
            if (z6) {
                if (aVar.f22699d != 0 || aVar.f22700e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(aVar.f22699d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(aVar.f22700e));
                }
                if (aVar.f22701f != 0 || aVar.f22702g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(aVar.f22701f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(aVar.f22702g));
                }
            }
        }
    }

    void t() {
        androidx.fragment.app.n nVar;
        int size = this.f22679c.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(i6);
            androidx.fragment.app.f fVar = aVar.f22697b;
            if (fVar != null) {
                fVar.f22486P = this.f22383w;
                fVar.y1(false);
                fVar.x1(this.f22684h);
                fVar.A1(this.f22692p, this.f22693q);
            }
            switch (aVar.f22696a) {
                case 1:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, false);
                    this.f22380t.h(fVar);
                    continue;
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + aVar.f22696a);
                case 3:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.b1(fVar);
                    continue;
                    break;
                case 4:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.B0(fVar);
                    continue;
                    break;
                case 5:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, false);
                    this.f22380t.m1(fVar);
                    continue;
                    break;
                case 6:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.u(fVar);
                    continue;
                    break;
                case 7:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, false);
                    this.f22380t.l(fVar);
                    continue;
                    break;
                case 8:
                    nVar = this.f22380t;
                    break;
                case 9:
                    nVar = this.f22380t;
                    fVar = null;
                    break;
                case 10:
                    this.f22380t.j1(fVar, aVar.f22704i);
                    continue;
                    break;
            }
            nVar.k1(fVar);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.f22382v >= 0) {
            sb.append(" #");
            sb.append(this.f22382v);
        }
        if (this.f22687k != null) {
            sb.append(" ");
            sb.append(this.f22687k);
        }
        sb.append("}");
        return sb.toString();
    }

    void u() {
        androidx.fragment.app.n nVar;
        for (int size = this.f22679c.size() - 1; size >= 0; size--) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(size);
            androidx.fragment.app.f fVar = aVar.f22697b;
            if (fVar != null) {
                fVar.f22486P = this.f22383w;
                fVar.y1(true);
                fVar.x1(androidx.fragment.app.n.f1(this.f22684h));
                fVar.A1(this.f22693q, this.f22692p);
            }
            switch (aVar.f22696a) {
                case 1:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, true);
                    this.f22380t.b1(fVar);
                    continue;
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + aVar.f22696a);
                case 3:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.h(fVar);
                    continue;
                    break;
                case 4:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.m1(fVar);
                    continue;
                    break;
                case 5:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, true);
                    this.f22380t.B0(fVar);
                    continue;
                    break;
                case 6:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.l(fVar);
                    continue;
                    break;
                case 7:
                    fVar.u1(aVar.f22699d, aVar.f22700e, aVar.f22701f, aVar.f22702g);
                    this.f22380t.i1(fVar, true);
                    this.f22380t.u(fVar);
                    continue;
                    break;
                case 8:
                    nVar = this.f22380t;
                    fVar = null;
                    break;
                case 9:
                    nVar = this.f22380t;
                    break;
                case 10:
                    this.f22380t.j1(fVar, aVar.f22703h);
                    continue;
                    break;
            }
            nVar.k1(fVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    androidx.fragment.app.f v(java.util.ArrayList arrayList, androidx.fragment.app.f fVar) {
        androidx.fragment.app.f fVar2 = fVar;
        int i6 = 0;
        while (i6 < this.f22679c.size()) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(i6);
            int i10 = aVar.f22696a;
            if (i10 == 1) {
                arrayList.add(aVar.f22697b);
            } else if (i10 == 2) {
                androidx.fragment.app.f fVar3 = aVar.f22697b;
                int i11 = fVar3.f22497a0;
                boolean z6 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.f fVar4 = (androidx.fragment.app.f) arrayList.get(size);
                    if (fVar4.f22497a0 == i11) {
                        if (fVar4 == fVar3) {
                            z6 = true;
                        } else {
                            if (fVar4 == fVar2) {
                                this.f22679c.add(i6, new androidx.fragment.app.u.a(9, fVar4, true));
                                i6++;
                                fVar2 = null;
                            }
                            androidx.fragment.app.u.a aVar2 = new androidx.fragment.app.u.a(3, fVar4, true);
                            aVar2.f22699d = aVar.f22699d;
                            aVar2.f22701f = aVar.f22701f;
                            aVar2.f22700e = aVar.f22700e;
                            aVar2.f22702g = aVar.f22702g;
                            this.f22679c.add(i6, aVar2);
                            arrayList.remove(fVar4);
                            i6++;
                        }
                    }
                }
                if (z6) {
                    this.f22679c.remove(i6);
                    i6--;
                } else {
                    aVar.f22696a = 1;
                    aVar.f22698c = true;
                    arrayList.add(fVar3);
                }
            } else if (i10 == 3 || i10 == 6) {
                arrayList.remove(aVar.f22697b);
                androidx.fragment.app.f fVar5 = aVar.f22697b;
                if (fVar5 == fVar2) {
                    this.f22679c.add(i6, new androidx.fragment.app.u.a(9, fVar5));
                    i6++;
                    fVar2 = null;
                }
            } else if (i10 == 7) {
                arrayList.add(aVar.f22697b);
            } else if (i10 == 8) {
                this.f22679c.add(i6, new androidx.fragment.app.u.a(9, fVar2, true));
                aVar.f22698c = true;
                i6++;
                fVar2 = aVar.f22697b;
            }
            i6++;
        }
        return fVar2;
    }

    public java.lang.String w() {
        return this.f22687k;
    }

    public void x() {
        if (this.f22695s != null) {
            for (int i6 = 0; i6 < this.f22695s.size(); i6++) {
                ((java.lang.Runnable) this.f22695s.get(i6)).run();
            }
            this.f22695s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    androidx.fragment.app.f y(java.util.ArrayList arrayList, androidx.fragment.app.f fVar) {
        for (int size = this.f22679c.size() - 1; size >= 0; size--) {
            androidx.fragment.app.u.a aVar = (androidx.fragment.app.u.a) this.f22679c.get(size);
            int i6 = aVar.f22696a;
            if (i6 == 1) {
                arrayList.remove(aVar.f22697b);
            } else if (i6 != 3) {
                switch (i6) {
                    case 6:
                        arrayList.add(aVar.f22697b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f22697b);
                        break;
                    case 8:
                        fVar = null;
                        break;
                    case 9:
                        fVar = aVar.f22697b;
                        break;
                    case 10:
                        aVar.f22704i = aVar.f22703h;
                        break;
                }
            } else {
                arrayList.add(aVar.f22697b);
            }
        }
        return fVar;
    }
}
