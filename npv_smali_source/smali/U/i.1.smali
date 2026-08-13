.class public final LU/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/i;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:LU/z;

.field private static final e:LU/e;

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/i;

    invoke-direct {v0}, LU/i;-><init>()V

    sput-object v0, LU/i;->a:LU/i;

    sget-object v0, LU/e;->p0:LU/e;

    sput-object v0, LU/i;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->b()F

    move-result v1

    sput v1, LU/i;->c:F

    sget-object v1, LU/z;->K:LU/z;

    sput-object v1, LU/i;->d:LU/z;

    sget-object v1, LU/e;->k0:LU/e;

    sput-object v1, LU/i;->e:LU/e;

    invoke-virtual {v0}, LU/j;->b()F

    move-result v1

    sput v1, LU/i;->f:F

    const v1, 0x3ec28f5c    # 0.38f

    sput v1, LU/i;->g:F

    invoke-virtual {v0}, LU/j;->e()F

    move-result v1

    sput v1, LU/i;->h:F

    invoke-virtual {v0}, LU/j;->b()F

    move-result v1

    sput v1, LU/i;->i:F

    sget-object v1, LU/e;->g0:LU/e;

    sput-object v1, LU/i;->j:LU/e;

    invoke-virtual {v0}, LU/j;->c()F

    move-result v1

    sput v1, LU/i;->k:F

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/i;->l:LU/e;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/i;->m:F

    invoke-virtual {v0}, LU/j;->b()F

    move-result v0

    sput v0, LU/i;->n:F

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

    sget-object v0, LU/i;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/i;->c:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/i;->d:LU/z;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/i;->e:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/i;->f:F

    return v0
.end method

.method public final f()F
    .locals 1

    sget v0, LU/i;->g:F

    return v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/i;->h:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/i;->i:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, LU/i;->k:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, LU/i;->n:F

    return v0
.end method
