.class public abstract LI7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF7/b;
.implements LI7/C;


# instance fields
.field private final C:LI7/F$a;

.field private final D:LI7/F$a;

.field private final E:LI7/F$a;

.field private final F:LI7/F$a;

.field private final G:LI7/F$a;

.field private final H:Li7/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LI7/j$b;

    invoke-direct {v0, p0}, LI7/j$b;-><init>(LI7/j;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    const-string v1, "lazySoft(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LI7/j;->C:LI7/F$a;

    new-instance v0, LI7/j$c;

    invoke-direct {v0, p0}, LI7/j$c;-><init>(LI7/j;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LI7/j;->D:LI7/F$a;

    new-instance v0, LI7/j$d;

    invoke-direct {v0, p0}, LI7/j$d;-><init>(LI7/j;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LI7/j;->E:LI7/F$a;

    new-instance v0, LI7/j$e;

    invoke-direct {v0, p0}, LI7/j$e;-><init>(LI7/j;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LI7/j;->F:LI7/F$a;

    new-instance v0, LI7/j$a;

    invoke-direct {v0, p0}, LI7/j$a;-><init>(LI7/j;)V

    invoke-static {v0}, LI7/F;->c(Lx7/a;)LI7/F$a;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LI7/j;->G:LI7/F$a;

    sget-object v0, Li7/r;->D:Li7/r;

    new-instance v1, LI7/j$f;

    invoke-direct {v1, p0}, LI7/j$f;-><init>(LI7/j;)V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, LI7/j;->H:Li7/n;

    return-void
.end method

.method private final B(LF7/j;)I
    .locals 1

    .prologue
    iget-object v0, p0, LI7/j;->H:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LF7/j;->getType()LF7/o;

    move-result-object v0

    invoke-static {v0}, LI7/M;->k(LF7/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LF7/j;->getType()LF7/o;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LI7/A;

    invoke-virtual {p1}, LI7/A;->f()LF8/E;

    move-result-object p1

    invoke-static {p1}, LF8/m0;->a(LF8/E;)LF8/M;

    move-result-object p1

    invoke-static {p1}, LJ7/k;->m(LF8/M;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Check if parametersNeedMFVCFlattening is true before"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic e(LI7/j;LF7/o;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LI7/j;->n(LF7/o;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(LI7/j;)Ljava/lang/reflect/Type;
    .locals 0

    invoke-direct {p0}, LI7/j;->p()Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LI7/j;LF7/j;)I
    .locals 0

    invoke-direct {p0, p1}, LI7/j;->B(LF7/j;)I

    move-result p0

    return p0
.end method

.method public static final synthetic m(LI7/j;)Li7/n;
    .locals 0

    iget-object p0, p0, LI7/j;->H:Li7/n;

    return-object p0
.end method

.method private final n(LF7/o;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {p1}, LH7/b;->b(LF7/o;)LF7/c;

    move-result-object p1

    invoke-static {p1}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "run(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, LI7/D;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot instantiate the default empty array of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", because it is not an array type"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final p()Ljava/lang/reflect/Type;
    .locals 4

    .prologue
    invoke-interface {p0}, LF7/b;->y()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LI7/j;->s()LJ7/e;

    move-result-object v0

    invoke-interface {v0}, LJ7/e;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    const-class v3, Lm7/e;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v2, "getActualTypeArguments(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->F0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lj7/n;->Y([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/Type;

    :cond_3
    return-object v1
.end method


# virtual methods
.method public abstract A()LO7/b;
.end method

.method public C()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LI7/j;->D:LI7/F$a;

    invoke-virtual {v0}, LI7/F$a;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method protected final D()Z
    .locals 2

    .prologue
    invoke-interface {p0}, LF7/b;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<init>"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/j;->t()LI7/n;

    move-result-object v0

    invoke-interface {v0}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isAnnotation()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract E()Z
.end method

.method public g()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LI7/j;->F:LI7/F$a;

    invoke-virtual {v0}, LI7/F$a;->b()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "invoke(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public abstract s()LJ7/e;
.end method

.method public abstract t()LI7/n;
.end method

.method public abstract x()LJ7/e;
.end method

.method public varargs z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, LI7/j;->s()LJ7/e;

    move-result-object v0

    invoke-interface {v0, p1}, LJ7/e;->z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, LG7/a;

    invoke-direct {v0, p1}, LG7/a;-><init>(Ljava/lang/IllegalAccessException;)V

    throw v0
.end method
