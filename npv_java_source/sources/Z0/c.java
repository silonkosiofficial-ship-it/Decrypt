package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Z0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0.c.a f16665c = new Z0.c.a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16666d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f16667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f16668b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float b(float f6, float[] fArr, float[] fArr2) {
            float f10;
            float f11;
            float f12;
            float fA;
            float fAbs = java.lang.Math.abs(f6);
            float fSignum = java.lang.Math.signum(f6);
            int iBinarySearch = java.util.Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fA = fArr2[iBinarySearch];
            } else {
                int i6 = -(iBinarySearch + 1);
                int i10 = i6 - 1;
                float f13 = 0.0f;
                if (i10 >= fArr.length - 1) {
                    float f14 = fArr[fArr.length - 1];
                    float f15 = fArr2[fArr.length - 1];
                    if (f14 == 0.0f) {
                        return 0.0f;
                    }
                    return f6 * (f15 / f14);
                }
                if (i10 == -1) {
                    float f16 = fArr[0];
                    f12 = fArr2[0];
                    f11 = f16;
                    f10 = 0.0f;
                } else {
                    float f17 = fArr[i10];
                    float f18 = fArr[i6];
                    f10 = fArr2[i10];
                    f13 = f17;
                    f11 = f18;
                    f12 = fArr2[i6];
                }
                fA = Z0.d.f16669a.a(f10, f12, f13, f11, fAbs);
            }
            return fSignum * fA;
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.f16667a = fArr;
        this.f16668b = fArr2;
    }

    @Override // Z0.a
    public float a(float f6) {
        return f16665c.b(f6, this.f16668b, this.f16667a);
    }

    @Override // Z0.a
    public float b(float f6) {
        return f16665c.b(f6, this.f16667a, this.f16668b);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z0.c)) {
            return false;
        }
        Z0.c cVar = (Z0.c) obj;
        return java.util.Arrays.equals(this.f16667a, cVar.f16667a) && java.util.Arrays.equals(this.f16668b, cVar.f16668b);
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.f16667a) * 31) + java.util.Arrays.hashCode(this.f16668b);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        java.lang.String string = java.util.Arrays.toString(this.f16667a);
        p247y7.AbstractC7350t.e(string, "toString(this)");
        sb.append(string);
        sb.append(", toDpValues=");
        java.lang.String string2 = java.util.Arrays.toString(this.f16668b);
        p247y7.AbstractC7350t.e(string2, "toString(this)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
