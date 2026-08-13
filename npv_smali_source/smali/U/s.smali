.class public final LU/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/s;

.field private static final b:F

.field private static final c:LU/z;

.field private static final d:LU/e;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:LU/e;

.field private static final i:LU/e;

.field private static final j:LU/e;

.field private static final k:LU/L;

.field private static final l:LU/e;

.field private static final m:F

.field private static final n:LU/e;

.field private static final o:LU/e;

.field private static final p:LU/e;

.field private static final q:LU/e;

.field private static final r:LU/e;

.field private static final s:LU/e;

.field private static final t:F

.field private static final u:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LU/s;

    invoke-direct {v0}, LU/s;-><init>()V

    sput-object v0, LU/s;->a:LU/s;

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/s;->b:F

    sget-object v0, LU/z;->G:LU/z;

    sput-object v0, LU/s;->c:LU/z;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/s;->d:LU/e;

    sput-object v0, LU/s;->e:LU/e;

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/s;->f:LU/e;

    sput-object v1, LU/s;->g:LU/e;

    sput-object v1, LU/s;->h:LU/e;

    sget-object v2, LU/e;->Z:LU/e;

    sput-object v2, LU/s;->i:LU/e;

    sput-object v1, LU/s;->j:LU/e;

    sget-object v3, LU/L;->L:LU/L;

    sput-object v3, LU/s;->k:LU/L;

    sput-object v2, LU/s;->l:LU/e;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    double-to-float v3, v3

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LU/s;->m:F

    sput-object v1, LU/s;->n:LU/e;

    sput-object v2, LU/s;->o:LU/e;

    sput-object v0, LU/s;->p:LU/e;

    sput-object v1, LU/s;->q:LU/e;

    sput-object v1, LU/s;->r:LU/e;

    sput-object v1, LU/s;->s:LU/e;

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    double-to-float v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/s;->t:F

    sput-object v1, LU/s;->u:LU/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LU/z;
    .locals 1

    sget-object v0, LU/s;->c:LU/z;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/s;->d:LU/e;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/s;->j:LU/e;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/s;->l:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/s;->m:F

    return v0
.end method
