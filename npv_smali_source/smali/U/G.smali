.class public final LU/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/G;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:F

.field private static final e:LU/z;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:LU/L;

.field private static final i:LU/e;

.field private static final j:F

.field private static final k:LU/e;

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/G;

    invoke-direct {v0}, LU/G;-><init>()V

    sput-object v0, LU/G;->a:LU/G;

    sget-object v0, LU/e;->k0:LU/e;

    sput-object v0, LU/G;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LU/G;->c:F

    const-wide/high16 v0, 0x405c000000000000L    # 112.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/G;->d:F

    sget-object v0, LU/z;->L:LU/z;

    sput-object v0, LU/G;->e:LU/z;

    sget-object v0, LU/e;->s0:LU/e;

    sput-object v0, LU/G;->f:LU/e;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/G;->g:LU/e;

    sget-object v1, LU/L;->K:LU/L;

    sput-object v1, LU/G;->h:LU/L;

    sput-object v0, LU/G;->i:LU/e;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/G;->j:F

    sget-object v1, LU/e;->U:LU/e;

    sput-object v1, LU/G;->k:LU/e;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/G;->l:F

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

    sget v0, LU/G;->d:F

    return v0
.end method
