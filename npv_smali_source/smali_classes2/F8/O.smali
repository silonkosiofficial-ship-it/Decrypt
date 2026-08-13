.class final LF8/O;
.super LF8/r;
.source "SourceFile"


# instance fields
.field private final E:LF8/a0;


# direct methods
.method public constructor <init>(LF8/M;LF8/a0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LF8/r;-><init>(LF8/M;)V

    iput-object p2, p0, LF8/O;->E:LF8/a0;

    return-void
.end method


# virtual methods
.method public V0()LF8/a0;
    .locals 1

    iget-object v0, p0, LF8/O;->E:LF8/a0;

    return-object v0
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, LF8/O;->i1(LF8/M;)LF8/O;

    move-result-object p1

    return-object p1
.end method

.method public i1(LF8/M;)LF8/O;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/O;

    invoke-virtual {p0}, LF8/O;->V0()LF8/a0;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LF8/O;-><init>(LF8/M;LF8/a0;)V

    return-object v0
.end method
