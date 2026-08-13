package E7;

/* JADX INFO: loaded from: classes3.dex */
final class d implements E7.e {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float f2256C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final float f2257D;

    public d(float f6, float f10) {
        this.f2256C = f6;
        this.f2257D = f10;
    }

    @Override // E7.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Float e() {
        return java.lang.Float.valueOf(this.f2257D);
    }

    @Override // E7.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Float d() {
        return java.lang.Float.valueOf(this.f2256C);
    }

    public boolean c() {
        return this.f2256C > this.f2257D;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof E7.d) {
            if (!c() || !((E7.d) obj).c()) {
                E7.d dVar = (E7.d) obj;
                if (this.f2256C != dVar.f2256C || this.f2257D != dVar.f2257D) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (java.lang.Float.floatToIntBits(this.f2256C) * 31) + java.lang.Float.floatToIntBits(this.f2257D);
    }

    public java.lang.String toString() {
        return this.f2256C + ".." + this.f2257D;
    }
}
