package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.emoji2.text.f.j f22289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.emoji2.text.n f22290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.f.e f22291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f22293e;

    private static final class a {
        static int a(java.lang.CharSequence charSequence, int i6, int i10) {
            int length = charSequence.length();
            if (i6 < 0 || length < i6 || i10 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i10 != 0) {
                    i6--;
                    if (i6 < 0) {
                        return z6 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i6);
                    if (z6) {
                        if (!java.lang.Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10--;
                    } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                        i10--;
                    } else {
                        if (java.lang.Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z6 = true;
                    }
                }
                return i6;
            }
        }

        static int b(java.lang.CharSequence charSequence, int i6, int i10) {
            int length = charSequence.length();
            if (i6 < 0 || length < i6 || i10 < 0) {
                return -1;
            }
            while (true) {
                boolean z6 = false;
                while (i10 != 0) {
                    if (i6 >= length) {
                        if (z6) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i6);
                    if (z6) {
                        if (!java.lang.Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10--;
                        i6++;
                    } else if (!java.lang.Character.isSurrogate(cCharAt)) {
                        i10--;
                        i6++;
                    } else {
                        if (java.lang.Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i6++;
                        z6 = true;
                    }
                }
                return i6;
            }
        }
    }

    private static class b implements androidx.emoji2.text.i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.emoji2.text.t f22294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.f.j f22295b;

        b(androidx.emoji2.text.t tVar, androidx.emoji2.text.f.j jVar) {
            this.f22294a = tVar;
            this.f22295b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(java.lang.CharSequence charSequence, int i6, int i10, androidx.emoji2.text.p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f22294a == null) {
                this.f22294a = new androidx.emoji2.text.t(charSequence instanceof android.text.Spannable ? (android.text.Spannable) charSequence : new android.text.SpannableString(charSequence));
            }
            this.f22294a.setSpan(this.f22295b.a(pVar), i6, i10, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.emoji2.text.t a() {
            return this.f22294a;
        }
    }

    private interface c {
        java.lang.Object a();

        boolean b(java.lang.CharSequence charSequence, int i6, int i10, androidx.emoji2.text.p pVar);
    }

    private static class d implements androidx.emoji2.text.i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22297b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22298c = -1;

        d(int i6) {
            this.f22296a = i6;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(java.lang.CharSequence charSequence, int i6, int i10, androidx.emoji2.text.p pVar) {
            int i11 = this.f22296a;
            if (i6 > i11 || i11 >= i10) {
                return i10 <= i11;
            }
            this.f22297b = i6;
            this.f22298c = i10;
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.emoji2.text.i.d a() {
            return this;
        }
    }

    private static class e implements androidx.emoji2.text.i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f22299a;

        e(java.lang.String str) {
            this.f22299a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(java.lang.CharSequence charSequence, int i6, int i10, androidx.emoji2.text.p pVar) {
            if (!android.text.TextUtils.equals(charSequence.subSequence(i6, i10), this.f22299a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public androidx.emoji2.text.i.e a() {
            return this;
        }
    }

    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22300a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.n.a f22301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.emoji2.text.n.a f22302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.emoji2.text.n.a f22303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f22304e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22305f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f22306g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f22307h;

        f(androidx.emoji2.text.n.a aVar, boolean z6, int[] iArr) {
            this.f22301b = aVar;
            this.f22302c = aVar;
            this.f22306g = z6;
            this.f22307h = iArr;
        }

        private static boolean d(int i6) {
            return i6 == 65039;
        }

        private static boolean f(int i6) {
            return i6 == 65038;
        }

        private int g() {
            this.f22300a = 1;
            this.f22302c = this.f22301b;
            this.f22305f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f22302c.b().j() || d(this.f22304e)) {
                return true;
            }
            if (this.f22306g) {
                if (this.f22307h == null) {
                    return true;
                }
                if (java.util.Arrays.binarySearch(this.f22307h, this.f22302c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000e  */
        int a(int i6) {
            androidx.emoji2.text.n.a aVarA = this.f22302c.a(i6);
            int iG = 2;
            if (this.f22300a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f22300a = 2;
                    this.f22302c = aVarA;
                    this.f22305f = 1;
                }
            } else if (aVarA != null) {
                this.f22302c = aVarA;
                this.f22305f++;
            } else if (f(i6)) {
                iG = g();
            } else if (!d(i6)) {
                if (this.f22302c.b() != null) {
                    iG = 3;
                    if (this.f22305f != 1 || h()) {
                        this.f22303d = this.f22302c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f22304e = i6;
            return iG;
        }

        androidx.emoji2.text.p b() {
            return this.f22302c.b();
        }

        androidx.emoji2.text.p c() {
            return this.f22303d.b();
        }

        boolean e() {
            return this.f22300a == 2 && this.f22302c.b() != null && (this.f22305f > 1 || h());
        }
    }

    i(androidx.emoji2.text.n nVar, androidx.emoji2.text.f.j jVar, androidx.emoji2.text.f.e eVar, boolean z6, int[] iArr, java.util.Set set) {
        this.f22289a = jVar;
        this.f22290b = nVar;
        this.f22291c = eVar;
        this.f22292d = z6;
        this.f22293e = iArr;
        i(set);
    }

    private static boolean a(android.text.Editable editable, android.view.KeyEvent keyEvent, boolean z6) {
        androidx.emoji2.text.j[] jVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (jVarArr = (androidx.emoji2.text.j[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.j.class)) != null && jVarArr.length > 0) {
            for (androidx.emoji2.text.j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z6 && spanStart == selectionStart) || ((!z6 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean d(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i6, int i10, boolean z6) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i6 >= 0 && i10 >= 0) {
            int selectionStart = android.text.Selection.getSelectionStart(editable);
            int selectionEnd = android.text.Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z6) {
                iMax = androidx.emoji2.text.i.a.a(editable, selectionStart, java.lang.Math.max(i6, 0));
                iMin = androidx.emoji2.text.i.a.b(editable, selectionEnd, java.lang.Math.max(i10, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = java.lang.Math.max(selectionStart - i6, 0);
                iMin = java.lang.Math.min(selectionEnd + i10, editable.length());
            }
            androidx.emoji2.text.j[] jVarArr = (androidx.emoji2.text.j[]) editable.getSpans(iMax, iMin, androidx.emoji2.text.j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (androidx.emoji2.text.j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = java.lang.Math.min(spanStart, iMax);
                    iMin = java.lang.Math.max(spanEnd, iMin);
                }
                int iMax2 = java.lang.Math.max(iMax, 0);
                int iMin2 = java.lang.Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean e(android.text.Editable editable, int i6, android.view.KeyEvent keyEvent) {
        boolean zA;
        if (i6 != 67) {
            zA = i6 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(java.lang.CharSequence charSequence, int i6, int i10, androidx.emoji2.text.p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f22291c.a(charSequence, i6, i10, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean g(int i6, int i10) {
        return i6 == -1 || i10 == -1 || i6 != i10;
    }

    private static boolean h(android.view.KeyEvent keyEvent) {
        return !android.view.KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(java.util.Set set) {
        if (set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            java.lang.String str = new java.lang.String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new androidx.emoji2.text.i.e(str));
        }
    }

    private java.lang.Object k(java.lang.CharSequence charSequence, int i6, int i10, int i11, boolean z6, androidx.emoji2.text.i.c cVar) {
        int iCharCount;
        androidx.emoji2.text.i.f fVar = new androidx.emoji2.text.i.f(this.f22290b.f(), this.f22292d, this.f22293e);
        int i12 = 0;
        boolean zB = true;
        int iCodePointAt = java.lang.Character.codePointAt(charSequence, i6);
        loop0: while (true) {
            iCharCount = i6;
            while (true) {
                if (i6 >= i10 || i12 >= i11 || !zB) {
                    break loop0;
                }
                int iA = fVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += java.lang.Character.charCount(java.lang.Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i10) {
                        iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
                    }
                    i6 = iCharCount;
                } else if (iA == 2) {
                    i6 += java.lang.Character.charCount(iCodePointAt);
                    if (i6 < i10) {
                        iCodePointAt = java.lang.Character.codePointAt(charSequence, i6);
                    }
                } else if (iA != 3) {
                }
            }
            if (z6 || !f(charSequence, iCharCount, i6, fVar.c())) {
                zB = cVar.b(charSequence, iCharCount, i6, fVar.c());
                i12++;
            }
        }
        if (fVar.e() && i12 < i11 && zB && (z6 || !f(charSequence, iCharCount, i6, fVar.b()))) {
            cVar.b(charSequence, iCharCount, i6, fVar.b());
        }
        return cVar.a();
    }

    int b(java.lang.CharSequence charSequence, int i6) {
        if (i6 < 0 || i6 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            androidx.emoji2.text.j[] jVarArr = (androidx.emoji2.text.j[]) spanned.getSpans(i6, i6 + 1, androidx.emoji2.text.j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanEnd(jVarArr[0]);
            }
        }
        return ((androidx.emoji2.text.i.d) k(charSequence, java.lang.Math.max(0, i6 - 16), java.lang.Math.min(charSequence.length(), i6 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.i.d(i6))).f22298c;
    }

    int c(java.lang.CharSequence charSequence, int i6) {
        if (i6 < 0 || i6 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            androidx.emoji2.text.j[] jVarArr = (androidx.emoji2.text.j[]) spanned.getSpans(i6, i6 + 1, androidx.emoji2.text.j.class);
            if (jVarArr.length > 0) {
                return spanned.getSpanStart(jVarArr[0]);
            }
        }
        return ((androidx.emoji2.text.i.d) k(charSequence, java.lang.Math.max(0, i6 - 16), java.lang.Math.min(charSequence.length(), i6 + 16), Integer.MAX_VALUE, true, new androidx.emoji2.text.i.d(i6))).f22297b;
    }

    java.lang.CharSequence j(java.lang.CharSequence charSequence, int i6, int i10, int i11, boolean z6) {
        androidx.emoji2.text.t tVar;
        androidx.emoji2.text.j[] jVarArr;
        boolean z10 = charSequence instanceof androidx.emoji2.text.o;
        if (z10) {
            ((androidx.emoji2.text.o) charSequence).a();
        }
        if (!z10) {
            try {
                tVar = charSequence instanceof android.text.Spannable ? new androidx.emoji2.text.t((android.text.Spannable) charSequence) : (!(charSequence instanceof android.text.Spanned) || ((android.text.Spanned) charSequence).nextSpanTransition(i6 + (-1), i10 + 1, androidx.emoji2.text.j.class) > i10) ? null : new androidx.emoji2.text.t(charSequence);
            } finally {
                if (z10) {
                    ((androidx.emoji2.text.o) charSequence).d();
                }
            }
        }
        if (tVar != null && (jVarArr = (androidx.emoji2.text.j[]) tVar.getSpans(i6, i10, androidx.emoji2.text.j.class)) != null && jVarArr.length > 0) {
            for (androidx.emoji2.text.j jVar : jVarArr) {
                int spanStart = tVar.getSpanStart(jVar);
                int spanEnd = tVar.getSpanEnd(jVar);
                if (spanStart != i10) {
                    tVar.removeSpan(jVar);
                }
                i6 = java.lang.Math.min(spanStart, i6);
                i10 = java.lang.Math.max(spanEnd, i10);
            }
        }
        int i12 = i10;
        if (i6 != i12 && i6 < charSequence.length()) {
            if (i11 != Integer.MAX_VALUE && tVar != null) {
                i11 -= ((androidx.emoji2.text.j[]) tVar.getSpans(0, tVar.length(), androidx.emoji2.text.j.class)).length;
            }
            androidx.emoji2.text.t tVar2 = (androidx.emoji2.text.t) k(charSequence, i6, i12, i11, z6, new androidx.emoji2.text.i.b(tVar, this.f22289a));
            return tVar2 != null ? tVar2.b() : charSequence;
        }
        return charSequence;
    }
}
