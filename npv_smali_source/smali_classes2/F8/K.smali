.class final LF8/K;
.super LF8/r;
.source "SourceFile"


# direct methods
.method public constructor <init>(LF8/M;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LF8/r;-><init>(LF8/M;)V

    return-void
.end method


# virtual methods
.method public X0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic h1(LF8/M;)LF8/q;
    .locals 0

    invoke-virtual {p0, p1}, LF8/K;->i1(LF8/M;)LF8/K;

    move-result-object p1

    return-object p1
.end method

.method public i1(LF8/M;)LF8/K;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/K;

    invoke-direct {v0, p1}, LF8/K;-><init>(LF8/M;)V

    return-object v0
.end method
