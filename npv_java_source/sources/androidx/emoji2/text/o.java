package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class o extends android.text.SpannableStringBuilder {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Class f22334C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f22335D;

    private static class a implements android.text.TextWatcher, android.text.SpanWatcher {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final java.lang.Object f22336C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicInteger f22337D = new java.util.concurrent.atomic.AtomicInteger(0);

        a(java.lang.Object obj) {
            this.f22336C = obj;
        }

        private boolean b(java.lang.Object obj) {
            return obj instanceof androidx.emoji2.text.j;
        }

        final void a() {
            this.f22337D.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            ((android.text.TextWatcher) this.f22336C).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
            ((android.text.TextWatcher) this.f22336C).beforeTextChanged(charSequence, i6, i10, i11);
        }

        final void c() {
            this.f22337D.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10) {
            if (this.f22337D.get() <= 0 || !b(obj)) {
                ((android.text.SpanWatcher) this.f22336C).onSpanAdded(spannable, obj, i6, i10);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10, int i11, int i12) {
            int i13;
            int i14;
            if (this.f22337D.get() <= 0 || !b(obj)) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    i13 = i6;
                    i14 = i11;
                } else {
                    if (i6 > i10) {
                        i6 = 0;
                    }
                    if (i11 > i12) {
                        i13 = i6;
                        i14 = 0;
                    } else {
                        i13 = i6;
                        i14 = i11;
                    }
                }
                ((android.text.SpanWatcher) this.f22336C).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i6, int i10) {
            if (this.f22337D.get() <= 0 || !b(obj)) {
                ((android.text.SpanWatcher) this.f22336C).onSpanRemoved(spannable, obj, i6, i10);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i6, int i10, int i11) {
            ((android.text.TextWatcher) this.f22336C).onTextChanged(charSequence, i6, i10, i11);
        }
    }

    o(java.lang.Class cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.f22335D = new java.util.ArrayList();
        B1.i.h(cls, "watcherClass cannot be null");
        this.f22334C = cls;
    }

    o(java.lang.Class cls, java.lang.CharSequence charSequence, int i6, int i10) {
        super(charSequence, i6, i10);
        this.f22335D = new java.util.ArrayList();
        B1.i.h(cls, "watcherClass cannot be null");
        this.f22334C = cls;
    }

    private void b() {
        for (int i6 = 0; i6 < this.f22335D.size(); i6++) {
            ((androidx.emoji2.text.o.a) this.f22335D.get(i6)).a();
        }
    }

    public static androidx.emoji2.text.o c(java.lang.Class cls, java.lang.CharSequence charSequence) {
        return new androidx.emoji2.text.o(cls, charSequence);
    }

    private void e() {
        for (int i6 = 0; i6 < this.f22335D.size(); i6++) {
            ((androidx.emoji2.text.o.a) this.f22335D.get(i6)).onTextChanged(this, 0, length(), length());
        }
    }

    private androidx.emoji2.text.o.a f(java.lang.Object obj) {
        for (int i6 = 0; i6 < this.f22335D.size(); i6++) {
            androidx.emoji2.text.o.a aVar = (androidx.emoji2.text.o.a) this.f22335D.get(i6);
            if (aVar.f22336C == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(java.lang.Class cls) {
        return this.f22334C == cls;
    }

    private boolean h(java.lang.Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i6 = 0; i6 < this.f22335D.size(); i6++) {
            ((androidx.emoji2.text.o.a) this.f22335D.get(i6)).c();
        }
    }

    public void a() {
        b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i6, int i10) {
        super.append(charSequence, i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i6) {
        super.append(charSequence, obj, i6);
        return this;
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder delete(int i6, int i10) {
        super.delete(i6, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        androidx.emoji2.text.o.a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        androidx.emoji2.text.o.a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        androidx.emoji2.text.o.a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public java.lang.Object[] getSpans(int i6, int i10, java.lang.Class cls) {
        if (!g(cls)) {
            return super.getSpans(i6, i10, cls);
        }
        androidx.emoji2.text.o.a[] aVarArr = (androidx.emoji2.text.o.a[]) super.getSpans(i6, i10, androidx.emoji2.text.o.a.class);
        java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, aVarArr.length);
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            objArr[i11] = aVarArr[i11].f22336C;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i6, java.lang.CharSequence charSequence) {
        super.insert(i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i6, java.lang.CharSequence charSequence, int i10, int i11) {
        super.insert(i6, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i6, int i10, java.lang.Class cls) {
        if (cls == null || g(cls)) {
            cls = androidx.emoji2.text.o.a.class;
        }
        return super.nextSpanTransition(i6, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        androidx.emoji2.text.o.a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f22335D.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i6, int i10, java.lang.CharSequence charSequence) {
        b();
        super.replace(i6, i10, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i6, int i10, java.lang.CharSequence charSequence, int i11, int i12) {
        b();
        super.replace(i6, i10, charSequence, i11, i12);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i6, int i10, int i11) {
        if (h(obj)) {
            androidx.emoji2.text.o.a aVar = new androidx.emoji2.text.o.a(obj);
            this.f22335D.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i6, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i6, int i10) {
        return new androidx.emoji2.text.o(this.f22334C, this, i6, i10);
    }
}
