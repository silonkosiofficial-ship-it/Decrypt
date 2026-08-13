.class public final La8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP7/g;


# instance fields
.field private final C:La8/g;

.field private final D:Le8/d;

.field private final E:Z

.field private final F:LE8/h;


# direct methods
.method public constructor <init>(La8/g;Le8/d;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/d;->C:La8/g;

    iput-object p2, p0, La8/d;->D:Le8/d;

    iput-boolean p3, p0, La8/d;->E:Z

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->u()LE8/n;

    move-result-object p1

    new-instance p2, La8/d$a;

    invoke-direct {p2, p0}, La8/d$a;-><init>(La8/d;)V

    invoke-interface {p1, p2}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, La8/d;->F:LE8/h;

    return-void
.end method

.method public synthetic constructor <init>(La8/g;Le8/d;ZILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, La8/d;-><init>(La8/g;Le8/d;Z)V

    return-void
.end method

.method public static final synthetic d(La8/d;)Z
    .locals 0

    iget-boolean p0, p0, La8/d;->E:Z

    return p0
.end method

.method public static final synthetic e(La8/d;)La8/g;
    .locals 0

    iget-object p0, p0, La8/d;->C:La8/g;

    return-object p0
.end method


# virtual methods
.method public H(Ln8/c;)Z
    .locals 0

    invoke-static {p0, p1}, LP7/g$b;->b(LP7/g;Ln8/c;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    iget-object v0, p0, La8/d;->D:Le8/d;

    invoke-interface {v0}, Le8/d;->k()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/d;->D:Le8/d;

    invoke-interface {v0}, Le8/d;->o()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, La8/d;->D:Le8/d;

    invoke-interface {v0}, Le8/d;->k()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object v0

    iget-object v1, p0, La8/d;->F:LE8/h;

    invoke-static {v0, v1}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    sget-object v1, LY7/c;->a:LY7/c;

    sget-object v2, LL7/j$a;->y:Ln8/c;

    iget-object v3, p0, La8/d;->D:Le8/d;

    iget-object v4, p0, La8/d;->C:La8/g;

    invoke-virtual {v1, v2, v3, v4}, LY7/c;->a(Ln8/c;Le8/d;La8/g;)LP7/c;

    move-result-object v1

    invoke-static {v0, v1}, LR8/k;->J(LR8/h;Ljava/lang/Object;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->y(LR8/h;)LR8/h;

    move-result-object v0

    invoke-interface {v0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j(Ln8/c;)LP7/c;
    .locals 3

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La8/d;->D:Le8/d;

    invoke-interface {v0, p1}, Le8/d;->j(Ln8/c;)Le8/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, La8/d;->F:LE8/h;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/c;

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LY7/c;->a:LY7/c;

    iget-object v1, p0, La8/d;->D:Le8/d;

    iget-object v2, p0, La8/d;->C:La8/g;

    invoke-virtual {v0, p1, v1, v2}, LY7/c;->a(Ln8/c;Le8/d;La8/g;)LP7/c;

    move-result-object v0

    :cond_1
    return-object v0
.end method
