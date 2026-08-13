.class public final LU/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/t;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:LU/z;

.field private static final e:F

.field private static final f:LU/e;

.field private static final g:F

.field private static final h:LU/e;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:LU/e;

.field private static final n:F

.field private static final o:LU/e;

.field private static final p:F

.field private static final q:F

.field private static final r:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LU/t;

    invoke-direct {v0}, LU/t;-><init>()V

    sput-object v0, LU/t;->a:LU/t;

    sget-object v0, LU/e;->k0:LU/e;

    sput-object v0, LU/t;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/t;->c:F

    sget-object v1, LU/z;->K:LU/z;

    sput-object v1, LU/t;->d:LU/z;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/t;->e:F

    sget-object v1, LU/e;->Z:LU/e;

    sput-object v1, LU/t;->f:LU/e;

    invoke-virtual {v0}, LU/j;->d()F

    move-result v1

    sput v1, LU/t;->g:F

    sget-object v1, LU/e;->a0:LU/e;

    sput-object v1, LU/t;->h:LU/e;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v2

    sput v2, LU/t;->i:F

    sget-object v2, LU/e;->T:LU/e;

    sput-object v2, LU/t;->j:LU/e;

    invoke-virtual {v0}, LU/j;->b()F

    move-result v2

    sput v2, LU/t;->k:F

    sput-object v1, LU/t;->l:LU/e;

    sget-object v2, LU/e;->b0:LU/e;

    sput-object v2, LU/t;->m:LU/e;

    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/t;->n:F

    sput-object v1, LU/t;->o:LU/e;

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    double-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/t;->p:F

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LU/t;->q:F

    sput-object v1, LU/t;->r:LU/e;

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

    sget-object v0, LU/t;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/t;->c:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/t;->d:LU/z;

    return-object v0
.end method

.method public final d()F
    .locals 1

    sget v0, LU/t;->e:F

    return v0
.end method

.method public final e()LU/e;
    .locals 1

    sget-object v0, LU/t;->f:LU/e;

    return-object v0
.end method

.method public final f()F
    .locals 1

    sget v0, LU/t;->g:F

    return v0
.end method

.method public final g()LU/e;
    .locals 1

    sget-object v0, LU/t;->o:LU/e;

    return-object v0
.end method

.method public final h()F
    .locals 1

    sget v0, LU/t;->p:F

    return v0
.end method
