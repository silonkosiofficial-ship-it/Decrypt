.class public final LJ9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH9/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ9/a$a;
    }
.end annotation


# instance fields
.field private final d:LH9/q;


# direct methods
.method public constructor <init>(LH9/q;)V
    .locals 1

    const-string v0, "defaultDns"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ9/a;->d:LH9/q;

    return-void
.end method

.method public synthetic constructor <init>(LH9/q;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, LH9/q;->b:LH9/q;

    :cond_0
    invoke-direct {p0, p1}, LJ9/a;-><init>(LH9/q;)V

    return-void
.end method

.method private final b(Ljava/net/Proxy;LH9/u;LH9/q;)Ljava/net/InetAddress;
    .locals 2

    .prologue
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, LJ9/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, LH9/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, LH9/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetAddress;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p1

    const-string p2, "address() as InetSocketAddress).address"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method


# virtual methods
.method public a(LH9/D;LH9/B;)LH9/z;
    .locals 19

    .prologue
    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, LH9/B;->i()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, LH9/B;->r0()LH9/z;

    move-result-object v3

    invoke-virtual {v3}, LH9/z;->i()LH9/u;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, LH9/B;->o()I

    move-result v2

    const/16 v5, 0x197

    const/4 v6, 0x1

    if-ne v2, v5, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual/range {p1 .. p1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v5

    if-nez v5, :cond_2

    :cond_1
    sget-object v5, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LH9/h;

    invoke-virtual {v7}, LH9/h;->c()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Basic"

    invoke-static {v9, v8, v6}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual/range {p1 .. p1}, LH9/D;->a()LH9/a;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, LH9/a;->c()LH9/q;

    move-result-object v8

    if-nez v8, :cond_6

    :cond_5
    iget-object v8, v0, LJ9/a;->d:LH9/q;

    :cond_6
    const-string v9, "proxy"

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-static {v10, v11}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/net/InetSocketAddress;

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v5, v4, v8}, LJ9/a;->b(Ljava/net/Proxy;LH9/u;LH9/q;)Ljava/net/InetAddress;

    move-result-object v12

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v13

    invoke-virtual {v4}, LH9/u;->p()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, LH9/h;->b()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7}, LH9/h;->c()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4}, LH9/u;->r()Ljava/net/URL;

    move-result-object v17

    sget-object v18, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    invoke-static/range {v11 .. v18}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, LH9/u;->h()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v5, v4, v8}, LJ9/a;->b(Ljava/net/Proxy;LH9/u;LH9/q;)Ljava/net/InetAddress;

    move-result-object v8

    invoke-virtual {v4}, LH9/u;->l()I

    move-result v11

    invoke-virtual {v4}, LH9/u;->p()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, LH9/h;->b()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7}, LH9/h;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, LH9/u;->r()Ljava/net/URL;

    move-result-object v15

    sget-object v16, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    move-object v9, v10

    move-object v10, v8

    invoke-static/range {v9 .. v16}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v8

    :goto_2
    if-eqz v8, :cond_3

    if-eqz v2, :cond_8

    const-string v1, "Proxy-Authorization"

    goto :goto_3

    :cond_8
    const-string v1, "Authorization"

    :goto_3
    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "auth.userName"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v4

    const-string v5, "auth.password"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v7}, LH9/h;->a()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-static {v2, v5, v4}, LH9/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, LH9/z;->h()LH9/z$a;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v1

    invoke-virtual {v1}, LH9/z$a;->b()LH9/z;

    move-result-object v1

    return-object v1

    :cond_9
    const/4 v1, 0x0

    return-object v1
.end method
