.class public abstract LF8/v0;
.super LF8/E;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LF8/E;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->U0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public V0()LF8/a0;
    .locals 1

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->V0()LF8/a0;

    move-result-object v0

    return-object v0
.end method

.method public W0()LF8/e0;
    .locals 1

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    return-object v0
.end method

.method public X0()Z
    .locals 1

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->X0()Z

    move-result v0

    return v0
.end method

.method public final Z0()LF8/t0;
    .locals 2

    .prologue
    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    :goto_0
    instance-of v1, v0, LF8/v0;

    if-eqz v1, :cond_0

    check-cast v0, LF8/v0;

    invoke-virtual {v0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LF8/t0;

    return-object v0
.end method

.method protected abstract a1()LF8/E;
.end method

.method public abstract b1()Z
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/v0;->b1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "<Not computed yet>"

    :goto_0
    return-object v0
.end method

.method public u()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LF8/v0;->a1()LF8/E;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->u()Ly8/h;

    move-result-object v0

    return-object v0
.end method
