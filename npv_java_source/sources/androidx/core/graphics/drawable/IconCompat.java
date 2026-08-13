package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final android.graphics.PorterDuff.Mode f21538k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    java.lang.Object f21540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f21541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.os.Parcelable f21542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f21545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    android.graphics.PorterDuff.Mode f21546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f21547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.String f21548j;

    static class a {
        static int a(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.c.a(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (java.lang.IllegalAccessException e6) {
                return 0;
            } catch (java.lang.NoSuchMethodException e10) {
                return 0;
            } catch (java.lang.reflect.InvocationTargetException e11) {
                return 0;
            }
        }

        static java.lang.String b(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.c.b(obj);
            }
            try {
                return (java.lang.String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (java.lang.IllegalAccessException e6) {
                return null;
            } catch (java.lang.NoSuchMethodException e10) {
                return null;
            } catch (java.lang.reflect.InvocationTargetException e11) {
                return null;
            }
        }

        static int c(java.lang.Object obj) {
            java.lang.StringBuilder sb;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.c.c(obj);
            }
            try {
                return ((java.lang.Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (java.lang.IllegalAccessException e6) {
                sb = new java.lang.StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                sb.toString();
                return -1;
            } catch (java.lang.NoSuchMethodException e10) {
                sb = new java.lang.StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                sb.toString();
                return -1;
            } catch (java.lang.reflect.InvocationTargetException e11) {
                sb = new java.lang.StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                sb.toString();
                return -1;
            }
        }

        static android.net.Uri d(java.lang.Object obj) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                return androidx.core.graphics.drawable.IconCompat.c.d(obj);
            }
            try {
                return (android.net.Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (java.lang.IllegalAccessException e6) {
                return null;
            } catch (java.lang.NoSuchMethodException e10) {
                return null;
            } catch (java.lang.reflect.InvocationTargetException e11) {
                return null;
            }
        }

        static android.graphics.drawable.Drawable e(android.graphics.drawable.Icon icon, android.content.Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat iconCompat, android.content.Context context) {
            android.graphics.Bitmap bitmapA;
            android.graphics.drawable.Icon iconCreateWithResource;
            android.graphics.Bitmap bitmapDecodeStream;
            android.content.res.ColorStateList colorStateList;
            android.graphics.PorterDuff.Mode mode;
            switch (iconCompat.f21539a) {
                case -1:
                    return (android.graphics.drawable.Icon) iconCompat.f21540b;
                case 0:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown type");
                case 1:
                    bitmapA = (android.graphics.Bitmap) iconCompat.f21540b;
                    iconCreateWithResource = android.graphics.drawable.Icon.createWithBitmap(bitmapA);
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 2:
                    iconCreateWithResource = android.graphics.drawable.Icon.createWithResource(iconCompat.f(), iconCompat.f21543e);
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 3:
                    iconCreateWithResource = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.f21540b, iconCompat.f21543e, iconCompat.f21544f);
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 4:
                    iconCreateWithResource = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.f21540b);
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 5:
                    if (android.os.Build.VERSION.SDK_INT >= 26) {
                        bitmapDecodeStream = (android.graphics.Bitmap) iconCompat.f21540b;
                        iconCreateWithResource = androidx.core.graphics.drawable.IconCompat.b.b(bitmapDecodeStream);
                        colorStateList = iconCompat.f21545g;
                        if (colorStateList != null) {
                            iconCreateWithResource.setTintList(colorStateList);
                        }
                        mode = iconCompat.f21546h;
                        if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                            iconCreateWithResource.setTintMode(mode);
                        }
                        return iconCreateWithResource;
                    }
                    bitmapDecodeStream = (android.graphics.Bitmap) iconCompat.f21540b;
                    bitmapA = androidx.core.graphics.drawable.IconCompat.a(bitmapDecodeStream, false);
                    iconCreateWithResource = android.graphics.drawable.Icon.createWithBitmap(bitmapA);
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                case 6:
                    int i6 = android.os.Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        iconCreateWithResource = androidx.core.graphics.drawable.IconCompat.d.a(iconCompat.h());
                    } else {
                        if (context == null) {
                            throw new java.lang.IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                        }
                        java.io.InputStream inputStreamI = iconCompat.i(context);
                        if (inputStreamI == null) {
                            throw new java.lang.IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                        bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamI);
                        if (i6 >= 26) {
                            iconCreateWithResource = androidx.core.graphics.drawable.IconCompat.b.b(bitmapDecodeStream);
                        } else {
                            bitmapA = androidx.core.graphics.drawable.IconCompat.a(bitmapDecodeStream, false);
                            iconCreateWithResource = android.graphics.drawable.Icon.createWithBitmap(bitmapA);
                        }
                    }
                    colorStateList = iconCompat.f21545g;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = iconCompat.f21546h;
                    if (mode != androidx.core.graphics.drawable.IconCompat.f21538k) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
            }
        }
    }

    static class b {
        static android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
            return new android.graphics.drawable.AdaptiveIconDrawable(drawable, drawable2);
        }

        static android.graphics.drawable.Icon b(android.graphics.Bitmap bitmap) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResId();
        }

        static java.lang.String b(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getResPackage();
        }

        static int c(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getType();
        }

        static android.net.Uri d(java.lang.Object obj) {
            return ((android.graphics.drawable.Icon) obj).getUri();
        }
    }

    static class d {
        static android.graphics.drawable.Icon a(android.net.Uri uri) {
            return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f21539a = -1;
        this.f21541c = null;
        this.f21542d = null;
        this.f21543e = 0;
        this.f21544f = 0;
        this.f21545g = null;
        this.f21546h = f21538k;
        this.f21547i = null;
    }

    IconCompat(int i6) {
        this.f21541c = null;
        this.f21542d = null;
        this.f21543e = 0;
        this.f21544f = 0;
        this.f21545g = null;
        this.f21546h = f21538k;
        this.f21547i = null;
        this.f21539a = i6;
    }

    static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, boolean z6) {
        int iMin = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f6 = iMin;
        float f10 = 0.5f * f6;
        float f11 = 0.9166667f * f10;
        if (z6) {
            float f12 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static androidx.core.graphics.drawable.IconCompat b(android.graphics.Bitmap bitmap) {
        B1.c.c(bitmap);
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(1);
        iconCompat.f21540b = bitmap;
        return iconCompat;
    }

    public static androidx.core.graphics.drawable.IconCompat c(android.content.res.Resources resources, java.lang.String str, int i6) {
        B1.c.c(str);
        if (i6 == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f21543e = i6;
        if (resources != null) {
            try {
                iconCompat.f21540b = resources.getResourceName(i6);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f21540b = str;
        }
        iconCompat.f21548j = str;
        return iconCompat;
    }

    private static java.lang.String n(int i6) {
        switch (i6) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public android.graphics.Bitmap d() {
        int i6 = this.f21539a;
        if (i6 == -1) {
            java.lang.Object obj = this.f21540b;
            if (obj instanceof android.graphics.Bitmap) {
                return (android.graphics.Bitmap) obj;
            }
            return null;
        }
        if (i6 == 1) {
            return (android.graphics.Bitmap) this.f21540b;
        }
        if (i6 == 5) {
            return a((android.graphics.Bitmap) this.f21540b, true);
        }
        throw new java.lang.IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i6 = this.f21539a;
        if (i6 == -1) {
            return androidx.core.graphics.drawable.IconCompat.a.a(this.f21540b);
        }
        if (i6 == 2) {
            return this.f21543e;
        }
        throw new java.lang.IllegalStateException("called getResId() on " + this);
    }

    public java.lang.String f() {
        int i6 = this.f21539a;
        if (i6 == -1) {
            return androidx.core.graphics.drawable.IconCompat.a.b(this.f21540b);
        }
        if (i6 == 2) {
            java.lang.String str = this.f21548j;
            return (str == null || android.text.TextUtils.isEmpty(str)) ? ((java.lang.String) this.f21540b).split(":", -1)[0] : this.f21548j;
        }
        throw new java.lang.IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i6 = this.f21539a;
        return i6 == -1 ? androidx.core.graphics.drawable.IconCompat.a.c(this.f21540b) : i6;
    }

    public android.net.Uri h() {
        int i6 = this.f21539a;
        if (i6 == -1) {
            return androidx.core.graphics.drawable.IconCompat.a.d(this.f21540b);
        }
        if (i6 == 4 || i6 == 6) {
            return android.net.Uri.parse((java.lang.String) this.f21540b);
        }
        throw new java.lang.IllegalStateException("called getUri() on " + this);
    }

    public java.io.InputStream i(android.content.Context context) {
        java.lang.StringBuilder sb;
        java.lang.String str;
        android.net.Uri uriH = h();
        java.lang.String scheme = uriH.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriH);
            } catch (java.lang.Exception e6) {
                sb = new java.lang.StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new java.io.FileInputStream(new java.io.File((java.lang.String) this.f21540b));
            } catch (java.io.FileNotFoundException e10) {
                sb = new java.lang.StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriH);
        sb.toString();
        return null;
    }

    public void j() {
        android.os.Parcelable parcelable;
        this.f21546h = android.graphics.PorterDuff.Mode.valueOf(this.f21547i);
        switch (this.f21539a) {
            case -1:
                parcelable = this.f21542d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f21542d;
                if (parcelable == null) {
                    byte[] bArr = this.f21541c;
                    this.f21540b = bArr;
                    this.f21539a = 3;
                    this.f21543e = 0;
                    this.f21544f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                java.lang.String str = new java.lang.String(this.f21541c, java.nio.charset.Charset.forName("UTF-16"));
                this.f21540b = str;
                if (this.f21539a == 2 && this.f21548j == null) {
                    this.f21548j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f21540b = this.f21541c;
                return;
        }
        this.f21540b = parcelable;
    }

    public void k(boolean z6) {
        this.f21547i = this.f21546h.name();
        switch (this.f21539a) {
            case -1:
                if (z6) {
                    throw new java.lang.IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z6) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f21540b;
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f21541c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f21541c = ((java.lang.String) this.f21540b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
            case 3:
                this.f21541c = (byte[]) this.f21540b;
                return;
            case 4:
            case 6:
                this.f21541c = this.f21540b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                return;
        }
        this.f21542d = (android.os.Parcelable) this.f21540b;
    }

    public android.graphics.drawable.Icon l() {
        return m(null);
    }

    public android.graphics.drawable.Icon m(android.content.Context context) {
        return androidx.core.graphics.drawable.IconCompat.a.f(this, context);
    }

    public java.lang.String toString() {
        int height;
        if (this.f21539a == -1) {
            return java.lang.String.valueOf(this.f21540b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Icon(typ=");
        sb.append(n(this.f21539a));
        switch (this.f21539a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((android.graphics.Bitmap) this.f21540b).getWidth());
                sb.append("x");
                height = ((android.graphics.Bitmap) this.f21540b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f21548j);
                sb.append(" id=");
                sb.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f21543e);
                if (this.f21544f != 0) {
                    sb.append(" off=");
                    height = this.f21544f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f21540b);
                break;
        }
        if (this.f21545g != null) {
            sb.append(" tint=");
            sb.append(this.f21545g);
        }
        if (this.f21546h != f21538k) {
            sb.append(" mode=");
            sb.append(this.f21546h);
        }
        sb.append(")");
        return sb.toString();
    }
}
