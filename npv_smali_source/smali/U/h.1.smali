.class public final LU/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LU/h;

.field private static final b:LU/e;

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LU/h;

    invoke-direct {v0}, LU/h;-><init>()V

    sput-object v0, LU/h;->a:LU/h;

    sget-object v0, LU/e;->a0:LU/e;

    sput-object v0, LU/h;->b:LU/e;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LU/h;->c:F

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

    sget-object v0, LU/h;->b:LU/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LU/h;->c:F

    return v0
.end method
