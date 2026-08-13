.class public final LN9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN9/j$a;
    }
.end annotation


# static fields
.field public static final b:LN9/j$a;


# instance fields
.field private final a:LH9/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN9/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN9/j$a;-><init>(Ly7/k;)V

    sput-object v0, LN9/j;->b:LN9/j$a;

    return-void
.end method

.method public constructor <init>(LH9/x;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN9/j;->a:LH9/x;

    return-void
.end method

.method private final b(LH9/B;Ljava/lang/String;)LH9/z;
    .locals 8

    .prologue
    iget-object v0, p0, LN9/j;->a:LH9/x;

    invoke-virtual {v0}, LH9/x;->v()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "Location"

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v2

    invoke-virtual {v2}, LH9/z;->i()LH9/u;

    move-result-object v2

    invoke-virtual {v2, v0}, LH9/u;->o(Ljava/lang/String;)LH9/u;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, LH9/u;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v3

    invoke-virtual {v3}, LH9/z;->i()LH9/u;

    move-result-object v3

    invoke-virtual {v3}, LH9/u;->p()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, LN9/j;->a:LH9/x;

    invoke-virtual {v2}, LH9/x;->w()Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v2

    invoke-virtual {v2}, LH9/z;->h()LH9/z$a;

    move-result-object v2

    invoke-static {p2}, LN9/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v3

    sget-object v4, LN9/f;->a:LN9/f;

    invoke-virtual {v4, p2}, LN9/f;->c(Ljava/lang/String;)Z

    move-result v5

    const/16 v6, 0x133

    const/16 v7, 0x134

    if-nez v5, :cond_5

    if-eq v3, v7, :cond_5

    if-ne v3, v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-virtual {v4, p2}, LN9/f;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    if-eq v3, v7, :cond_7

    if-eq v3, v6, :cond_7

    const-string p2, "GET"

    :cond_6
    :goto_2
    invoke-virtual {v2, p2, v1}, LH9/z$a;->e(Ljava/lang/String;LH9/A;)LH9/z$a;

    goto :goto_3

    :cond_7
    if-eqz v5, :cond_6

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v1

    invoke-virtual {v1}, LH9/z;->a()LH9/A;

    move-result-object v1

    goto :goto_2

    :goto_3
    if-nez v5, :cond_8

    const-string p2, "Transfer-Encoding"

    invoke-virtual {v2, p2}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    const-string p2, "Content-Length"

    invoke-virtual {v2, p2}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    const-string p2, "Content-Type"

    invoke-virtual {v2, p2}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    :cond_8
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object p1

    invoke-virtual {p1}, LH9/z;->i()LH9/u;

    move-result-object p1

    invoke-static {p1, v0}, LI9/d;->j(LH9/u;LH9/u;)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Authorization"

    invoke-virtual {v2, p1}, LH9/z$a;->f(Ljava/lang/String;)LH9/z$a;

    :cond_9
    invoke-virtual {v2, v0}, LH9/z$a;->g(LH9/u;)LH9/z$a;

    move-result-object p1

    invoke-virtual {p1}, LH9/z$a;->b()LH9/z;

    move-result-object p1

    return-object p1
.end method

.method private final c(LH9/B;LM9/c;)LH9/z;
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LM9/c;->h()LM9/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LM9/f;->A()LH9/D;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1}, LH9/B;->o()I

    move-result v2

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v3

    invoke-virtual {v3}, LH9/z;->g()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x133

    if-eq v2, v4, :cond_10

    const/16 v4, 0x134

    if-eq v2, v4, :cond_10

    const/16 v4, 0x191

    if-eq v2, v4, :cond_f

    const/16 v4, 0x1a5

    if-eq v2, v4, :cond_b

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_8

    const/16 p2, 0x197

    if-eq v2, p2, :cond_6

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, LN9/j;->a:LH9/x;

    invoke-virtual {v1}, LH9/x;->L()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v1

    invoke-virtual {v1}, LH9/z;->a()LH9/A;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LH9/A;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, LH9/B;->n0()LH9/B;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LH9/B;->o()I

    move-result v1

    if-ne v1, p2, :cond_4

    return-object v0

    :cond_4
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LN9/j;->g(LH9/B;I)I

    move-result p2

    if-lez p2, :cond_5

    return-object v0

    :cond_5
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_7

    iget-object p2, p0, LN9/j;->a:LH9/x;

    invoke-virtual {p2}, LH9/x;->I()LH9/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, LH9/b;->a(LH9/D;LH9/B;)LH9/z;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p1}, LH9/B;->n0()LH9/B;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, LH9/B;->o()I

    move-result v1

    if-ne v1, p2, :cond_9

    return-object v0

    :cond_9
    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, LN9/j;->g(LH9/B;I)I

    move-result p2

    if-nez p2, :cond_a

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v0

    :cond_b
    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v1

    invoke-virtual {v1}, LH9/z;->a()LH9/A;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LH9/A;->d()Z

    move-result v1

    if-eqz v1, :cond_c

    return-object v0

    :cond_c
    if-eqz p2, :cond_e

    invoke-virtual {p2}, LM9/c;->l()Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_1

    :cond_d
    invoke-virtual {p2}, LM9/c;->h()LM9/f;

    move-result-object p2

    invoke-virtual {p2}, LM9/f;->y()V

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object p1

    return-object p1

    :cond_e
    :goto_1
    return-object v0

    :cond_f
    iget-object p2, p0, LN9/j;->a:LH9/x;

    invoke-virtual {p2}, LH9/x;->e()LH9/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, LH9/b;->a(LH9/D;LH9/B;)LH9/z;

    move-result-object p1

    return-object p1

    :cond_10
    :pswitch_0
    invoke-direct {p0, p1, v3}, LN9/j;->b(LH9/B;Ljava/lang/String;)LH9/z;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final d(Ljava/io/IOException;Z)Z
    .locals 3

    .prologue
    instance-of v0, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    move v1, v2

    :cond_1
    return v1

    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/security/cert/CertificateException;

    if-eqz p2, :cond_3

    return v1

    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method private final e(Ljava/io/IOException;LM9/e;LH9/z;Z)Z
    .locals 2

    .prologue
    iget-object v0, p0, LN9/j;->a:LH9/x;

    invoke-virtual {v0}, LH9/x;->L()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p4, :cond_1

    invoke-direct {p0, p1, p3}, LN9/j;->f(Ljava/io/IOException;LH9/z;)Z

    move-result p3

    if-eqz p3, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1, p4}, LN9/j;->d(Ljava/io/IOException;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p2}, LM9/e;->A()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final f(Ljava/io/IOException;LH9/z;)Z
    .locals 0

    .prologue
    invoke-virtual {p2}, LH9/z;->a()LH9/A;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LH9/A;->d()Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final g(LH9/B;I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Retry-After"

    invoke-static {p1, v2, v0, v1, v0}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    :cond_0
    new-instance p2, LS8/o;

    const-string v0, "\\d+"

    invoke-direct {p2, v0}, LS8/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, LS8/o;->d(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "valueOf(header)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7fffffff

    return p1
.end method


# virtual methods
.method public a(LH9/v$a;)LH9/B;
    .locals 10

    .prologue
    const-string v0, "chain"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LN9/g;

    invoke-virtual {p1}, LN9/g;->i()LH9/z;

    move-result-object v0

    invoke-virtual {p1}, LN9/g;->e()LM9/e;

    move-result-object v1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v8, v3

    move-object v7, v4

    :goto_0
    move v6, v5

    :goto_1
    invoke-virtual {v1, v0, v6}, LM9/e;->k(LH9/z;Z)V

    :try_start_0
    invoke-virtual {v1}, LM9/e;->D()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_8

    :try_start_1
    invoke-virtual {p1, v0}, LN9/g;->a(LH9/z;)LH9/B;

    move-result-object v0
    :try_end_1
    .catch LM9/i; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_0

    :try_start_2
    invoke-virtual {v0}, LH9/B;->g0()LH9/B$a;

    move-result-object v0

    invoke-virtual {v7}, LH9/B;->g0()LH9/B$a;

    move-result-object v6

    invoke-virtual {v6, v4}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object v6

    invoke-virtual {v6}, LH9/B$a;->c()LH9/B;

    move-result-object v6

    invoke-virtual {v0, v6}, LH9/B$a;->o(LH9/B;)LH9/B$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/B$a;->c()LH9/B;

    move-result-object v0

    :cond_0
    move-object v7, v0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :goto_2
    invoke-virtual {v1}, LM9/e;->r()LM9/c;

    move-result-object v0

    invoke-direct {p0, v7, v0}, LN9/j;->c(LH9/B;LM9/c;)LH9/z;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LM9/c;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, LM9/e;->C()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    invoke-virtual {v1, v3}, LM9/e;->l(Z)V

    return-object v7

    :cond_2
    :try_start_3
    invoke-virtual {v6}, LH9/z;->a()LH9/A;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LH9/A;->d()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    invoke-virtual {v1, v3}, LM9/e;->l(Z)V

    return-object v7

    :cond_3
    :try_start_4
    invoke-virtual {v7}, LH9/B;->a()LH9/C;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_4
    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_5

    invoke-virtual {v1, v5}, LM9/e;->l(Z)V

    move-object v0, v6

    goto :goto_0

    :cond_5
    :try_start_5
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Too many follow-up requests: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v6

    instance-of v9, v6, LP9/a;

    xor-int/2addr v9, v5

    invoke-direct {p0, v6, v1, v0, v9}, LN9/j;->e(Ljava/io/IOException;LM9/e;LH9/z;Z)Z

    move-result v9

    if-eqz v9, :cond_6

    check-cast v2, Ljava/util/Collection;

    :goto_3
    invoke-static {v2, v6}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v1, v5}, LM9/e;->l(Z)V

    move v6, v3

    goto/16 :goto_1

    :cond_6
    :try_start_6
    invoke-static {v6, v2}, LI9/d;->Z(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :catch_1
    move-exception v6

    invoke-virtual {v6}, LM9/i;->c()Ljava/io/IOException;

    move-result-object v9

    invoke-direct {p0, v9, v1, v0, v3}, LN9/j;->e(Ljava/io/IOException;LM9/e;LH9/z;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v6}, LM9/i;->b()Ljava/io/IOException;

    move-result-object v6

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, LM9/i;->b()Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1, v2}, LI9/d;->Z(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_4
    invoke-virtual {v1, v5}, LM9/e;->l(Z)V

    throw p1
.end method
