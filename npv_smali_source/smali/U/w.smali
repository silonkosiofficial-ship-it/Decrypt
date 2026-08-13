.class public final LU/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final A:LU/L;

.field public static final a:LU/w;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:LG/f;

.field private static final e:LU/e;

.field private static final f:F

.field private static final g:F

.field private static final h:LU/z;

.field private static final i:LU/e;

.field private static final j:LU/e;

.field private static final k:LU/e;

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

.field private static final y:LU/e;

.field private static final z:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/w;

    invoke-direct {v0}, LU/w;-><init>()V

    sput-object v0, LU/w;->a:LU/w;

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/w;->b:LU/e;

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/w;->c:F

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, LG/g;->c(F)LG/f;

    move-result-object v1

    sput-object v1, LU/w;->d:LG/f;

    sget-object v1, LU/e;->k0:LU/e;

    sput-object v1, LU/w;->e:LU/e;

    sget-object v1, LU/j;->a:LU/j;

    invoke-virtual {v1}, LU/j;->a()F

    move-result v1

    sput v1, LU/w;->f:F

    const-wide/high16 v1, 0x4048000000000000L    # 48.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/w;->g:F

    sget-object v1, LU/z;->L:LU/z;

    sput-object v1, LU/w;->h:LU/z;

    sput-object v0, LU/w;->i:LU/e;

    sput-object v0, LU/w;->j:LU/e;

    sput-object v0, LU/w;->k:LU/e;

    sput-object v0, LU/w;->l:LU/e;

    const-wide/high16 v1, 0x4050000000000000L    # 64.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/w;->m:F

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/w;->n:F

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/w;->o:LU/e;

    sput-object v1, LU/w;->p:LU/e;

    sget-object v2, LU/e;->U:LU/e;

    sput-object v2, LU/w;->q:LU/e;

    sput-object v1, LU/w;->r:LU/e;

    sput-object v0, LU/w;->s:LU/e;

    sput-object v0, LU/w;->t:LU/e;

    sput-object v0, LU/w;->u:LU/e;

    sput-object v0, LU/w;->v:LU/e;

    sput-object v1, LU/w;->w:LU/e;

    sput-object v1, LU/w;->x:LU/e;

    sput-object v2, LU/w;->y:LU/e;

    sput-object v1, LU/w;->z:LU/e;

    sget-object v0, LU/L;->Q:LU/L;

    sput-object v0, LU/w;->A:LU/L;

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

    sget-object v0, LU/w;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/w;->c:F

    return v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/w;->u:LU/e;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/w;->e:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/w;->g:F

    return v0
.end method

.method public final f()LU/L;
    .locals 1

    sget-object v0, LU/w;->A:LU/L;

    return-object v0
.end method
