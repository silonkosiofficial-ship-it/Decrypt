.class public final LU/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/e;

.field private static final B:LU/e;

.field private static final C:LU/e;

.field private static final D:F

.field private static final E:LU/e;

.field private static final F:LU/e;

.field private static final G:LU/L;

.field private static final H:LU/e;

.field private static final I:LU/L;

.field private static final J:LU/e;

.field private static final K:LU/L;

.field public static final a:LU/D;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:LU/z;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/L;

.field private static final h:F

.field private static final i:LU/z;

.field private static final j:F

.field private static final k:LU/L;

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:LU/e;

.field private static final o:LU/e;

.field private static final p:LU/e;

.field private static final q:LU/e;

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:LU/e;

.field private static final u:LU/e;

.field private static final v:LU/e;

.field private static final w:LU/e;

.field private static final x:F

.field private static final y:LU/z;

.field private static final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LU/D;

    invoke-direct {v0}, LU/D;-><init>()V

    sput-object v0, LU/D;->a:LU/D;

    sget-object v0, LU/e;->n0:LU/e;

    sput-object v0, LU/D;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->d()F

    move-result v0

    sput v0, LU/D;->c:F

    sget-object v0, LU/z;->C:LU/z;

    sput-object v0, LU/D;->d:LU/z;

    sget-object v0, LU/e;->g0:LU/e;

    sput-object v0, LU/D;->e:LU/e;

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/D;->f:LU/e;

    sget-object v1, LU/L;->M:LU/L;

    sput-object v1, LU/D;->g:LU/L;

    const-wide/high16 v1, 0x4052000000000000L    # 72.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/D;->h:F

    sget-object v2, LU/z;->M:LU/z;

    sput-object v2, LU/D;->i:LU/z;

    const-wide/high16 v3, 0x404a000000000000L    # 52.0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/D;->j:F

    sget-object v3, LU/L;->P:LU/L;

    sput-object v3, LU/D;->k:LU/L;

    sget-object v3, LU/e;->Z:LU/e;

    sput-object v3, LU/D;->l:LU/e;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/D;->m:F

    sget-object v3, LU/e;->v0:LU/e;

    sput-object v3, LU/D;->n:LU/e;

    sget-object v3, LU/e;->W:LU/e;

    sput-object v3, LU/D;->o:LU/e;

    sput-object v3, LU/D;->p:LU/e;

    sput-object v3, LU/D;->q:LU/e;

    sput-object v3, LU/D;->r:LU/e;

    sput-object v0, LU/D;->s:LU/e;

    sput-object v0, LU/D;->t:LU/e;

    sput-object v0, LU/D;->u:LU/e;

    sput-object v0, LU/D;->v:LU/e;

    sget-object v3, LU/e;->o0:LU/e;

    sput-object v3, LU/D;->w:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/D;->x:F

    sput-object v2, LU/D;->y:LU/z;

    const-wide/high16 v1, 0x4058000000000000L    # 96.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/D;->z:F

    sget-object v1, LU/e;->c0:LU/e;

    sput-object v1, LU/D;->A:LU/e;

    sget-object v1, LU/e;->M:LU/e;

    sput-object v1, LU/D;->B:LU/e;

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/D;->C:LU/e;

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/D;->D:F

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/D;->E:LU/e;

    sput-object v1, LU/D;->F:LU/e;

    sget-object v2, LU/L;->G:LU/L;

    sput-object v2, LU/D;->G:LU/L;

    sput-object v1, LU/D;->H:LU/e;

    sget-object v1, LU/L;->F:LU/L;

    sput-object v1, LU/D;->I:LU/L;

    sput-object v0, LU/D;->J:LU/e;

    sget-object v0, LU/L;->E:LU/L;

    sput-object v0, LU/D;->K:LU/L;

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

    sget-object v0, LU/D;->H:LU/e;

    return-object v0
.end method
