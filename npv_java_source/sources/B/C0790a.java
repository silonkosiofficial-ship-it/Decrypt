package B;

/* JADX INFO: renamed from: B.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0790a implements B.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f345b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.compose.foundation.lazy.layout.d.b f346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f347d;

    public C0790a(int i6) {
        this.f344a = i6;
    }

    @Override // B.x
    public void a(D.K k6, int i6) {
        int i10 = this.f344a;
        for (int i11 = 0; i11 < i10; i11++) {
            k6.a(i6 + i11);
        }
    }

    @Override // B.x
    public /* synthetic */ D.P b() {
        return B.w.a(this);
    }

    @Override // B.x
    public void c(B.v vVar, B.q qVar) {
        if (this.f345b == -1 || !(!qVar.j().isEmpty())) {
            return;
        }
        if (this.f345b != (this.f347d ? ((B.l) p097j7.AbstractC6879v.t0(qVar.j())).getIndex() + 1 : ((B.l) p097j7.AbstractC6879v.i0(qVar.j())).getIndex() - 1)) {
            this.f345b = -1;
            androidx.compose.foundation.lazy.layout.d.b bVar = this.f346c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f346c = null;
        }
    }

    @Override // B.x
    public void d(B.v vVar, float f6, B.q qVar) {
        androidx.compose.foundation.lazy.layout.d.b bVar;
        androidx.compose.foundation.lazy.layout.d.b bVar2;
        if (!qVar.j().isEmpty()) {
            boolean z6 = f6 < 0.0f;
            java.util.List listJ = qVar.j();
            int index = z6 ? ((B.l) p097j7.AbstractC6879v.t0(listJ)).getIndex() + 1 : ((B.l) p097j7.AbstractC6879v.i0(listJ)).getIndex() - 1;
            if (index < 0 || index >= qVar.d()) {
                return;
            }
            if (index != this.f345b) {
                if (this.f347d != z6 && (bVar2 = this.f346c) != null) {
                    bVar2.cancel();
                }
                this.f347d = z6;
                this.f345b = index;
                this.f346c = vVar.a(index);
            }
            java.util.List listJ2 = qVar.j();
            if (z6) {
                B.l lVar = (B.l) p097j7.AbstractC6879v.t0(listJ2);
                if (((lVar.c() + lVar.a()) + qVar.h()) - qVar.c() >= (-f6) || (bVar = this.f346c) == null) {
                    return;
                }
            } else if (qVar.i() - ((B.l) p097j7.AbstractC6879v.i0(listJ2)).c() >= f6 || (bVar = this.f346c) == null) {
                return;
            }
            bVar.a();
        }
    }
}
