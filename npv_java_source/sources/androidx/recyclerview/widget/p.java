package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p170r.Y f23448a = new p170r.Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final p170r.C7046v f23449b = new p170r.C7046v();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static B1.f f23450d = new B1.g(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.m.b f23452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.recyclerview.widget.RecyclerView.m.b f23453c;

        private a() {
        }

        static void a() {
            while (f23450d.b() != null) {
            }
        }

        static androidx.recyclerview.widget.p.a b() {
            androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) f23450d.b();
            return aVar == null ? new androidx.recyclerview.widget.p.a() : aVar;
        }

        static void c(androidx.recyclerview.widget.p.a aVar) {
            aVar.f23451a = 0;
            aVar.f23452b = null;
            aVar.f23453c = null;
            f23450d.a(aVar);
        }
    }

    interface b {
        void a(androidx.recyclerview.widget.RecyclerView.D d6);

        void b(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        void c(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);

        void d(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar, androidx.recyclerview.widget.RecyclerView.m.b bVar2);
    }

    p() {
    }

    private androidx.recyclerview.widget.RecyclerView.m.b l(androidx.recyclerview.widget.RecyclerView.D d6, int i6) {
        androidx.recyclerview.widget.p.a aVar;
        androidx.recyclerview.widget.RecyclerView.m.b bVar;
        int iD = this.f23448a.d(d6);
        if (iD >= 0 && (aVar = (androidx.recyclerview.widget.p.a) this.f23448a.k(iD)) != null) {
            int i10 = aVar.f23451a;
            if ((i10 & i6) != 0) {
                int i11 = (~i6) & i10;
                aVar.f23451a = i11;
                if (i6 == 4) {
                    bVar = aVar.f23452b;
                } else {
                    if (i6 != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f23453c;
                }
                if ((i11 & 12) == 0) {
                    this.f23448a.h(iD);
                    androidx.recyclerview.widget.p.a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar) {
        androidx.recyclerview.widget.p.a aVarB = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        if (aVarB == null) {
            aVarB = androidx.recyclerview.widget.p.a.b();
            this.f23448a.put(d6, aVarB);
        }
        aVarB.f23451a |= 2;
        aVarB.f23452b = bVar;
    }

    void b(androidx.recyclerview.widget.RecyclerView.D d6) {
        androidx.recyclerview.widget.p.a aVarB = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        if (aVarB == null) {
            aVarB = androidx.recyclerview.widget.p.a.b();
            this.f23448a.put(d6, aVarB);
        }
        aVarB.f23451a |= 1;
    }

    void c(long j6, androidx.recyclerview.widget.RecyclerView.D d6) {
        this.f23449b.m(j6, d6);
    }

    void d(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar) {
        androidx.recyclerview.widget.p.a aVarB = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        if (aVarB == null) {
            aVarB = androidx.recyclerview.widget.p.a.b();
            this.f23448a.put(d6, aVarB);
        }
        aVarB.f23453c = bVar;
        aVarB.f23451a |= 8;
    }

    void e(androidx.recyclerview.widget.RecyclerView.D d6, androidx.recyclerview.widget.RecyclerView.m.b bVar) {
        androidx.recyclerview.widget.p.a aVarB = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        if (aVarB == null) {
            aVarB = androidx.recyclerview.widget.p.a.b();
            this.f23448a.put(d6, aVarB);
        }
        aVarB.f23452b = bVar;
        aVarB.f23451a |= 4;
    }

    void f() {
        this.f23448a.clear();
        this.f23449b.b();
    }

    androidx.recyclerview.widget.RecyclerView.D g(long j6) {
        return (androidx.recyclerview.widget.RecyclerView.D) this.f23449b.e(j6);
    }

    boolean h(androidx.recyclerview.widget.RecyclerView.D d6) {
        androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        return (aVar == null || (aVar.f23451a & 1) == 0) ? false : true;
    }

    boolean i(androidx.recyclerview.widget.RecyclerView.D d6) {
        androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        return (aVar == null || (aVar.f23451a & 4) == 0) ? false : true;
    }

    void j() {
        androidx.recyclerview.widget.p.a.a();
    }

    public void k(androidx.recyclerview.widget.RecyclerView.D d6) {
        p(d6);
    }

    androidx.recyclerview.widget.RecyclerView.m.b m(androidx.recyclerview.widget.RecyclerView.D d6) {
        return l(d6, 8);
    }

    androidx.recyclerview.widget.RecyclerView.m.b n(androidx.recyclerview.widget.RecyclerView.D d6) {
        return l(d6, 4);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    void o(androidx.recyclerview.widget.p.b bVar) {
        androidx.recyclerview.widget.RecyclerView.m.b bVar2;
        androidx.recyclerview.widget.RecyclerView.m.b bVar3;
        for (int size = this.f23448a.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.RecyclerView.D d6 = (androidx.recyclerview.widget.RecyclerView.D) this.f23448a.f(size);
            androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) this.f23448a.h(size);
            int i6 = aVar.f23451a;
            if ((i6 & 3) != 3) {
                if ((i6 & 1) != 0) {
                    bVar2 = aVar.f23452b;
                    if (bVar2 == null) {
                        bVar.a(d6);
                    } else {
                        bVar3 = aVar.f23453c;
                    }
                } else if ((i6 & 14) == 14) {
                    bVar.b(d6, aVar.f23452b, aVar.f23453c);
                } else if ((i6 & 12) == 12) {
                    bVar.d(d6, aVar.f23452b, aVar.f23453c);
                } else if ((i6 & 4) != 0) {
                    bVar2 = aVar.f23452b;
                    bVar3 = null;
                } else if ((i6 & 8) != 0) {
                    bVar.b(d6, aVar.f23452b, aVar.f23453c);
                }
                bVar.c(d6, bVar2, bVar3);
            } else {
                bVar.a(d6);
            }
            androidx.recyclerview.widget.p.a.c(aVar);
        }
    }

    void p(androidx.recyclerview.widget.RecyclerView.D d6) {
        androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) this.f23448a.get(d6);
        if (aVar == null) {
            return;
        }
        aVar.f23451a &= -2;
    }

    void q(androidx.recyclerview.widget.RecyclerView.D d6) {
        for (int iQ = this.f23449b.q() - 1; iQ >= 0; iQ--) {
            if (d6 == this.f23449b.r(iQ)) {
                this.f23449b.p(iQ);
                break;
            }
        }
        androidx.recyclerview.widget.p.a aVar = (androidx.recyclerview.widget.p.a) this.f23448a.remove(d6);
        if (aVar != null) {
            androidx.recyclerview.widget.p.a.c(aVar);
        }
    }
}
