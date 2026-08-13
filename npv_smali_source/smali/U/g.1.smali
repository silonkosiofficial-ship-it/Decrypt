.class public final LU/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/g;

.field private static final b:LU/e;

.field private static final c:LU/e;

.field private static final d:LU/e;

.field private static final e:LU/L;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:F

.field private static final i:LU/z;

.field private static final j:LU/e;

.field private static final k:LU/L;

.field private static final l:LU/e;

.field private static final m:LU/L;

.field private static final n:LU/e;

.field private static final o:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/g;

    invoke-direct {v0}, LU/g;-><init>()V

    sput-object v0, LU/g;->a:LU/g;

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/g;->b:LU/e;

    sput-object v0, LU/g;->c:LU/e;

    sput-object v0, LU/g;->d:LU/e;

    sget-object v1, LU/L;->L:LU/L;

    sput-object v1, LU/g;->e:LU/L;

    sput-object v0, LU/g;->f:LU/e;

    sget-object v0, LU/e;->n0:LU/e;

    sput-object v0, LU/g;->g:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->d()F

    move-result v0

    sput v0, LU/g;->h:F

    sget-object v0, LU/z;->C:LU/z;

    sput-object v0, LU/g;->i:LU/z;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/g;->j:LU/e;

    sget-object v0, LU/L;->K:LU/L;

    sput-object v0, LU/g;->k:LU/L;

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/g;->l:LU/e;

    sget-object v0, LU/L;->D:LU/L;

    sput-object v0, LU/g;->m:LU/L;

    sget-object v0, LU/e;->g0:LU/e;

    sput-object v0, LU/g;->n:LU/e;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/g;->o:F

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

    sget-object v0, LU/g;->d:LU/e;

    return-object v0
.end method

.method public final b()LU/L;
    .locals 1

    sget-object v0, LU/g;->e:LU/L;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/g;->g:LU/e;

    return-object v0
.end method

.method public final d()LU/z;
    .locals 1

    sget-object v0, LU/g;->i:LU/z;

    return-object v0
.end method

.method public final e()LU/e;
    .locals 1

    sget-object v0, LU/g;->j:LU/e;

    return-object v0
.end method

.method public final f()LU/L;
    .locals 1

    sget-object v0, LU/g;->k:LU/L;

    return-object v0
.end method

.method public final g()LU/e;
    .locals 1

    sget-object v0, LU/g;->n:LU/e;

    return-object v0
.end method

.method public final h()LU/e;
    .locals 1

    sget-object v0, LU/g;->l:LU/e;

    return-object v0
.end method

.method public final i()LU/L;
    .locals 1

    sget-object v0, LU/g;->m:LU/L;

    return-object v0
.end method
