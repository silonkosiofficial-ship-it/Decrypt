.class final Lo0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/l0;

    invoke-direct {v0}, Lo0/l0;-><init>()V

    sput-object v0, Lo0/l0;->a:Lo0/l0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JI)Landroid/graphics/BlendModeColorFilter;
    .locals 0

    invoke-static {}, Lo0/i0;->a()V

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-static {p3}, Lo0/F;->a(I)Landroid/graphics/BlendMode;

    move-result-object p2

    invoke-static {p1, p2}, Lo0/h0;->a(ILandroid/graphics/BlendMode;)Landroid/graphics/BlendModeColorFilter;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/graphics/BlendModeColorFilter;)Lo0/g0;
    .locals 7

    new-instance v6, Lo0/g0;

    invoke-static {p1}, Lo0/j0;->a(Landroid/graphics/BlendModeColorFilter;)I

    move-result v0

    invoke-static {v0}, Lo0/A0;->b(I)J

    move-result-wide v1

    invoke-static {p1}, Lo0/k0;->a(Landroid/graphics/BlendModeColorFilter;)Landroid/graphics/BlendMode;

    move-result-object v0

    invoke-static {v0}, Lo0/F;->b(Landroid/graphics/BlendMode;)I

    move-result v3

    const/4 v5, 0x0

    move-object v0, v6

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lo0/g0;-><init>(JILandroid/graphics/ColorFilter;Ly7/k;)V

    return-object v6
.end method
