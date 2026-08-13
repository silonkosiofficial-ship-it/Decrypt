package p172r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p172r1.e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public java.util.ArrayList f53808w0 = new java.util.ArrayList();

    public abstract void K0();

    public void L0(p172r1.e eVar) {
        this.f53808w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f53808w0.clear();
    }

    @Override // p172r1.e
    public void Y() {
        this.f53808w0.clear();
        super.Y();
    }

    @Override // p172r1.e
    public void a0(p162q1.c cVar) {
        super.a0(cVar);
        int size = this.f53808w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((p172r1.e) this.f53808w0.get(i6)).a0(cVar);
        }
    }

    public void b(p172r1.e eVar) {
        this.f53808w0.add(eVar);
        if (eVar.G() != null) {
            ((p172r1.m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }
}
