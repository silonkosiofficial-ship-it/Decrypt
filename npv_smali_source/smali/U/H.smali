.class public final LU/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/H;

.field private static final b:LU/z;

.field private static final c:F

.field private static final d:LU/e;

.field private static final e:F

.field private static final f:F

.field private static final g:LU/z;

.field private static final h:LU/e;

.field private static final i:LU/e;

.field private static final j:LU/L;

.field private static final k:LU/e;

.field private static final l:F

.field private static final m:LU/e;

.field private static final n:F

.field private static final o:LU/e;

.field private static final p:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/H;

    invoke-direct {v0}, LU/H;-><init>()V

    sput-object v0, LU/H;->a:LU/H;

    sget-object v0, LU/z;->G:LU/z;

    sput-object v0, LU/H;->b:LU/z;

    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/H;->c:F

    sget-object v0, LU/e;->k0:LU/e;

    sput-object v0, LU/H;->d:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/H;->e:F

    const-wide/high16 v1, 0x4050000000000000L    # 64.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/H;->f:F

    sget-object v1, LU/z;->L:LU/z;

    sput-object v1, LU/H;->g:LU/z;

    sget-object v1, LU/e;->s0:LU/e;

    sput-object v1, LU/H;->h:LU/e;

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/H;->i:LU/e;

    sget-object v2, LU/L;->O:LU/L;

    sput-object v2, LU/H;->j:LU/L;

    sput-object v1, LU/H;->k:LU/e;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/H;->l:F

    sget-object v2, LU/e;->m0:LU/e;

    sput-object v2, LU/H;->m:LU/e;

    invoke-virtual {v0}, LU/j;->c()F

    move-result v0

    sput v0, LU/H;->n:F

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/H;->o:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/H;->p:F

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

    sget-object v0, LU/H;->d:LU/e;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/H;->i:LU/e;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/H;->k:LU/e;

    return-object v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/H;->m:LU/e;

    return-object v0
.end method

.method public final e()LU/e;
    .locals 1

    sget-object v0, LU/H;->o:LU/e;

    return-object v0
.end method
