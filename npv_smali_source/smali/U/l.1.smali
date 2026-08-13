.class public final LU/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/l;

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

    new-instance v0, LU/l;

    invoke-direct {v0}, LU/l;-><init>()V

    sput-object v0, LU/l;->a:LU/l;

    sget-object v0, LU/e;->o0:LU/e;

    sput-object v0, LU/l;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/l;->c:F

    sget-object v1, LU/z;->K:LU/z;

    sput-object v1, LU/l;->d:LU/z;

    sget-object v1, LU/e;->t0:LU/e;

    sput-object v1, LU/l;->e:LU/e;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/l;->f:F

    const v1, 0x3ec28f5c    # 0.38f

    sput v1, LU/l;->g:F

    invoke-virtual {v0}, LU/j;->d()F

    move-result v1

    sput v1, LU/l;->h:F

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/l;->i:F

    sget-object v1, LU/e;->g0:LU/e;

    sput-object v1, LU/l;->j:LU/e;

    invoke-virtual {v0}, LU/j;->b()F

    move-result v1

    sput v1, LU/l;->k:F

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/l;->l:LU/e;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/l;->m:F

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LU/l;->n:F

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

    sget-object v0, LU/l;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/l;->c:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/l;->d:LU/z;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/l;->e:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/l;->f:F

    return v0
.end method

.method public final f()F
    .locals 1

    sget v0, LU/l;->g:F

    return v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/l;->h:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/l;->i:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, LU/l;->k:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, LU/l;->n:F

    return v0
.end method
