.class public final LU/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/j;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/j;

    invoke-direct {v0}, LU/j;-><init>()V

    sput-object v0, LU/j;->a:LU/j;

    const-wide/16 v0, 0x0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->b:F

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->c:F

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->d:F

    const-wide/high16 v0, 0x4018000000000000L    # 6.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->e:F

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->f:F

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/j;->g:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, LU/j;->b:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/j;->c:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, LU/j;->d:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/j;->e:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/j;->f:F

    return v0
.end method
