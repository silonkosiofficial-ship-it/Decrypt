.class public final Lb8/f;
.super LR7/g;
.source "SourceFile"

# interfaces
.implements LZ7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/f$a;,
        Lb8/f$b;
    }
.end annotation


# static fields
.field public static final a0:Lb8/f$a;

.field private static final b0:Ljava/util/Set;


# instance fields
.field private final K:La8/g;

.field private final L:Le8/g;

.field private final M:LO7/e;

.field private final N:La8/g;

.field private final O:Li7/n;

.field private final P:LO7/f;

.field private final Q:LO7/D;

.field private final R:LO7/n0;

.field private final S:Z

.field private final T:Lb8/f$b;

.field private final U:Lb8/g;

.field private final V:LO7/Y;

.field private final W:Ly8/f;

.field private final X:Lb8/l;

.field private final Y:LP7/g;

.field private final Z:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lb8/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb8/f$a;-><init>(Ly7/k;)V

    sput-object v0, Lb8/f;->a0:Lb8/f$a;

    const-string v7, "notifyAll"

    const-string v8, "toString"

    const-string v2, "equals"

    const-string v3, "hashCode"

    const-string v4, "getClass"

    const-string v5, "wait"

    const-string v6, "notify"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lb8/f;->b0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(La8/g;LO7/m;Le8/g;LO7/e;)V
    .locals 12

    .prologue
    move-object v8, p0

    move-object v6, p1

    move-object v9, p3

    move-object/from16 v7, p4

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    move-object v2, p2

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object v1

    invoke-interface {p3}, Le8/t;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->t()Ld8/b;

    move-result-object v0

    invoke-interface {v0, p3}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LR7/g;-><init>(LE8/n;LO7/m;Ln8/f;LO7/a0;Z)V

    iput-object v6, v8, Lb8/f;->K:La8/g;

    iput-object v9, v8, Lb8/f;->L:Le8/g;

    iput-object v7, v8, Lb8/f;->M:LO7/e;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v2, p3

    invoke-static/range {v0 .. v5}, La8/a;->d(La8/g;LO7/g;Le8/z;IILjava/lang/Object;)La8/g;

    move-result-object v10

    iput-object v10, v8, Lb8/f;->N:La8/g;

    invoke-virtual {v10}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->h()LY7/g;

    move-result-object v0

    invoke-interface {v0, p3, p0}, LY7/g;->d(Le8/g;LO7/e;)V

    invoke-interface {p3}, Le8/g;->O()Le8/D;

    new-instance v0, Lb8/f$e;

    invoke-direct {v0, p0}, Lb8/f$e;-><init>(Lb8/f;)V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, v8, Lb8/f;->O:Li7/n;

    invoke-interface {p3}, Le8/g;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LO7/f;->H:LO7/f;

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Le8/g;->M()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LO7/f;->E:LO7/f;

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Le8/g;->F()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LO7/f;->F:LO7/f;

    goto :goto_0

    :cond_2
    sget-object v0, LO7/f;->D:LO7/f;

    :goto_0
    iput-object v0, v8, Lb8/f;->P:LO7/f;

    invoke-interface {p3}, Le8/g;->t()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_6

    invoke-interface {p3}, Le8/g;->F()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    sget-object v0, LO7/D;->C:LO7/D$a;

    invoke-interface {p3}, Le8/g;->J()Z

    move-result v3

    invoke-interface {p3}, Le8/g;->J()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, Le8/s;->N()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, Le8/g;->M()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    :goto_1
    move v4, v2

    :goto_2
    invoke-interface {p3}, Le8/s;->q()Z

    move-result v5

    xor-int/2addr v5, v2

    invoke-virtual {v0, v3, v4, v5}, LO7/D$a;->a(ZZZ)LO7/D;

    move-result-object v0

    goto :goto_4

    :cond_6
    :goto_3
    sget-object v0, LO7/D;->D:LO7/D;

    :goto_4
    iput-object v0, v8, Lb8/f;->Q:LO7/D;

    invoke-interface {p3}, Le8/s;->h()LO7/n0;

    move-result-object v0

    iput-object v0, v8, Lb8/f;->R:LO7/n0;

    invoke-interface {p3}, Le8/g;->f()Le8/g;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p3}, Le8/s;->W()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v2

    goto :goto_5

    :cond_7
    move v0, v1

    :goto_5
    iput-boolean v0, v8, Lb8/f;->S:Z

    new-instance v0, Lb8/f$b;

    invoke-direct {v0, p0}, Lb8/f$b;-><init>(Lb8/f;)V

    iput-object v0, v8, Lb8/f;->T:Lb8/f$b;

    new-instance v11, Lb8/g;

    if-eqz v7, :cond_8

    move v4, v2

    goto :goto_6

    :cond_8
    move v4, v1

    :goto_6
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v11

    move-object v1, v10

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Lb8/g;-><init>(La8/g;LO7/e;Le8/g;ZLb8/g;ILy7/k;)V

    iput-object v11, v8, Lb8/f;->U:Lb8/g;

    sget-object v0, LO7/Y;->e:LO7/Y$a;

    invoke-virtual {v10}, La8/g;->e()LE8/n;

    move-result-object v1

    invoke-virtual {v10}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2}, La8/b;->k()LG8/l;

    move-result-object v2

    invoke-interface {v2}, LG8/l;->c()LG8/g;

    move-result-object v2

    new-instance v3, Lb8/f$f;

    invoke-direct {v3, p0}, Lb8/f$f;-><init>(Lb8/f;)V

    invoke-virtual {v0, p0, v1, v2, v3}, LO7/Y$a;->a(LO7/e;LE8/n;LG8/g;Lx7/l;)LO7/Y;

    move-result-object v0

    iput-object v0, v8, Lb8/f;->V:LO7/Y;

    new-instance v0, Ly8/f;

    invoke-direct {v0, v11}, Ly8/f;-><init>(Ly8/h;)V

    iput-object v0, v8, Lb8/f;->W:Ly8/f;

    new-instance v0, Lb8/l;

    invoke-direct {v0, v10, p3, p0}, Lb8/l;-><init>(La8/g;Le8/g;LZ7/c;)V

    iput-object v0, v8, Lb8/f;->X:Lb8/l;

    invoke-static {v10, p3}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v0

    iput-object v0, v8, Lb8/f;->Y:LP7/g;

    invoke-virtual {v10}, La8/g;->e()LE8/n;

    move-result-object v0

    new-instance v1, Lb8/f$c;

    invoke-direct {v1, p0}, Lb8/f$c;-><init>(Lb8/f;)V

    invoke-interface {v0, v1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object v0

    iput-object v0, v8, Lb8/f;->Z:LE8/i;

    return-void
.end method

.method public synthetic constructor <init>(La8/g;LO7/m;Le8/g;LO7/e;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lb8/f;-><init>(La8/g;LO7/m;Le8/g;LO7/e;)V

    return-void
.end method

.method public static final synthetic T0(Lb8/f;)LO7/e;
    .locals 0

    iget-object p0, p0, Lb8/f;->M:LO7/e;

    return-object p0
.end method

.method public static final synthetic U0(Lb8/f;)La8/g;
    .locals 0

    iget-object p0, p0, Lb8/f;->N:La8/g;

    return-object p0
.end method

.method public static final synthetic V0(Lb8/f;)Lb8/g;
    .locals 0

    iget-object p0, p0, Lb8/f;->U:Lb8/g;

    return-object p0
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/f;->Z:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public E()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public H0()Ly8/h;
    .locals 1

    iget-object v0, p0, Lb8/f;->W:Ly8/f;

    return-object v0
.end method

.method public I()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I0()LO7/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic M0()Ly8/h;
    .locals 1

    invoke-virtual {p0}, Lb8/f;->b1()Lb8/g;

    move-result-object v0

    return-object v0
.end method

.method public N0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public O()Ljava/util/Collection;
    .locals 8

    .prologue
    iget-object v0, p0, Lb8/f;->Q:LO7/D;

    sget-object v1, LO7/D;->E:LO7/D;

    if-ne v0, v1, :cond_3

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v0

    iget-object v1, p0, Lb8/f;->L:Le8/g;

    invoke-interface {v1}, Le8/g;->T()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/j;

    iget-object v4, p0, Lb8/f;->N:La8/g;

    invoke-virtual {v4}, La8/g;->g()Lc8/d;

    move-result-object v4

    invoke-virtual {v4, v3, v0}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v3

    invoke-virtual {v3}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->w()LO7/h;

    move-result-object v3

    instance-of v4, v3, LO7/e;

    if-eqz v4, :cond_1

    check-cast v3, LO7/e;

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lb8/f$d;

    invoke-direct {v0}, Lb8/f$d;-><init>()V

    invoke-static {v2, v0}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    :goto_2
    check-cast v0, Ljava/util/Collection;

    goto :goto_3

    :cond_3
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :goto_3
    return-object v0
.end method

.method public P()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Q(LG8/g;)Ly8/h;
    .locals 0

    invoke-virtual {p0, p1}, Lb8/f;->c1(LG8/g;)Lb8/g;

    move-result-object p1

    return-object p1
.end method

.method public R()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public R0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lb8/f;->S:Z

    return v0
.end method

.method public final W0(LY7/g;LO7/e;)Lb8/f;
    .locals 3

    const-string v0, "javaResolverCache"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb8/f;

    iget-object v1, p0, Lb8/f;->N:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v2

    invoke-virtual {v2, p1}, La8/b;->x(LY7/g;)La8/b;

    move-result-object p1

    invoke-static {v1, p1}, La8/a;->i(La8/g;La8/b;)La8/g;

    move-result-object p1

    invoke-virtual {p0}, LR7/g;->b()LO7/m;

    move-result-object v1

    const-string v2, "getContainingDeclaration(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lb8/f;->L:Le8/g;

    invoke-direct {v0, p1, v1, v2, p2}, Lb8/f;-><init>(La8/g;LO7/m;Le8/g;LO7/e;)V

    return-object v0
.end method

.method public X()LO7/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public X0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/f;->U:Lb8/g;

    invoke-virtual {v0}, Lb8/g;->x0()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public Y()Ly8/h;
    .locals 1

    iget-object v0, p0, Lb8/f;->X:Lb8/l;

    return-object v0
.end method

.method public final Y0()Le8/g;
    .locals 1

    iget-object v0, p0, Lb8/f;->L:Le8/g;

    return-object v0
.end method

.method public final Z0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/f;->O:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a0()LO7/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a1()La8/g;
    .locals 1

    iget-object v0, p0, Lb8/f;->K:La8/g;

    return-object v0
.end method

.method public b1()Lb8/g;
    .locals 2

    invoke-super {p0}, LR7/a;->M0()Ly8/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lb8/g;

    return-object v0
.end method

.method protected c1(LG8/g;)Lb8/g;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/f;->V:LO7/Y;

    invoke-virtual {v0, p1}, LO7/Y;->c(LG8/g;)Ly8/h;

    move-result-object p1

    check-cast p1, Lb8/g;

    return-object p1
.end method

.method public h()LO7/u;
    .locals 2

    .prologue
    iget-object v0, p0, Lb8/f;->R:LO7/n0;

    sget-object v1, LO7/t;->a:LO7/u;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb8/f;->L:Le8/g;

    invoke-interface {v0}, Le8/g;->f()Le8/g;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LX7/s;->a:LO7/u;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb8/f;->R:LO7/n0;

    invoke-static {v0}, LX7/J;->d(LO7/n0;)LO7/u;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public j()LO7/f;
    .locals 1

    iget-object v0, p0, Lb8/f;->P:LO7/f;

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    iget-object v0, p0, Lb8/f;->Y:LP7/g;

    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p()LF8/e0;
    .locals 1

    iget-object v0, p0, Lb8/f;->T:Lb8/f$b;

    return-object v0
.end method

.method public q()LO7/D;
    .locals 1

    iget-object v0, p0, Lb8/f;->Q:LO7/D;

    return-object v0
.end method

.method public bridge synthetic r()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lb8/f;->X0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lv8/c;->m(LO7/m;)Ln8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
