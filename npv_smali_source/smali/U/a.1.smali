.class public final LU/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/a;

.field private static final b:LU/e;

.field private static final c:F

.field private static final d:F

.field private static final e:LU/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/a;

    invoke-direct {v0}, LU/a;-><init>()V

    sput-object v0, LU/a;->a:LU/a;

    sget-object v0, LU/e;->m0:LU/e;

    sput-object v0, LU/a;->b:LU/e;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->c()F

    move-result v0

    sput v0, LU/a;->c:F

    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/a;->d:F

    sget-object v0, LU/z;->L:LU/z;

    sput-object v0, LU/a;->e:LU/z;

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

    sget-object v0, LU/a;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/a;->d:F

    return v0
.end method

.method public final c()LU/z;
    .locals 1

    sget-object v0, LU/a;->e:LU/z;

    return-object v0
.end method
