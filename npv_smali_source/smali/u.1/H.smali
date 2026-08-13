.class public abstract Lu/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/F;

.field private static final b:Lu/F;

.field private static final c:Lu/F;

.field private static final d:Lu/F;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu/z;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const v3, 0x3e4ccccd    # 0.2f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Lu/z;-><init>(FFFF)V

    sput-object v0, Lu/H;->a:Lu/F;

    new-instance v0, Lu/z;

    invoke-direct {v0, v2, v2, v3, v4}, Lu/z;-><init>(FFFF)V

    sput-object v0, Lu/H;->b:Lu/F;

    new-instance v0, Lu/z;

    invoke-direct {v0, v1, v2, v4, v4}, Lu/z;-><init>(FFFF)V

    sput-object v0, Lu/H;->c:Lu/F;

    new-instance v0, Lu/G;

    invoke-direct {v0}, Lu/G;-><init>()V

    sput-object v0, Lu/H;->d:Lu/F;

    return-void
.end method

.method public static synthetic a(F)F
    .locals 0

    invoke-static {p0}, Lu/H;->b(F)F

    move-result p0

    return p0
.end method

.method private static final b(F)F
    .locals 0

    return p0
.end method

.method public static final c()Lu/F;
    .locals 1

    sget-object v0, Lu/H;->c:Lu/F;

    return-object v0
.end method

.method public static final d()Lu/F;
    .locals 1

    sget-object v0, Lu/H;->a:Lu/F;

    return-object v0
.end method

.method public static final e()Lu/F;
    .locals 1

    sget-object v0, Lu/H;->d:Lu/F;

    return-object v0
.end method

.method public static final f()Lu/F;
    .locals 1

    sget-object v0, Lu/H;->b:Lu/F;

    return-object v0
.end method
