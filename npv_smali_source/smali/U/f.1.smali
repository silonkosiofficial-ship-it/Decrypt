.class public final LU/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:F

.field private static final B:LU/z;

.field private static final C:F

.field private static final D:LU/z;

.field private static final E:LU/e;

.field private static final F:F

.field private static final G:LU/L;

.field private static final H:LU/e;

.field private static final I:LU/L;

.field private static final J:LU/e;

.field private static final K:LU/L;

.field private static final L:F

.field private static final M:F

.field private static final N:LU/L;

.field private static final O:LU/e;

.field private static final P:LU/e;

.field private static final Q:F

.field private static final R:LU/z;

.field private static final S:F

.field private static final T:LU/e;

.field public static final a:LU/f;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:F

.field private static final e:LU/z;

.field private static final f:F

.field private static final g:F

.field private static final h:LU/z;

.field private static final i:F

.field private static final j:LU/L;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:LU/z;

.field private static final o:F

.field private static final p:LU/e;

.field private static final q:F

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:F

.field private static final u:F

.field private static final v:LU/e;

.field private static final w:LU/L;

.field private static final x:LU/e;

.field private static final y:LU/L;

.field private static final z:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, LU/f;

    invoke-direct {v0}, LU/f;-><init>()V

    sput-object v0, LU/f;->a:LU/f;

    sget-object v0, LU/e;->n0:LU/e;

    sput-object v0, LU/f;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->d()F

    move-result v1

    sput v1, LU/f;->c:F

    const-wide v1, 0x4081c00000000000L    # 568.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/f;->d:F

    sget-object v1, LU/z;->C:LU/z;

    sput-object v1, LU/f;->e:LU/z;

    const-wide v1, 0x4076800000000000L    # 360.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/f;->f:F

    const-wide/high16 v2, 0x4044000000000000L    # 40.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/f;->g:F

    sget-object v3, LU/z;->G:LU/z;

    sput-object v3, LU/f;->h:LU/z;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/f;->i:F

    sget-object v4, LU/L;->C:LU/L;

    sput-object v4, LU/f;->j:LU/L;

    sget-object v5, LU/e;->b0:LU/e;

    sput-object v5, LU/f;->k:LU/e;

    sget-object v6, LU/e;->L:LU/e;

    sput-object v6, LU/f;->l:LU/e;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v7

    sput v7, LU/f;->m:F

    sput-object v3, LU/f;->n:LU/z;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v7

    sput v7, LU/f;->o:F

    sput-object v5, LU/f;->p:LU/e;

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    double-to-float v7, v7

    invoke-static {v7}, LY0/i;->q(F)F

    move-result v7

    sput v7, LU/f;->q:F

    sput-object v5, LU/f;->r:LU/e;

    sget-object v7, LU/e;->T:LU/e;

    sput-object v7, LU/f;->s:LU/e;

    const-wide/high16 v8, 0x405e000000000000L    # 120.0

    double-to-float v8, v8

    invoke-static {v8}, LY0/i;->q(F)F

    move-result v8

    sput v8, LU/f;->t:F

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/f;->u:F

    sget-object v1, LU/e;->U:LU/e;

    sput-object v1, LU/f;->v:LU/e;

    sget-object v8, LU/L;->I:LU/L;

    sput-object v8, LU/f;->w:LU/L;

    sput-object v1, LU/f;->x:LU/e;

    sget-object v8, LU/L;->L:LU/L;

    sput-object v8, LU/f;->y:LU/L;

    sget-object v8, LU/e;->h0:LU/e;

    sput-object v8, LU/f;->z:LU/e;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/f;->A:F

    sput-object v3, LU/f;->B:LU/z;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LU/f;->C:F

    sget-object v0, LU/z;->L:LU/z;

    sput-object v0, LU/f;->D:LU/z;

    sget-object v0, LU/e;->Q:LU/e;

    sput-object v0, LU/f;->E:LU/e;

    const-wide/high16 v8, 0x4060000000000000L    # 128.0

    double-to-float v0, v8

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/f;->F:F

    sget-object v0, LU/L;->O:LU/L;

    sput-object v0, LU/f;->G:LU/L;

    sput-object v1, LU/f;->H:LU/e;

    sget-object v0, LU/L;->Q:LU/L;

    sput-object v0, LU/f;->I:LU/L;

    sput-object v7, LU/f;->J:LU/e;

    sput-object v4, LU/f;->K:LU/L;

    const-wide/high16 v7, 0x4042000000000000L    # 36.0

    double-to-float v0, v7

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/f;->L:F

    const-wide/high16 v7, 0x4052000000000000L    # 72.0

    double-to-float v2, v7

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v7

    sput v7, LU/f;->M:F

    sput-object v4, LU/f;->N:LU/L;

    sput-object v5, LU/f;->O:LU/e;

    sput-object v6, LU/f;->P:LU/e;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/f;->Q:F

    sput-object v3, LU/f;->R:LU/z;

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/f;->S:F

    sput-object v1, LU/f;->T:LU/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()LU/e;
    .locals 1

    sget-object v0, LU/f;->P:LU/e;

    return-object v0
.end method

.method public final B()LU/z;
    .locals 1

    sget-object v0, LU/f;->R:LU/z;

    return-object v0
.end method

.method public final C()LU/e;
    .locals 1

    sget-object v0, LU/f;->T:LU/e;

    return-object v0
.end method

.method public final D()LU/e;
    .locals 1

    sget-object v0, LU/f;->J:LU/e;

    return-object v0
.end method

.method public final E()LU/L;
    .locals 1

    sget-object v0, LU/f;->K:LU/L;

    return-object v0
.end method

.method public final a()LU/e;
    .locals 1

    sget-object v0, LU/f;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/f;->d:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/f;->e:LU/z;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/f;->f:F

    return v0
.end method

.method public final e()LU/z;
    .locals 1

    sget-object v0, LU/f;->h:LU/z;

    return-object v0
.end method

.method public final f()LU/L;
    .locals 1

    sget-object v0, LU/f;->j:LU/L;

    return-object v0
.end method

.method public final g()LU/e;
    .locals 1

    sget-object v0, LU/f;->k:LU/e;

    return-object v0
.end method

.method public final h()LU/e;
    .locals 1

    sget-object v0, LU/f;->l:LU/e;

    return-object v0
.end method

.method public final i()F
    .locals 1

    sget v0, LU/f;->m:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, LU/f;->o:F

    return v0
.end method

.method public final k()LU/e;
    .locals 1

    sget-object v0, LU/f;->p:LU/e;

    return-object v0
.end method

.method public final l()F
    .locals 1

    sget v0, LU/f;->q:F

    return v0
.end method

.method public final m()LU/e;
    .locals 1

    sget-object v0, LU/f;->r:LU/e;

    return-object v0
.end method

.method public final n()LU/e;
    .locals 1

    sget-object v0, LU/f;->s:LU/e;

    return-object v0
.end method

.method public final o()F
    .locals 1

    sget v0, LU/f;->t:F

    return v0
.end method

.method public final p()LU/e;
    .locals 1

    sget-object v0, LU/f;->v:LU/e;

    return-object v0
.end method

.method public final q()LU/L;
    .locals 1

    sget-object v0, LU/f;->w:LU/L;

    return-object v0
.end method

.method public final r()LU/e;
    .locals 1

    sget-object v0, LU/f;->x:LU/e;

    return-object v0
.end method

.method public final s()LU/L;
    .locals 1

    sget-object v0, LU/f;->y:LU/L;

    return-object v0
.end method

.method public final t()LU/e;
    .locals 1

    sget-object v0, LU/f;->z:LU/e;

    return-object v0
.end method

.method public final u()LU/e;
    .locals 1

    sget-object v0, LU/f;->H:LU/e;

    return-object v0
.end method

.method public final v()LU/e;
    .locals 1

    sget-object v0, LU/f;->E:LU/e;

    return-object v0
.end method

.method public final w()F
    .locals 1

    sget v0, LU/f;->L:F

    return v0
.end method

.method public final x()F
    .locals 1

    sget v0, LU/f;->M:F

    return v0
.end method

.method public final y()LU/L;
    .locals 1

    sget-object v0, LU/f;->N:LU/L;

    return-object v0
.end method

.method public final z()LU/e;
    .locals 1

    sget-object v0, LU/f;->O:LU/e;

    return-object v0
.end method
