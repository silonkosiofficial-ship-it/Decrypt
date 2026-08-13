.class public abstract Lf8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lf8/e;

.field private static final b:Lf8/e;

.field private static final c:Lf8/e;

.field private static final d:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v7, Lf8/e;

    sget-object v1, Lf8/h;->D:Lf8/h;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZILy7/k;)V

    sput-object v7, Lf8/j;->a:Lf8/e;

    new-instance v0, Lf8/e;

    sget-object v2, Lf8/h;->E:Lf8/h;

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v0

    move-object v9, v2

    invoke-direct/range {v8 .. v14}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZILy7/k;)V

    sput-object v0, Lf8/j;->b:Lf8/e;

    new-instance v0, Lf8/e;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lf8/e;-><init>(Lf8/h;Lf8/f;ZZILy7/k;)V

    sput-object v0, Lf8/j;->c:Lf8/e;

    sget-object v0, Lg8/A;->a:Lg8/A;

    const-string v1, "Object"

    invoke-virtual {v0, v1}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Predicate"

    invoke-virtual {v0, v2}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Function"

    invoke-virtual {v0, v3}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Consumer"

    invoke-virtual {v0, v4}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "BiFunction"

    invoke-virtual {v0, v5}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "BiConsumer"

    invoke-virtual {v0, v6}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "UnaryOperator"

    invoke-virtual {v0, v7}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "stream/Stream"

    invoke-virtual {v0, v8}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Optional"

    invoke-virtual {v0, v9}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lf8/m;

    invoke-direct {v10}, Lf8/m;-><init>()V

    const-string v11, "Iterator"

    invoke-virtual {v0, v11}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lf8/m$a;

    invoke-direct {v12, v10, v11}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v11, Lf8/j$a;

    invoke-direct {v11, v4}, Lf8/j$a;-><init>(Ljava/lang/String;)V

    const-string v13, "forEachRemaining"

    invoke-virtual {v12, v13, v11}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v11, "Iterable"

    invoke-virtual {v0, v11}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lf8/m$a;

    invoke-direct {v12, v10, v11}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v11, Lf8/j$g;

    invoke-direct {v11, v0}, Lf8/j$g;-><init>(Lg8/A;)V

    const-string v13, "spliterator"

    invoke-virtual {v12, v13, v11}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v11, "Collection"

    invoke-virtual {v0, v11}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lf8/m$a;

    invoke-direct {v12, v10, v11}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v11, Lf8/j$h;

    invoke-direct {v11, v2}, Lf8/j$h;-><init>(Ljava/lang/String;)V

    const-string v13, "removeIf"

    invoke-virtual {v12, v13, v11}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v11, Lf8/j$i;

    invoke-direct {v11, v8}, Lf8/j$i;-><init>(Ljava/lang/String;)V

    const-string v13, "stream"

    invoke-virtual {v12, v13, v11}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v11, Lf8/j$j;

    invoke-direct {v11, v8}, Lf8/j$j;-><init>(Ljava/lang/String;)V

    const-string v8, "parallelStream"

    invoke-virtual {v12, v8, v11}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v8, "List"

    invoke-virtual {v0, v8}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Lf8/m$a;

    invoke-direct {v11, v10, v8}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v8, Lf8/j$k;

    invoke-direct {v8, v7}, Lf8/j$k;-><init>(Ljava/lang/String;)V

    const-string v7, "replaceAll"

    invoke-virtual {v11, v7, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v8, "Map"

    invoke-virtual {v0, v8}, Lg8/A;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Lf8/m$a;

    invoke-direct {v11, v10, v8}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v8, Lf8/j$l;

    invoke-direct {v8, v6}, Lf8/j$l;-><init>(Ljava/lang/String;)V

    const-string v12, "forEach"

    invoke-virtual {v11, v12, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$m;

    invoke-direct {v8, v1}, Lf8/j$m;-><init>(Ljava/lang/String;)V

    const-string v12, "putIfAbsent"

    invoke-virtual {v11, v12, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$n;

    invoke-direct {v8, v1}, Lf8/j$n;-><init>(Ljava/lang/String;)V

    const-string v12, "replace"

    invoke-virtual {v11, v12, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$o;

    invoke-direct {v8, v1}, Lf8/j$o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v12, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$p;

    invoke-direct {v8, v5}, Lf8/j$p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v7, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/j$q;

    invoke-direct {v7, v1, v5}, Lf8/j$q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "compute"

    invoke-virtual {v11, v8, v7}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/j$r;

    invoke-direct {v7, v1, v3}, Lf8/j$r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "computeIfAbsent"

    invoke-virtual {v11, v8, v7}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/j$s;

    invoke-direct {v7, v1, v5}, Lf8/j$s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "computeIfPresent"

    invoke-virtual {v11, v8, v7}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/j$t;

    invoke-direct {v7, v1, v5}, Lf8/j$t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "merge"

    invoke-virtual {v11, v8, v7}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/m$a;

    invoke-direct {v7, v10, v9}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v8, Lf8/j$u;

    invoke-direct {v8, v9}, Lf8/j$u;-><init>(Ljava/lang/String;)V

    const-string v11, "empty"

    invoke-virtual {v7, v11, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$v;

    invoke-direct {v8, v1, v9}, Lf8/j$v;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v11, "of"

    invoke-virtual {v7, v11, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$w;

    invoke-direct {v8, v1, v9}, Lf8/j$w;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "ofNullable"

    invoke-virtual {v7, v9, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$x;

    invoke-direct {v8, v1}, Lf8/j$x;-><init>(Ljava/lang/String;)V

    const-string v9, "get"

    invoke-virtual {v7, v9, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v8, Lf8/j$y;

    invoke-direct {v8, v4}, Lf8/j$y;-><init>(Ljava/lang/String;)V

    const-string v11, "ifPresent"

    invoke-virtual {v7, v11, v8}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v7, "ref/Reference"

    invoke-virtual {v0, v7}, Lg8/A;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lf8/m$a;

    invoke-direct {v8, v10, v7}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v7, Lf8/j$z;

    invoke-direct {v7, v1}, Lf8/j$z;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v9, v7}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v7, Lf8/m$a;

    invoke-direct {v7, v10, v2}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v2, Lf8/j$A;

    invoke-direct {v2, v1}, Lf8/j$A;-><init>(Ljava/lang/String;)V

    const-string v8, "test"

    invoke-virtual {v7, v8, v2}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v2, "BiPredicate"

    invoke-virtual {v0, v2}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v7, Lf8/m$a;

    invoke-direct {v7, v10, v2}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v2, Lf8/j$B;

    invoke-direct {v2, v1}, Lf8/j$B;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8, v2}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v2, Lf8/m$a;

    invoke-direct {v2, v10, v4}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v4, Lf8/j$b;

    invoke-direct {v4, v1}, Lf8/j$b;-><init>(Ljava/lang/String;)V

    const-string v7, "accept"

    invoke-virtual {v2, v7, v4}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v2, Lf8/m$a;

    invoke-direct {v2, v10, v6}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v4, Lf8/j$c;

    invoke-direct {v4, v1}, Lf8/j$c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7, v4}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v2, Lf8/m$a;

    invoke-direct {v2, v10, v3}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v3, Lf8/j$d;

    invoke-direct {v3, v1}, Lf8/j$d;-><init>(Ljava/lang/String;)V

    const-string v4, "apply"

    invoke-virtual {v2, v4, v3}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    new-instance v2, Lf8/m$a;

    invoke-direct {v2, v10, v5}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v3, Lf8/j$e;

    invoke-direct {v3, v1}, Lf8/j$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4, v3}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    const-string v2, "Supplier"

    invoke-virtual {v0, v2}, Lg8/A;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lf8/m$a;

    invoke-direct {v2, v10, v0}, Lf8/m$a;-><init>(Lf8/m;Ljava/lang/String;)V

    new-instance v0, Lf8/j$f;

    invoke-direct {v0, v1}, Lf8/j$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v9, v0}, Lf8/m$a;->a(Ljava/lang/String;Lx7/l;)V

    invoke-virtual {v10}, Lf8/m;->b()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lf8/j;->d:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a()Lf8/e;
    .locals 1

    sget-object v0, Lf8/j;->c:Lf8/e;

    return-object v0
.end method

.method public static final synthetic b()Lf8/e;
    .locals 1

    sget-object v0, Lf8/j;->b:Lf8/e;

    return-object v0
.end method

.method public static final synthetic c()Lf8/e;
    .locals 1

    sget-object v0, Lf8/j;->a:Lf8/e;

    return-object v0
.end method

.method public static final d()Ljava/util/Map;
    .locals 1

    sget-object v0, Lf8/j;->d:Ljava/util/Map;

    return-object v0
.end method
