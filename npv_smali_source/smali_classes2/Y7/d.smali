.class public final LY7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY7/d;

.field private static final b:Ljava/util/Map;

.field private static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, LY7/d;

    invoke-direct {v0}, LY7/d;-><init>()V

    sput-object v0, LY7/d;->a:LY7/d;

    const-class v0, LP7/n;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    const-string v1, "PACKAGE"

    invoke-static {v1, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v1, LP7/n;->V:LP7/n;

    sget-object v2, LP7/n;->i0:LP7/n;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    const-string v2, "TYPE"

    invoke-static {v2, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    sget-object v2, LP7/n;->W:LP7/n;

    invoke-static {v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v2

    const-string v3, "ANNOTATION_TYPE"

    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    sget-object v3, LP7/n;->X:LP7/n;

    invoke-static {v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v3

    const-string v4, "TYPE_PARAMETER"

    invoke-static {v4, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    sget-object v4, LP7/n;->Z:LP7/n;

    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v4

    const-string v5, "FIELD"

    invoke-static {v5, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    sget-object v5, LP7/n;->a0:LP7/n;

    invoke-static {v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v5

    const-string v6, "LOCAL_VARIABLE"

    invoke-static {v6, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    sget-object v6, LP7/n;->b0:LP7/n;

    invoke-static {v6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v6

    const-string v7, "PARAMETER"

    invoke-static {v7, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    sget-object v7, LP7/n;->c0:LP7/n;

    invoke-static {v7}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v7

    const-string v8, "CONSTRUCTOR"

    invoke-static {v8, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    sget-object v8, LP7/n;->d0:LP7/n;

    sget-object v9, LP7/n;->e0:LP7/n;

    sget-object v10, LP7/n;->f0:LP7/n;

    invoke-static {v8, v9, v10}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v8

    const-string v9, "METHOD"

    invoke-static {v9, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v8

    sget-object v9, LP7/n;->g0:LP7/n;

    invoke-static {v9}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v9

    const-string v10, "TYPE_USE"

    invoke-static {v10, v9}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v9

    const/16 v10, 0xa

    new-array v10, v10, [Li7/u;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v1, v10, v0

    const/4 v1, 0x2

    aput-object v2, v10, v1

    const/4 v2, 0x3

    aput-object v3, v10, v2

    const/4 v3, 0x4

    aput-object v4, v10, v3

    const/4 v3, 0x5

    aput-object v5, v10, v3

    const/4 v3, 0x6

    aput-object v6, v10, v3

    const/4 v3, 0x7

    aput-object v7, v10, v3

    const/16 v3, 0x8

    aput-object v8, v10, v3

    const/16 v3, 0x9

    aput-object v9, v10, v3

    invoke-static {v10}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v3

    sput-object v3, LY7/d;->b:Ljava/util/Map;

    const-string v3, "RUNTIME"

    sget-object v4, LP7/m;->C:LP7/m;

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const-string v4, "CLASS"

    sget-object v5, LP7/m;->D:LP7/m;

    invoke-static {v4, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    const-string v5, "SOURCE"

    sget-object v6, LP7/m;->E:LP7/m;

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    new-array v2, v2, [Li7/u;

    aput-object v3, v2, v11

    aput-object v4, v2, v0

    aput-object v5, v2, v1

    invoke-static {v2}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LY7/d;->c:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Le8/b;)Lt8/g;
    .locals 3

    .prologue
    instance-of v0, p1, Le8/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Le8/m;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    sget-object v0, LY7/d;->c:Ljava/util/Map;

    invoke-interface {p1}, Le8/m;->d()Ln8/f;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP7/m;

    if-eqz p1, :cond_2

    new-instance v1, Lt8/j;

    sget-object v0, LL7/j$a;->K:Ln8/c;

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    const-string v2, "topLevel(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p1

    const-string v2, "identifier(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, p1}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    :cond_2
    return-object v1
.end method

.method public final b(Ljava/lang/String;)Ljava/util/Set;
    .locals 1

    .prologue
    sget-object v0, LY7/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/EnumSet;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Ljava/util/List;)Lt8/g;
    .locals 5

    .prologue
    const-string v0, "arguments"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Le8/m;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/m;

    sget-object v2, LY7/d;->a:LY7/d;

    invoke-interface {v1}, Le8/m;->d()Ln8/f;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v2, v1}, LY7/d;->b(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP7/n;

    new-instance v2, Lt8/j;

    sget-object v3, LL7/j$a;->J:Ln8/c;

    invoke-static {v3}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v3

    const-string v4, "topLevel(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    const-string v4, "identifier(...)"

    invoke-static {v1, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v3, v1}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance p1, Lt8/b;

    sget-object v1, LY7/d$a;->D:LY7/d$a;

    invoke-direct {p1, v0, v1}, Lt8/b;-><init>(Ljava/util/List;Lx7/l;)V

    return-object p1
.end method
