package p110l;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends p110l.b {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private l.d.a f49942O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f49943P;

    static class a extends l.b.d {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int[][] f49944J;

        a(l.d.a aVar, p110l.d dVar, android.content.res.Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f49944J = aVar.f49944J;
            } else {
                this.f49944J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.f49944J;
            int iH = h();
            for (int i6 = 0; i6 < iH; i6++) {
                if (android.util.StateSet.stateSetMatches(iArr2[i6], iArr)) {
                    return i6;
                }
            }
            return -1;
        }

        @Override // l.b.d
        public void o(int i6, int i10) {
            super.o(i6, i10);
            int[][] iArr = new int[i10][];
            java.lang.System.arraycopy(this.f49944J, 0, iArr, 0, i6);
            this.f49944J = iArr;
        }

        @Override // l.b.d
        abstract void r();

        int z(int[] iArr, android.graphics.drawable.Drawable drawable) {
            int iA = a(drawable);
            this.f49944J[iA] = iArr;
            return iA;
        }
    }

    d(l.d.a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    @Override // p110l.b, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p110l.b
    void h(l.b.d dVar) {
        super.h(dVar);
        if (dVar instanceof l.d.a) {
            this.f49942O = (l.d.a) dVar;
        }
    }

    int[] j(android.util.AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i6 = 0;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i10);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i11 = i6 + 1;
                if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i6] = attributeNameResource;
                i6 = i11;
            }
        }
        return android.util.StateSet.trimStateSet(iArr, i6);
    }

    @Override // p110l.b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.f49943P && super.mutate() == this) {
            this.f49942O.r();
            this.f49943P = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
