package p182s1;

/* JADX INFO: loaded from: classes.dex */
class h extends p182s1.m {
    public h(p172r1.e eVar) {
        super(eVar);
        eVar.f53673e.f();
        eVar.f53675f.f();
        this.f54105f = ((p172r1.h) eVar).K0();
    }

    private void q(p182s1.f fVar) {
        this.f54107h.f54075k.add(fVar);
        fVar.f54076l.add(this.f54107h);
    }

    @Override // p182s1.m, p182s1.d
    public void a(p182s1.d dVar) {
        p182s1.f fVar = this.f54107h;
        if (fVar.f54067c && !fVar.f54074j) {
            this.f54107h.d((int) ((((p182s1.f) fVar.f54076l.get(0)).f54071g * ((p172r1.h) this.f54101b).N0()) + 0.5f));
        }
    }

    @Override // p182s1.m
    void d() {
        p182s1.f fVar;
        p182s1.m mVar;
        p182s1.f fVar2;
        p172r1.h hVar = (p172r1.h) this.f54101b;
        int iL0 = hVar.L0();
        int iM0 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            p182s1.f fVar3 = this.f54107h;
            if (iL0 != -1) {
                fVar3.f54076l.add(this.f54101b.f53652N.f53673e.f54107h);
                this.f54101b.f53652N.f53673e.f54107h.f54075k.add(this.f54107h);
                fVar2 = this.f54107h;
            } else {
                if (iM0 != -1) {
                    fVar3.f54076l.add(this.f54101b.f53652N.f53673e.f54108i);
                    this.f54101b.f53652N.f53673e.f54108i.f54075k.add(this.f54107h);
                    fVar2 = this.f54107h;
                    iL0 = -iM0;
                } else {
                    fVar3.f54066b = true;
                    fVar3.f54076l.add(this.f54101b.f53652N.f53673e.f54108i);
                    this.f54101b.f53652N.f53673e.f54108i.f54075k.add(this.f54107h);
                }
                q(this.f54101b.f53673e.f54107h);
                mVar = this.f54101b.f53673e;
            }
            fVar2.f54070f = iL0;
            q(this.f54101b.f53673e.f54107h);
            mVar = this.f54101b.f53673e;
        } else {
            p182s1.f fVar4 = this.f54107h;
            if (iL0 != -1) {
                fVar4.f54076l.add(this.f54101b.f53652N.f53675f.f54107h);
                this.f54101b.f53652N.f53675f.f54107h.f54075k.add(this.f54107h);
                fVar = this.f54107h;
            } else {
                if (iM0 != -1) {
                    fVar4.f54076l.add(this.f54101b.f53652N.f53675f.f54108i);
                    this.f54101b.f53652N.f53675f.f54108i.f54075k.add(this.f54107h);
                    fVar = this.f54107h;
                    iL0 = -iM0;
                } else {
                    fVar4.f54066b = true;
                    fVar4.f54076l.add(this.f54101b.f53652N.f53675f.f54108i);
                    this.f54101b.f53652N.f53675f.f54108i.f54075k.add(this.f54107h);
                }
                q(this.f54101b.f53675f.f54107h);
                mVar = this.f54101b.f53675f;
            }
            fVar.f54070f = iL0;
            q(this.f54101b.f53675f.f54107h);
            mVar = this.f54101b.f53675f;
        }
        q(mVar.f54108i);
    }

    @Override // p182s1.m
    public void e() {
        if (((p172r1.h) this.f54101b).K0() == 1) {
            this.f54101b.F0(this.f54107h.f54071g);
        } else {
            this.f54101b.G0(this.f54107h.f54071g);
        }
    }

    @Override // p182s1.m
    void f() {
        this.f54107h.c();
    }

    @Override // p182s1.m
    boolean m() {
        return false;
    }
}
