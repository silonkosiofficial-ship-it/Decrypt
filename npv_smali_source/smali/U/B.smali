.class public final LU/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/B;

.field private static final b:LU/e;

.field private static final c:LU/e;

.field private static final d:LU/e;

.field private static final e:LU/L;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:F

.field private static final i:LU/z;

.field private static final j:LU/e;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:LU/e;

.field private static final n:F

.field private static final o:LU/e;

.field private static final p:LU/L;

.field private static final q:F

.field private static final r:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/B;

    invoke-direct {v0}, LU/B;-><init>()V

    sput-object v0, LU/B;->a:LU/B;

    sget-object v0, LU/e;->G:LU/e;

    sput-object v0, LU/B;->b:LU/e;

    sput-object v0, LU/B;->c:LU/e;

    sput-object v0, LU/B;->d:LU/e;

    sget-object v1, LU/L;->L:LU/L;

    sput-object v1, LU/B;->e:LU/L;

    sput-object v0, LU/B;->f:LU/e;

    sget-object v0, LU/e;->H:LU/e;

    sput-object v0, LU/B;->g:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->d()F

    move-result v0

    sput v0, LU/B;->h:F

    sget-object v0, LU/z;->E:LU/z;

    sput-object v0, LU/B;->i:LU/z;

    sget-object v0, LU/e;->F:LU/e;

    sput-object v0, LU/B;->j:LU/e;

    sput-object v0, LU/B;->k:LU/e;

    sput-object v0, LU/B;->l:LU/e;

    sput-object v0, LU/B;->m:LU/e;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/B;->n:F

    sput-object v0, LU/B;->o:LU/e;

    sget-object v0, LU/L;->D:LU/L;

    sput-object v0, LU/B;->p:LU/L;

    const-wide/high16 v0, 0x4048000000000000L    # 48.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/B;->q:F

    const-wide/high16 v0, 0x4051000000000000L    # 68.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/B;->r:F

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

    sget-object v0, LU/B;->d:LU/e;

    return-object v0
.end method

.method public final b()LU/L;
    .locals 1

    sget-object v0, LU/B;->e:LU/L;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/B;->g:LU/e;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/B;->h:F

    return v0
.end method

.method public final e()LU/z;
    .locals 1

    sget-object v0, LU/B;->i:LU/z;

    return-object v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/B;->j:LU/e;

    return-object v0
.end method

.method public final g()F
    .locals 1

    sget v0, LU/B;->q:F

    return v0
.end method

.method public final h()LU/e;
    .locals 1

    sget-object v0, LU/B;->o:LU/e;

    return-object v0
.end method

.method public final i()LU/L;
    .locals 1

    sget-object v0, LU/B;->p:LU/L;

    return-object v0
.end method

.method public final j()F
    .locals 1

    sget v0, LU/B;->r:F

    return v0
.end method
