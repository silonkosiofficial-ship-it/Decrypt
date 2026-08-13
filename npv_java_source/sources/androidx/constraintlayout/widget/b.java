package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.String f20837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.constraintlayout.widget.b.EnumC0398b f20838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f20840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.String f20841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f20842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20843g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20844a;

        static {
            int[] iArr = new int[androidx.constraintlayout.widget.b.EnumC0398b.values().length];
            f20844a = iArr;
            try {
                iArr[androidx.constraintlayout.widget.b.EnumC0398b.COLOR_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.INT_TYPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.FLOAT_TYPE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.STRING_TYPE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f20844a[androidx.constraintlayout.widget.b.EnumC0398b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0398b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public b(androidx.constraintlayout.widget.b bVar, java.lang.Object obj) {
        this.f20837a = bVar.f20837a;
        this.f20838b = bVar.f20838b;
        d(obj);
    }

    public b(java.lang.String str, androidx.constraintlayout.widget.b.EnumC0398b enumC0398b, java.lang.Object obj) {
        this.f20837a = str;
        this.f20838b = enumC0398b;
        d(obj);
    }

    public static java.util.HashMap a(java.util.HashMap map, android.view.View view) {
        java.util.HashMap map2 = new java.util.HashMap();
        java.lang.Class<?> cls = view.getClass();
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new androidx.constraintlayout.widget.b(bVar, java.lang.Integer.valueOf(((android.graphics.drawable.ColorDrawable) view.getBackground()).getColor())) : new androidx.constraintlayout.widget.b(bVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
            } catch (java.lang.IllegalAccessException e6) {
                e = e6;
                e.printStackTrace();
            } catch (java.lang.NoSuchMethodException e10) {
                e = e10;
                e.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e11) {
                e = e11;
                e.printStackTrace();
            }
        }
        return map2;
    }

    public static void b(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.HashMap map) {
        androidx.constraintlayout.widget.b.EnumC0398b enumC0398b;
        java.lang.Object string;
        int integer;
        float dimension;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f21064O2);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        java.lang.String string2 = null;
        java.lang.Object objValueOf = null;
        androidx.constraintlayout.widget.b.EnumC0398b enumC0398b2 = null;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i6);
            if (index == androidx.constraintlayout.widget.i.f21070P2) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = java.lang.Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == androidx.constraintlayout.widget.i.f21076Q2) {
                objValueOf = java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0398b2 = androidx.constraintlayout.widget.b.EnumC0398b.BOOLEAN_TYPE;
            } else {
                if (index == androidx.constraintlayout.widget.i.f21088S2) {
                    enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.COLOR_TYPE;
                } else if (index == androidx.constraintlayout.widget.i.f21082R2) {
                    enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == androidx.constraintlayout.widget.i.f21112W2) {
                        enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.DIMENSION_TYPE;
                        dimension = android.util.TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == androidx.constraintlayout.widget.i.f21094T2) {
                        enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == androidx.constraintlayout.widget.i.f21100U2) {
                        enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == androidx.constraintlayout.widget.i.f21106V2) {
                        enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = java.lang.Integer.valueOf(integer);
                        java.lang.Object obj = string;
                        enumC0398b2 = enumC0398b;
                        objValueOf = obj;
                    } else if (index == androidx.constraintlayout.widget.i.f21118X2) {
                        enumC0398b = androidx.constraintlayout.widget.b.EnumC0398b.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        java.lang.Object obj2 = string;
                        enumC0398b2 = enumC0398b;
                        objValueOf = obj2;
                    }
                    string = java.lang.Float.valueOf(dimension);
                    java.lang.Object obj3 = string;
                    enumC0398b2 = enumC0398b;
                    objValueOf = obj3;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = java.lang.Integer.valueOf(integer);
                java.lang.Object obj4 = string;
                enumC0398b2 = enumC0398b;
                objValueOf = obj4;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new androidx.constraintlayout.widget.b(string2, enumC0398b2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void c(android.view.View view, java.util.HashMap map) {
        java.lang.StringBuilder sb;
        java.lang.Class<?> cls = view.getClass();
        for (java.lang.String str : map.keySet()) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) map.get(str);
            java.lang.String str2 = "set" + str;
            try {
                switch (androidx.constraintlayout.widget.b.a.f20844a[bVar.f20838b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(bVar.f20843g));
                        break;
                    case 2:
                        java.lang.reflect.Method method = cls.getMethod(str2, android.graphics.drawable.Drawable.class);
                        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                        colorDrawable.setColor(bVar.f20843g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, java.lang.Integer.TYPE).invoke(view, java.lang.Integer.valueOf(bVar.f20839c));
                        break;
                    case 4:
                        cls.getMethod(str2, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(bVar.f20840d));
                        break;
                    case 5:
                        cls.getMethod(str2, java.lang.CharSequence.class).invoke(view, bVar.f20841e);
                        break;
                    case 6:
                        cls.getMethod(str2, java.lang.Boolean.TYPE).invoke(view, java.lang.Boolean.valueOf(bVar.f20842f));
                        break;
                    case 7:
                        cls.getMethod(str2, java.lang.Float.TYPE).invoke(view, java.lang.Float.valueOf(bVar.f20840d));
                        break;
                }
            } catch (java.lang.IllegalAccessException e6) {
                e = e6;
                sb = new java.lang.StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                sb.toString();
                e.printStackTrace();
            } catch (java.lang.NoSuchMethodException e10) {
                e10.getMessage();
                java.lang.String str3 = " Custom Attribute \"" + str + "\" not found on " + cls.getName();
                java.lang.String str4 = cls.getName() + " must have a method " + str2;
            } catch (java.lang.reflect.InvocationTargetException e11) {
                e = e11;
                sb = new java.lang.StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                sb.toString();
                e.printStackTrace();
            }
        }
    }

    public void d(java.lang.Object obj) {
        switch (androidx.constraintlayout.widget.b.a.f20844a[this.f20838b.ordinal()]) {
            case 1:
            case 2:
                this.f20843g = ((java.lang.Integer) obj).intValue();
                break;
            case 3:
                this.f20839c = ((java.lang.Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.f20840d = ((java.lang.Float) obj).floatValue();
                break;
            case 5:
                this.f20841e = (java.lang.String) obj;
                break;
            case 6:
                this.f20842f = ((java.lang.Boolean) obj).booleanValue();
                break;
        }
    }
}
