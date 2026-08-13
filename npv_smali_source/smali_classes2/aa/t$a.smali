.class public final Laa/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/t;->b()Laa/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Li7/n;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Laa/t$a$a;->D:Laa/t$a$a;

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, Laa/t$a;->a:Li7/n;

    return-void
.end method

.method private final c()Landroid/content/res/AssetManager;
    .locals 2

    iget-object v0, p0, Laa/t$a;->a:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/res/AssetManager;

    return-object v0
.end method

.method private final d()Ljava/lang/ClassLoader;
    .locals 2

    .prologue
    const-class v0, Laa/t$a;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot find class loader"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final e()Landroid/content/res/AssetManager;
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lorg/jetbrains/compose/resources/a;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "ResourceReader"

    const-string v1, "Android Instrumentation context is not available."

    nop

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final f(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .prologue
    :try_start_0
    invoke-direct {p0}, Laa/t$a;->c()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :try_start_1
    invoke-direct {p0}, Laa/t$a;->e()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Laa/t$a;->g(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, p1

    goto :goto_0

    :catch_1
    invoke-direct {p0}, Laa/t$a;->d()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication;->zqubf(Ljava/lang/Object;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Laa/j;

    invoke-direct {v0, p1}, Laa/j;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final g(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/io/FileNotFoundException;

    const-string p2, "Current AssetManager is null."

    invoke-direct {p1, p2}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(Ljava/io/InputStream;[BII)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    add-int v1, p3, v0

    sub-int v2, p4, v0

    invoke-virtual {p1, p2, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final i(Ljava/io/InputStream;J)V
    .locals 7

    .prologue
    const-wide/16 v0, 0x0

    move-wide v2, v0

    :goto_0
    cmp-long v4, v2, p2

    if-gez v4, :cond_0

    sub-long v4, p2, v2

    invoke-virtual {p1, v4, v5}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-eqz v6, :cond_0

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;JJLm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-direct {p0, p1}, Laa/t$a;->f(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    long-to-int p4, p4

    new-array p5, p4, [B

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Laa/t$a;->i(Ljava/io/InputStream;J)V

    const/4 p2, 0x0

    invoke-direct {p0, p1, p5, p2, p4}, Laa/t$a;->h(Ljava/io/InputStream;[BII)V

    sget-object p2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p5

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p3

    invoke-static {p1, p2}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public b(Ljava/lang/String;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Laa/t$a;->f(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    :try_start_0
    invoke-static {p1}, Lt7/a;->c(Ljava/io/InputStream;)[B

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p2

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lt7/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
