.class final LT7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LT7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT7/c;

    invoke-direct {v0}, LT7/c;-><init>()V

    sput-object v0, LT7/c;->a:LT7/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Class;)Lt8/f;
    .locals 4

    .prologue
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const-string v1, "getComponentType(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "topLevel(...)"

    if-eqz v1, :cond_1

    new-instance p1, Lt8/f;

    sget-object v1, LL7/j$a;->f:Ln8/d;

    invoke-virtual {v1}, Ln8/d;->l()Ln8/c;

    move-result-object v1

    invoke-static {v1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1, v0}, Lt8/f;-><init>(Ln8/b;I)V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw8/e;->i(Ljava/lang/String;)Lw8/e;

    move-result-object p1

    invoke-virtual {p1}, Lw8/e;->o()LL7/h;

    move-result-object p1

    const-string v1, "getPrimitiveType(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt8/f;

    if-lez v0, :cond_2

    invoke-virtual {p1}, LL7/h;->g()Ln8/c;

    move-result-object p1

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v1, p1, v0}, Lt8/f;-><init>(Ln8/b;I)V

    return-object v1

    :cond_2
    invoke-virtual {p1}, LL7/h;->m()Ln8/c;

    move-result-object p1

    invoke-static {p1}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object p1

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, Lt8/f;-><init>(Ln8/b;I)V

    return-object v1

    :cond_3
    invoke-static {p1}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object p1

    sget-object v1, LN7/c;->a:LN7/c;

    invoke-virtual {p1}, Ln8/b;->b()Ln8/c;

    move-result-object v2

    const-string v3, "asSingleFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LN7/c;->m(Ln8/c;)Ln8/b;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    new-instance v1, Lt8/f;

    invoke-direct {v1, p1, v0}, Lt8/f;-><init>(Ln8/b;I)V

    return-object v1
.end method

.method private final c(Ljava/lang/Class;Lg8/t$d;)V
    .locals 18

    .prologue
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const-string v1, "getDeclaredConstructors(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_6

    aget-object v4, v0, v3

    sget-object v5, Ln8/h;->i:Ln8/f;

    sget-object v6, LT7/m;->a:LT7/m;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, LT7/m;->a(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p2

    invoke-interface {v7, v5, v6}, Lg8/t$d;->b(Ln8/f;Ljava/lang/String;)Lg8/t$e;

    move-result-object v5

    if-nez v5, :cond_0

    move-object/from16 v11, p0

    move-object/from16 v16, v0

    move/from16 v17, v1

    goto/16 :goto_5

    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v6

    const-string v8, "getDeclaredAnnotations(...)"

    invoke-static {v6, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v6

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    aget-object v10, v6, v9

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v11, p0

    invoke-direct {v11, v5, v10}, LT7/c;->f(Lg8/t$c;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v11, p0

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v8, v6

    const/4 v9, 0x1

    if-nez v8, :cond_2

    move v8, v9

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    xor-int/2addr v8, v9

    if-eqz v8, :cond_5

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    array-length v8, v6

    sub-int/2addr v4, v8

    array-length v8, v6

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v8, :cond_5

    aget-object v10, v6, v9

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v12, v10

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v12, :cond_4

    aget-object v14, v10, v13

    invoke-static {v14}, Lw7/a;->a(Ljava/lang/annotation/Annotation;)LF7/c;

    move-result-object v15

    invoke-static {v15}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object v15

    add-int v2, v9, v4

    move-object/from16 v16, v0

    invoke-static {v15}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    move/from16 v17, v1

    new-instance v1, LT7/b;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v1, v14}, LT7/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {v5, v2, v0, v1}, Lg8/t$e;->b(ILn8/b;LO7/a0;)Lg8/t$a;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, LT7/c;->a:LT7/c;

    invoke-direct {v1, v0, v14, v15}, LT7/c;->h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_3
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v17

    goto :goto_4

    :cond_4
    move-object/from16 v16, v0

    move/from16 v17, v1

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_5
    move-object/from16 v16, v0

    move/from16 v17, v1

    invoke-interface {v5}, Lg8/t$c;->a()V

    :goto_5
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_6
    move-object/from16 v11, p0

    return-void
.end method

.method private final d(Ljava/lang/Class;Lg8/t$d;)V
    .locals 8

    .prologue
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    const-string v0, "getDeclaredFields(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v4

    const-string v5, "identifier(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, LT7/m;->a:LT7/m;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, LT7/m;->b(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-interface {p2, v4, v5, v6}, Lg8/t$d;->a(Ln8/f;Ljava/lang/String;Ljava/lang/Object;)Lg8/t$c;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    const-string v5, "getDeclaredAnnotations(...)"

    invoke-static {v3, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v3

    move v6, v1

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v3, v6

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v4, v7}, LT7/c;->f(Lg8/t$c;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Lg8/t$c;->a()V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final e(Ljava/lang/Class;Lg8/t$d;)V
    .locals 16

    .prologue
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "getDeclaredMethods(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    const-string v6, "identifier(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, LT7/m;->a:LT7/m;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, LT7/m;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p2

    invoke-interface {v7, v5, v6}, Lg8/t$d;->b(Ln8/f;Ljava/lang/String;)Lg8/t$e;

    move-result-object v5

    if-nez v5, :cond_0

    move-object/from16 v11, p0

    goto :goto_4

    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v6

    const-string v8, "getDeclaredAnnotations(...)"

    invoke-static {v6, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v8, v6

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    aget-object v10, v6, v9

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v11, p0

    invoke-direct {v11, v5, v10}, LT7/c;->f(Lg8/t$c;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object/from16 v11, p0

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v4

    const-string v6, "getParameterAnnotations(...)"

    invoke-static {v4, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, [[Ljava/lang/annotation/Annotation;

    array-length v6, v4

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_4

    aget-object v9, v4, v8

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v10, v9

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v10, :cond_3

    aget-object v13, v9, v12

    invoke-static {v13}, Lw7/a;->a(Ljava/lang/annotation/Annotation;)LF7/c;

    move-result-object v14

    invoke-static {v14}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object v14

    invoke-static {v14}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v15

    new-instance v2, LT7/b;

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v2, v13}, LT7/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {v5, v8, v15, v2}, Lg8/t$e;->b(ILn8/b;LO7/a0;)Lg8/t$a;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v15, LT7/c;->a:LT7/c;

    invoke-direct {v15, v2, v13, v14}, LT7/c;->h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    invoke-interface {v5}, Lg8/t$c;->a()V

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v11, p0

    return-void
.end method

.method private final f(Lg8/t$c;Ljava/lang/annotation/Annotation;)V
    .locals 3

    .prologue
    invoke-static {p2}, Lw7/a;->a(Ljava/lang/annotation/Annotation;)LF7/c;

    move-result-object v0

    invoke-static {v0}, Lw7/a;->b(LF7/c;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v1

    new-instance v2, LT7/b;

    invoke-direct {v2, p2}, LT7/b;-><init>(Ljava/lang/annotation/Annotation;)V

    invoke-interface {p1, v1, v2}, Lg8/t$c;->c(Ln8/b;LO7/a0;)Lg8/t$a;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v1, LT7/c;->a:LT7/c;

    invoke-direct {v1, p1, p2, v0}, LT7/c;->h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :cond_0
    return-void
.end method

.method private final g(Lg8/t$a;Ln8/f;Ljava/lang/Object;)V
    .locals 9

    .prologue
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Class;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "null cannot be cast to non-null type java.lang.Class<*>"

    if-eqz v2, :cond_0

    invoke-static {p3, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Class;

    invoke-direct {p0, p3}, LT7/c;->a(Ljava/lang/Class;)Lt8/f;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lg8/t$a;->c(Ln8/f;Lt8/f;)V

    goto/16 :goto_6

    :cond_0
    invoke-static {}, LT7/i;->a()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, p2, p3}, Lg8/t$a;->f(Ln8/f;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    invoke-static {v0}, LU7/d;->h(Ljava/lang/Class;)Z

    move-result v2

    const-string v4, "identifier(...)"

    const-string v5, "null cannot be cast to non-null type kotlin.Enum<*>"

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    invoke-static {p3, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Enum;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p3

    invoke-static {p3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, v0, p3}, Lg8/t$a;->e(Ln8/f;Ln8/b;Ln8/f;)V

    goto/16 :goto_6

    :cond_3
    const-class v2, Ljava/lang/annotation/Annotation;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    const-string v7, "null cannot be cast to non-null type kotlin.Annotation"

    if-eqz v6, :cond_5

    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInterfaces(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lj7/n;->F0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v1

    invoke-interface {p1, p2, v1}, Lg8/t$a;->b(Ln8/f;Ln8/b;)Lg8/t$a;

    move-result-object p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-static {p3, v7}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/annotation/Annotation;

    invoke-direct {p0, p1, p3, v0}, LT7/c;->h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {p1, p2}, Lg8/t$a;->d(Ln8/f;)Lg8/t$b;

    move-result-object p1

    if-nez p1, :cond_6

    return-void

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    const/4 v6, 0x0

    const-string v8, "null cannot be cast to non-null type kotlin.Array<*>"

    if-eqz v0, :cond_7

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p2}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object p2

    invoke-static {p3, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length v0, p3

    :goto_1
    if-ge v6, v0, :cond_b

    aget-object v1, p3, v6

    invoke-static {v1, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Enum;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2, v1}, Lg8/t$b;->b(Ln8/b;Ln8/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_7
    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {p3, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    array-length p2, p3

    :goto_2
    if-ge v6, p2, :cond_b

    aget-object v0, p3, v6

    invoke-static {v0, v3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Class;

    invoke-direct {p0, v0}, LT7/c;->a(Ljava/lang/Class;)Lt8/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lg8/t$b;->e(Lt8/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    invoke-static {p3, v8}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, [Ljava/lang/Object;

    if-eqz v0, :cond_a

    array-length v0, p3

    :goto_3
    if-ge v6, v0, :cond_b

    aget-object v1, p3, v6

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p2}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v2

    invoke-interface {p1, v2}, Lg8/t$b;->d(Ln8/b;)Lg8/t$a;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v1, v7}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/annotation/Annotation;

    invoke-direct {p0, v2, v1, p2}, LT7/c;->h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_a
    array-length p2, p3

    :goto_5
    if-ge v6, p2, :cond_b

    aget-object v0, p3, v6

    invoke-interface {p1, v0}, Lg8/t$b;->c(Ljava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_b
    invoke-interface {p1}, Lg8/t$b;->a()V

    :goto_6
    return-void

    :cond_c
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument value ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "): "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(Lg8/t$a;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 5

    .prologue
    invoke-virtual {p3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object p3

    const-string v0, "getDeclaredMethods(...)"

    invoke-static {p3, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p3, v1

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2, p2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    const-string v4, "identifier(...)"

    invoke-static {v2, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v2, v3}, LT7/c;->g(Lg8/t$a;Ln8/f;Ljava/lang/Object;)V

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lg8/t$a;->a()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;Lg8/t$c;)V
    .locals 3

    .prologue
    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visitor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/napsternetlabs/napsternetv/ProtectedMyApplication$ProtectedMyApplication$VpnPermissionActivity$a;->qdg(Ljava/lang/Class;)[Ljava/lang/annotation/Annotation;

    move-result-object p1

    const-string v0, "getDeclaredAnnotations(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p2, v2}, LT7/c;->f(Lg8/t$c;Ljava/lang/annotation/Annotation;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lg8/t$c;->a()V

    return-void
.end method

.method public final i(Ljava/lang/Class;Lg8/t$d;)V
    .locals 1

    const-string v0, "klass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberVisitor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LT7/c;->e(Ljava/lang/Class;Lg8/t$d;)V

    invoke-direct {p0, p1, p2}, LT7/c;->c(Ljava/lang/Class;Lg8/t$d;)V

    invoke-direct {p0, p1, p2}, LT7/c;->d(Ljava/lang/Class;Lg8/t$d;)V

    return-void
.end method
