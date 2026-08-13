.class public final LP9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN9/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/g$a;
    }
.end annotation


# static fields
.field public static final g:LP9/g$a;

.field private static final h:Ljava/util/List;

.field private static final i:Ljava/util/List;


# instance fields
.field private final a:LM9/f;

.field private final b:LN9/g;

.field private final c:LP9/f;

.field private volatile d:LP9/i;

.field private final e:LH9/y;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, LP9/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP9/g$a;-><init>(Ly7/k;)V

    sput-object v0, LP9/g;->g:LP9/g$a;

    const-string v12, ":scheme"

    const-string v13, ":authority"

    const-string v2, "connection"

    const-string v3, "host"

    const-string v4, "keep-alive"

    const-string v5, "proxy-connection"

    const-string v6, "te"

    const-string v7, "transfer-encoding"

    const-string v8, "encoding"

    const-string v9, "upgrade"

    const-string v10, ":method"

    const-string v11, ":path"

    filled-new-array/range {v2 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LI9/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LP9/g;->h:Ljava/util/List;

    const-string v7, "encoding"

    const-string v8, "upgrade"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LI9/d;->w([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LP9/g;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LH9/x;LM9/f;LN9/g;LP9/f;)V
    .locals 1

    .prologue
    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LP9/g;->a:LM9/f;

    iput-object p3, p0, LP9/g;->b:LN9/g;

    iput-object p4, p0, LP9/g;->c:LP9/f;

    invoke-virtual {p1}, LH9/x;->G()Ljava/util/List;

    move-result-object p1

    sget-object p2, LH9/y;->I:LH9/y;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, LH9/y;->H:LH9/y;

    :goto_0
    iput-object p2, p0, LP9/g;->e:LH9/y;

    return-void
.end method

.method public static final synthetic i()Ljava/util/List;
    .locals 1

    sget-object v0, LP9/g;->h:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/List;
    .locals 1

    sget-object v0, LP9/g;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(LH9/B;)J
    .locals 2

    .prologue
    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LN9/e;->b(LH9/B;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LI9/d;->v(LH9/B;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LP9/g;->d:LP9/i;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LP9/i;->n()LX9/X;

    move-result-object v0

    invoke-interface {v0}, LX9/X;->close()V

    return-void
.end method

.method public c(LH9/B;)LX9/Z;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LP9/g;->d:LP9/i;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LP9/i;->p()LP9/i$c;

    move-result-object p1

    return-object p1
.end method

.method public cancel()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, LP9/g;->f:Z

    iget-object v0, p0, LP9/g;->d:LP9/i;

    if-eqz v0, :cond_0

    sget-object v1, LP9/b;->M:LP9/b;

    invoke-virtual {v0, v1}, LP9/i;->f(LP9/b;)V

    :cond_0
    return-void
.end method

.method public d(Z)LH9/B$a;
    .locals 3

    .prologue
    iget-object v0, p0, LP9/g;->d:LP9/i;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LP9/i;->C()LH9/t;

    move-result-object v0

    sget-object v1, LP9/g;->g:LP9/g$a;

    iget-object v2, p0, LP9/g;->e:LH9/y;

    invoke-virtual {v1, v0, v2}, LP9/g$a;->b(LH9/t;LH9/y;)LH9/B$a;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LH9/B$a;->h()I

    move-result p1

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()LM9/f;
    .locals 1

    iget-object v0, p0, LP9/g;->a:LM9/f;

    return-object v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, LP9/g;->c:LP9/f;

    invoke-virtual {v0}, LP9/f;->flush()V

    return-void
.end method

.method public g(LH9/z;J)LX9/X;
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LP9/g;->d:LP9/i;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LP9/i;->n()LX9/X;

    move-result-object p1

    return-object p1
.end method

.method public h(LH9/z;)V
    .locals 3

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP9/g;->d:LP9/i;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LH9/z;->a()LH9/A;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LP9/g;->g:LP9/g$a;

    invoke-virtual {v1, p1}, LP9/g$a;->a(LH9/z;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, LP9/g;->c:LP9/f;

    invoke-virtual {v1, p1, v0}, LP9/f;->l1(Ljava/util/List;Z)LP9/i;

    move-result-object p1

    iput-object p1, p0, LP9/g;->d:LP9/i;

    iget-boolean p1, p0, LP9/g;->f:Z

    if-nez p1, :cond_2

    iget-object p1, p0, LP9/g;->d:LP9/i;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LP9/i;->v()LX9/a0;

    move-result-object p1

    iget-object v0, p0, LP9/g;->b:LN9/g;

    invoke-virtual {v0}, LN9/g;->h()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    iget-object p1, p0, LP9/g;->d:LP9/i;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, LP9/i;->E()LX9/a0;

    move-result-object p1

    iget-object v0, p0, LP9/g;->b:LN9/g;

    invoke-virtual {v0}, LN9/g;->j()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    return-void

    :cond_2
    iget-object p1, p0, LP9/g;->d:LP9/i;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v0, LP9/b;->M:LP9/b;

    invoke-virtual {p1, v0}, LP9/i;->f(LP9/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
