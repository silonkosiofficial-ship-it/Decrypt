package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        static int a(android.content.res.TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    public interface b {
    }

    public static final class c implements androidx.core.content.res.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.content.res.e.d[] f21501a;

        public c(androidx.core.content.res.e.d[] dVarArr) {
            this.f21501a = dVarArr;
        }

        public androidx.core.content.res.e.d[] a() {
            return this.f21501a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.String f21502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.String f21505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f21506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f21507f;

        public d(java.lang.String str, int i6, boolean z6, java.lang.String str2, int i10, int i11) {
            this.f21502a = str;
            this.f21503b = i6;
            this.f21504c = z6;
            this.f21505d = str2;
            this.f21506e = i10;
            this.f21507f = i11;
        }

        public java.lang.String a() {
            return this.f21502a;
        }

        public int b() {
            return this.f21507f;
        }

        public int c() {
            return this.f21506e;
        }

        public java.lang.String d() {
            return this.f21505d;
        }

        public int e() {
            return this.f21503b;
        }

        public boolean f() {
            return this.f21504c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.e$e, reason: collision with other inner class name */
    public static final class C0405e implements androidx.core.content.res.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p242y1.f f21508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final java.lang.String f21511d;

        public C0405e(p242y1.f fVar, int i6, int i10, java.lang.String str) {
            this.f21508a = fVar;
            this.f21510c = i6;
            this.f21509b = i10;
            this.f21511d = str;
        }

        public int a() {
            return this.f21510c;
        }

        public p242y1.f b() {
            return this.f21508a;
        }

        public java.lang.String c() {
            return this.f21511d;
        }

        public int d() {
            return this.f21509b;
        }
    }

    private static int a(android.content.res.TypedArray typedArray, int i6) {
        return androidx.core.content.res.e.a.a(typedArray, i6);
    }

    public static androidx.core.content.res.e.b b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }

    public static java.util.List c(android.content.res.Resources resources, int i6) {
        if (i6 == 0) {
            return java.util.Collections.emptyList();
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i10 = 0; i10 < typedArrayObtainTypedArray.length(); i10++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i6)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static androidx.core.content.res.e.b d(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static androidx.core.content.res.e.b e(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), p202u1.d.f55440h);
        java.lang.String string = typedArrayObtainAttributes.getString(p202u1.d.f55441i);
        java.lang.String string2 = typedArrayObtainAttributes.getString(p202u1.d.f55445m);
        java.lang.String string3 = typedArrayObtainAttributes.getString(p202u1.d.f55446n);
        int resourceId = typedArrayObtainAttributes.getResourceId(p202u1.d.f55442j, 0);
        int integer = typedArrayObtainAttributes.getInteger(p202u1.d.f55443k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(p202u1.d.f55444l, 500);
        java.lang.String string4 = typedArrayObtainAttributes.getString(p202u1.d.f55447o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new androidx.core.content.res.e.C0405e(new p242y1.f(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.core.content.res.e.c((androidx.core.content.res.e.d[]) arrayList.toArray(new androidx.core.content.res.e.d[0]));
    }

    private static androidx.core.content.res.e.d f(org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources resources) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), p202u1.d.f55448p);
        int i6 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(p202u1.d.f55457y) ? p202u1.d.f55457y : p202u1.d.f55450r, 400);
        boolean z6 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(p202u1.d.f55455w) ? p202u1.d.f55455w : p202u1.d.f55451s, 0);
        int i10 = typedArrayObtainAttributes.hasValue(p202u1.d.f55458z) ? p202u1.d.f55458z : p202u1.d.f55452t;
        java.lang.String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(p202u1.d.f55456x) ? p202u1.d.f55456x : p202u1.d.f55453u);
        int i11 = typedArrayObtainAttributes.getInt(i10, 0);
        int i12 = typedArrayObtainAttributes.hasValue(p202u1.d.f55454v) ? p202u1.d.f55454v : p202u1.d.f55449q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i12, 0);
        java.lang.String string2 = typedArrayObtainAttributes.getString(i12);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new androidx.core.content.res.e.d(string2, i6, z6, string, i11, resourceId);
    }

    private static void g(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }

    private static java.util.List h(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }
}
