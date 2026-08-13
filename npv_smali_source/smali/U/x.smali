.class public final LU/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/x;

.field private static final b:LU/e;

.field private static final c:LU/z;

.field private static final d:F

.field private static final e:F

.field private static final f:LU/e;

.field private static final g:F

.field private static final h:F

.field private static final i:LU/e;

.field private static final j:LU/z;

.field private static final k:F

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LU/x;

    invoke-direct {v0}, LU/x;-><init>()V

    sput-object v0, LU/x;->a:LU/x;

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/x;->b:LU/e;

    sget-object v1, LU/z;->G:LU/z;

    sput-object v1, LU/x;->c:LU/z;

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/x;->d:F

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/x;->e:F

    sput-object v0, LU/x;->f:LU/e;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/x;->g:F

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/x;->h:F

    sget-object v0, LU/e;->h0:LU/e;

    sput-object v0, LU/x;->i:LU/e;

    sput-object v1, LU/x;->j:LU/z;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/x;->k:F

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/x;->l:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LU/e;
    .locals 1

    sget-object v0, LU/x;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/x;->e:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, LU/x;->l:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/x;->h:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/x;->k:F

    return v0
.end method
