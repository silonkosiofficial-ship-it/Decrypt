.class public LX9/n;
.super LX9/a0;
.source "SourceFile"


# instance fields
.field private f:LX9/a0;


# direct methods
.method public constructor <init>(LX9/a0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LX9/a0;-><init>()V

    iput-object p1, p0, LX9/n;->f:LX9/a0;

    return-void
.end method


# virtual methods
.method public a()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->a()LX9/a0;

    move-result-object v0

    return-object v0
.end method

.method public b()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->b()LX9/a0;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0, p1, p2}, LX9/a0;->d(J)LX9/a0;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)LX9/a0;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0, p1, p2, p3}, LX9/a0;->g(JLjava/util/concurrent/TimeUnit;)LX9/a0;

    move-result-object p1

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    invoke-virtual {v0}, LX9/a0;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()LX9/a0;
    .locals 1

    iget-object v0, p0, LX9/n;->f:LX9/a0;

    return-object v0
.end method

.method public final j(LX9/a0;)LX9/n;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LX9/n;->f:LX9/a0;

    return-object p0
.end method
