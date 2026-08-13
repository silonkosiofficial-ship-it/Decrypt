package p141o0;

/* JADX INFO: loaded from: classes.dex */
public final class W implements p141o0.T1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.PathMeasure f52177a;

    public W(android.graphics.PathMeasure pathMeasure) {
        this.f52177a = pathMeasure;
    }

    @Override // p141o0.T1
    public float a() {
        return this.f52177a.getLength();
    }

    @Override // p141o0.T1
    public void b(p141o0.Q1 q6, boolean z6) {
        android.graphics.Path pathS;
        android.graphics.PathMeasure pathMeasure = this.f52177a;
        if (q6 == null) {
            pathS = null;
        } else {
            if (!(q6 instanceof p141o0.V)) {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathS = ((p141o0.V) q6).s();
        }
        pathMeasure.setPath(pathS, z6);
    }

    @Override // p141o0.T1
    public boolean c(float f6, float f10, p141o0.Q1 q6, boolean z6) {
        android.graphics.PathMeasure pathMeasure = this.f52177a;
        if (q6 instanceof p141o0.V) {
            return pathMeasure.getSegment(f6, f10, ((p141o0.V) q6).s(), z6);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
