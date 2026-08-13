package p141o0;

/* JADX INFO: renamed from: o0.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7017y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p141o0.C7017y1 f52279a = new p141o0.C7017y1();

    private C7017y1() {
    }

    public static final android.graphics.ColorSpace e(p151p0.c cVar) {
        android.graphics.ColorSpace.Rgb.TransferParameters transferParametersA;
        android.graphics.ColorSpace.Rgb rgbA;
        android.graphics.ColorSpace.Named named;
        p151p0.g gVar = p151p0.g.f52623a;
        if (p247y7.AbstractC7350t.b(cVar, gVar.w())) {
            named = android.graphics.ColorSpace.Named.SRGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.e())) {
            named = android.graphics.ColorSpace.Named.ACES;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.f())) {
            named = android.graphics.ColorSpace.Named.ACESCG;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.g())) {
            named = android.graphics.ColorSpace.Named.ADOBE_RGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.h())) {
            named = android.graphics.ColorSpace.Named.BT2020;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.i())) {
            named = android.graphics.ColorSpace.Named.BT709;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.j())) {
            named = android.graphics.ColorSpace.Named.CIE_LAB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.k())) {
            named = android.graphics.ColorSpace.Named.CIE_XYZ;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.m())) {
            named = android.graphics.ColorSpace.Named.DCI_P3;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.n())) {
            named = android.graphics.ColorSpace.Named.DISPLAY_P3;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.o())) {
            named = android.graphics.ColorSpace.Named.EXTENDED_SRGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.p())) {
            named = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.q())) {
            named = android.graphics.ColorSpace.Named.LINEAR_SRGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.r())) {
            named = android.graphics.ColorSpace.Named.NTSC_1953;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.u())) {
            named = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (p247y7.AbstractC7350t.b(cVar, gVar.v())) {
            named = android.graphics.ColorSpace.Named.SMPTE_C;
        } else {
            if (cVar instanceof p151p0.x) {
                p151p0.x xVar = (p151p0.x) cVar;
                float[] fArrC = xVar.N().c();
                p151p0.y yVarL = xVar.L();
                if (yVarL != null) {
                    p141o0.AbstractC6973j1.a();
                    transferParametersA = p141o0.C0.a(yVarL.a(), yVarL.b(), yVarL.c(), yVarL.d(), yVarL.e(), yVarL.f(), yVarL.g());
                } else {
                    transferParametersA = null;
                }
                p141o0.AbstractC6988o1.a();
                if (transferParametersA != null) {
                    rgbA = p141o0.N0.a(cVar.f(), xVar.K(), fArrC, transferParametersA);
                } else {
                    java.lang.String strF = cVar.f();
                    float[] fArrK = xVar.K();
                    final p237x7.l lVarH = xVar.H();
                    java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: o0.u1
                        public /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                            return j$.util.function.DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                        }

                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d6) {
                            return p141o0.C7017y1.f(lVarH, d6);
                        }

                        public /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                            return j$.util.function.DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                        }
                    };
                    final p237x7.l lVarD = xVar.D();
                    rgbA = p141o0.Y0.a(strF, fArrK, fArrC, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: o0.v1
                        public /* synthetic */ java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                            return j$.util.function.DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator2);
                        }

                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d6) {
                            return p141o0.C7017y1.g(lVarD, d6);
                        }

                        public /* synthetic */ java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
                            return j$.util.function.DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator2);
                        }
                    }, cVar.d(0), cVar.c(0));
                }
                return p141o0.M0.a(rgbA);
            }
            named = android.graphics.ColorSpace.Named.SRGB;
        }
        return android.graphics.ColorSpace.get(named);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(p237x7.l lVar, double d6) {
        return ((java.lang.Number) lVar.l(java.lang.Double.valueOf(d6))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(p237x7.l lVar, double d6) {
        return ((java.lang.Number) lVar.l(java.lang.Double.valueOf(d6))).doubleValue();
    }

    public static final p151p0.c h(final android.graphics.ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id != android.graphics.ColorSpace.Named.SRGB.ordinal()) {
            if (id == android.graphics.ColorSpace.Named.ACES.ordinal()) {
                return p151p0.g.f52623a.e();
            }
            if (id == android.graphics.ColorSpace.Named.ACESCG.ordinal()) {
                return p151p0.g.f52623a.f();
            }
            if (id == android.graphics.ColorSpace.Named.ADOBE_RGB.ordinal()) {
                return p151p0.g.f52623a.g();
            }
            if (id == android.graphics.ColorSpace.Named.BT2020.ordinal()) {
                return p151p0.g.f52623a.h();
            }
            if (id == android.graphics.ColorSpace.Named.BT709.ordinal()) {
                return p151p0.g.f52623a.i();
            }
            if (id == android.graphics.ColorSpace.Named.CIE_LAB.ordinal()) {
                return p151p0.g.f52623a.j();
            }
            if (id == android.graphics.ColorSpace.Named.CIE_XYZ.ordinal()) {
                return p151p0.g.f52623a.k();
            }
            if (id == android.graphics.ColorSpace.Named.DCI_P3.ordinal()) {
                return p151p0.g.f52623a.m();
            }
            if (id == android.graphics.ColorSpace.Named.DISPLAY_P3.ordinal()) {
                return p151p0.g.f52623a.n();
            }
            if (id == android.graphics.ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
                return p151p0.g.f52623a.o();
            }
            if (id == android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
                return p151p0.g.f52623a.p();
            }
            if (id == android.graphics.ColorSpace.Named.LINEAR_SRGB.ordinal()) {
                return p151p0.g.f52623a.q();
            }
            if (id == android.graphics.ColorSpace.Named.NTSC_1953.ordinal()) {
                return p151p0.g.f52623a.r();
            }
            if (id == android.graphics.ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
                return p151p0.g.f52623a.u();
            }
            if (id == android.graphics.ColorSpace.Named.SMPTE_C.ordinal()) {
                return p151p0.g.f52623a.v();
            }
            if (p141o0.T0.a(colorSpace)) {
                android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = p141o0.U0.a(colorSpace).getTransferParameters();
                return new p151p0.x(p141o0.U0.a(colorSpace).getName(), p141o0.U0.a(colorSpace).getPrimaries(), p141o0.U0.a(colorSpace).getWhitePoint().length == 3 ? new p151p0.z(p141o0.U0.a(colorSpace).getWhitePoint()[0], p141o0.U0.a(colorSpace).getWhitePoint()[1], p141o0.U0.a(colorSpace).getWhitePoint()[2]) : new p151p0.z(p141o0.U0.a(colorSpace).getWhitePoint()[0], p141o0.U0.a(colorSpace).getWhitePoint()[1]), p141o0.U0.a(colorSpace).getTransform(), new p151p0.j() { // from class: o0.w1
                    @Override // p151p0.j
                    public final double a(double d6) {
                        return p141o0.C7017y1.i(colorSpace, d6);
                    }
                }, new p151p0.j() { // from class: o0.x1
                    @Override // p151p0.j
                    public final double a(double d6) {
                        return p141o0.C7017y1.j(colorSpace, d6);
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new p151p0.y(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, p141o0.U0.a(colorSpace).getId());
            }
        }
        return p151p0.g.f52623a.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(android.graphics.ColorSpace colorSpace, double d6) {
        return p141o0.U0.a(colorSpace).getOetf().applyAsDouble(d6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(android.graphics.ColorSpace colorSpace, double d6) {
        return p141o0.U0.a(colorSpace).getEotf().applyAsDouble(d6);
    }
}
