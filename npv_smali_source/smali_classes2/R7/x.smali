.class public final LR7/x;
.super LR7/j;
.source "SourceFile"

# interfaces
.implements LO7/G;


# instance fields
.field private final E:LE8/n;

.field private final F:LL7/g;

.field private final G:Ln8/f;

.field private final H:Ljava/util/Map;

.field private final I:LR7/A;

.field private J:LR7/v;

.field private K:LO7/L;

.field private L:Z

.field private final M:LE8/g;

.field private final N:Li7/n;


# direct methods
.method public constructor <init>(Ln8/f;LE8/n;LL7/g;Lo8/a;)V
    .locals 10

    const-string v0, "moduleName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builtIns"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v9}, LR7/x;-><init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;ILy7/k;)V

    return-void
.end method

.method public constructor <init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;)V
    .locals 0

    .prologue
    const-string p4, "moduleName"

    invoke-static {p1, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "storageManager"

    invoke-static {p2, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builtIns"

    invoke-static {p3, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "capabilities"

    invoke-static {p5, p4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, LP7/g;->d:LP7/g$a;

    invoke-virtual {p4}, LP7/g$a;->b()LP7/g;

    move-result-object p4

    invoke-direct {p0, p4, p1}, LR7/j;-><init>(LP7/g;Ln8/f;)V

    iput-object p2, p0, LR7/x;->E:LE8/n;

    iput-object p3, p0, LR7/x;->F:LL7/g;

    iput-object p6, p0, LR7/x;->G:Ln8/f;

    invoke-virtual {p1}, Ln8/f;->q()Z

    move-result p3

    if-eqz p3, :cond_1

    iput-object p5, p0, LR7/x;->H:Ljava/util/Map;

    sget-object p1, LR7/A;->a:LR7/A$a;

    invoke-virtual {p1}, LR7/A$a;->a()LO7/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LR7/x;->q0(LO7/F;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LR7/A;

    if-nez p1, :cond_0

    sget-object p1, LR7/A$b;->b:LR7/A$b;

    :cond_0
    iput-object p1, p0, LR7/x;->I:LR7/A;

    const/4 p1, 0x1

    iput-boolean p1, p0, LR7/x;->L:Z

    new-instance p1, LR7/x$b;

    invoke-direct {p1, p0}, LR7/x$b;-><init>(LR7/x;)V

    invoke-interface {p2, p1}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, LR7/x;->M:LE8/g;

    new-instance p1, LR7/x$a;

    invoke-direct {p1, p0}, LR7/x$a;-><init>(LR7/x;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LR7/x;->N:Li7/n;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Module name must be special: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public synthetic constructor <init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;ILy7/k;)V
    .locals 9

    .prologue
    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v8}, LR7/x;-><init>(Ln8/f;LE8/n;LL7/g;Lo8/a;Ljava/util/Map;Ln8/f;)V

    return-void
.end method

.method public static final synthetic J0(LR7/x;)LR7/v;
    .locals 0

    iget-object p0, p0, LR7/x;->J:LR7/v;

    return-object p0
.end method

.method public static final synthetic O0(LR7/x;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LR7/x;->Y0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T0(LR7/x;)LO7/L;
    .locals 0

    iget-object p0, p0, LR7/x;->K:LO7/L;

    return-object p0
.end method

.method public static final synthetic U0(LR7/x;)LR7/A;
    .locals 0

    iget-object p0, p0, LR7/x;->I:LR7/A;

    return-object p0
.end method

.method public static final synthetic V0(LR7/x;)LE8/n;
    .locals 0

    iget-object p0, p0, LR7/x;->E:LE8/n;

    return-object p0
.end method

.method public static final synthetic W0(LR7/x;)Z
    .locals 0

    invoke-direct {p0}, LR7/x;->c1()Z

    move-result p0

    return p0
.end method

.method private final Y0()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, LR7/j;->getName()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final a1()LR7/i;
    .locals 1

    iget-object v0, p0, LR7/x;->N:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR7/i;

    return-object v0
.end method

.method private final c1()Z
    .locals 1

    .prologue
    iget-object v0, p0, LR7/x;->K:LO7/L;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public C0()Ljava/util/List;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/x;->J:LR7/v;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LR7/v;->c()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependencies of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LR7/x;->Y0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " were not set"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public U(LO7/G;)Z
    .locals 2

    .prologue
    const-string v0, "targetModule"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LR7/x;->J:LR7/v;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, LR7/v;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, LR7/x;->C0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    invoke-interface {p1}, LO7/G;->C0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public X0()V
    .locals 1

    .prologue
    invoke-virtual {p0}, LR7/x;->d1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, LO7/B;->a(LO7/G;)V

    :cond_0
    return-void
.end method

.method public final Z0()LO7/L;
    .locals 1

    invoke-virtual {p0}, LR7/x;->X0()V

    invoke-direct {p0}, LR7/x;->a1()LR7/i;

    move-result-object v0

    return-object v0
.end method

.method public b()LO7/m;
    .locals 1

    invoke-static {p0}, LO7/G$a;->b(LO7/G;)LO7/m;

    move-result-object v0

    return-object v0
.end method

.method public final b1(LO7/L;)V
    .locals 1

    const-string v0, "providerForModuleContent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LR7/x;->c1()Z

    iput-object p1, p0, LR7/x;->K:LO7/L;

    return-void
.end method

.method public d1()Z
    .locals 1

    iget-boolean v0, p0, LR7/x;->L:Z

    return v0
.end method

.method public final e1(LR7/v;)V
    .locals 1

    const-string v0, "dependencies"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LR7/x;->J:LR7/v;

    return-void
.end method

.method public final f1(Ljava/util/List;)V
    .locals 1

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, LR7/x;->g1(Ljava/util/List;Ljava/util/Set;)V

    return-void
.end method

.method public final g1(Ljava/util/List;Ljava/util/Set;)V
    .locals 3

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "friends"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR7/w;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, p1, p2, v1, v2}, LR7/w;-><init>(Ljava/util/List;Ljava/util/Set;Ljava/util/List;Ljava/util/Set;)V

    invoke-virtual {p0, v0}, LR7/x;->e1(LR7/v;)V

    return-void
.end method

.method public final varargs h1([LR7/x;)V
    .locals 1

    const-string v0, "descriptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lj7/n;->R0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LR7/x;->f1(Ljava/util/List;)V

    return-void
.end method

.method public q0(LO7/F;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "capability"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LR7/x;->H:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LO7/G$a;->a(LO7/G;LO7/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public s0(Ln8/c;)LO7/P;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/x;->X0()V

    iget-object v0, p0, LR7/x;->M:LE8/g;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/P;

    return-object p1
.end method

.method public t()LL7/g;
    .locals 1

    iget-object v0, p0, LR7/x;->F:LL7/g;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LR7/j;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/x;->d1()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, " !isValid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " packageFragmentProvider: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR7/x;->K:LO7/L;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public x(Ln8/c;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LR7/x;->X0()V

    invoke-virtual {p0}, LR7/x;->Z0()LO7/L;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LO7/L;->x(Ln8/c;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
