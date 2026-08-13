.class final LO7/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static synthetic d(I)V
    .locals 2

    const/4 p0, 0x2

    new-array p0, p0, [Ljava/lang/Object;

    const-string v0, "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1"

    const/4 v1, 0x0

    aput-object v0, p0, v1

    const-string v0, "getContainingFile"

    const/4 v1, 0x1

    aput-object v0, p0, v1

    const-string v0, "@NotNull method %s.%s must not return null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()LO7/b0;
    .locals 2

    .prologue
    sget-object v0, LO7/b0;->a:LO7/b0;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, LO7/a0$a;->d(I)V

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NO_SOURCE"

    return-object v0
.end method
