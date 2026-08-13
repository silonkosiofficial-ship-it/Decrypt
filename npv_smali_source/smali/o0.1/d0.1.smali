.class public final Lo0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/d0;

    invoke-direct {v0}, Lo0/d0;-><init>()V

    sput-object v0, Lo0/d0;->a:Lo0/d0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/graphics/Bitmap;)Lp0/c;
    .locals 0

    .prologue
    invoke-static {p0}, Lo0/b0;->a(Landroid/graphics/Bitmap;)Landroid/graphics/ColorSpace;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lo0/J;->b(Landroid/graphics/ColorSpace;)Lp0/c;

    move-result-object p0

    if-nez p0, :cond_1

    :cond_0
    sget-object p0, Lp0/g;->a:Lp0/g;

    invoke-virtual {p0}, Lp0/g;->w()Lp0/x;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final b(IIIZLp0/c;)Landroid/graphics/Bitmap;
    .locals 6

    invoke-static {p2}, Lo0/Q;->d(I)Landroid/graphics/Bitmap$Config;

    move-result-object v3

    invoke-static {p4}, Lo0/J;->a(Lp0/c;)Landroid/graphics/ColorSpace;

    move-result-object v5

    const/4 v0, 0x0

    move v1, p0

    move v2, p1

    move v4, p3

    invoke-static/range {v0 .. v5}, Lo0/c0;->a(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;ZLandroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
