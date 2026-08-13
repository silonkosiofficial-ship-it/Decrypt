.class public final LN9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/v;


# instance fields
.field private final a:LH9/n;


# direct methods
.method public constructor <init>(LH9/n;)V
    .locals 1

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN9/a;->a:LH9/n;

    return-void
.end method

.method private final b(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lj7/v;->w()V

    :cond_0
    check-cast v2, LH9/m;

    if-lez v1, :cond_1

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v2}, LH9/m;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, LH9/m;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v1, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(LH9/v$a;)LH9/B;
    .locals 12

    .prologue
    const-string v0, "chain"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LH9/v$a;->b()LH9/z;

    move-result-object v0

    invoke-virtual {v0}, LH9/z;->h()LH9/z$a;

    move-result-object v1

    invoke-virtual {v0}, LH9/z;->a()LH9/A;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Type"

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LH9/A;->b()LH9/w;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, LH9/w;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    :cond_0
    invoke-virtual {v2}, LH9/A;->a()J

    move-result-wide v7

    cmp-long v2, v7, v3

    const-string v9, "Transfer-Encoding"

    if-eqz v2, :cond_1

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    invoke-virtual {v1, v9}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    goto :goto_0

    :cond_1
    const-string v2, "chunked"

    invoke-virtual {v1, v9, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    invoke-virtual {v1, v6}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    :cond_2
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v7, :cond_3

    invoke-virtual {v0}, LH9/z;->i()LH9/u;

    move-result-object v7

    invoke-static {v7, v8, v9, v10}, LI9/d;->S(LH9/u;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v2, v7}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v1, v2, v11}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move v8, v9

    :cond_5
    iget-object v2, p0, LN9/a;->a:LH9/n;

    invoke-virtual {v0}, LH9/z;->i()LH9/u;

    move-result-object v7

    invoke-interface {v2, v7}, LH9/n;->b(LH9/u;)Ljava/util/List;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    xor-int/2addr v7, v9

    if-eqz v7, :cond_6

    const-string v7, "Cookie"

    invoke-direct {p0, v2}, LN9/a;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    :cond_6
    const-string v2, "User-Agent"

    invoke-virtual {v0, v2}, LH9/z;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    const-string v7, "okhttp/4.12.0"

    invoke-virtual {v1, v2, v7}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    :cond_7
    invoke-virtual {v1}, LH9/z$a;->b()LH9/z;

    move-result-object v1

    invoke-interface {p1, v1}, LH9/v$a;->a(LH9/z;)LH9/B;

    move-result-object p1

    iget-object v1, p0, LN9/a;->a:LH9/n;

    invoke-virtual {v0}, LH9/z;->i()LH9/u;

    move-result-object v2

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object v7

    invoke-static {v1, v2, v7}, LN9/e;->f(LH9/n;LH9/u;LH9/t;)V

    invoke-virtual {p1}, LH9/B;->g0()LH9/B$a;

    move-result-object v1

    invoke-virtual {v1, v0}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object v0

    if-eqz v8, :cond_8

    const-string v1, "Content-Encoding"

    const/4 v2, 0x2

    invoke-static {p1, v1, v10, v2, v10}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7, v9}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {p1}, LN9/e;->b(LH9/B;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v8, LX9/o;

    invoke-virtual {v7}, LH9/C;->g()LX9/f;

    move-result-object v7

    invoke-direct {v8, v7}, LX9/o;-><init>(LX9/Z;)V

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object v7

    invoke-virtual {v7}, LH9/t;->g()LH9/t$a;

    move-result-object v7

    invoke-virtual {v7, v1}, LH9/t$a;->f(Ljava/lang/String;)LH9/t$a;

    move-result-object v1

    invoke-virtual {v1, v6}, LH9/t$a;->f(Ljava/lang/String;)LH9/t$a;

    move-result-object v1

    invoke-virtual {v1}, LH9/t$a;->d()LH9/t;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/B$a;->k(LH9/t;)LH9/B$a;

    invoke-static {p1, v5, v10, v2, v10}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, LN9/h;

    invoke-static {v8}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v2

    invoke-direct {v1, p1, v3, v4, v2}, LN9/h;-><init>(Ljava/lang/String;JLX9/f;)V

    invoke-virtual {v0, v1}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    :cond_8
    invoke-virtual {v0}, LH9/B$a;->c()LH9/B;

    move-result-object p1

    return-object p1
.end method
