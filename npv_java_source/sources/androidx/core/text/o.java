package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements android.text.Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.text.TextPaint f21625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final android.text.TextDirectionHeuristic f21626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final android.text.PrecomputedText.Params f21629e;

        /* JADX INFO: renamed from: androidx.core.text.o$a$a, reason: collision with other inner class name */
        public static class C0409a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final android.text.TextPaint f21630a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f21632c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f21633d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private android.text.TextDirectionHeuristic f21631b = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0409a(android.text.TextPaint textPaint) {
                this.f21630a = textPaint;
            }

            public androidx.core.text.o.a a() {
                return new androidx.core.text.o.a(this.f21630a, this.f21631b, this.f21632c, this.f21633d);
            }

            public androidx.core.text.o.a.C0409a b(int i6) {
                this.f21632c = i6;
                return this;
            }

            public androidx.core.text.o.a.C0409a c(int i6) {
                this.f21633d = i6;
                return this;
            }

            public androidx.core.text.o.a.C0409a d(android.text.TextDirectionHeuristic textDirectionHeuristic) {
                this.f21631b = textDirectionHeuristic;
                return this;
            }
        }

        public a(android.text.PrecomputedText.Params params) {
            this.f21625a = params.getTextPaint();
            this.f21626b = params.getTextDirection();
            this.f21627c = params.getBreakStrategy();
            this.f21628d = params.getHyphenationFrequency();
            this.f21629e = android.os.Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i6, int i10) {
            this.f21629e = android.os.Build.VERSION.SDK_INT >= 29 ? androidx.core.text.e.a(textPaint).setBreakStrategy(i6).setHyphenationFrequency(i10).setTextDirection(textDirectionHeuristic).build() : null;
            this.f21625a = textPaint;
            this.f21626b = textDirectionHeuristic;
            this.f21627c = i6;
            this.f21628d = i10;
        }

        public boolean a(androidx.core.text.o.a aVar) {
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (this.f21627c != aVar.b() || this.f21628d != aVar.c() || this.f21625a.getTextSize() != aVar.e().getTextSize() || this.f21625a.getTextScaleX() != aVar.e().getTextScaleX() || this.f21625a.getTextSkewX() != aVar.e().getTextSkewX() || this.f21625a.getLetterSpacing() != aVar.e().getLetterSpacing() || !android.text.TextUtils.equals(this.f21625a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f21625a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i6 >= 24) {
                if (!this.f21625a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f21625a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f21625a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f21625a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f21627c;
        }

        public int c() {
            return this.f21628d;
        }

        public android.text.TextDirectionHeuristic d() {
            return this.f21626b;
        }

        public android.text.TextPaint e() {
            return this.f21625a;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof androidx.core.text.o.a)) {
                return false;
            }
            androidx.core.text.o.a aVar = (androidx.core.text.o.a) obj;
            return a(aVar) && this.f21626b == aVar.d();
        }

        public int hashCode() {
            return android.os.Build.VERSION.SDK_INT >= 24 ? B1.c.b(java.lang.Float.valueOf(this.f21625a.getTextSize()), java.lang.Float.valueOf(this.f21625a.getTextScaleX()), java.lang.Float.valueOf(this.f21625a.getTextSkewX()), java.lang.Float.valueOf(this.f21625a.getLetterSpacing()), java.lang.Integer.valueOf(this.f21625a.getFlags()), this.f21625a.getTextLocales(), this.f21625a.getTypeface(), java.lang.Boolean.valueOf(this.f21625a.isElegantTextHeight()), this.f21626b, java.lang.Integer.valueOf(this.f21627c), java.lang.Integer.valueOf(this.f21628d)) : B1.c.b(java.lang.Float.valueOf(this.f21625a.getTextSize()), java.lang.Float.valueOf(this.f21625a.getTextScaleX()), java.lang.Float.valueOf(this.f21625a.getTextSkewX()), java.lang.Float.valueOf(this.f21625a.getLetterSpacing()), java.lang.Integer.valueOf(this.f21625a.getFlags()), this.f21625a.getTextLocale(), this.f21625a.getTypeface(), java.lang.Boolean.valueOf(this.f21625a.isElegantTextHeight()), this.f21626b, java.lang.Integer.valueOf(this.f21627c), java.lang.Integer.valueOf(this.f21628d));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb;
            java.lang.Object textLocale;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("{");
            sb2.append("textSize=" + this.f21625a.getTextSize());
            sb2.append(", textScaleX=" + this.f21625a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f21625a.getTextSkewX());
            int i6 = android.os.Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f21625a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f21625a.isElegantTextHeight());
            if (i6 >= 24) {
                sb = new java.lang.StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f21625a.getTextLocales();
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(", textLocale=");
                textLocale = this.f21625a.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f21625a.getTypeface());
            if (i6 >= 26) {
                sb2.append(", variationSettings=" + this.f21625a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f21626b);
            sb2.append(", breakStrategy=" + this.f21627c);
            sb2.append(", hyphenationFrequency=" + this.f21628d);
            sb2.append("}");
            return sb2.toString();
        }
    }
}
