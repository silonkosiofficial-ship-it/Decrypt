.class public final LU/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/e;

.field private static final B:F

.field private static final C:LU/e;

.field private static final D:LU/e;

.field private static final E:F

.field private static final F:LU/z;

.field private static final G:F

.field private static final H:LU/e;

.field private static final I:F

.field private static final J:LU/e;

.field private static final K:F

.field private static final L:LU/e;

.field private static final M:F

.field private static final N:LU/e;

.field private static final O:LU/e;

.field private static final P:F

.field private static final Q:LU/e;

.field private static final R:F

.field private static final S:LU/e;

.field private static final T:F

.field private static final U:LU/e;

.field private static final V:F

.field private static final W:LU/e;

.field private static final X:F

.field public static final a:LU/b;

.field private static final b:F

.field private static final c:LG/f;

.field private static final d:F

.field private static final e:F

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:F

.field private static final i:LU/e;

.field private static final j:LU/e;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:LU/e;

.field private static final o:LU/e;

.field private static final p:F

.field private static final q:LU/e;

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:F

.field private static final u:LU/e;

.field private static final v:LU/e;

.field private static final w:F

.field private static final x:LU/e;

.field private static final y:LU/e;

.field private static final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LU/b;

    invoke-direct {v0}, LU/b;-><init>()V

    sput-object v0, LU/b;->a:LU/b;

    const-wide/high16 v0, 0x4032000000000000L    # 18.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/b;->b:F

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    invoke-static {v2}, LG/g;->c(F)LG/f;

    move-result-object v2

    sput-object v2, LU/b;->c:LG/f;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/b;->d:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->e:F

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/b;->f:LU/e;

    sget-object v2, LU/e;->T:LU/e;

    sput-object v2, LU/b;->g:LU/e;

    const-wide/16 v3, 0x0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v4

    sput v4, LU/b;->h:F

    sget-object v4, LU/e;->k0:LU/e;

    sput-object v4, LU/b;->i:LU/e;

    sget-object v4, LU/e;->D:LU/e;

    sput-object v4, LU/b;->j:LU/e;

    sput-object v4, LU/b;->k:LU/e;

    sget-object v5, LU/e;->J:LU/e;

    sput-object v5, LU/b;->l:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/b;->m:F

    sput-object v4, LU/b;->n:LU/e;

    sput-object v5, LU/b;->o:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/b;->p:F

    sput-object v5, LU/b;->q:LU/e;

    sput-object v4, LU/b;->r:LU/e;

    sput-object v5, LU/b;->s:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v5

    sput v5, LU/b;->t:F

    sput-object v0, LU/b;->u:LU/e;

    sget-object v5, LU/e;->L:LU/e;

    sput-object v5, LU/b;->v:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/b;->w:F

    sput-object v0, LU/b;->x:LU/e;

    sput-object v5, LU/b;->y:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/b;->z:F

    sput-object v5, LU/b;->A:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v6

    sput v6, LU/b;->B:F

    sput-object v0, LU/b;->C:LU/e;

    sput-object v5, LU/b;->D:LU/e;

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->E:F

    sget-object v0, LU/z;->G:LU/z;

    sput-object v0, LU/b;->F:LU/z;

    const-wide/high16 v5, 0x4044000000000000L    # 40.0

    double-to-float v0, v5

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->G:F

    sput-object v2, LU/b;->H:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->I:F

    sput-object v4, LU/b;->J:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->K:F

    sput-object v4, LU/b;->L:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->M:F

    sput-object v4, LU/b;->N:LU/e;

    sput-object v4, LU/b;->O:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->P:F

    sput-object v2, LU/b;->Q:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->R:F

    sput-object v2, LU/b;->S:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->T:F

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/b;->U:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->V:F

    sput-object v2, LU/b;->W:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/b;->X:F

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

    sget-object v0, LU/b;->f:LU/e;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/b;->g:LU/e;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/b;->A:LU/e;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/b;->G:F

    return v0
.end method

.method public final e()LU/e;
    .locals 1

    sget-object v0, LU/b;->H:LU/e;

    return-object v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/b;->U:LU/e;

    return-object v0
.end method
