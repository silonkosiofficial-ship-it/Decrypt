package p182s1;

/* JADX INFO: loaded from: classes.dex */
class i extends p182s1.m {
    public i(p172r1.e eVar) {
        super(eVar);
    }

    private void q(p182s1.f fVar) {
        this.f54107h.f54075k.add(fVar);
        fVar.f54076l.add(this.f54107h);
    }

    @Override // p182s1.m, p182s1.d
    public void a(p182s1.d dVar) {
        p172r1.a aVar = (p172r1.a) this.f54101b;
        int iL0 = aVar.L0();
        java.util.Iterator it = this.f54107h.f54076l.iterator();
        int i6 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((p182s1.f) it.next()).f54071g;
            if (i10 == -1 || i11 < i10) {
                i10 = i11;
            }
            if (i6 < i11) {
                i6 = i11;
            }
        }
        if (iL0 == 0 || iL0 == 2) {
            this.f54107h.d(i10 + aVar.M0());
        } else {
            this.f54107h.d(i6 + aVar.M0());
        }
    }

    @Override // p182s1.m
    void d() {
        p182s1.m mVar;
        p172r1.e eVar = this.f54101b;
        if (eVar instanceof p172r1.a) {
            this.f54107h.f54066b = true;
            p172r1.a aVar = (p172r1.a) eVar;
            int iL0 = aVar.L0();
            boolean zK0 = aVar.K0();
            int i6 = 0;
            if (iL0 != 0) {
                if (iL0 != 1) {
                    if (iL0 == 2) {
                        this.f54107h.f54069e = s1.f.a.TOP;
                        while (i6 < aVar.f53793x0) {
                            p172r1.e eVar2 = aVar.f53792w0[i6];
                            if (zK0 || eVar2.O() != 8) {
                                p182s1.f fVar = eVar2.f53675f.f54107h;
                                fVar.f54075k.add(this.f54107h);
                                this.f54107h.f54076l.add(fVar);
                            }
                            i6++;
                        }
                    } else {
                        if (iL0 != 3) {
                            return;
                        }
                        this.f54107h.f54069e = s1.f.a.BOTTOM;
                        while (i6 < aVar.f53793x0) {
                            p172r1.e eVar3 = aVar.f53792w0[i6];
                            if (zK0 || eVar3.O() != 8) {
                                p182s1.f fVar2 = eVar3.f53675f.f54108i;
                                fVar2.f54075k.add(this.f54107h);
                                this.f54107h.f54076l.add(fVar2);
                            }
                            i6++;
                        }
                    }
                    q(this.f54101b.f53675f.f54107h);
                    mVar = this.f54101b.f53675f;
                } else {
                    this.f54107h.f54069e = s1.f.a.RIGHT;
                    while (i6 < aVar.f53793x0) {
                        p172r1.e eVar4 = aVar.f53792w0[i6];
                        if (zK0 || eVar4.O() != 8) {
                            p182s1.f fVar3 = eVar4.f53673e.f54108i;
                            fVar3.f54075k.add(this.f54107h);
                            this.f54107h.f54076l.add(fVar3);
                        }
                        i6++;
                    }
                }
                q(mVar.f54108i);
            }
            this.f54107h.f54069e = s1.f.a.LEFT;
            while (i6 < aVar.f53793x0) {
                p172r1.e eVar5 = aVar.f53792w0[i6];
                if (zK0 || eVar5.O() != 8) {
                    p182s1.f fVar4 = eVar5.f53673e.f54107h;
                    fVar4.f54075k.add(this.f54107h);
                    this.f54107h.f54076l.add(fVar4);
                }
                i6++;
            }
            q(this.f54101b.f53673e.f54107h);
            mVar = this.f54101b.f53673e;
            q(mVar.f54108i);
        }
    }

    @Override // p182s1.m
    public void e() {
        p172r1.e eVar = this.f54101b;
        if (eVar instanceof p172r1.a) {
            int iL0 = ((p172r1.a) eVar).L0();
            if (iL0 == 0 || iL0 == 1) {
                this.f54101b.F0(this.f54107h.f54071g);
            } else {
                this.f54101b.G0(this.f54107h.f54071g);
            }
        }
    }

    @Override // p182s1.m
    void f() {
        this.f54102c = null;
        this.f54107h.c();
    }

    @Override // p182s1.m
    boolean m() {
        return false;
    }
}
