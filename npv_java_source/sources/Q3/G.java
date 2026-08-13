package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.util.SparseIntArray f8860a = new android.util.SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N3.C1395h f8861b;

    public G(N3.C1395h c1395h) {
        Q3.AbstractC1477p.l(c1395h);
        this.f8861b = c1395h;
    }

    public final int a(android.content.Context context, int i6) {
        return this.f8860a.get(i6, -1);
    }

    public final int b(android.content.Context context, O3.a.f fVar) {
        Q3.AbstractC1477p.l(context);
        Q3.AbstractC1477p.l(fVar);
        int i6 = 0;
        if (!fVar.k()) {
            return 0;
        }
        int iL = fVar.l();
        int iA = a(context, iL);
        if (iA == -1) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f8860a.size()) {
                    i6 = -1;
                    break;
                }
                int iKeyAt = this.f8860a.keyAt(i10);
                if (iKeyAt > iL && this.f8860a.get(iKeyAt) == 0) {
                    break;
                }
                i10++;
            }
            iA = i6 == -1 ? this.f8861b.h(context, iL) : i6;
            this.f8860a.put(iL, iA);
        }
        return iA;
    }

    public final void c() {
        this.f8860a.clear();
    }
}
