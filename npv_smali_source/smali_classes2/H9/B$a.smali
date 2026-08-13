.class public LH9/B$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:LH9/z;

.field private b:LH9/y;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:LH9/s;

.field private f:LH9/t$a;

.field private g:LH9/C;

.field private h:LH9/B;

.field private i:LH9/B;

.field private j:LH9/B;

.field private k:J

.field private l:J

.field private m:LM9/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LH9/B$a;->c:I

    new-instance v0, LH9/t$a;

    invoke-direct {v0}, LH9/t$a;-><init>()V

    iput-object v0, p0, LH9/B$a;->f:LH9/t$a;

    return-void
.end method

.method public constructor <init>(LH9/B;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LH9/B$a;->c:I

    invoke-virtual {p1}, LH9/B;->r0()LH9/z;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->a:LH9/z;

    invoke-virtual {p1}, LH9/B;->o0()LH9/y;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->b:LH9/y;

    invoke-virtual {p1}, LH9/B;->o()I

    move-result v0

    iput v0, p0, LH9/B$a;->c:I

    invoke-virtual {p1}, LH9/B;->R()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->d:Ljava/lang/String;

    invoke-virtual {p1}, LH9/B;->s()LH9/s;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->e:LH9/s;

    invoke-virtual {p1}, LH9/B;->H()LH9/t;

    move-result-object v0

    invoke-virtual {v0}, LH9/t;->g()LH9/t$a;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->f:LH9/t$a;

    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->g:LH9/C;

    invoke-virtual {p1}, LH9/B;->e0()LH9/B;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->h:LH9/B;

    invoke-virtual {p1}, LH9/B;->g()LH9/B;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->i:LH9/B;

    invoke-virtual {p1}, LH9/B;->n0()LH9/B;

    move-result-object v0

    iput-object v0, p0, LH9/B$a;->j:LH9/B;

    invoke-virtual {p1}, LH9/B;->s0()J

    move-result-wide v0

    iput-wide v0, p0, LH9/B$a;->k:J

    invoke-virtual {p1}, LH9/B;->q0()J

    move-result-wide v0

    iput-wide v0, p0, LH9/B$a;->l:J

    invoke-virtual {p1}, LH9/B;->r()LM9/c;

    move-result-object p1

    iput-object p1, p0, LH9/B$a;->m:LM9/c;

    return-void
.end method

.method private final e(LH9/B;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    invoke-virtual {p1}, LH9/B;->a()LH9/C;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method private final f(Ljava/lang/String;LH9/B;)V
    .locals 1

    .prologue
    if-eqz p2, :cond_4

    invoke-virtual {p2}, LH9/B;->a()LH9/C;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, LH9/B;->e0()LH9/B;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, LH9/B;->g()LH9/B;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, LH9/B;->n0()LH9/B;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)LH9/B$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/B$a;->f:LH9/t$a;

    invoke-virtual {v0, p1, p2}, LH9/t$a;->a(Ljava/lang/String;Ljava/lang/String;)LH9/t$a;

    return-object p0
.end method

.method public b(LH9/C;)LH9/B$a;
    .locals 0

    iput-object p1, p0, LH9/B$a;->g:LH9/C;

    return-object p0
.end method

.method public c()LH9/B;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    iget v5, v0, LH9/B$a;->c:I

    if-ltz v5, :cond_3

    iget-object v2, v0, LH9/B$a;->a:LH9/z;

    if-eqz v2, :cond_2

    iget-object v3, v0, LH9/B$a;->b:LH9/y;

    if-eqz v3, :cond_1

    iget-object v4, v0, LH9/B$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v6, v0, LH9/B$a;->e:LH9/s;

    iget-object v1, v0, LH9/B$a;->f:LH9/t$a;

    invoke-virtual {v1}, LH9/t$a;->d()LH9/t;

    move-result-object v7

    iget-object v8, v0, LH9/B$a;->g:LH9/C;

    iget-object v9, v0, LH9/B$a;->h:LH9/B;

    iget-object v10, v0, LH9/B$a;->i:LH9/B;

    iget-object v11, v0, LH9/B$a;->j:LH9/B;

    iget-wide v12, v0, LH9/B$a;->k:J

    iget-wide v14, v0, LH9/B$a;->l:J

    iget-object v1, v0, LH9/B$a;->m:LM9/c;

    new-instance v17, LH9/B;

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    invoke-direct/range {v1 .. v16}, LH9/B;-><init>(LH9/z;LH9/y;Ljava/lang/String;ILH9/s;LH9/t;LH9/C;LH9/B;LH9/B;LH9/B;JJLM9/c;)V

    return-object v17

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "message == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "protocol == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "request == null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, LH9/B$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public d(LH9/B;)LH9/B$a;
    .locals 1

    const-string v0, "cacheResponse"

    invoke-direct {p0, v0, p1}, LH9/B$a;->f(Ljava/lang/String;LH9/B;)V

    iput-object p1, p0, LH9/B$a;->i:LH9/B;

    return-object p0
.end method

.method public g(I)LH9/B$a;
    .locals 0

    iput p1, p0, LH9/B$a;->c:I

    return-object p0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LH9/B$a;->c:I

    return v0
.end method

.method public i(LH9/s;)LH9/B$a;
    .locals 0

    iput-object p1, p0, LH9/B$a;->e:LH9/s;

    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/lang/String;)LH9/B$a;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LH9/B$a;->f:LH9/t$a;

    invoke-virtual {v0, p1, p2}, LH9/t$a;->g(Ljava/lang/String;Ljava/lang/String;)LH9/t$a;

    return-object p0
.end method

.method public k(LH9/t;)LH9/B$a;
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH9/t;->g()LH9/t$a;

    move-result-object p1

    iput-object p1, p0, LH9/B$a;->f:LH9/t$a;

    return-object p0
.end method

.method public final l(LM9/c;)V
    .locals 1

    const-string v0, "deferredTrailers"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/B$a;->m:LM9/c;

    return-void
.end method

.method public m(Ljava/lang/String;)LH9/B$a;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/B$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public n(LH9/B;)LH9/B$a;
    .locals 1

    const-string v0, "networkResponse"

    invoke-direct {p0, v0, p1}, LH9/B$a;->f(Ljava/lang/String;LH9/B;)V

    iput-object p1, p0, LH9/B$a;->h:LH9/B;

    return-object p0
.end method

.method public o(LH9/B;)LH9/B$a;
    .locals 0

    invoke-direct {p0, p1}, LH9/B$a;->e(LH9/B;)V

    iput-object p1, p0, LH9/B$a;->j:LH9/B;

    return-object p0
.end method

.method public p(LH9/y;)LH9/B$a;
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/B$a;->b:LH9/y;

    return-object p0
.end method

.method public q(J)LH9/B$a;
    .locals 0

    iput-wide p1, p0, LH9/B$a;->l:J

    return-object p0
.end method

.method public r(LH9/z;)LH9/B$a;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH9/B$a;->a:LH9/z;

    return-object p0
.end method

.method public s(J)LH9/B$a;
    .locals 0

    iput-wide p1, p0, LH9/B$a;->k:J

    return-object p0
.end method
