.class public final LU7/l;
.super LU7/p;
.source "SourceFile"

# interfaces
.implements LU7/h;
.implements LU7/v;
.implements Le8/g;


# instance fields
.field private final a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/p;-><init>()V

    iput-object p1, p0, LU7/l;->a:Ljava/lang/Class;

    return-void
.end method

.method public static final synthetic X(LU7/l;Ljava/lang/reflect/Method;)Z
    .locals 0

    invoke-direct {p0, p1}, LU7/l;->e0(Ljava/lang/reflect/Method;)Z

    move-result p0

    return p0
.end method

.method private final e0(Ljava/lang/reflect/Method;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "values"

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v1, "getParameterTypes(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_0

    :cond_1
    const-string v2, "valueOf"

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    aput-object v1, v0, v3

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0
.end method


# virtual methods
.method public bridge synthetic A()Ljava/lang/reflect/AnnotatedElement;
    .locals 1

    invoke-virtual {p0}, LU7/l;->Z()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic H()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LU7/l;->a0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public I()I
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    return v0
.end method

.method public J()Z
    .locals 2

    .prologue
    sget-object v0, LU7/b;->a:LU7/b;

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LU7/b;->f(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public M()Z
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    return v0
.end method

.method public N()Z
    .locals 1

    invoke-interface {p0}, LU7/v;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    return v0
.end method

.method public O()Le8/D;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic Q()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LU7/l;->b0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public bridge synthetic S()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LU7/l;->c0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public T()Ljava/util/Collection;
    .locals 6

    .prologue
    sget-object v0, LU7/b;->a:LU7/b;

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LU7/b;->c(Ljava/lang/Class;)[Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    new-instance v5, LU7/n;

    invoke-direct {v5, v4}, LU7/n;-><init>(Ljava/lang/reflect/Type;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    :cond_1
    return-object v1
.end method

.method public W()Z
    .locals 1

    invoke-interface {p0}, LU7/v;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    return v0
.end method

.method public Y()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v1, "getDeclaredConstructors(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->O([Ljava/lang/Object;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$a;->L:LU7/l$a;

    invoke-static {v0, v1}, LR8/k;->x(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$b;->L:LU7/l$b;

    invoke-static {v0, v1}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public Z()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public a0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getDeclaredFields(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->O([Ljava/lang/Object;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$c;->L:LU7/l$c;

    invoke-static {v0, v1}, LR8/k;->x(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$d;->L:LU7/l$d;

    invoke-static {v0, v1}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getDeclaredClasses(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->O([Ljava/lang/Object;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$e;->D:LU7/l$e;

    invoke-static {v0, v1}, LR8/k;->x(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$f;->D:LU7/l$f;

    invoke-static {v0, v1}, LR8/k;->H(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c0()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->O([Ljava/lang/Object;)LR8/h;

    move-result-object v0

    new-instance v1, LU7/l$g;

    invoke-direct {v1, p0}, LU7/l$g;-><init>(LU7/l;)V

    invoke-static {v0, v1}, LR8/k;->w(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    sget-object v1, LU7/l$h;->L:LU7/l$h;

    invoke-static {v0, v1}, LR8/k;->G(LR8/h;Lx7/l;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d0()LU7/l;
    .locals 2

    .prologue
    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LU7/l;

    invoke-direct {v1, v0}, LU7/l;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public e()Ln8/c;
    .locals 2

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    invoke-virtual {v0}, Ln8/b;->b()Ln8/c;

    move-result-object v0

    const-string v1, "asSingleFqName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LU7/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    check-cast p1, LU7/l;

    iget-object p1, p1, LU7/l;->a:Ljava/lang/Class;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic f()Le8/g;
    .locals 1

    invoke-virtual {p0}, LU7/l;->d0()LU7/l;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 6

    .prologue
    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    const-string v1, "getTypeParameters(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    new-instance v5, LU7/A;

    invoke-direct {v5, v4}, LU7/A;-><init>(Ljava/lang/reflect/TypeVariable;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public getName()Ln8/f;
    .locals 4

    .prologue
    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "."

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LS8/r;->m1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public h()LO7/n0;
    .locals 2

    .prologue
    invoke-interface {p0}, LU7/v;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, LO7/m0$h;->c:LO7/m0$h;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, LO7/m0$e;->c:LO7/m0$e;

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LS7/c;->c:LS7/c;

    goto :goto_0

    :cond_2
    sget-object v0, LS7/b;->c:LS7/b;

    goto :goto_0

    :cond_3
    sget-object v0, LS7/a;->c:LS7/a;

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/Collection;
    .locals 6

    .prologue
    sget-object v0, LU7/b;->a:LU7/b;

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LU7/b;->d(Ljava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v0, v1

    new-instance v5, LU7/y;

    invoke-direct {v5, v4}, LU7/y;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public j(Ln8/c;)LU7/e;
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LU7/h;->A()Ljava/lang/reflect/AnnotatedElement;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, LU7/i;->a([Ljava/lang/annotation/Annotation;Ln8/c;)LU7/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic j(Ln8/c;)Le8/a;
    .locals 0

    invoke-interface {p0, p1}, LU7/h;->j(Ln8/c;)LU7/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k()Ljava/util/Collection;
    .locals 1

    invoke-interface {p0}, LU7/h;->k()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    .prologue
    invoke-interface {p0}, LU7/h;->A()Ljava/lang/reflect/AnnotatedElement;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LU7/i;->b([Ljava/lang/annotation/Annotation;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q()Z
    .locals 1

    invoke-interface {p0}, LU7/v;->I()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic r()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LU7/l;->Y()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public t()Z
    .locals 1

    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LU7/l;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 4

    .prologue
    iget-object v0, p0, LU7/l;->a:Ljava/lang/Class;

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0

    :cond_0
    new-instance v0, Ly7/U;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Ly7/U;-><init>(I)V

    iget-object v2, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ly7/U;->a(Ljava/lang/Object;)V

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v1

    const-string v2, "getGenericInterfaces(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ly7/U;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly7/U;->c()I

    move-result v1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    invoke-virtual {v0, v1}, Ly7/U;->d([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Type;

    new-instance v3, LU7/n;

    invoke-direct {v3, v2}, LU7/n;-><init>(Ljava/lang/reflect/Type;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public w()Z
    .locals 2

    .prologue
    sget-object v0, LU7/b;->a:LU7/b;

    iget-object v1, p0, LU7/l;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, LU7/b;->e(Ljava/lang/Class;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
