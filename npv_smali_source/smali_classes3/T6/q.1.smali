.class public final LT6/q;
.super LW6/B;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, LW6/B;-><init>(ZI)V

    return-void
.end method

.method public synthetic constructor <init>(IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x8

    :cond_0
    invoke-direct {p0, p1}, LT6/q;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected o(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LW6/B;->o(Ljava/lang/String;)V

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0, p1}, LT6/v;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected p(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LW6/B;->p(Ljava/lang/String;)V

    sget-object v0, LT6/v;->a:LT6/v;

    invoke-virtual {v0, p1}, LT6/v;->b(Ljava/lang/String;)V

    return-void
.end method

.method public q()LT6/p;
    .locals 2

    new-instance v0, LT6/r;

    invoke-virtual {p0}, LW6/B;->l()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, LT6/r;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
