.class public final Lb9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb9/s;

.field public static final b:LW8/J0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb9/s;

    invoke-direct {v0}, Lb9/s;-><init>()V

    sput-object v0, Lb9/s;->a:Lb9/s;

    const-string v1, "kotlinx.coroutines.fast.service.loader"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lb9/E;->f(Ljava/lang/String;Z)Z

    invoke-direct {v0}, Lb9/s;->a()LW8/J0;

    move-result-object v0

    sput-object v0, Lb9/s;->b:LW8/J0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()LW8/J0;
    .locals 7

    .prologue
    const-class v0, Lb9/r;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, LR8/k;->g(Ljava/util/Iterator;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v3

    check-cast v4, Lb9/r;

    invoke-interface {v4}, Lb9/r;->c()I

    move-result v4

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lb9/r;

    invoke-interface {v6}, Lb9/r;->c()I

    move-result v6

    if-ge v4, v6, :cond_3

    move-object v3, v5

    move v4, v6

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_0
    check-cast v3, Lb9/r;

    if-eqz v3, :cond_5

    invoke-static {v3, v0}, Lb9/t;->e(Lb9/r;Ljava/util/List;)LW8/J0;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x3

    invoke-static {v1, v1, v0, v1}, Lb9/t;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lb9/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Lb9/t;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lb9/u;

    :goto_3
    return-object v1
.end method
