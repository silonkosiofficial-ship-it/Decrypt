.class public final LU/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/n;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:LU/e;

.field private static final e:LU/e;

.field private static final f:LU/e;

.field private static final g:LU/e;

.field private static final h:LU/z;

.field private static final i:F

.field private static final j:LU/e;

.field private static final k:LU/e;

.field private static final l:LU/e;

.field private static final m:LU/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/n;

    invoke-direct {v0}, LU/n;-><init>()V

    sput-object v0, LU/n;->a:LU/n;

    sget-object v0, LU/e;->T:LU/e;

    sput-object v0, LU/n;->b:LU/e;

    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/n;->c:F

    sget-object v0, LU/e;->b0:LU/e;

    sput-object v0, LU/n;->d:LU/e;

    sput-object v0, LU/n;->e:LU/e;

    sput-object v0, LU/n;->f:LU/e;

    sput-object v0, LU/n;->g:LU/e;

    sget-object v0, LU/z;->G:LU/z;

    sput-object v0, LU/n;->h:LU/z;

    const-wide/high16 v0, 0x4044000000000000L    # 40.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/n;->i:F

    sget-object v0, LU/e;->U:LU/e;

    sput-object v0, LU/n;->j:LU/e;

    sput-object v0, LU/n;->k:LU/e;

    sput-object v0, LU/n;->l:LU/e;

    sput-object v0, LU/n;->m:LU/e;

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

    sget v0, LU/n;->c:F

    return v0
.end method

.method public final b()LU/z;
    .locals 1

    sget-object v0, LU/n;->h:LU/z;

    return-object v0
.end method

.method public final c()F
    .locals 1

    sget v0, LU/n;->i:F

    return v0
.end method
