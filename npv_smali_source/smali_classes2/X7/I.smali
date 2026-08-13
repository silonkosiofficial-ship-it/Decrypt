.class public abstract LX7/I;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/I$a;,
        LX7/I$b;,
        LX7/I$c;
    }
.end annotation


# static fields
.field public static final a:LX7/I$a;

.field private static final b:Ljava/util/List;

.field private static final c:Ljava/util/List;

.field private static final d:Ljava/util/List;

.field private static final e:Ljava/util/Map;

.field private static final f:Ljava/util/Map;

.field private static final g:Ljava/util/Set;

.field private static final h:Ljava/util/Set;

.field private static final i:LX7/I$a$a;

.field private static final j:Ljava/util/Map;

.field private static final k:Ljava/util/Map;

.field private static final l:Ljava/util/Set;

.field private static final m:Ljava/util/List;

.field private static final n:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .prologue
    new-instance v9, LX7/I$a;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, LX7/I$a;-><init>(Ly7/k;)V

    sput-object v9, LX7/I;->a:LX7/I$a;

    const-string v9, "removeAll"

    const-string v10, "retainAll"

    const-string v11, "containsAll"

    filled-new-array {v11, v9, v10}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v9, v11}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "getDesc(...)"

    if-eqz v12, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    sget-object v14, LX7/I;->a:LX7/I$a;

    sget-object v15, Lw8/e;->G:Lw8/e;

    invoke-virtual {v15}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "java/util/Collection"

    const-string v0, "Ljava/util/Collection;"

    invoke-static {v14, v13, v12, v0, v15}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v10, LX7/I;->b:Ljava/util/List;

    check-cast v10, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v10, v11}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LX7/I$a$a;

    invoke-virtual {v10}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sput-object v0, LX7/I;->c:Ljava/util/List;

    sget-object v0, LX7/I;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v0, v11}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LX7/I$a$a;

    invoke-virtual {v10}, LX7/I$a$a;->c()Ln8/f;

    move-result-object v10

    invoke-virtual {v10}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sput-object v9, LX7/I;->d:Ljava/util/List;

    sget-object v0, Lg8/A;->a:Lg8/A;

    sget-object v9, LX7/I;->a:LX7/I$a;

    const-string v10, "Collection"

    invoke-virtual {v0, v10}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    sget-object v14, Lw8/e;->G:Lw8/e;

    invoke-virtual {v14}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "contains"

    const-string v2, "Ljava/lang/Object;"

    invoke-static {v9, v12, v1, v2, v15}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v1

    sget-object v12, LX7/I$c;->F:LX7/I$c;

    invoke-static {v1, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    invoke-virtual {v0, v10}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "remove"

    invoke-static {v9, v10, v3, v2, v15}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v10

    invoke-static {v10, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    const-string v15, "Map"

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "containsKey"

    invoke-static {v9, v4, v6, v2, v5}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v4

    invoke-static {v4, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "containsValue"

    invoke-static {v9, v5, v7, v2, v6}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v5

    invoke-static {v5, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "Ljava/lang/Object;Ljava/lang/Object;"

    invoke-static {v9, v6, v3, v14, v7}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v6

    invoke-static {v6, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v12, "getOrDefault"

    invoke-static {v9, v7, v12, v14, v2}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v7

    sget-object v12, LX7/I$c;->G:LX7/I$c;

    invoke-static {v7, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v14, "get"

    invoke-static {v9, v12, v14, v2, v2}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v12

    sget-object v8, LX7/I$c;->D:LX7/I$c;

    invoke-static {v12, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v12

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v9, v15, v3, v2, v2}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v15

    invoke-static {v15, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v8

    const-string v15, "List"

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v16, Lw8/e;->K:Lw8/e;

    move-object/from16 v17, v14

    invoke-virtual/range {v16 .. v16}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v3

    const-string v3, "indexOf"

    invoke-static {v9, v11, v3, v2, v14}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v3

    sget-object v11, LX7/I$c;->E:LX7/I$c;

    invoke-static {v3, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    invoke-virtual {v0, v15}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "lastIndexOf"

    invoke-static {v9, v0, v15, v2, v14}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v0

    invoke-static {v0, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const/16 v9, 0xa

    new-array v11, v9, [Li7/u;

    const/4 v9, 0x0

    aput-object v1, v11, v9

    const/4 v1, 0x1

    aput-object v10, v11, v1

    const/4 v1, 0x2

    aput-object v4, v11, v1

    const/4 v1, 0x3

    aput-object v5, v11, v1

    const/4 v1, 0x4

    aput-object v6, v11, v1

    const/4 v1, 0x5

    aput-object v7, v11, v1

    const/4 v1, 0x6

    aput-object v12, v11, v1

    const/4 v1, 0x7

    aput-object v8, v11, v1

    const/16 v1, 0x8

    aput-object v3, v11, v1

    const/16 v1, 0x9

    aput-object v0, v11, v1

    invoke-static {v11}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/I;->e:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lj7/S;->d(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LX7/I$a$a;

    invoke-virtual {v4}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    sput-object v1, LX7/I;->f:Ljava/util/Map;

    sget-object v0, LX7/I;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    sget-object v1, LX7/I;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LX7/I$a$a;

    invoke-virtual {v4}, LX7/I$a$a;->c()Ln8/f;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LX7/I;->g:Ljava/util/Set;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LX7/I$a$a;

    invoke-virtual {v3}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    invoke-static {v1}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/I;->h:Ljava/util/Set;

    sget-object v0, LX7/I;->a:LX7/I$a;

    sget-object v1, Lw8/e;->K:Lw8/e;

    invoke-virtual {v1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "java/util/List"

    const-string v5, "removeAt"

    invoke-static {v0, v4, v5, v3, v2}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v2

    sput-object v2, LX7/I;->i:LX7/I$a$a;

    sget-object v3, Lg8/A;->a:Lg8/A;

    const-string v4, "Number"

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lw8/e;->I:Lw8/e;

    invoke-virtual {v6}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "toByte"

    const-string v8, ""

    invoke-static {v0, v5, v7, v8, v6}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v5

    const-string v6, "byteValue"

    invoke-static {v6}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lw8/e;->J:Lw8/e;

    invoke-virtual {v7}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "toShort"

    invoke-static {v0, v6, v9, v8, v7}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v6

    const-string v7, "shortValue"

    invoke-static {v7}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v7

    invoke-static {v6, v7}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "toInt"

    invoke-static {v0, v7, v10, v8, v9}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v7

    const-string v9, "intValue"

    invoke-static {v9}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v9

    invoke-static {v7, v9}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lw8/e;->M:Lw8/e;

    invoke-virtual {v10}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "toLong"

    invoke-static {v0, v9, v11, v8, v10}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v9

    const-string v10, "longValue"

    invoke-static {v10}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v10

    invoke-static {v9, v10}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v9

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lw8/e;->L:Lw8/e;

    invoke-virtual {v11}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "toFloat"

    invoke-static {v0, v10, v12, v8, v11}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v10

    const-string v11, "floatValue"

    invoke-static {v11}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v11

    invoke-static {v10, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    invoke-virtual {v3, v4}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Lw8/e;->N:Lw8/e;

    invoke-virtual {v11}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "toDouble"

    invoke-static {v0, v4, v12, v8, v11}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v4

    const-string v8, "doubleValue"

    invoke-static {v8}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-static {v4, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    invoke-static/range {v18 .. v18}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v8

    invoke-static {v2, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    const-string v8, "CharSequence"

    invoke-virtual {v3, v8}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lw8/e;->H:Lw8/e;

    invoke-virtual {v8}, Lw8/e;->m()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, v17

    invoke-static {v0, v3, v11, v1, v8}, LX7/I$a;->a(LX7/I$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LX7/I$a$a;

    move-result-object v0

    const-string v1, "charAt"

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const/16 v1, 0x8

    new-array v1, v1, [Li7/u;

    const/4 v3, 0x0

    aput-object v5, v1, v3

    const/4 v3, 0x1

    aput-object v6, v1, v3

    const/4 v3, 0x2

    aput-object v7, v1, v3

    const/4 v3, 0x3

    aput-object v9, v1, v3

    const/4 v3, 0x4

    aput-object v10, v1, v3

    const/4 v3, 0x5

    aput-object v4, v1, v3

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v0, v1, v2

    invoke-static {v1}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/I;->j:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lj7/S;->d(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LX7/I$a$a;

    invoke-virtual {v3}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_6
    sput-object v1, LX7/I;->k:Ljava/util/Map;

    sget-object v0, LX7/I;->j:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LX7/I$a$a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ln8/f;

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, LX7/I$a$a;->b(LX7/I$a$a;Ljava/lang/String;Ln8/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LX7/I$a$a;

    move-result-object v2

    invoke-virtual {v2}, LX7/I$a$a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_7
    sput-object v1, LX7/I;->l:Ljava/util/Set;

    sget-object v0, LX7/I;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LX7/I$a$a;

    invoke-virtual {v2}, LX7/I$a$a;->c()Ln8/f;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_8
    sput-object v1, LX7/I;->m:Ljava/util/List;

    sget-object v0, LX7/I;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Li7/u;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LX7/I$a$a;

    invoke-virtual {v4}, LX7/I$a$a;->c()Ln8/f;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_9
    const/16 v2, 0xa

    invoke-static {v1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lj7/S;->d(I)I

    move-result v0

    const/16 v2, 0x10

    invoke-static {v0, v2}, LE7/j;->d(II)I

    move-result v0

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li7/u;

    invoke-virtual {v1}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-virtual {v1}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/f;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_a
    sput-object v2, LX7/I;->n:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/util/List;
    .locals 1

    sget-object v0, LX7/I;->c:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/I;->g:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic c()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/I;->h:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic d()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/I;->n:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic e()Ljava/util/List;
    .locals 1

    sget-object v0, LX7/I;->m:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic f()LX7/I$a$a;
    .locals 1

    sget-object v0, LX7/I;->i:LX7/I$a$a;

    return-object v0
.end method

.method public static final synthetic g()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/I;->f:Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic h()Ljava/util/Map;
    .locals 1

    sget-object v0, LX7/I;->k:Ljava/util/Map;

    return-object v0
.end method
