.class public final LU/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/k;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:F

.field private static final e:LU/z;

.field private static final f:LU/e;

.field private static final g:F

.field private static final h:LU/e;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:LU/e;

.field private static final n:LU/L;

.field private static final o:F

.field private static final p:LU/e;

.field private static final q:LU/e;

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:LU/e;

.field private static final u:F

.field private static final v:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LU/k;

    invoke-direct {v0}, LU/k;-><init>()V

    sput-object v0, LU/k;->a:LU/k;

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/k;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/k;->c:F

    const-wide/high16 v1, 0x4044000000000000L    # 40.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/k;->d:F

    sget-object v1, LU/z;->G:LU/z;

    sput-object v1, LU/k;->e:LU/z;

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/k;->f:LU/e;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v2

    sput v2, LU/k;->g:F

    sput-object v1, LU/k;->h:LU/e;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v2

    sput v2, LU/k;->i:F

    sget-object v2, LU/e;->L:LU/e;

    sput-object v2, LU/k;->j:LU/e;

    invoke-virtual {v0}, LU/j;->b()F

    move-result v3

    sput v3, LU/k;->k:F

    sput-object v2, LU/k;->l:LU/e;

    sput-object v2, LU/k;->m:LU/e;

    sget-object v3, LU/L;->L:LU/L;

    sput-object v3, LU/k;->n:LU/L;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LU/k;->o:F

    sput-object v2, LU/k;->p:LU/e;

    sput-object v1, LU/k;->q:LU/e;

    sput-object v2, LU/k;->r:LU/e;

    sput-object v2, LU/k;->s:LU/e;

    sput-object v2, LU/k;->t:LU/e;

    const-wide/high16 v0, 0x4032000000000000L    # 18.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/k;->u:F

    sput-object v2, LU/k;->v:LU/e;

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

    sget-object v0, LU/k;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/k;->c:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/k;->e:LU/z;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/k;->f:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/k;->g:F

    return v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/k;->h:LU/e;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/k;->i:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/k;->k:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, LU/k;->u:F

    return v0
.end method

.method public final j()LU/e;
    .locals 1

    sget-object v0, LU/k;->m:LU/e;

    return-object v0
.end method

.method public final k()F
    .locals 1

    sget v0, LU/k;->o:F

    return v0
.end method
