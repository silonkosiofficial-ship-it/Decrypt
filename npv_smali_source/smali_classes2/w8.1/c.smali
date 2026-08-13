.class public final Lw8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:La8/f;

.field private final b:LY7/g;


# direct methods
.method public constructor <init>(La8/f;LY7/g;)V
    .locals 1

    const-string v0, "packageFragmentProvider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/c;->a:La8/f;

    iput-object p2, p0, Lw8/c;->b:LY7/g;

    return-void
.end method


# virtual methods
.method public final a()La8/f;
    .locals 1

    iget-object v0, p0, Lw8/c;->a:La8/f;

    return-object v0
.end method

.method public final b(Le8/g;)LO7/e;
    .locals 4

    .prologue
    const-string v0, "javaClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/g;->e()Ln8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Le8/g;->O()Le8/D;

    move-result-object v1

    sget-object v2, Le8/D;->C:Le8/D;

    if-ne v1, v2, :cond_0

    iget-object p1, p0, Lw8/c;->b:LY7/g;

    invoke-interface {p1, v0}, LY7/g;->c(Ln8/c;)LO7/e;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, Le8/g;->f()Le8/g;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {p0, v1}, Lw8/c;->b(Le8/g;)LO7/e;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, LO7/e;->H0()Ly8/h;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, Le8/t;->getName()Ln8/f;

    move-result-object p1

    sget-object v1, LW7/d;->U:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    instance-of v0, p1, LO7/e;

    if-eqz v0, :cond_3

    move-object v2, p1

    check-cast v2, LO7/e;

    :cond_3
    return-object v2

    :cond_4
    if-nez v0, :cond_5

    return-object v2

    :cond_5
    iget-object v1, p0, Lw8/c;->a:La8/f;

    invoke-virtual {v0}, Ln8/c;->e()Ln8/c;

    move-result-object v0

    const-string v3, "parent(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, La8/f;->b(Ln8/c;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/h;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, Lb8/h;->V0(Le8/g;)LO7/e;

    move-result-object v2

    :cond_6
    return-object v2
.end method
