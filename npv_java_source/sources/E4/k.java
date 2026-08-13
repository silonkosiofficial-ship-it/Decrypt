package E4;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final E4.c f2162m = new E4.i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    E4.d f2163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    E4.d f2164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    E4.d f2165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    E4.d f2166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    E4.c f2167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    E4.c f2168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    E4.c f2169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    E4.c f2170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    E4.f f2171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    E4.f f2172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    E4.f f2173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    E4.f f2174l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private E4.d f2175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private E4.d f2176b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private E4.d f2177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private E4.d f2178d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private E4.c f2179e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private E4.c f2180f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private E4.c f2181g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private E4.c f2182h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private E4.f f2183i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private E4.f f2184j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private E4.f f2185k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private E4.f f2186l;

        public b() {
            this.f2175a = E4.h.b();
            this.f2176b = E4.h.b();
            this.f2177c = E4.h.b();
            this.f2178d = E4.h.b();
            this.f2179e = new E4.a(0.0f);
            this.f2180f = new E4.a(0.0f);
            this.f2181g = new E4.a(0.0f);
            this.f2182h = new E4.a(0.0f);
            this.f2183i = E4.h.c();
            this.f2184j = E4.h.c();
            this.f2185k = E4.h.c();
            this.f2186l = E4.h.c();
        }

        public b(E4.k kVar) {
            this.f2175a = E4.h.b();
            this.f2176b = E4.h.b();
            this.f2177c = E4.h.b();
            this.f2178d = E4.h.b();
            this.f2179e = new E4.a(0.0f);
            this.f2180f = new E4.a(0.0f);
            this.f2181g = new E4.a(0.0f);
            this.f2182h = new E4.a(0.0f);
            this.f2183i = E4.h.c();
            this.f2184j = E4.h.c();
            this.f2185k = E4.h.c();
            this.f2186l = E4.h.c();
            this.f2175a = kVar.f2163a;
            this.f2176b = kVar.f2164b;
            this.f2177c = kVar.f2165c;
            this.f2178d = kVar.f2166d;
            this.f2179e = kVar.f2167e;
            this.f2180f = kVar.f2168f;
            this.f2181g = kVar.f2169g;
            this.f2182h = kVar.f2170h;
            this.f2183i = kVar.f2171i;
            this.f2184j = kVar.f2172j;
            this.f2185k = kVar.f2173k;
            this.f2186l = kVar.f2174l;
        }

        private static float n(E4.d dVar) {
            if (dVar instanceof E4.j) {
                return ((E4.j) dVar).f2161a;
            }
            if (dVar instanceof E4.e) {
                return ((E4.e) dVar).f2109a;
            }
            return -1.0f;
        }

        public E4.k.b A(float f6) {
            this.f2179e = new E4.a(f6);
            return this;
        }

        public E4.k.b B(E4.c cVar) {
            this.f2179e = cVar;
            return this;
        }

        public E4.k.b C(int i6, E4.c cVar) {
            return D(E4.h.a(i6)).F(cVar);
        }

        public E4.k.b D(E4.d dVar) {
            this.f2176b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public E4.k.b E(float f6) {
            this.f2180f = new E4.a(f6);
            return this;
        }

        public E4.k.b F(E4.c cVar) {
            this.f2180f = cVar;
            return this;
        }

        public E4.k m() {
            return new E4.k(this);
        }

        public E4.k.b o(float f6) {
            return A(f6).E(f6).w(f6).s(f6);
        }

        public E4.k.b p(E4.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public E4.k.b q(int i6, E4.c cVar) {
            return r(E4.h.a(i6)).t(cVar);
        }

        public E4.k.b r(E4.d dVar) {
            this.f2178d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public E4.k.b s(float f6) {
            this.f2182h = new E4.a(f6);
            return this;
        }

        public E4.k.b t(E4.c cVar) {
            this.f2182h = cVar;
            return this;
        }

        public E4.k.b u(int i6, E4.c cVar) {
            return v(E4.h.a(i6)).x(cVar);
        }

        public E4.k.b v(E4.d dVar) {
            this.f2177c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public E4.k.b w(float f6) {
            this.f2181g = new E4.a(f6);
            return this;
        }

        public E4.k.b x(E4.c cVar) {
            this.f2181g = cVar;
            return this;
        }

        public E4.k.b y(int i6, E4.c cVar) {
            return z(E4.h.a(i6)).B(cVar);
        }

        public E4.k.b z(E4.d dVar) {
            this.f2175a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }
    }

    public interface c {
        E4.c a(E4.c cVar);
    }

    public k() {
        this.f2163a = E4.h.b();
        this.f2164b = E4.h.b();
        this.f2165c = E4.h.b();
        this.f2166d = E4.h.b();
        this.f2167e = new E4.a(0.0f);
        this.f2168f = new E4.a(0.0f);
        this.f2169g = new E4.a(0.0f);
        this.f2170h = new E4.a(0.0f);
        this.f2171i = E4.h.c();
        this.f2172j = E4.h.c();
        this.f2173k = E4.h.c();
        this.f2174l = E4.h.c();
    }

    private k(E4.k.b bVar) {
        this.f2163a = bVar.f2175a;
        this.f2164b = bVar.f2176b;
        this.f2165c = bVar.f2177c;
        this.f2166d = bVar.f2178d;
        this.f2167e = bVar.f2179e;
        this.f2168f = bVar.f2180f;
        this.f2169g = bVar.f2181g;
        this.f2170h = bVar.f2182h;
        this.f2171i = bVar.f2183i;
        this.f2172j = bVar.f2184j;
        this.f2173k = bVar.f2185k;
        this.f2174l = bVar.f2186l;
    }

    public static E4.k.b a() {
        return new E4.k.b();
    }

    public static E4.k.b b(android.content.Context context, int i6, int i10) {
        return c(context, i6, i10, 0);
    }

    private static E4.k.b c(android.content.Context context, int i6, int i10, int i11) {
        return d(context, i6, i10, new E4.a(i11));
    }

    private static E4.k.b d(android.content.Context context, int i6, int i10, E4.c cVar) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, i6);
        if (i10 != 0) {
            contextThemeWrapper = new android.view.ContextThemeWrapper(contextThemeWrapper, i10);
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p125m4.j.f50805L4);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50813M4, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50837P4, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50845Q4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50829O4, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(p125m4.j.f50821N4, i11);
            E4.c cVarM = m(typedArrayObtainStyledAttributes, p125m4.j.f50853R4, cVar);
            E4.c cVarM2 = m(typedArrayObtainStyledAttributes, p125m4.j.f50877U4, cVarM);
            E4.c cVarM3 = m(typedArrayObtainStyledAttributes, p125m4.j.f50885V4, cVarM);
            E4.c cVarM4 = m(typedArrayObtainStyledAttributes, p125m4.j.f50869T4, cVarM);
            return new E4.k.b().y(i12, cVarM2).C(i13, cVarM3).u(i14, cVarM4).q(i15, m(typedArrayObtainStyledAttributes, p125m4.j.f50861S4, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static E4.k.b e(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        return f(context, attributeSet, i6, i10, 0);
    }

    public static E4.k.b f(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, int i11) {
        return g(context, attributeSet, i6, i10, new E4.a(i11));
    }

    public static E4.k.b g(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, E4.c cVar) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p125m4.j.f50836P3, i6, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50844Q3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(p125m4.j.f50852R3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static E4.c m(android.content.res.TypedArray typedArray, int i6, E4.c cVar) {
        android.util.TypedValue typedValuePeekValue = typedArray.peekValue(i6);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i10 = typedValuePeekValue.type;
        if (i10 == 5) {
            return new E4.a(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i10 == 6 ? new E4.i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public E4.f h() {
        return this.f2173k;
    }

    public E4.d i() {
        return this.f2166d;
    }

    public E4.c j() {
        return this.f2170h;
    }

    public E4.d k() {
        return this.f2165c;
    }

    public E4.c l() {
        return this.f2169g;
    }

    public E4.f n() {
        return this.f2174l;
    }

    public E4.f o() {
        return this.f2172j;
    }

    public E4.f p() {
        return this.f2171i;
    }

    public E4.d q() {
        return this.f2163a;
    }

    public E4.c r() {
        return this.f2167e;
    }

    public E4.d s() {
        return this.f2164b;
    }

    public E4.c t() {
        return this.f2168f;
    }

    public boolean u(android.graphics.RectF rectF) {
        boolean z6 = this.f2174l.getClass().equals(E4.f.class) && this.f2172j.getClass().equals(E4.f.class) && this.f2171i.getClass().equals(E4.f.class) && this.f2173k.getClass().equals(E4.f.class);
        float fA = this.f2167e.a(rectF);
        return z6 && ((this.f2168f.a(rectF) > fA ? 1 : (this.f2168f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2170h.a(rectF) > fA ? 1 : (this.f2170h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f2169g.a(rectF) > fA ? 1 : (this.f2169g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2164b instanceof E4.j) && (this.f2163a instanceof E4.j) && (this.f2165c instanceof E4.j) && (this.f2166d instanceof E4.j));
    }

    public E4.k.b v() {
        return new E4.k.b(this);
    }

    public E4.k w(float f6) {
        return v().o(f6).m();
    }

    public E4.k x(E4.c cVar) {
        return v().p(cVar).m();
    }

    public E4.k y(E4.k.c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
