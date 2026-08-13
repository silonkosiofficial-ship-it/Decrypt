.class public final LU/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/y;

.field private static final b:LU/e;

.field private static final c:LU/e;

.field private static final d:F

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:LU/e;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LU/y;

    invoke-direct {v0}, LU/y;-><init>()V

    sput-object v0, LU/y;->a:LU/y;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/y;->b:LU/e;

    sput-object v0, LU/y;->c:LU/e;

    const-wide/high16 v1, 0x4034000000000000L    # 20.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/y;->d:F

    sget-object v1, LU/e;->b0:LU/e;

    sput-object v1, LU/y;->e:LU/e;

    sput-object v1, LU/y;->f:LU/e;

    sput-object v1, LU/y;->g:LU/e;

    sput-object v1, LU/y;->h:LU/e;

    const-wide/high16 v1, 0x4044000000000000L    # 40.0

    double-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LU/y;->i:F

    sput-object v0, LU/y;->j:LU/e;

    sput-object v0, LU/y;->k:LU/e;

    sget-object v1, LU/e;->U:LU/e;

    sput-object v1, LU/y;->l:LU/e;

    sput-object v0, LU/y;->m:LU/e;

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

    sget-object v0, LU/y;->b:LU/e;

    return-object v0
.end method

.method public final b()LU/e;
    .locals 1

    sget-object v0, LU/y;->c:LU/e;

    return-object v0
.end method

.method public final c()F
    .locals 1

    sget v0, LU/y;->d:F

    return v0
.end method

.method public final d()LU/e;
    .locals 1

    sget-object v0, LU/y;->g:LU/e;

    return-object v0
.end method

.method public final e()F
    .locals 1

    sget v0, LU/y;->i:F

    return v0
.end method

.method public final f()LU/e;
    .locals 1

    sget-object v0, LU/y;->l:LU/e;

    return-object v0
.end method
