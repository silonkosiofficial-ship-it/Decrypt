.class public abstract LR7/d;
.super LR7/k;
.source "SourceFile"

# interfaces
.implements LO7/e0;


# static fields
.field static final synthetic L:[LF7/k;


# instance fields
.field private final G:LE8/n;

.field private final H:LO7/u;

.field private final I:LE8/i;

.field private J:Ljava/util/List;

.field private final K:LR7/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, LR7/d;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "constructors"

    const-string v3, "getConstructors()Ljava/util/Collection;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, LR7/d;->L:[LF7/k;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/m;LP7/g;Ln8/f;LO7/a0;LO7/u;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElement"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibilityImpl"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4, p5}, LR7/k;-><init>(LO7/m;LP7/g;Ln8/f;LO7/a0;)V

    iput-object p1, p0, LR7/d;->G:LE8/n;

    iput-object p6, p0, LR7/d;->H:LO7/u;

    new-instance p2, LR7/d$b;

    invoke-direct {p2, p0}, LR7/d$b;-><init>(LR7/d;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LR7/d;->I:LE8/i;

    new-instance p1, LR7/d$d;

    invoke-direct {p1, p0}, LR7/d$d;-><init>(LR7/d;)V

    iput-object p1, p0, LR7/d;->K:LR7/d$d;

    return-void
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, LR7/d;->J:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "declaredTypeParametersImpl"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic J0()LO7/p;
    .locals 1

    invoke-virtual {p0}, LR7/d;->T0()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final O0()LF8/M;
    .locals 2

    .prologue
    invoke-interface {p0}, LO7/e0;->v()LO7/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LO7/e;->M0()Ly8/h;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Ly8/h$b;->b:Ly8/h$b;

    :cond_1
    new-instance v1, LR7/d$a;

    invoke-direct {v1, p0}, LR7/d$a;-><init>(LR7/d;)V

    invoke-static {p0, v0, v1}, LF8/q0;->v(LO7/h;Ly8/h;Lx7/l;)LF8/M;

    move-result-object v0

    const-string v1, "makeUnsubstitutedType(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 2

    invoke-interface {p0}, LO7/e0;->o0()LF8/M;

    move-result-object v0

    new-instance v1, LR7/d$c;

    invoke-direct {v1, p0}, LR7/d$c;-><init>(LR7/d;)V

    invoke-static {v0, v1}, LF8/q0;->c(LF8/E;Lx7/l;)Z

    move-result v0

    return v0
.end method

.method public T0()LO7/e0;
    .locals 2

    invoke-super {p0}, LR7/k;->J0()LO7/p;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LO7/e0;

    return-object v0
.end method

.method public final U0()Ljava/util/Collection;
    .locals 5

    .prologue
    invoke-interface {p0}, LO7/e0;->v()LO7/e;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    invoke-interface {v0}, LO7/e;->r()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getConstructors(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/d;

    sget-object v3, LR7/J;->k0:LR7/J$a;

    iget-object v4, p0, LR7/d;->G:LE8/n;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3, v4, p0, v2}, LR7/J$a;->b(LE8/n;LO7/e0;LO7/d;)LR7/I;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method protected abstract V0()Ljava/util/List;
.end method

.method public final W0(Ljava/util/List;)V
    .locals 1

    const-string v0, "declaredTypeParameters"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LR7/d;->J:Ljava/util/List;

    return-void
.end method

.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LR7/d;->T0()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LR7/d;->T0()LO7/e0;

    move-result-object v0

    return-object v0
.end method

.method public h()LO7/u;
    .locals 1

    iget-object v0, p0, LR7/d;->H:LO7/u;

    return-object v0
.end method

.method public p()LF8/e0;
    .locals 1

    iget-object v0, p0, LR7/d;->K:LR7/d$d;

    return-object v0
.end method

.method protected final p0()LE8/n;
    .locals 1

    iget-object v0, p0, LR7/d;->G:LE8/n;

    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "visitor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0, p2}, LO7/o;->c(LO7/e0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "typealias "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/j;->getName()Ln8/f;

    move-result-object v1

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
