package p253z2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p253z2.g {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final p253z2.a.C0764a f57635E = new p253z2.a.C0764a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f57636C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object[] f57637D;

    /* JADX INFO: renamed from: z2.a$a, reason: collision with other inner class name */
    public static final class C0764a {
        private C0764a() {
        }

        public /* synthetic */ C0764a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        private final void a(p253z2.f fVar, int i6, java.lang.Object obj) {
            long jLongValue;
            int iByteValue;
            double dDoubleValue;
            if (obj == null) {
                fVar.M0(i6);
                return;
            }
            if (obj instanceof byte[]) {
                fVar.p0(i6, (byte[]) obj);
                return;
            }
            if (obj instanceof java.lang.Float) {
                dDoubleValue = ((java.lang.Number) obj).floatValue();
            } else {
                if (!(obj instanceof java.lang.Double)) {
                    if (obj instanceof java.lang.Long) {
                        jLongValue = ((java.lang.Number) obj).longValue();
                    } else {
                        if (obj instanceof java.lang.Integer) {
                            iByteValue = ((java.lang.Number) obj).intValue();
                        } else if (obj instanceof java.lang.Short) {
                            iByteValue = ((java.lang.Number) obj).shortValue();
                        } else if (obj instanceof java.lang.Byte) {
                            iByteValue = ((java.lang.Number) obj).byteValue();
                        } else {
                            if (obj instanceof java.lang.String) {
                                fVar.C(i6, (java.lang.String) obj);
                                return;
                            }
                            if (!(obj instanceof java.lang.Boolean)) {
                                throw new java.lang.IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            jLongValue = ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        jLongValue = iByteValue;
                    }
                    fVar.l(i6, jLongValue);
                    return;
                }
                dDoubleValue = ((java.lang.Number) obj).doubleValue();
            }
            fVar.P(i6, dDoubleValue);
        }

        public final void b(p253z2.f fVar, java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(fVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i6 = 0;
            while (i6 < length) {
                java.lang.Object obj = objArr[i6];
                i6++;
                a(fVar, i6, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str) {
        this(str, null);
        p247y7.AbstractC7350t.f(str, "query");
    }

    public a(java.lang.String str, java.lang.Object[] objArr) {
        p247y7.AbstractC7350t.f(str, "query");
        this.f57636C = str;
        this.f57637D = objArr;
    }

    @Override // p253z2.g
    public java.lang.String a() {
        return this.f57636C;
    }

    @Override // p253z2.g
    public void f(p253z2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "statement");
        f57635E.b(fVar, this.f57637D);
    }
}
