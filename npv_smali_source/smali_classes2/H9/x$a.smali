.class public final LH9/x$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:J

.field private C:LM9/h;

.field private a:LH9/p;

.field private b:LH9/k;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:LH9/r$c;

.field private f:Z

.field private g:LH9/b;

.field private h:Z

.field private i:Z

.field private j:LH9/n;

.field private k:LH9/q;

.field private l:Ljava/net/Proxy;

.field private m:Ljava/net/ProxySelector;

.field private n:LH9/b;

.field private o:Ljavax/net/SocketFactory;

.field private p:Ljavax/net/ssl/SSLSocketFactory;

.field private q:Ljavax/net/ssl/X509TrustManager;

.field private r:Ljava/util/List;

.field private s:Ljava/util/List;

.field private t:Ljavax/net/ssl/HostnameVerifier;

.field private u:LH9/g;

.field private v:LU9/c;

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LH9/p;

    invoke-direct {v0}, LH9/p;-><init>()V

    iput-object v0, p0, LH9/x$a;->a:LH9/p;

    new-instance v0, LH9/k;

    invoke-direct {v0}, LH9/k;-><init>()V

    iput-object v0, p0, LH9/x$a;->b:LH9/k;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LH9/x$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LH9/x$a;->d:Ljava/util/List;

    sget-object v0, LH9/r;->b:LH9/r;

    invoke-static {v0}, LI9/d;->g(LH9/r;)LH9/r$c;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->e:LH9/r$c;

    const/4 v0, 0x1

    iput-boolean v0, p0, LH9/x$a;->f:Z

    sget-object v1, LH9/b;->b:LH9/b;

    iput-object v1, p0, LH9/x$a;->g:LH9/b;

    iput-boolean v0, p0, LH9/x$a;->h:Z

    iput-boolean v0, p0, LH9/x$a;->i:Z

    sget-object v0, LH9/n;->b:LH9/n;

    iput-object v0, p0, LH9/x$a;->j:LH9/n;

    sget-object v0, LH9/q;->b:LH9/q;

    iput-object v0, p0, LH9/x$a;->k:LH9/q;

    iput-object v1, p0, LH9/x$a;->n:LH9/b;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LH9/x$a;->o:Ljavax/net/SocketFactory;

    sget-object v0, LH9/x;->f0:LH9/x$b;

    invoke-virtual {v0}, LH9/x$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, LH9/x$a;->r:Ljava/util/List;

    invoke-virtual {v0}, LH9/x$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->s:Ljava/util/List;

    sget-object v0, LU9/d;->a:LU9/d;

    iput-object v0, p0, LH9/x$a;->t:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, LH9/g;->d:LH9/g;

    iput-object v0, p0, LH9/x$a;->u:LH9/g;

    const/16 v0, 0x2710

    iput v0, p0, LH9/x$a;->x:I

    iput v0, p0, LH9/x$a;->y:I

    iput v0, p0, LH9/x$a;->z:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, LH9/x$a;->B:J

    return-void
.end method

.method public constructor <init>(LH9/x;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LH9/x$a;-><init>()V

    invoke-virtual {p1}, LH9/x;->r()LH9/p;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->a:LH9/p;

    invoke-virtual {p1}, LH9/x;->n()LH9/k;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->b:LH9/k;

    iget-object v0, p0, LH9/x$a;->c:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, LH9/x;->z()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object v0, p0, LH9/x$a;->d:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, LH9/x;->B()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    invoke-virtual {p1}, LH9/x;->u()LH9/r$c;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->e:LH9/r$c;

    invoke-virtual {p1}, LH9/x;->L()Z

    move-result v0

    iput-boolean v0, p0, LH9/x$a;->f:Z

    invoke-virtual {p1}, LH9/x;->e()LH9/b;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->g:LH9/b;

    invoke-virtual {p1}, LH9/x;->v()Z

    move-result v0

    iput-boolean v0, p0, LH9/x$a;->h:Z

    invoke-virtual {p1}, LH9/x;->w()Z

    move-result v0

    iput-boolean v0, p0, LH9/x$a;->i:Z

    invoke-virtual {p1}, LH9/x;->q()LH9/n;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->j:LH9/n;

    invoke-virtual {p1}, LH9/x;->h()LH9/c;

    invoke-virtual {p1}, LH9/x;->t()LH9/q;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->k:LH9/q;

    invoke-virtual {p1}, LH9/x;->H()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->l:Ljava/net/Proxy;

    invoke-virtual {p1}, LH9/x;->J()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->m:Ljava/net/ProxySelector;

    invoke-virtual {p1}, LH9/x;->I()LH9/b;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->n:LH9/b;

    invoke-virtual {p1}, LH9/x;->M()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->o:Ljavax/net/SocketFactory;

    invoke-static {p1}, LH9/x;->d(LH9/x;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    invoke-virtual {p1}, LH9/x;->S()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->q:Ljavax/net/ssl/X509TrustManager;

    invoke-virtual {p1}, LH9/x;->p()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->r:Ljava/util/List;

    invoke-virtual {p1}, LH9/x;->G()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->s:Ljava/util/List;

    invoke-virtual {p1}, LH9/x;->y()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->t:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {p1}, LH9/x;->l()LH9/g;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->u:LH9/g;

    invoke-virtual {p1}, LH9/x;->k()LU9/c;

    move-result-object v0

    iput-object v0, p0, LH9/x$a;->v:LU9/c;

    invoke-virtual {p1}, LH9/x;->j()I

    move-result v0

    iput v0, p0, LH9/x$a;->w:I

    invoke-virtual {p1}, LH9/x;->m()I

    move-result v0

    iput v0, p0, LH9/x$a;->x:I

    invoke-virtual {p1}, LH9/x;->K()I

    move-result v0

    iput v0, p0, LH9/x$a;->y:I

    invoke-virtual {p1}, LH9/x;->Q()I

    move-result v0

    iput v0, p0, LH9/x$a;->z:I

    invoke-virtual {p1}, LH9/x;->F()I

    move-result v0

    iput v0, p0, LH9/x$a;->A:I

    invoke-virtual {p1}, LH9/x;->A()J

    move-result-wide v0

    iput-wide v0, p0, LH9/x$a;->B:J

    invoke-virtual {p1}, LH9/x;->x()LM9/h;

    move-result-object p1

    iput-object p1, p0, LH9/x$a;->C:LM9/h;

    return-void
.end method


# virtual methods
.method public final A()Ljava/net/Proxy;
    .locals 1

    iget-object v0, p0, LH9/x$a;->l:Ljava/net/Proxy;

    return-object v0
.end method

.method public final B()LH9/b;
    .locals 1

    iget-object v0, p0, LH9/x$a;->n:LH9/b;

    return-object v0
.end method

.method public final C()Ljava/net/ProxySelector;
    .locals 1

    iget-object v0, p0, LH9/x$a;->m:Ljava/net/ProxySelector;

    return-object v0
.end method

.method public final D()I
    .locals 1

    iget v0, p0, LH9/x$a;->y:I

    return v0
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, LH9/x$a;->f:Z

    return v0
.end method

.method public final F()LM9/h;
    .locals 1

    iget-object v0, p0, LH9/x$a;->C:LM9/h;

    return-object v0
.end method

.method public final G()Ljavax/net/SocketFactory;
    .locals 1

    iget-object v0, p0, LH9/x$a;->o:Ljavax/net/SocketFactory;

    return-object v0
.end method

.method public final H()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    iget-object v0, p0, LH9/x$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    return-object v0
.end method

.method public final I()I
    .locals 1

    iget v0, p0, LH9/x$a;->z:I

    return v0
.end method

.method public final J()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    iget-object v0, p0, LH9/x$a;->q:Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method

.method public final K(Ljava/util/List;)LH9/x$a;
    .locals 3

    .prologue
    const-string v0, "protocols"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    sget-object v0, LH9/y;->I:LH9/y;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, LH9/y;->F:LH9/y;

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v0, LH9/y;->E:LH9/y;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_6

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v1, :cond_5

    sget-object v1, LH9/y;->G:LH9/y;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, LH9/x$a;->s:Ljava/util/List;

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v0, p0, LH9/x$a;->C:LM9/h;

    :cond_4
    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "unmodifiableList(protocolsCopy)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/x$a;->s:Ljava/util/List;

    return-object p0

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "protocols must not contain null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "protocols must not contain http/1.0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L(Ljava/net/Proxy;)LH9/x$a;
    .locals 1

    .prologue
    iget-object v0, p0, LH9/x$a;->l:Ljava/net/Proxy;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LH9/x$a;->C:LM9/h;

    :cond_0
    iput-object p1, p0, LH9/x$a;->l:Ljava/net/Proxy;

    return-object p0
.end method

.method public final M(JLjava/util/concurrent/TimeUnit;)LH9/x$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, LI9/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, LH9/x$a;->y:I

    return-object p0
.end method

.method public final N(Z)LH9/x$a;
    .locals 0

    iput-boolean p1, p0, LH9/x$a;->f:Z

    return-object p0
.end method

.method public final O(JLjava/util/concurrent/TimeUnit;)LH9/x$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, LI9/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, LH9/x$a;->z:I

    return-object p0
.end method

.method public final a()LH9/x;
    .locals 1

    new-instance v0, LH9/x;

    invoke-direct {v0, p0}, LH9/x;-><init>(LH9/x$a;)V

    return-object v0
.end method

.method public final b(JLjava/util/concurrent/TimeUnit;)LH9/x$a;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, LI9/d;->k(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, LH9/x$a;->x:I

    return-object p0
.end method

.method public final c(LH9/p;)LH9/x$a;
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/x$a;->a:LH9/p;

    return-object p0
.end method

.method public final d(LH9/r;)LH9/x$a;
    .locals 1

    const-string v0, "eventListener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LI9/d;->g(LH9/r;)LH9/r$c;

    move-result-object p1

    iput-object p1, p0, LH9/x$a;->e:LH9/r$c;

    return-object p0
.end method

.method public final e(Z)LH9/x$a;
    .locals 0

    iput-boolean p1, p0, LH9/x$a;->h:Z

    return-object p0
.end method

.method public final f(Z)LH9/x$a;
    .locals 0

    iput-boolean p1, p0, LH9/x$a;->i:Z

    return-object p0
.end method

.method public final g()LH9/b;
    .locals 1

    iget-object v0, p0, LH9/x$a;->g:LH9/b;

    return-object v0
.end method

.method public final h()LH9/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LH9/x$a;->w:I

    return v0
.end method

.method public final j()LU9/c;
    .locals 1

    iget-object v0, p0, LH9/x$a;->v:LU9/c;

    return-object v0
.end method

.method public final k()LH9/g;
    .locals 1

    iget-object v0, p0, LH9/x$a;->u:LH9/g;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, LH9/x$a;->x:I

    return v0
.end method

.method public final m()LH9/k;
    .locals 1

    iget-object v0, p0, LH9/x$a;->b:LH9/k;

    return-object v0
.end method

.method public final n()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH9/x$a;->r:Ljava/util/List;

    return-object v0
.end method

.method public final o()LH9/n;
    .locals 1

    iget-object v0, p0, LH9/x$a;->j:LH9/n;

    return-object v0
.end method

.method public final p()LH9/p;
    .locals 1

    iget-object v0, p0, LH9/x$a;->a:LH9/p;

    return-object v0
.end method

.method public final q()LH9/q;
    .locals 1

    iget-object v0, p0, LH9/x$a;->k:LH9/q;

    return-object v0
.end method

.method public final r()LH9/r$c;
    .locals 1

    iget-object v0, p0, LH9/x$a;->e:LH9/r$c;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, LH9/x$a;->h:Z

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, LH9/x$a;->i:Z

    return v0
.end method

.method public final u()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    iget-object v0, p0, LH9/x$a;->t:Ljavax/net/ssl/HostnameVerifier;

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH9/x$a;->c:Ljava/util/List;

    return-object v0
.end method

.method public final w()J
    .locals 2

    iget-wide v0, p0, LH9/x$a;->B:J

    return-wide v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH9/x$a;->d:Ljava/util/List;

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, LH9/x$a;->A:I

    return v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH9/x$a;->s:Ljava/util/List;

    return-object v0
.end method
