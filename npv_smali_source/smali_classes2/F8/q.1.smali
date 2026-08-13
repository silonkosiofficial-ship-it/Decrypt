.class public abstract LF8/q;
.super LF8/M;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF8/M;-><init>()V

    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public V0()LF8/a0;
    .locals 1

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    return-object v0
.end method

.method public W0()LF8/e0;
    .locals 1

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    return-object v0
.end method

.method public X0()Z
    .locals 1

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->X0()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/q;->g1(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/q;->g1(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method protected abstract f1()LF8/M;
.end method

.method public g1(LG8/g;)LF8/M;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {p1, v0}, LG8/g;->h(LJ8/i;)LF8/E;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LF8/M;

    invoke-virtual {p0, p1}, LF8/q;->h1(LF8/M;)LF8/q;

    move-result-object p1

    return-object p1
.end method

.method public abstract h1(LF8/M;)LF8/q;
.end method

.method public u()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LF8/q;->f1()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->u()Ly8/h;

    move-result-object v0

    return-object v0
.end method
