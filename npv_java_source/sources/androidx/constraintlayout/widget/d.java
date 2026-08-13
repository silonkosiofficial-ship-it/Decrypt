package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.constraintlayout.widget.ConstraintLayout f20861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f20862b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f20863c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private android.util.SparseArray f20864d = new android.util.SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.util.SparseArray f20865e = new android.util.SparseArray();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.ArrayList f20867b = new java.util.ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f20868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.constraintlayout.widget.e f20869d;

        public a(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.f20868c = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f21084R4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21090S4) {
                    this.f20866a = typedArrayObtainStyledAttributes.getResourceId(index, this.f20866a);
                } else if (index == androidx.constraintlayout.widget.i.f21096T4) {
                    this.f20868c = typedArrayObtainStyledAttributes.getResourceId(index, this.f20868c);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.f20868c);
                    context.getResources().getResourceName(this.f20868c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        this.f20869d = eVar;
                        eVar.e(context, this.f20868c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(androidx.constraintlayout.widget.d.b bVar) {
            this.f20867b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f20870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f20871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f20872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f20873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.constraintlayout.widget.e f20875f;

        public b(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.f20870a = Float.NaN;
            this.f20871b = Float.NaN;
            this.f20872c = Float.NaN;
            this.f20873d = Float.NaN;
            this.f20874e = -1;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f21230n5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i6);
                if (index == androidx.constraintlayout.widget.i.f21237o5) {
                    this.f20874e = typedArrayObtainStyledAttributes.getResourceId(index, this.f20874e);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.f20874e);
                    context.getResources().getResourceName(this.f20874e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        this.f20875f = eVar;
                        eVar.e(context, this.f20874e);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f21244p5) {
                    this.f20873d = typedArrayObtainStyledAttributes.getDimension(index, this.f20873d);
                } else if (index == androidx.constraintlayout.widget.i.f21251q5) {
                    this.f20871b = typedArrayObtainStyledAttributes.getDimension(index, this.f20871b);
                } else if (index == androidx.constraintlayout.widget.i.f21258r5) {
                    this.f20872c = typedArrayObtainStyledAttributes.getDimension(index, this.f20872c);
                } else if (index == androidx.constraintlayout.widget.i.f21265s5) {
                    this.f20870a = typedArrayObtainStyledAttributes.getDimension(index, this.f20870a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(android.content.Context context, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i6) {
        this.f20861a = constraintLayout;
        a(context, i6);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(android.content.Context context, int i6) {
        byte b6;
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            androidx.constraintlayout.widget.d.a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b6 = 4;
                            } else {
                                b6 = -1;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b6 = 2;
                            } else {
                                b6 = -1;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b6 = 1;
                            } else {
                                b6 = -1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b6 = 0;
                            } else {
                                b6 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b6 = 3;
                            } else {
                                b6 = -1;
                            }
                            break;
                        default:
                            b6 = -1;
                            break;
                    }
                    if (b6 != 0 && b6 != 1) {
                        if (b6 == 2) {
                            aVar = new androidx.constraintlayout.widget.d.a(context, xml);
                            this.f20864d.put(aVar.f20866a, aVar);
                        } else if (b6 == 3) {
                            androidx.constraintlayout.widget.d.b bVar = new androidx.constraintlayout.widget.d.b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b6 != 4) {
                            java.lang.String str = "unknown tag " + name;
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (java.io.IOException e6) {
            e6.printStackTrace();
        } catch (org.xmlpull.v1.XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    private void b(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i6 = 0; i6 < attributeCount; i6++) {
            if ("id".equals(xmlPullParser.getAttributeName(i6))) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i6);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = java.lang.Integer.parseInt(attributeValue.substring(1));
                }
                eVar.l(context, xmlPullParser);
                this.f20865e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(androidx.constraintlayout.widget.f fVar) {
    }
}
