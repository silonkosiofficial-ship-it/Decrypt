.class public final LU/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/e;

.field private static final B:LU/L;

.field public static final a:LU/r;

.field private static final b:LU/e;

.field private static final c:LU/e;

.field private static final d:LU/e;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:F

.field private static final i:LU/z;

.field private static final j:F

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:LU/e;

.field private static final n:LU/e;

.field private static final o:F

.field private static final p:F

.field private static final q:LU/z;

.field private static final r:LU/e;

.field private static final s:F

.field private static final t:LU/e;

.field private static final u:LU/e;

.field private static final v:LU/e;

.field private static final w:LU/e;

.field private static final x:LU/e;

.field private static final y:LU/e;

.field private static final z:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LU/r;

    invoke-direct {v0}, LU/r;-><init>()V

    sput-object v0, LU/r;->a:LU/r;

    sget-object v0, LU/e;->Q:LU/e;

    sput-object v0, LU/r;->b:LU/e;

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/r;->c:LU/e;

    sput-object v0, LU/r;->d:LU/e;

    sput-object v1, LU/r;->e:LU/e;

    sput-object v0, LU/r;->f:LU/e;

    sget-object v2, LU/e;->h0:LU/e;

    sput-object v2, LU/r;->g:LU/e;

    const-wide/high16 v2, 0x4040000000000000L    # 32.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/r;->h:F

    sget-object v2, LU/z;->G:LU/z;

    sput-object v2, LU/r;->i:LU/z;

    const-wide/high16 v2, 0x4050000000000000L    # 64.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/r;->j:F

    sput-object v1, LU/r;->k:LU/e;

    sput-object v0, LU/r;->l:LU/e;

    sput-object v1, LU/r;->m:LU/e;

    sget-object v0, LU/e;->m0:LU/e;

    sput-object v0, LU/r;->n:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->c()F

    move-result v0

    sput v0, LU/r;->o:F

    const-wide/high16 v2, 0x4054000000000000L    # 80.0

    double-to-float v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/r;->p:F

    sget-object v0, LU/z;->L:LU/z;

    sput-object v0, LU/r;->q:LU/z;

    sget-object v0, LU/e;->g0:LU/e;

    sput-object v0, LU/r;->r:LU/e;

    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    double-to-float v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/r;->s:F

    sput-object v1, LU/r;->t:LU/e;

    sput-object v1, LU/r;->u:LU/e;

    sput-object v1, LU/r;->v:LU/e;

    sput-object v1, LU/r;->w:LU/e;

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/r;->x:LU/e;

    sput-object v0, LU/r;->y:LU/e;

    sput-object v1, LU/r;->z:LU/e;

    sput-object v1, LU/r;->A:LU/e;

    sget-object v0, LU/L;->M:LU/L;

    sput-object v0, LU/r;->B:LU/L;

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

    sget-object v0, LU/r;->f:LU/e;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/r;->g:LU/e;

    return-object v0
.end method

.method public final c()F
    .locals 1

    sget v0, LU/r;->h:F

    return v0
.end method

.method public final d()LU/z;
    .locals 1

    sget-object v0, LU/r;->i:LU/z;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/r;->j:F

    return v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/r;->k:LU/e;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/r;->p:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/r;->s:F

    return v0
.end method

.method public final i()LU/e;
    .locals 1

    sget-object v0, LU/r;->x:LU/e;

    return-object v0
.end method

.method public final j()LU/e;
    .locals 1

    sget-object v0, LU/r;->y:LU/e;

    return-object v0
.end method

.method public final k()LU/L;
    .locals 1

    sget-object v0, LU/r;->B:LU/L;

    return-object v0
.end method
