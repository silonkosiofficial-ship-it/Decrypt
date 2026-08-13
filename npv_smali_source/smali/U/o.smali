.class public final LU/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/e;

.field private static final B:LU/e;

.field private static final C:LU/L;

.field private static final D:LU/z;

.field private static final E:F

.field private static final F:LU/e;

.field private static final G:F

.field private static final H:F

.field private static final I:LU/z;

.field private static final J:F

.field private static final K:F

.field private static final L:LU/z;

.field private static final M:F

.field private static final N:F

.field private static final O:LU/e;

.field private static final P:LU/L;

.field private static final Q:LU/e;

.field private static final R:LU/e;

.field private static final S:LU/e;

.field private static final T:LU/e;

.field private static final U:F

.field private static final V:LU/e;

.field private static final W:LU/L;

.field private static final X:F

.field private static final Y:LU/e;

.field private static final Z:F

.field public static final a:LU/o;

.field private static final a0:F

.field private static final b:F

.field private static final b0:LU/e;

.field private static final c:F

.field private static final c0:LU/L;

.field private static final d:LU/e;

.field private static final d0:F

.field private static final e:LU/e;

.field private static final e0:LU/e;

.field private static final f:F

.field private static final g:LU/z;

.field private static final h:LU/e;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:F

.field private static final o:LU/e;

.field private static final p:LU/e;

.field private static final q:LU/e;

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:LU/e;

.field private static final u:LU/e;

.field private static final v:LU/e;

.field private static final w:LU/e;

.field private static final x:LU/e;

.field private static final y:LU/L;

.field private static final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LU/o;

    invoke-direct {v0}, LU/o;-><init>()V

    sput-object v0, LU/o;->a:LU/o;

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/o;->b:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/o;->c:F

    sget-object v1, LU/e;->g0:LU/e;

    sput-object v1, LU/o;->d:LU/e;

    sget-object v1, LU/e;->k0:LU/e;

    sput-object v1, LU/o;->e:LU/e;

    sget-object v1, LU/j;->a:LU/j;

    invoke-virtual {v1}, LU/j;->a()F

    move-result v2

    sput v2, LU/o;->f:F

    sget-object v2, LU/z;->L:LU/z;

    sput-object v2, LU/o;->g:LU/z;

    sget-object v3, LU/e;->T:LU/e;

    sput-object v3, LU/o;->h:LU/e;

    const v4, 0x3ec28f5c    # 0.38f

    sput v4, LU/o;->i:F

    sput-object v3, LU/o;->j:LU/e;

    sput v4, LU/o;->k:F

    sput-object v3, LU/o;->l:LU/e;

    sput v4, LU/o;->m:F

    invoke-virtual {v1}, LU/j;->e()F

    move-result v1

    sput v1, LU/o;->n:F

    sput-object v3, LU/o;->o:LU/e;

    sget-object v1, LU/e;->U:LU/e;

    sput-object v1, LU/o;->p:LU/e;

    sput-object v1, LU/o;->q:LU/e;

    sput-object v3, LU/o;->r:LU/e;

    sput-object v1, LU/o;->s:LU/e;

    sput-object v1, LU/o;->t:LU/e;

    sput-object v3, LU/o;->u:LU/e;

    sput-object v1, LU/o;->v:LU/e;

    sput-object v1, LU/o;->w:LU/e;

    sput-object v3, LU/o;->x:LU/e;

    sget-object v4, LU/L;->C:LU/L;

    sput-object v4, LU/o;->y:LU/L;

    const-wide v4, 0x4051400000000000L    # 69.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/o;->z:F

    sget-object v4, LU/e;->c0:LU/e;

    sput-object v4, LU/o;->A:LU/e;

    sget-object v4, LU/e;->M:LU/e;

    sput-object v4, LU/o;->B:LU/e;

    sget-object v4, LU/L;->P:LU/L;

    sput-object v4, LU/o;->C:LU/L;

    sget-object v4, LU/z;->G:LU/z;

    sput-object v4, LU/o;->D:LU/z;

    const-wide/high16 v4, 0x4044000000000000L    # 40.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/o;->E:F

    sput-object v1, LU/o;->F:LU/e;

    const-wide/high16 v4, 0x4038000000000000L    # 24.0

    double-to-float v4, v4

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v5

    sput v5, LU/o;->G:F

    const-wide/high16 v5, 0x404c000000000000L    # 56.0

    double-to-float v5, v5

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/o;->H:F

    sput-object v2, LU/o;->I:LU/z;

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/o;->J:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/o;->K:F

    sput-object v2, LU/o;->L:LU/z;

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    double-to-float v2, v6

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/o;->M:F

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/o;->N:F

    sput-object v1, LU/o;->O:LU/e;

    sget-object v2, LU/L;->N:LU/L;

    sput-object v2, LU/o;->P:LU/L;

    sput-object v3, LU/o;->Q:LU/e;

    sput-object v1, LU/o;->R:LU/e;

    sput-object v1, LU/o;->S:LU/e;

    sget-object v6, LU/e;->b0:LU/e;

    sput-object v6, LU/o;->T:LU/e;

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v5

    sput v5, LU/o;->U:F

    sput-object v1, LU/o;->V:LU/e;

    sget-object v5, LU/L;->D:LU/L;

    sput-object v5, LU/o;->W:LU/L;

    const-wide/high16 v5, 0x4056000000000000L    # 88.0

    double-to-float v5, v5

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v5

    sput v5, LU/o;->X:F

    sput-object v1, LU/o;->Y:LU/e;

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/o;->Z:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/o;->a0:F

    sput-object v1, LU/o;->b0:LU/e;

    sput-object v2, LU/o;->c0:LU/L;

    const-wide/high16 v0, 0x4052000000000000L    # 72.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/o;->d0:F

    sput-object v3, LU/o;->e0:LU/e;

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

    sget-object v0, LU/o;->h:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/o;->i:F

    return v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/o;->j:LU/e;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/o;->k:F

    return v0
.end method

.method public final e()LU/e;
    .locals 1

    sget-object v0, LU/o;->l:LU/e;

    return-object v0
.end method

.method public final f()F
    .locals 1

    sget v0, LU/o;->m:F

    return v0
.end method

.method public final g()LU/e;
    .locals 1

    sget-object v0, LU/o;->x:LU/e;

    return-object v0
.end method

.method public final h()LU/e;
    .locals 1

    sget-object v0, LU/o;->F:LU/e;

    return-object v0
.end method

.method public final i()F
    .locals 1

    sget v0, LU/o;->G:F

    return v0
.end method

.method public final j()LU/e;
    .locals 1

    sget-object v0, LU/o;->Y:LU/e;

    return-object v0
.end method

.method public final k()F
    .locals 1

    sget v0, LU/o;->Z:F

    return v0
.end method
