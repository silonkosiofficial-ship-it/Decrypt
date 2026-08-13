.class public LR7/r;
.super LR7/j;
.source "SourceFile"

# interfaces
.implements LO7/P;


# static fields
.field static final synthetic J:[LF7/k;


# instance fields
.field private final E:LR7/x;

.field private final F:Ln8/c;

.field private final G:LE8/i;

.field private final H:LE8/i;

.field private final I:Ly8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, LR7/r;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "fragments"

    const-string v4, "getFragments()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "empty"

    const-string v4, "getEmpty()Z"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LR7/r;->J:[LF7/k;

    return-void
.end method

.method public constructor <init>(LR7/x;Ln8/c;LE8/n;)V
    .locals 2

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    invoke-virtual {p2}, Ln8/c;->h()Ln8/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LR7/j;-><init>(LP7/g;Ln8/f;)V

    iput-object p1, p0, LR7/r;->E:LR7/x;

    iput-object p2, p0, LR7/r;->F:Ln8/c;

    new-instance p1, LR7/r$b;

    invoke-direct {p1, p0}, LR7/r$b;-><init>(LR7/r;)V

    invoke-interface {p3, p1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LR7/r;->G:LE8/i;

    new-instance p1, LR7/r$a;

    invoke-direct {p1, p0}, LR7/r$a;-><init>(LR7/r;)V

    invoke-interface {p3, p1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LR7/r;->H:LE8/i;

    new-instance p1, Ly8/g;

    new-instance p2, LR7/r$c;

    invoke-direct {p2, p0}, LR7/r$c;-><init>(LR7/r;)V

    invoke-direct {p1, p3, p2}, Ly8/g;-><init>(LE8/n;Lx7/a;)V

    iput-object p1, p0, LR7/r;->I:Ly8/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic E0()LO7/G;
    .locals 1

    invoke-virtual {p0}, LR7/r;->T0()LR7/x;

    move-result-object v0

    return-object v0
.end method

.method public J0()LO7/P;
    .locals 3

    .prologue
    invoke-virtual {p0}, LR7/r;->e()Ln8/c;

    move-result-object v0

    invoke-virtual {v0}, Ln8/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LR7/r;->T0()LR7/x;

    move-result-object v0

    invoke-virtual {p0}, LR7/r;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->e()Ln8/c;

    move-result-object v1

    const-string v2, "parent(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LR7/x;->s0(Ln8/c;)LO7/P;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public N()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LR7/r;->G:LE8/i;

    sget-object v1, LR7/r;->J:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method protected final O0()Z
    .locals 3

    iget-object v0, p0, LR7/r;->H:LE8/i;

    sget-object v1, LR7/r;->J:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public T0()LR7/x;
    .locals 1

    iget-object v0, p0, LR7/r;->E:LR7/x;

    return-object v0
.end method

.method public bridge synthetic b()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/r;->J0()LO7/P;

    move-result-object v0

    return-object v0
.end method

.method public e()Ln8/c;
    .locals 1

    iget-object v0, p0, LR7/r;->F:Ln8/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, LO7/P;

    if-eqz v0, :cond_0

    check-cast p1, LO7/P;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, LR7/r;->e()Ln8/c;

    move-result-object v1

    invoke-interface {p1}, LO7/P;->e()Ln8/c;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LR7/r;->T0()LR7/x;

    move-result-object v1

    invoke-interface {p1}, LO7/P;->E0()LO7/G;

    move-result-object p1

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, LR7/r;->T0()LR7/x;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LR7/r;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, LR7/r;->O0()Z

    move-result v0

    return v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LO7/o;->k(LO7/P;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u()Ly8/h;
    .locals 1

    iget-object v0, p0, LR7/r;->I:Ly8/h;

    return-object v0
.end method
