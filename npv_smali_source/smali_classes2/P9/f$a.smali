.class public final LP9/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private final b:LL9/e;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:LX9/f;

.field public f:LX9/e;

.field private g:LP9/f$c;

.field private h:LP9/l;

.field private i:I


# direct methods
.method public constructor <init>(ZLL9/e;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LP9/f$a;->a:Z

    iput-object p2, p0, LP9/f$a;->b:LL9/e;

    sget-object p1, LP9/f$c;->b:LP9/f$c;

    iput-object p1, p0, LP9/f$a;->g:LP9/f$c;

    sget-object p1, LP9/l;->b:LP9/l;

    iput-object p1, p0, LP9/f$a;->h:LP9/l;

    return-void
.end method


# virtual methods
.method public final a()LP9/f;
    .locals 1

    new-instance v0, LP9/f;

    invoke-direct {v0, p0}, LP9/f;-><init>(LP9/f$a;)V

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LP9/f$a;->a:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, LP9/f$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "connectionName"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()LP9/f$c;
    .locals 1

    iget-object v0, p0, LP9/f$a;->g:LP9/f$c;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LP9/f$a;->i:I

    return v0
.end method

.method public final f()LP9/l;
    .locals 1

    iget-object v0, p0, LP9/f$a;->h:LP9/l;

    return-object v0
.end method

.method public final g()LX9/e;
    .locals 1

    .prologue
    iget-object v0, p0, LP9/f$a;->f:LX9/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sink"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/net/Socket;
    .locals 1

    .prologue
    iget-object v0, p0, LP9/f$a;->c:Ljava/net/Socket;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "socket"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()LX9/f;
    .locals 1

    .prologue
    iget-object v0, p0, LP9/f$a;->e:LX9/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "source"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()LL9/e;
    .locals 1

    iget-object v0, p0, LP9/f$a;->b:LL9/e;

    return-object v0
.end method

.method public final k(LP9/f$c;)LP9/f$a;
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$a;->g:LP9/f$c;

    return-object p0
.end method

.method public final l(I)LP9/f$a;
    .locals 0

    iput p1, p0, LP9/f$a;->i:I

    return-object p0
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$a;->d:Ljava/lang/String;

    return-void
.end method

.method public final n(LX9/e;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$a;->f:LX9/e;

    return-void
.end method

.method public final o(Ljava/net/Socket;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$a;->c:Ljava/net/Socket;

    return-void
.end method

.method public final p(LX9/f;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP9/f$a;->e:LX9/f;

    return-void
.end method

.method public final q(Ljava/net/Socket;Ljava/lang/String;LX9/f;LX9/e;)LP9/f$a;
    .locals 1

    .prologue
    const-string v0, "socket"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LP9/f$a;->o(Ljava/net/Socket;)V

    iget-boolean p1, p0, LP9/f$a;->a:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, LI9/d;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MockWebServer "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_1
    invoke-virtual {p0, p1}, LP9/f$a;->m(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, LP9/f$a;->p(LX9/f;)V

    invoke-virtual {p0, p4}, LP9/f$a;->n(LX9/e;)V

    return-object p0
.end method
