.class public final LQ9/b;
.super LQ9/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ9/b$a;
    }
.end annotation


# static fields
.field public static final e:LQ9/b$a;

.field private static final f:Z


# instance fields
.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    new-instance v0, LQ9/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ9/b$a;-><init>(Ly7/k;)V

    sput-object v0, LQ9/b;->e:LQ9/b$a;

    sget-object v0, LQ9/k;->a:LQ9/k$a;

    invoke-virtual {v0}, LQ9/k$a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, LQ9/b;->f:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .prologue
    invoke-direct {p0}, LQ9/k;-><init>()V

    sget-object v0, LR9/c;->a:LR9/c$a;

    invoke-virtual {v0}, LR9/c$a;->a()LR9/m;

    move-result-object v0

    new-instance v1, LR9/l;

    sget-object v2, LR9/h;->f:LR9/h$a;

    invoke-virtual {v2}, LR9/h$a;->d()LR9/l$a;

    move-result-object v2

    invoke-direct {v1, v2}, LR9/l;-><init>(LR9/l$a;)V

    new-instance v2, LR9/l;

    sget-object v3, LR9/k;->a:LR9/k$b;

    invoke-virtual {v3}, LR9/k$b;->a()LR9/l$a;

    move-result-object v3

    invoke-direct {v2, v3}, LR9/l;-><init>(LR9/l$a;)V

    new-instance v3, LR9/l;

    sget-object v4, LR9/i;->a:LR9/i$b;

    invoke-virtual {v4}, LR9/i$b;->a()LR9/l$a;

    move-result-object v4

    invoke-direct {v3, v4}, LR9/l;-><init>(LR9/l$a;)V

    const/4 v4, 0x4

    new-array v4, v4, [LR9/m;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-static {v4}, Lj7/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LR9/m;

    invoke-interface {v3}, LR9/m;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object v1, p0, LQ9/b;->d:Ljava/util/List;

    return-void
.end method

.method public static final synthetic p()Z
    .locals 1

    sget-boolean v0, LQ9/b;->f:Z

    return v0
.end method


# virtual methods
.method public c(Ljavax/net/ssl/X509TrustManager;)LU9/c;
    .locals 1

    .prologue
    const-string v0, "trustManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LR9/d;->d:LR9/d$a;

    invoke-virtual {v0, p1}, LR9/d$a;->a(Ljavax/net/ssl/X509TrustManager;)LR9/d;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, LQ9/k;->c(Ljavax/net/ssl/X509TrustManager;)LU9/c;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .prologue
    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ9/b;->d:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LR9/m;

    invoke-interface {v2, p1}, LR9/m;->b(Ljavax/net/ssl/SSLSocket;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LR9/m;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1, p2, p3}, LR9/m;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "sslSocket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ9/b;->d:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LR9/m;

    invoke-interface {v3, p1}, LR9/m;->b(Ljavax/net/ssl/SSLSocket;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LR9/m;

    if-eqz v1, :cond_2

    invoke-interface {v1, p1}, LR9/m;->c(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_2
    return-object v2
.end method

.method public i(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "hostname"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    move-result-object v0

    invoke-static {v0, p1}, LQ9/a;->a(Landroid/security/NetworkSecurityPolicy;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
