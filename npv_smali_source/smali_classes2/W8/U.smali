.class public abstract LW8/U;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static final b:LW8/X;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb9/E;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, LW8/U;->a:Z

    invoke-static {}, LW8/U;->b()LW8/X;

    move-result-object v0

    sput-object v0, LW8/U;->b:LW8/X;

    return-void
.end method

.method public static final a()LW8/X;
    .locals 1

    sget-object v0, LW8/U;->b:LW8/X;

    return-object v0
.end method

.method private static final b()LW8/X;
    .locals 2

    .prologue
    sget-boolean v0, LW8/U;->a:Z

    if-nez v0, :cond_0

    sget-object v0, LW8/T;->K:LW8/T;

    return-object v0

    :cond_0
    invoke-static {}, LW8/d0;->c()LW8/J0;

    move-result-object v0

    invoke-static {v0}, Lb9/t;->c(LW8/J0;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, LW8/X;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, LW8/X;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, LW8/T;->K:LW8/T;

    :goto_1
    return-object v0
.end method
