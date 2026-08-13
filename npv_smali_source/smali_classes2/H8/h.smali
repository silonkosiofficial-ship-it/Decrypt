.class public final LH8/h;
.super LF8/M;
.source "SourceFile"


# instance fields
.field private final D:LF8/e0;

.field private final E:Ly8/h;

.field private final F:LH8/j;

.field private final G:Ljava/util/List;

.field private final H:Z

.field private final I:[Ljava/lang/String;

.field private final J:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/M;-><init>()V

    iput-object p1, p0, LH8/h;->D:LF8/e0;

    iput-object p2, p0, LH8/h;->E:Ly8/h;

    iput-object p3, p0, LH8/h;->F:LH8/j;

    iput-object p4, p0, LH8/h;->G:Ljava/util/List;

    iput-boolean p5, p0, LH8/h;->H:Z

    iput-object p6, p0, LH8/h;->I:[Ljava/lang/String;

    sget-object p1, Ly7/V;->a:Ly7/V;

    invoke-virtual {p3}, LH8/j;->g()Ljava/lang/String;

    move-result-object p1

    array-length p2, p6

    invoke-static {p6, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length p3, p2

    invoke-static {p2, p3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LH8/h;->J:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;ILy7/k;)V
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, LH8/h;-><init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LH8/h;->G:Ljava/util/List;

    return-object v0
.end method

.method public V0()LF8/a0;
    .locals 1

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v0

    return-object v0
.end method

.method public W0()LF8/e0;
    .locals 1

    iget-object v0, p0, LH8/h;->D:LF8/e0;

    return-object v0
.end method

.method public X0()Z
    .locals 1

    iget-boolean v0, p0, LH8/h;->H:Z

    return v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LH8/h;->h1(LG8/g;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LH8/h;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LH8/h;->h1(LG8/g;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LH8/h;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 8

    new-instance v7, LH8/h;

    invoke-virtual {p0}, LH8/h;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {p0}, LH8/h;->u()Ly8/h;

    move-result-object v2

    iget-object v3, p0, LH8/h;->F:LH8/j;

    invoke-virtual {p0}, LH8/h;->U0()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, LH8/h;->I:[Ljava/lang/String;

    array-length v5, v0

    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [Ljava/lang/String;

    move-object v0, v7

    move v5, p1

    invoke-direct/range {v0 .. v6}, LH8/h;-><init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v7
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final f1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LH8/h;->J:Ljava/lang/String;

    return-object v0
.end method

.method public final g1()LH8/j;
    .locals 1

    iget-object v0, p0, LH8/h;->F:LH8/j;

    return-object v0
.end method

.method public h1(LG8/g;)LH8/h;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final i1(Ljava/util/List;)LH8/h;
    .locals 8

    const-string v0, "newArguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH8/h;

    invoke-virtual {p0}, LH8/h;->W0()LF8/e0;

    move-result-object v2

    invoke-virtual {p0}, LH8/h;->u()Ly8/h;

    move-result-object v3

    iget-object v4, p0, LH8/h;->F:LH8/j;

    invoke-virtual {p0}, LH8/h;->X0()Z

    move-result v6

    iget-object v1, p0, LH8/h;->I:[Ljava/lang/String;

    array-length v5, v1

    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, [Ljava/lang/String;

    move-object v1, v0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, LH8/h;-><init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public u()Ly8/h;
    .locals 1

    iget-object v0, p0, LH8/h;->E:Ly8/h;

    return-object v0
.end method
