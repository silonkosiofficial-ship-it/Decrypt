.class public final LM9/f;
.super LP9/f$c;
.source "SourceFile"

# interfaces
.implements LH9/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM9/f$a;,
        LM9/f$b;
    }
.end annotation


# static fields
.field public static final t:LM9/f$a;


# instance fields
.field private final c:LM9/g;

.field private final d:LH9/D;

.field private e:Ljava/net/Socket;

.field private f:Ljava/net/Socket;

.field private g:LH9/s;

.field private h:LH9/y;

.field private i:LP9/f;

.field private j:LX9/f;

.field private k:LX9/e;

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private final r:Ljava/util/List;

.field private s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM9/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM9/f$a;-><init>(Ly7/k;)V

    sput-object v0, LM9/f;->t:LM9/f$a;

    return-void
.end method

.method public constructor <init>(LM9/g;LH9/D;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LP9/f$c;-><init>()V

    iput-object p1, p0, LM9/f;->c:LM9/g;

    iput-object p2, p0, LM9/f;->d:LH9/D;

    const/4 p1, 0x1

    iput p1, p0, LM9/f;->q:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LM9/f;->r:Ljava/util/List;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, LM9/f;->s:J

    return-void
.end method

.method private final B(Ljava/util/List;)Z
    .locals 4

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH9/D;

    invoke-virtual {v0}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_1

    iget-object v2, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v2}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-ne v2, v3, :cond_1

    iget-object v2, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v2}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v0}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private final F(I)V
    .locals 7

    iget-object v0, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LM9/f;->j:LX9/f;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, LM9/f;->k:LX9/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, LP9/f$a;

    const/4 v5, 0x1

    sget-object v6, LL9/e;->i:LL9/e;

    invoke-direct {v4, v5, v6}, LP9/f$a;-><init>(ZLL9/e;)V

    iget-object v5, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v5}, LH9/D;->a()LH9/a;

    move-result-object v5

    invoke-virtual {v5}, LH9/a;->l()LH9/u;

    move-result-object v5

    invoke-virtual {v5}, LH9/u;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5, v1, v2}, LP9/f$a;->q(Ljava/net/Socket;Ljava/lang/String;LX9/f;LX9/e;)LP9/f$a;

    move-result-object v0

    invoke-virtual {v0, p0}, LP9/f$a;->k(LP9/f$c;)LP9/f$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LP9/f$a;->l(I)LP9/f$a;

    move-result-object p1

    invoke-virtual {p1}, LP9/f$a;->a()LP9/f;

    move-result-object p1

    iput-object p1, p0, LM9/f;->i:LP9/f;

    sget-object v0, LP9/f;->e0:LP9/f$b;

    invoke-virtual {v0}, LP9/f$b;->a()LP9/m;

    move-result-object v0

    invoke-virtual {v0}, LP9/m;->d()I

    move-result v0

    iput v0, p0, LM9/f;->q:I

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v3, v0, v1, v0}, LP9/f;->D1(LP9/f;ZLL9/e;ILjava/lang/Object;)V

    return-void
.end method

.method private final G(LH9/u;)Z
    .locals 4

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {p1}, LH9/u;->l()I

    move-result v1

    invoke-virtual {v0}, LH9/u;->l()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    invoke-virtual {p1}, LH9/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, LM9/f;->m:Z

    if-nez v0, :cond_4

    iget-object v0, p0, LM9/f;->g:LH9/s;

    if-eqz v0, :cond_4

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, LM9/f;->e(LH9/u;LH9/s;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v3, v1

    :cond_4
    return v3
.end method

.method public static final synthetic c(LM9/f;)LH9/s;
    .locals 0

    iget-object p0, p0, LM9/f;->g:LH9/s;

    return-object p0
.end method

.method private final e(LH9/u;LH9/s;)Z
    .locals 4

    .prologue
    invoke-virtual {p2}, LH9/s;->d()Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v0, LU9/d;->a:LU9/d;

    invoke-virtual {p1}, LH9/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p2, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, p2}, LU9/d;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1
.end method

.method private final h(IILH9/e;LH9/r;)V
    .locals 4

    .prologue
    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, LM9/f$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LH9/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_1
    iput-object v1, p0, LM9/f;->e:Ljava/net/Socket;

    iget-object v2, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v2}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {p4, p3, v2, v0}, LH9/r;->i(LH9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    invoke-virtual {v1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {p2}, LQ9/k$a;->g()LQ9/k;

    move-result-object p2

    iget-object p3, p0, LM9/f;->d:LH9/D;

    invoke-virtual {p3}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, LQ9/k;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v1}, LX9/K;->g(Ljava/net/Socket;)LX9/Z;

    move-result-object p1

    invoke-static {p1}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object p1

    iput-object p1, p0, LM9/f;->j:LX9/f;

    invoke-static {v1}, LX9/K;->d(Ljava/net/Socket;)LX9/X;

    move-result-object p1

    invoke-static {p1}, LX9/K;->a(LX9/X;)LX9/e;

    move-result-object p1

    iput-object p1, p0, LM9/f;->k:LX9/e;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, LM9/f;->d:LH9/D;

    invoke-virtual {p4}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private final i(LM9/b;)V
    .locals 10

    .prologue
    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LM9/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v4

    invoke-virtual {v4}, LH9/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v5

    invoke-virtual {v5}, LH9/u;->l()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-static {v1, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, LM9/b;->a(Ljavax/net/ssl/SSLSocket;)LH9/l;

    move-result-object p1

    invoke-virtual {p1}, LH9/l;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v3}, LQ9/k$a;->g()LQ9/k;

    move-result-object v3

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v4

    invoke-virtual {v4}, LH9/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LH9/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, LQ9/k;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    sget-object v4, LH9/s;->e:LH9/s$a;

    const-string v5, "sslSocketSession"

    invoke-static {v3, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, LH9/s$a;->a(Ljavax/net/ssl/SSLSession;)LH9/s;

    move-result-object v4

    invoke-virtual {v0}, LH9/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v7

    invoke-virtual {v7}, LH9/u;->h()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, LH9/s;->d()Ljava/util/List;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {p1, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v3, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\n              |Hostname "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n              |    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, LH9/g;->c:LH9/g$b;

    invoke-virtual {v0, p1}, LH9/g$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, LU9/d;->a:LU9/d;

    invoke-virtual {v0, p1}, LU9/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v6, v2}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hostname "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, LH9/a;->a()LH9/g;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v5, LH9/s;

    invoke-virtual {v4}, LH9/s;->e()LH9/E;

    move-result-object v6

    invoke-virtual {v4}, LH9/s;->a()LH9/i;

    move-result-object v7

    invoke-virtual {v4}, LH9/s;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, LM9/f$c;

    invoke-direct {v9, v3, v4, v0}, LM9/f$c;-><init>(LH9/g;LH9/s;LH9/a;)V

    invoke-direct {v5, v6, v7, v8, v9}, LH9/s;-><init>(LH9/E;LH9/i;Ljava/util/List;Lx7/a;)V

    iput-object v5, p0, LM9/f;->g:LH9/s;

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v4, LM9/f$d;

    invoke-direct {v4, p0}, LM9/f$d;-><init>(LM9/f;)V

    invoke-virtual {v3, v0, v4}, LH9/g;->b(Ljava/lang/String;Lx7/a;)V

    invoke-virtual {p1}, LH9/l;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {p1}, LQ9/k$a;->g()LQ9/k;

    move-result-object p1

    invoke-virtual {p1, v1}, LQ9/k;->g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iput-object v1, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v1}, LX9/K;->g(Ljava/net/Socket;)LX9/Z;

    move-result-object p1

    invoke-static {p1}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object p1

    iput-object p1, p0, LM9/f;->j:LX9/f;

    invoke-static {v1}, LX9/K;->d(Ljava/net/Socket;)LX9/X;

    move-result-object p1

    invoke-static {p1}, LX9/K;->a(LX9/X;)LX9/e;

    move-result-object p1

    iput-object p1, p0, LM9/f;->k:LX9/e;

    if-eqz v2, :cond_4

    sget-object p1, LH9/y;->D:LH9/y$a;

    invoke-virtual {p1, v2}, LH9/y$a;->a(Ljava/lang/String;)LH9/y;

    move-result-object p1

    goto :goto_1

    :cond_4
    sget-object p1, LH9/y;->F:LH9/y;

    :goto_1
    iput-object p1, p0, LM9/f;->h:LH9/y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {p1}, LQ9/k$a;->g()LQ9/k;

    move-result-object p1

    invoke-virtual {p1, v1}, LQ9/k;->b(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_1
    move-exception p1

    :goto_2
    if-eqz v2, :cond_5

    sget-object v0, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v0}, LQ9/k$a;->g()LQ9/k;

    move-result-object v0

    invoke-virtual {v0, v2}, LQ9/k;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-static {v2}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_6
    throw p1
.end method

.method private final j(IIILH9/e;LH9/r;)V
    .locals 6

    .prologue
    invoke-direct {p0}, LM9/f;->l()LH9/z;

    move-result-object v0

    invoke-virtual {v0}, LH9/z;->i()LH9/u;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_2

    invoke-direct {p0, p1, p2, p4, p5}, LM9/f;->h(IILH9/e;LH9/r;)V

    invoke-direct {p0, p2, p3, v0, v1}, LM9/f;->k(IILH9/z;LH9/u;)LH9/z;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, LM9/f;->e:Ljava/net/Socket;

    if-eqz v3, :cond_1

    invoke-static {v3}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_1
    const/4 v3, 0x0

    iput-object v3, p0, LM9/f;->e:Ljava/net/Socket;

    iput-object v3, p0, LM9/f;->k:LX9/e;

    iput-object v3, p0, LM9/f;->j:LX9/f;

    iget-object v4, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v4}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v5}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, LH9/r;->g(LH9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LH9/y;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private final k(IILH9/z;LH9/u;)LH9/z;
    .locals 9

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, LI9/d;->R(LH9/u;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    iget-object v0, p0, LM9/f;->j:LX9/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, LM9/f;->k:LX9/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v3, LO9/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0, v0, v2}, LO9/b;-><init>(LH9/x;LM9/f;LX9/f;LX9/e;)V

    invoke-interface {v0}, LX9/Z;->k()LX9/a0;

    move-result-object v5

    int-to-long v6, p1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v6, v7, v8}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    invoke-interface {v2}, LX9/X;->k()LX9/a0;

    move-result-object v5

    int-to-long v6, p2

    invoke-virtual {v5, v6, v7, v8}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    invoke-virtual {p3}, LH9/z;->e()LH9/t;

    move-result-object v5

    invoke-virtual {v3, v5, p4}, LO9/b;->A(LH9/t;Ljava/lang/String;)V

    invoke-virtual {v3}, LO9/b;->b()V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, LO9/b;->d(Z)LH9/B$a;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, p3}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object p3

    invoke-virtual {p3}, LH9/B$a;->c()LH9/B;

    move-result-object p3

    invoke-virtual {v3, p3}, LO9/b;->z(LH9/B;)V

    invoke-virtual {p3}, LH9/B;->o()I

    move-result v3

    const/16 v5, 0xc8

    if-eq v3, v5, :cond_3

    const/16 v0, 0x197

    if-ne v3, v0, :cond_2

    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->h()LH9/b;

    move-result-object v0

    iget-object v2, p0, LM9/f;->d:LH9/D;

    invoke-interface {v0, v2, p3}, LH9/b;->a(LH9/D;LH9/B;)LH9/z;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "Connection"

    const/4 v3, 0x2

    invoke-static {p3, v2, v4, v3, v4}, LH9/B;->D(LH9/B;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "close"

    invoke-static {v2, p3, v1}, LS8/r;->K(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, LH9/B;->o()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {v0}, LX9/f;->d()LX9/d;

    move-result-object p1

    invoke-virtual {p1}, LX9/d;->j()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v2}, LX9/e;->d()LX9/d;

    move-result-object p1

    invoke-virtual {p1}, LX9/d;->j()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v4

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final l()LH9/z;
    .locals 4

    .prologue
    new-instance v0, LH9/z$a;

    invoke-direct {v0}, LH9/z$a;-><init>()V

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    invoke-virtual {v0, v1}, LH9/z$a;->g(LH9/u;)LH9/z$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LH9/z$a;->e(Ljava/lang/String;LH9/A;)LH9/z$a;

    move-result-object v0

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, LI9/d;->R(LH9/u;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "okhttp/4.12.0"

    invoke-virtual {v0, v1, v2}, LH9/z$a;->c(Ljava/lang/String;Ljava/lang/String;)LH9/z$a;

    move-result-object v0

    invoke-virtual {v0}, LH9/z$a;->b()LH9/z;

    move-result-object v0

    new-instance v1, LH9/B$a;

    invoke-direct {v1}, LH9/B$a;-><init>()V

    invoke-virtual {v1, v0}, LH9/B$a;->r(LH9/z;)LH9/B$a;

    move-result-object v1

    sget-object v2, LH9/y;->F:LH9/y;

    invoke-virtual {v1, v2}, LH9/B$a;->p(LH9/y;)LH9/B$a;

    move-result-object v1

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, LH9/B$a;->g(I)LH9/B$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, LH9/B$a;->m(Ljava/lang/String;)LH9/B$a;

    move-result-object v1

    sget-object v2, LI9/d;->c:LH9/C;

    invoke-virtual {v1, v2}, LH9/B$a;->b(LH9/C;)LH9/B$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, LH9/B$a;->s(J)LH9/B$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, LH9/B$a;->q(J)LH9/B$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, LH9/B$a;->j(Ljava/lang/String;Ljava/lang/String;)LH9/B$a;

    move-result-object v1

    invoke-virtual {v1}, LH9/B$a;->c()LH9/B;

    move-result-object v1

    iget-object v2, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v2}, LH9/D;->a()LH9/a;

    move-result-object v2

    invoke-virtual {v2}, LH9/a;->h()LH9/b;

    move-result-object v2

    iget-object v3, p0, LM9/f;->d:LH9/D;

    invoke-interface {v2, v3, v1}, LH9/b;->a(LH9/D;LH9/B;)LH9/z;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method private final m(LM9/b;ILH9/e;LH9/r;)V
    .locals 1

    .prologue
    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {p1}, LH9/D;->a()LH9/a;

    move-result-object p1

    invoke-virtual {p1}, LH9/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, LH9/y;->I:LH9/y;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LM9/f;->e:Ljava/net/Socket;

    iput-object p1, p0, LM9/f;->f:Ljava/net/Socket;

    iput-object p3, p0, LM9/f;->h:LH9/y;

    invoke-direct {p0, p2}, LM9/f;->F(I)V

    return-void

    :cond_0
    iget-object p1, p0, LM9/f;->e:Ljava/net/Socket;

    iput-object p1, p0, LM9/f;->f:Ljava/net/Socket;

    sget-object p1, LH9/y;->F:LH9/y;

    iput-object p1, p0, LM9/f;->h:LH9/y;

    return-void

    :cond_1
    invoke-virtual {p4, p3}, LH9/r;->B(LH9/e;)V

    invoke-direct {p0, p1}, LM9/f;->i(LM9/b;)V

    iget-object p1, p0, LM9/f;->g:LH9/s;

    invoke-virtual {p4, p3, p1}, LH9/r;->A(LH9/e;LH9/s;)V

    iget-object p1, p0, LM9/f;->h:LH9/y;

    sget-object p3, LH9/y;->H:LH9/y;

    if-ne p1, p3, :cond_2

    invoke-direct {p0, p2}, LM9/f;->F(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public A()LH9/D;
    .locals 1

    iget-object v0, p0, LM9/f;->d:LH9/D;

    return-object v0
.end method

.method public final C(J)V
    .locals 0

    iput-wide p1, p0, LM9/f;->s:J

    return-void
.end method

.method public final D(Z)V
    .locals 0

    iput-boolean p1, p0, LM9/f;->l:Z

    return-void
.end method

.method public E()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final declared-synchronized H(LM9/e;Ljava/io/IOException;)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LP9/n;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, LP9/n;

    iget-object v0, v0, LP9/n;->C:LP9/b;

    sget-object v2, LP9/b;->L:LP9/b;

    if-ne v0, v2, :cond_0

    iget p1, p0, LM9/f;->p:I

    add-int/2addr p1, v1

    iput p1, p0, LM9/f;->p:I

    if-le p1, v1, :cond_5

    iput-boolean v1, p0, LM9/f;->l:Z

    iget p1, p0, LM9/f;->n:I

    :goto_0
    add-int/2addr p1, v1

    iput p1, p0, LM9/f;->n:I

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    check-cast p2, LP9/n;

    iget-object p2, p2, LP9/n;->C:LP9/b;

    sget-object v0, LP9/b;->M:LP9/b;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, LM9/e;->D()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_1
    iput-boolean v1, p0, LM9/f;->l:Z

    iget p1, p0, LM9/f;->n:I

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LM9/f;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p2, LP9/a;

    if-eqz v0, :cond_5

    :cond_3
    iput-boolean v1, p0, LM9/f;->l:Z

    iget v0, p0, LM9/f;->o:I

    if-nez v0, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p1}, LM9/e;->m()LH9/x;

    move-result-object p1

    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {p0, p1, v0, p2}, LM9/f;->g(LH9/x;LH9/D;Ljava/io/IOException;)V

    :cond_4
    iget p1, p0, LM9/f;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(LP9/f;LP9/m;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LP9/m;->d()I

    move-result p1

    iput p1, p0, LM9/f;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(LP9/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP9/b;->L:LP9/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LP9/i;->d(LP9/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    iget-object v0, p0, LM9/f;->e:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final f(IIIIZLH9/e;LH9/r;)V
    .locals 16

    .prologue
    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    const-string v0, "call"

    invoke-static {v8, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, LM9/f;->h:LH9/y;

    if-nez v0, :cond_c

    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v10, LM9/b;

    invoke-direct {v10, v0}, LM9/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    sget-object v1, LH9/l;->k:LH9/l;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v1}, LQ9/k$a;->g()LQ9/k;

    move-result-object v1

    invoke-virtual {v1, v0}, LQ9/k;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, LM9/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, LM9/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, LM9/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LM9/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, LH9/y;->I:LH9/y;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    :goto_1
    :try_start_0
    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v6}, LM9/f;->j(IIILH9/e;LH9/r;)V

    iget-object v0, v7, LM9/f;->e:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    :goto_2
    move/from16 v15, p4

    goto :goto_4

    :catch_0
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_3
    move/from16 v15, p4

    goto :goto_7

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    :try_start_1
    invoke-direct {v7, v13, v14, v8, v9}, LM9/f;->h(IILH9/e;LH9/r;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :goto_4
    :try_start_2
    invoke-direct {v7, v10, v15, v8, v9}, LM9/f;->m(LM9/b;ILH9/e;LH9/r;)V

    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, LM9/f;->h:LH9/y;

    invoke-virtual {v9, v8, v0, v1, v2}, LH9/r;->g(LH9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LH9/y;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_5
    iget-object v0, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, LM9/f;->e:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_6

    :cond_5
    new-instance v0, LM9/i;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LM9/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_6
    :goto_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, LM9/f;->s:J

    return-void

    :catch_1
    move-exception v0

    goto :goto_7

    :catch_2
    move-exception v0

    goto :goto_3

    :goto_7
    iget-object v1, v7, LM9/f;->f:Ljava/net/Socket;

    if-eqz v1, :cond_7

    invoke-static {v1}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_7
    iget-object v1, v7, LM9/f;->e:Ljava/net/Socket;

    if-eqz v1, :cond_8

    invoke-static {v1}, LI9/d;->n(Ljava/net/Socket;)V

    :cond_8
    iput-object v11, v7, LM9/f;->f:Ljava/net/Socket;

    iput-object v11, v7, LM9/f;->e:Ljava/net/Socket;

    iput-object v11, v7, LM9/f;->j:LX9/f;

    iput-object v11, v7, LM9/f;->k:LX9/e;

    iput-object v11, v7, LM9/f;->g:LH9/s;

    iput-object v11, v7, LM9/f;->h:LH9/y;

    iput-object v11, v7, LM9/f;->i:LP9/f;

    const/4 v1, 0x1

    iput v1, v7, LM9/f;->q:I

    iget-object v1, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, LH9/r;->h(LH9/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LH9/y;Ljava/io/IOException;)V

    if-nez v12, :cond_9

    new-instance v12, LM9/i;

    invoke-direct {v12, v0}, LM9/i;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v12, v0}, LM9/i;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_a

    invoke-virtual {v10, v0}, LM9/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_1

    :cond_a
    throw v12

    :cond_b
    new-instance v0, LM9/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, LM9/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(LH9/x;LH9/D;Ljava/io/IOException;)V
    .locals 3

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0}, LH9/a;->i()Ljava/net/ProxySelector;

    move-result-object v1

    invoke-virtual {v0}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->q()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p2}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    invoke-virtual {p1}, LH9/x;->x()LM9/h;

    move-result-object p1

    invoke-virtual {p1, p2}, LM9/h;->b(LH9/D;)V

    return-void
.end method

.method public final n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM9/f;->r:Ljava/util/List;

    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, LM9/f;->s:J

    return-wide v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, LM9/f;->l:Z

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, LM9/f;->n:I

    return v0
.end method

.method public r()LH9/s;
    .locals 1

    iget-object v0, p0, LM9/f;->g:LH9/s;

    return-object v0
.end method

.method public final declared-synchronized s()V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget v0, p0, LM9/f;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LM9/f;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final t(LH9/a;Ljava/util/List;)Z
    .locals 3

    .prologue
    const-string v0, "address"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " MUST hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LM9/f;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, LM9/f;->q:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-boolean v0, p0, LM9/f;->l:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v0}, LH9/D;->a()LH9/a;

    move-result-object v0

    invoke-virtual {v0, p1}, LH9/a;->d(LH9/a;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-virtual {p1}, LH9/a;->l()LH9/u;

    move-result-object v0

    invoke-virtual {v0}, LH9/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, LM9/f;->A()LH9/D;

    move-result-object v1

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    invoke-virtual {v1}, LH9/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, LM9/f;->i:LP9/f;

    if-nez v0, :cond_5

    return v2

    :cond_5
    if-eqz p2, :cond_9

    invoke-direct {p0, p2}, LM9/f;->B(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, LH9/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, LU9/d;->a:LU9/d;

    if-eq p2, v0, :cond_7

    return v2

    :cond_7
    invoke-virtual {p1}, LH9/a;->l()LH9/u;

    move-result-object p2

    invoke-direct {p0, p2}, LM9/f;->G(LH9/u;)Z

    move-result p2

    if-nez p2, :cond_8

    return v2

    :cond_8
    :try_start_0
    invoke-virtual {p1}, LH9/a;->a()LH9/g;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LH9/a;->l()LH9/u;

    move-result-object p1

    invoke-virtual {p1}, LH9/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, LM9/f;->r()LH9/s;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LH9/s;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, LH9/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    invoke-virtual {v1}, LH9/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->a()LH9/a;

    move-result-object v1

    invoke-virtual {v1}, LH9/a;->l()LH9/u;

    move-result-object v1

    invoke-virtual {v1}, LH9/u;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->d:LH9/D;

    invoke-virtual {v1}, LH9/D;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->g:LH9/s;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LH9/s;->a()LH9/i;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "none"

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM9/f;->h:LH9/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Z)Z
    .locals 7

    .prologue
    sget-boolean v0, LI9/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, LM9/f;->e:Ljava/net/Socket;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v4, p0, LM9/f;->j:LX9/f;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, LM9/f;->i:LP9/f;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0, v1}, LP9/f;->e1(J)Z

    move-result p1

    return p1

    :cond_3
    monitor-enter p0

    :try_start_0
    iget-wide v5, p0, LM9/f;->s:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v5

    monitor-exit p0

    const-wide v5, 0x2540be400L

    cmp-long v0, v0, v5

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    invoke-static {v3, v4}, LI9/d;->F(Ljava/net/Socket;LX9/f;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final v()Z
    .locals 1

    .prologue
    iget-object v0, p0, LM9/f;->i:LP9/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w(LH9/x;LN9/g;)LN9/d;
    .locals 6

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LM9/f;->j:LX9/f;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, LM9/f;->k:LX9/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v3, p0, LM9/f;->i:LP9/f;

    if-eqz v3, :cond_0

    new-instance v0, LP9/g;

    invoke-direct {v0, p1, p0, p2, v3}, LP9/g;-><init>(LH9/x;LM9/f;LN9/g;LP9/f;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, LN9/g;->k()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-interface {v1}, LX9/Z;->k()LX9/a0;

    move-result-object v0

    invoke-virtual {p2}, LN9/g;->h()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    invoke-interface {v2}, LX9/X;->k()LX9/a0;

    move-result-object v0

    invoke-virtual {p2}, LN9/g;->j()I

    move-result p2

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    new-instance v0, LO9/b;

    invoke-direct {v0, p1, p0, v1, v2}, LO9/b;-><init>(LH9/x;LM9/f;LX9/f;LX9/e;)V

    :goto_0
    return-object v0
.end method

.method public final x(LM9/c;)LV9/d$d;
    .locals 4

    const-string v0, "exchange"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM9/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, LM9/f;->j:LX9/f;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v2, p0, LM9/f;->k:LX9/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {p0}, LM9/f;->z()V

    new-instance v0, LM9/f$e;

    invoke-direct {v0, v1, v2, p1}, LM9/f$e;-><init>(LX9/f;LX9/e;LM9/c;)V

    return-object v0
.end method

.method public final declared-synchronized y()V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, LM9/f;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized z()V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, LM9/f;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
