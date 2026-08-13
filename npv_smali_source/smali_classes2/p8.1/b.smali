.class public abstract Lp8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp8/r;


# static fields
.field private static final a:Lp8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lp8/g;->c()Lp8/g;

    move-result-object v0

    sput-object v0, Lp8/b;->a:Lp8/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d(Lp8/p;)Lp8/p;
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lp8/q;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lp8/b;->e(Lp8/p;)Lp8/v;

    move-result-object v0

    invoke-virtual {v0}, Lp8/v;->a()Lp8/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method private e(Lp8/p;)Lp8/v;
    .locals 1

    .prologue
    instance-of v0, p1, Lp8/a;

    if-eqz v0, :cond_0

    check-cast p1, Lp8/a;

    invoke-virtual {p1}, Lp8/a;->f()Lp8/v;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lp8/v;

    invoke-direct {v0, p1}, Lp8/v;-><init>(Lp8/p;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp8/b;->f(Ljava/io/InputStream;Lp8/g;)Lp8/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/io/InputStream;Lp8/g;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp8/b;->g(Ljava/io/InputStream;Lp8/g;)Lp8/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/io/InputStream;Lp8/g;)Lp8/p;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp8/b;->h(Ljava/io/InputStream;Lp8/g;)Lp8/p;

    move-result-object p1

    invoke-direct {p0, p1}, Lp8/b;->d(Lp8/p;)Lp8/p;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/io/InputStream;Lp8/g;)Lp8/p;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lp8/b;->i(Ljava/io/InputStream;Lp8/g;)Lp8/p;

    move-result-object p1

    invoke-direct {p0, p1}, Lp8/b;->d(Lp8/p;)Lp8/p;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/io/InputStream;Lp8/g;)Lp8/p;
    .locals 2

    .prologue
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, p1}, Lp8/e;->A(ILjava/io/InputStream;)I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lp8/a$a$a;

    invoke-direct {v1, p1, v0}, Lp8/a$a$a;-><init>(Ljava/io/InputStream;I)V

    invoke-virtual {p0, v1, p2}, Lp8/b;->i(Ljava/io/InputStream;Lp8/g;)Lp8/p;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lp8/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lp8/k;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public i(Ljava/io/InputStream;Lp8/g;)Lp8/p;
    .locals 1

    .prologue
    invoke-static {p1}, Lp8/e;->g(Ljava/io/InputStream;)Lp8/e;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp8/p;

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lp8/e;->a(I)V
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {p1, p2}, Lp8/k;->i(Lp8/p;)Lp8/k;

    move-result-object p1

    throw p1
.end method
