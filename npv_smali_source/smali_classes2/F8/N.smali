.class final LF8/N;
.super LF8/M;
.source "SourceFile"


# instance fields
.field private final D:LF8/e0;

.field private final E:Ljava/util/List;

.field private final F:Z

.field private final G:Ly8/h;

.field private final H:Lx7/l;


# direct methods
.method public constructor <init>(LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "constructor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refinedTypeFactory"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LF8/M;-><init>()V

    iput-object p1, p0, LF8/N;->D:LF8/e0;

    iput-object p2, p0, LF8/N;->E:Ljava/util/List;

    iput-boolean p3, p0, LF8/N;->F:Z

    iput-object p4, p0, LF8/N;->G:Ly8/h;

    iput-object p5, p0, LF8/N;->H:Lx7/l;

    invoke-virtual {p0}, LF8/N;->u()Ly8/h;

    move-result-object p1

    instance-of p1, p1, LH8/f;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LF8/N;->u()Ly8/h;

    move-result-object p1

    instance-of p1, p1, LH8/l;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SimpleTypeImpl should not be created for error type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/N;->u()Ly8/h;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p3, 0xa

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LF8/N;->W0()LF8/e0;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public U0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LF8/N;->E:Ljava/util/List;

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

    iget-object v0, p0, LF8/N;->D:LF8/e0;

    return-object v0
.end method

.method public X0()Z
    .locals 1

    iget-boolean v0, p0, LF8/N;->F:Z

    return v0
.end method

.method public bridge synthetic Y0(LG8/g;)LF8/E;
    .locals 0

    invoke-virtual {p0, p1}, LF8/N;->f1(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a1(Z)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/N;->d1(Z)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b1(LG8/g;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/N;->f1(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c1(LF8/a0;)LF8/t0;
    .locals 0

    invoke-virtual {p0, p1}, LF8/N;->e1(LF8/a0;)LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public d1(Z)LF8/M;
    .locals 1

    .prologue
    invoke-virtual {p0}, LF8/N;->X0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, LF8/K;

    invoke-direct {p1, p0}, LF8/K;-><init>(LF8/M;)V

    goto :goto_0

    :cond_1
    new-instance p1, LF8/I;

    invoke-direct {p1, p0}, LF8/I;-><init>(LF8/M;)V

    :goto_0
    return-object p1
.end method

.method public e1(LF8/a0;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM8/a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, LF8/O;

    invoke-direct {v0, p0, p1}, LF8/O;-><init>(LF8/M;LF8/a0;)V

    :goto_0
    return-object v0
.end method

.method public f1(LG8/g;)LF8/M;
    .locals 1

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/N;->H:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/M;

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    return-object p1
.end method

.method public u()Ly8/h;
    .locals 1

    iget-object v0, p0, LF8/N;->G:Ly8/h;

    return-object v0
.end method
