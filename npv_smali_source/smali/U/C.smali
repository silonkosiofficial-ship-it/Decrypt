.class public final LU/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/C;

.field private static final b:F

.field private static final c:LU/z;

.field private static final d:LU/e;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:LU/L;

.field private static final i:LU/e;

.field private static final j:LU/e;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:LU/e;

.field private static final n:F

.field private static final o:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LU/C;

    invoke-direct {v0}, LU/C;-><init>()V

    sput-object v0, LU/C;->a:LU/C;

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/C;->b:F

    sget-object v0, LU/z;->G:LU/z;

    sput-object v0, LU/C;->c:LU/z;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/C;->d:LU/e;

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/C;->e:LU/e;

    sput-object v1, LU/C;->f:LU/e;

    sput-object v1, LU/C;->g:LU/e;

    sget-object v2, LU/L;->L:LU/L;

    sput-object v2, LU/C;->h:LU/L;

    sput-object v1, LU/C;->i:LU/e;

    sput-object v0, LU/C;->j:LU/e;

    sput-object v1, LU/C;->k:LU/e;

    sput-object v1, LU/C;->l:LU/e;

    sput-object v1, LU/C;->m:LU/e;

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    double-to-float v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/C;->n:F

    sput-object v1, LU/C;->o:LU/e;

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

    sget-object v0, LU/C;->c:LU/z;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/C;->d:LU/e;

    return-object v0
.end method

.method public final c()LU/e;
    .locals 1

    sget-object v0, LU/C;->g:LU/e;

    return-object v0
.end method
