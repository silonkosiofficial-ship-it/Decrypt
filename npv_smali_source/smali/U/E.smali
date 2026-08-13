.class public final LU/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/e;

.field private static final B:LU/e;

.field private static final C:LU/e;

.field private static final D:LU/e;

.field private static final E:LU/e;

.field private static final F:LU/e;

.field private static final G:LU/e;

.field private static final H:LU/e;

.field private static final I:LU/e;

.field private static final J:F

.field private static final K:F

.field private static final L:F

.field private static final M:F

.field private static final N:LU/z;

.field private static final O:F

.field private static final P:LU/L;

.field private static final Q:LU/e;

.field private static final R:LU/e;

.field private static final S:LU/e;

.field private static final T:LU/e;

.field private static final U:LU/e;

.field private static final V:LU/e;

.field private static final W:LU/L;

.field private static final X:LU/e;

.field private static final Y:LU/e;

.field private static final Z:LU/e;

.field public static final a:LU/E;

.field private static final a0:LU/e;

.field private static final b:LU/e;

.field private static final b0:LU/e;

.field private static final c:F

.field private static final d:LU/L;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/z;

.field private static final h:F

.field private static final i:LU/e;

.field private static final j:LU/z;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:LU/z;

.field private static final o:LU/e;

.field private static final p:LU/e;

.field private static final q:F

.field private static final r:LU/z;

.field private static final s:LU/e;

.field private static final t:LU/L;

.field private static final u:LU/z;

.field private static final v:F

.field private static final w:F

.field private static final x:LU/L;

.field private static final y:LU/e;

.field private static final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LU/E;

    invoke-direct {v0}, LU/E;-><init>()V

    sput-object v0, LU/E;->a:LU/E;

    sget-object v0, LU/e;->o0:LU/e;

    sput-object v0, LU/E;->b:LU/e;

    const-wide/high16 v1, 0x4070000000000000L    # 256.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/E;->c:F

    sget-object v1, LU/L;->C:LU/L;

    sput-object v1, LU/E;->d:LU/L;

    sget-object v1, LU/e;->L:LU/e;

    sput-object v1, LU/E;->e:LU/e;

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/E;->f:LU/e;

    sget-object v2, LU/z;->G:LU/z;

    sput-object v2, LU/E;->g:LU/z;

    const-wide/high16 v3, 0x4020000000000000L    # 8.0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/E;->h:F

    sput-object v1, LU/E;->i:LU/e;

    sput-object v2, LU/E;->j:LU/z;

    const-wide/high16 v3, 0x4048000000000000L    # 48.0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/E;->k:F

    sput-object v1, LU/E;->l:LU/e;

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    double-to-float v1, v3

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/E;->m:F

    sput-object v2, LU/E;->n:LU/z;

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/E;->o:LU/e;

    sget-object v2, LU/e;->n0:LU/e;

    sput-object v2, LU/E;->p:LU/e;

    sget-object v2, LU/j;->a:LU/j;

    invoke-virtual {v2}, LU/j;->d()F

    move-result v2

    sput v2, LU/E;->q:F

    sget-object v2, LU/z;->C:LU/z;

    sput-object v2, LU/E;->r:LU/z;

    sget-object v2, LU/e;->U:LU/e;

    sput-object v2, LU/E;->s:LU/e;

    sget-object v3, LU/L;->M:LU/L;

    sput-object v3, LU/E;->t:LU/L;

    sget-object v3, LU/z;->M:LU/z;

    sput-object v3, LU/E;->u:LU/z;

    const-wide/high16 v4, 0x4043000000000000L    # 38.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->v:F

    const-wide/high16 v4, 0x406b000000000000L    # 216.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->w:F

    sget-object v4, LU/L;->P:LU/L;

    sput-object v4, LU/E;->x:LU/L;

    sget-object v4, LU/e;->Z:LU/e;

    sput-object v4, LU/E;->y:LU/e;

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->z:F

    sget-object v4, LU/e;->v0:LU/e;

    sput-object v4, LU/E;->A:LU/e;

    sget-object v4, LU/e;->W:LU/e;

    sput-object v4, LU/E;->B:LU/e;

    sput-object v4, LU/E;->C:LU/e;

    sput-object v4, LU/E;->D:LU/e;

    sput-object v4, LU/E;->E:LU/e;

    sput-object v2, LU/E;->F:LU/e;

    sput-object v2, LU/E;->G:LU/e;

    sput-object v2, LU/E;->H:LU/e;

    sput-object v2, LU/E;->I:LU/e;

    const-wide/high16 v4, 0x4054000000000000L    # 80.0

    double-to-float v2, v4

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->J:F

    const-wide/high16 v4, 0x404a000000000000L    # 52.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->K:F

    const-wide v4, 0x405c800000000000L    # 114.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/E;->L:F

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/E;->M:F

    sput-object v3, LU/E;->N:LU/z;

    const-wide/high16 v2, 0x4058000000000000L    # 96.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/E;->O:F

    sget-object v2, LU/L;->F:LU/L;

    sput-object v2, LU/E;->P:LU/L;

    sget-object v3, LU/e;->c0:LU/e;

    sput-object v3, LU/E;->Q:LU/e;

    sget-object v3, LU/e;->M:LU/e;

    sput-object v3, LU/E;->R:LU/e;

    sput-object v3, LU/E;->S:LU/e;

    sput-object v3, LU/E;->T:LU/e;

    sput-object v3, LU/E;->U:LU/e;

    sput-object v1, LU/E;->V:LU/e;

    sput-object v2, LU/E;->W:LU/L;

    sput-object v0, LU/E;->X:LU/e;

    sput-object v1, LU/E;->Y:LU/e;

    sput-object v1, LU/E;->Z:LU/e;

    sput-object v1, LU/E;->a0:LU/e;

    sput-object v1, LU/E;->b0:LU/e;

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

    sget-object v0, LU/E;->X:LU/e;

    return-object v0
.end method

.method public final B()LU/e;
    .locals 1

    sget-object v0, LU/E;->a0:LU/e;

    return-object v0
.end method

.method public final a()LU/e;
    .locals 1

    sget-object v0, LU/E;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/E;->c:F

    return v0
.end method

.method public final c()LU/L;
    .locals 1

    sget-object v0, LU/E;->d:LU/L;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/E;->e:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/E;->h:F

    return v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/E;->i:LU/e;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/E;->k:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/E;->m:F

    return v0
.end method

.method public final i()LU/e;
    .locals 1

    sget-object v0, LU/E;->o:LU/e;

    return-object v0
.end method

.method public final j()LU/e;
    .locals 1

    sget-object v0, LU/E;->p:LU/e;

    return-object v0
.end method

.method public final k()LU/z;
    .locals 1

    sget-object v0, LU/E;->u:LU/z;

    return-object v0
.end method

.method public final l()F
    .locals 1

    sget v0, LU/E;->v:F

    return v0
.end method

.method public final m()F
    .locals 1

    sget v0, LU/E;->w:F

    return v0
.end method

.method public final n()LU/e;
    .locals 1

    sget-object v0, LU/E;->y:LU/e;

    return-object v0
.end method

.method public final o()F
    .locals 1

    sget v0, LU/E;->z:F

    return v0
.end method

.method public final p()LU/e;
    .locals 1

    sget-object v0, LU/E;->A:LU/e;

    return-object v0
.end method

.method public final q()LU/e;
    .locals 1

    sget-object v0, LU/E;->D:LU/e;

    return-object v0
.end method

.method public final r()LU/e;
    .locals 1

    sget-object v0, LU/E;->H:LU/e;

    return-object v0
.end method

.method public final s()F
    .locals 1

    sget v0, LU/E;->J:F

    return v0
.end method

.method public final t()F
    .locals 1

    sget v0, LU/E;->K:F

    return v0
.end method

.method public final u()F
    .locals 1

    sget v0, LU/E;->M:F

    return v0
.end method

.method public final v()LU/z;
    .locals 1

    sget-object v0, LU/E;->N:LU/z;

    return-object v0
.end method

.method public final w()F
    .locals 1

    sget v0, LU/E;->O:F

    return v0
.end method

.method public final x()LU/L;
    .locals 1

    sget-object v0, LU/E;->P:LU/L;

    return-object v0
.end method

.method public final y()LU/e;
    .locals 1

    sget-object v0, LU/E;->Q:LU/e;

    return-object v0
.end method

.method public final z()LU/e;
    .locals 1

    sget-object v0, LU/E;->T:LU/e;

    return-object v0
.end method
