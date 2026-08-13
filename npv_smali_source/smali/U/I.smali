.class public final LU/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/I;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:F

.field private static final e:LU/z;

.field private static final f:LU/e;

.field private static final g:LU/L;

.field private static final h:LU/e;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:F

.field private static final l:LU/e;

.field private static final m:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/I;

    invoke-direct {v0}, LU/I;-><init>()V

    sput-object v0, LU/I;->a:LU/I;

    sget-object v0, LU/e;->k0:LU/e;

    sput-object v0, LU/I;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v1

    sput v1, LU/I;->c:F

    const-wide/high16 v1, 0x4050000000000000L    # 64.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/I;->d:F

    sget-object v1, LU/z;->L:LU/z;

    sput-object v1, LU/I;->e:LU/z;

    sget-object v1, LU/e;->T:LU/e;

    sput-object v1, LU/I;->f:LU/e;

    sget-object v2, LU/L;->O:LU/L;

    sput-object v2, LU/I;->g:LU/L;

    sput-object v1, LU/I;->h:LU/e;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v2

    sput v2, LU/I;->i:F

    sget-object v2, LU/e;->m0:LU/e;

    sput-object v2, LU/I;->j:LU/e;

    invoke-virtual {v0}, LU/j;->c()F

    move-result v0

    sput v0, LU/I;->k:F

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/I;->l:LU/e;

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/I;->m:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, LU/I;->d:F

    return v0
.end method

.method public final b()LU/L;
    .locals 1

    sget-object v0, LU/I;->g:LU/L;

    return-object v0
.end method
