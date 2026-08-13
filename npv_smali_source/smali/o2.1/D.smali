.class public final Lo2/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo2/D$a;
    }
.end annotation


# static fields
.field public static final l:Lo2/D$a;

.field private static final m:[Ljava/lang/String;


# instance fields
.field private final a:Lo2/n;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:Z

.field private final e:Lx7/l;

.field private final f:Ljava/util/Map;

.field private final g:[Ljava/lang/String;

.field private final h:Lo2/i;

.field private final i:Lo2/j;

.field private final j:LV8/a;

.field private k:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lo2/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo2/D$a;-><init>(Ly7/k;)V

    sput-object v0, Lo2/D;->l:Lo2/D$a;

    const-string v0, "UPDATE"

    const-string v1, "DELETE"

    const-string v2, "INSERT"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo2/D;->m:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lo2/n;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLx7/l;)V
    .locals 3

    .prologue
    const-string v0, "database"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shadowTablesMap"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewTables"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableNames"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onInvalidatedTablesIds"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/D;->a:Lo2/n;

    iput-object p2, p0, Lo2/D;->b:Ljava/util/Map;

    iput-object p3, p0, Lo2/D;->c:Ljava/util/Map;

    iput-boolean p5, p0, Lo2/D;->d:Z

    iput-object p6, p0, Lo2/D;->e:Lx7/l;

    const/4 p1, 0x0

    invoke-static {p1}, LV8/b;->a(Z)LV8/a;

    move-result-object p2

    iput-object p2, p0, Lo2/D;->j:LV8/a;

    sget-object p2, Lo2/D$g;->D:Lo2/D$g;

    iput-object p2, p0, Lo2/D;->k:Lx7/a;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lo2/D;->f:Ljava/util/Map;

    array-length p2, p4

    new-array p3, p2, [Ljava/lang/String;

    :goto_0
    const-string p5, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    if-ge p1, p2, :cond_2

    aget-object p6, p4, p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p6, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p6

    invoke-static {p6, p5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lo2/D;->f:Ljava/util/Map;

    invoke-interface {v2, p6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lo2/D;->b:Ljava/util/Map;

    aget-object v2, p4, p1

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move-object p6, v0

    :goto_2
    aput-object p6, p3, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lo2/D;->g:[Ljava/lang/String;

    iget-object p1, p0, Lo2/D;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p6, p0, Lo2/D;->f:Ljava/util/Map;

    invoke-interface {p6, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Lo2/D;->f:Ljava/util/Map;

    invoke-static {p4, p3}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    new-instance p1, Lo2/i;

    iget-object p2, p0, Lo2/D;->g:[Ljava/lang/String;

    array-length p2, p2

    invoke-direct {p1, p2}, Lo2/i;-><init>(I)V

    iput-object p1, p0, Lo2/D;->h:Lo2/i;

    new-instance p1, Lo2/j;

    iget-object p2, p0, Lo2/D;->g:[Ljava/lang/String;

    array-length p2, p2

    invoke-direct {p1, p2}, Lo2/j;-><init>(I)V

    iput-object p1, p0, Lo2/D;->i:Lo2/j;

    return-void
.end method

.method public static final synthetic a(Lo2/D;Lo2/k;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo2/D;->h(Lo2/k;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lo2/D;)Lo2/n;
    .locals 0

    iget-object p0, p0, Lo2/D;->a:Lo2/n;

    return-object p0
.end method

.method public static final synthetic c(Lo2/D;)Lo2/i;
    .locals 0

    iget-object p0, p0, Lo2/D;->h:Lo2/i;

    return-object p0
.end method

.method public static final synthetic d(Lo2/D;)Lo2/j;
    .locals 0

    iget-object p0, p0, Lo2/D;->i:Lo2/j;

    return-object p0
.end method

.method public static final synthetic e(Lo2/D;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lo2/D;->k(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lo2/D;Lo2/k;ILm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo2/D;->s(Lo2/k;ILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lo2/D;Lo2/k;ILm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo2/D;->t(Lo2/k;ILm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lo2/k;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, Lo2/D$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo2/D$b;

    iget v1, v0, Lo2/D$b;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$b;

    invoke-direct {v0, p0, p2}, Lo2/D$b;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lo2/D$b;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$b;->I:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lo2/D$b;->F:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lo2/D$b;->F:Ljava/lang/Object;

    check-cast p1, Lo2/k;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p2, Lo2/D$c;->D:Lo2/D$c;

    iput-object p1, v0, Lo2/D$b;->F:Ljava/lang/Object;

    iput v4, v0, Lo2/D$b;->I:I

    const-string v2, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    invoke-interface {p1, v2, p2, v0}, Lo2/k;->b(Ljava/lang/String;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Ljava/util/Set;

    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v4

    if-eqz v2, :cond_6

    iput-object p2, v0, Lo2/D$b;->F:Ljava/lang/Object;

    iput v3, v0, Lo2/D$b;->I:I

    const-string v2, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    invoke-static {p1, v2, v0}, Lo2/C;->a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object p1, p2

    :goto_2
    move-object p2, p1

    :cond_6
    return-object p2
.end method

.method private final k(Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, Lo2/D$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo2/D$e;

    iget v1, v0, Lo2/D$e;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$e;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$e;

    invoke-direct {v0, p0, p1}, Lo2/D$e;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lo2/D$e;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$e;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lo2/D$e;->G:Ljava/lang/Object;

    check-cast v1, Lp2/a;

    iget-object v0, v0, Lo2/D$e;->F:Ljava/lang/Object;

    check-cast v0, Lo2/D;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo2/D;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->p()Lp2/a;

    move-result-object p1

    invoke-virtual {p1}, Lp2/a;->a()Z

    move-result v2

    if-eqz v2, :cond_7

    :try_start_1
    iget-object v2, p0, Lo2/D;->j:LV8/a;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, LV8/a;->a(ZZ)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {p1}, Lp2/a;->c()V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    goto :goto_2

    :cond_3
    :try_start_2
    iget-object v2, p0, Lo2/D;->k:Lx7/a;

    invoke-interface {v2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p1}, Lp2/a;->c()V

    return-object v0

    :cond_4
    :try_start_3
    iget-object v2, p0, Lo2/D;->a:Lo2/n;

    new-instance v5, Lo2/D$f;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lo2/D$f;-><init>(Lo2/D;Lm7/e;)V

    iput-object p0, v0, Lo2/D$e;->F:Ljava/lang/Object;

    iput-object p1, v0, Lo2/D$e;->G:Ljava/lang/Object;

    iput v3, v0, Lo2/D$e;->J:I

    invoke-virtual {v2, v4, v5, v0}, Lo2/n;->O(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p1

    move-object p1, v0

    move-object v0, p0

    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v3

    if-eqz v2, :cond_6

    iget-object v2, v0, Lo2/D;->i:Lo2/j;

    invoke-virtual {v2, p1}, Lo2/j;->b(Ljava/util/Set;)V

    iget-object v0, v0, Lo2/D;->e:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    invoke-virtual {v1}, Lp2/a;->c()V

    return-object p1

    :goto_2
    invoke-virtual {v1}, Lp2/a;->c()V

    throw p1

    :cond_7
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final q([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    .prologue
    invoke-static {}, Lj7/Z;->b()Ljava/util/Set;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    iget-object v5, p0, Lo2/D;->c:Ljava/util/Map;

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Set;

    if-eqz v5, :cond_0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v0, v5}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_0
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lj7/Z;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array v0, v2, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    return-object p1
.end method

.method private final s(Lo2/k;ILm7/e;)Ljava/lang/Object;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lo2/D$j;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lo2/D$j;

    iget v5, v4, Lo2/D$j;->O:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lo2/D$j;->O:I

    goto :goto_0

    :cond_0
    new-instance v4, Lo2/D$j;

    invoke-direct {v4, v0, v3}, Lo2/D$j;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object v3, v4, Lo2/D$j;->M:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, Lo2/D$j;->O:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget v1, v4, Lo2/D$j;->L:I

    iget v2, v4, Lo2/D$j;->K:I

    iget v6, v4, Lo2/D$j;->J:I

    iget-object v9, v4, Lo2/D$j;->I:Ljava/lang/Object;

    check-cast v9, [Ljava/lang/String;

    iget-object v10, v4, Lo2/D$j;->H:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v4, Lo2/D$j;->G:Ljava/lang/Object;

    check-cast v11, Lo2/k;

    iget-object v12, v4, Lo2/D$j;->F:Ljava/lang/Object;

    check-cast v12, Lo2/D;

    invoke-static {v3}, Li7/x;->b(Ljava/lang/Object;)V

    move v3, v8

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v4, Lo2/D$j;->J:I

    iget-object v2, v4, Lo2/D$j;->G:Ljava/lang/Object;

    check-cast v2, Lo2/k;

    iget-object v6, v4, Lo2/D$j;->F:Ljava/lang/Object;

    check-cast v6, Lo2/D;

    invoke-static {v3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v1

    move-object/from16 v1, v16

    goto :goto_1

    :cond_3
    invoke-static {v3}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", 0)"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v0, v4, Lo2/D$j;->F:Ljava/lang/Object;

    iput-object v1, v4, Lo2/D$j;->G:Ljava/lang/Object;

    iput v2, v4, Lo2/D$j;->J:I

    iput v8, v4, Lo2/D$j;->O:I

    invoke-static {v1, v3, v4}, Lo2/C;->a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_4

    return-object v5

    :cond_4
    move-object v6, v0

    :goto_1
    iget-object v3, v6, Lo2/D;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    sget-object v9, Lo2/D;->m:[Ljava/lang/String;

    array-length v10, v9

    const/4 v11, 0x0

    move-object v12, v6

    move v6, v2

    move v2, v11

    move-object v11, v1

    move v1, v10

    move-object v10, v3

    :goto_2
    if-ge v2, v1, :cond_7

    aget-object v3, v9, v2

    iget-boolean v13, v12, Lo2/D;->d:Z

    if-eqz v13, :cond_5

    const-string v13, "TEMP"

    goto :goto_3

    :cond_5
    const-string v13, ""

    :goto_3
    sget-object v14, Lo2/D;->l:Lo2/D$a;

    invoke-static {v14, v10, v3}, Lo2/D$a;->a(Lo2/D$a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "CREATE "

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " TRIGGER IF NOT EXISTS `"

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "` AFTER "

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ON `"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " AND invalidated = 0; END"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v12, v4, Lo2/D$j;->F:Ljava/lang/Object;

    iput-object v11, v4, Lo2/D$j;->G:Ljava/lang/Object;

    iput-object v10, v4, Lo2/D$j;->H:Ljava/lang/Object;

    iput-object v9, v4, Lo2/D$j;->I:Ljava/lang/Object;

    iput v6, v4, Lo2/D$j;->J:I

    iput v2, v4, Lo2/D$j;->K:I

    iput v1, v4, Lo2/D$j;->L:I

    iput v7, v4, Lo2/D$j;->O:I

    invoke-static {v11, v3, v4}, Lo2/C;->a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_6

    return-object v5

    :cond_6
    const/4 v3, 0x1

    :goto_4
    add-int/2addr v2, v3

    move v8, v3

    goto :goto_2

    :cond_7
    sget-object v1, Li7/M;->a:Li7/M;

    return-object v1
.end method

.method private final t(Lo2/k;ILm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p3, Lo2/D$k;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lo2/D$k;

    iget v1, v0, Lo2/D$k;->M:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$k;->M:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$k;

    invoke-direct {v0, p0, p3}, Lo2/D$k;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lo2/D$k;->K:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$k;->M:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lo2/D$k;->J:I

    iget p2, v0, Lo2/D$k;->I:I

    iget-object v2, v0, Lo2/D$k;->H:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    iget-object v4, v0, Lo2/D$k;->G:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lo2/D$k;->F:Ljava/lang/Object;

    check-cast v5, Lo2/k;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p3, v4

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p3, p0, Lo2/D;->g:[Ljava/lang/String;

    aget-object p2, p3, p2

    sget-object p3, Lo2/D;->m:[Ljava/lang/String;

    array-length v2, p3

    const/4 v4, 0x0

    move-object v8, p2

    move-object p2, p1

    move p1, v2

    move-object v2, p3

    move-object p3, v8

    :goto_1
    if-ge v4, p1, :cond_4

    aget-object v5, v2, v4

    sget-object v6, Lo2/D;->l:Lo2/D$a;

    invoke-static {v6, p3, v5}, Lo2/D$a;->a(Lo2/D$a;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DROP TRIGGER IF EXISTS `"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x60

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object p2, v0, Lo2/D$k;->F:Ljava/lang/Object;

    iput-object p3, v0, Lo2/D$k;->G:Ljava/lang/Object;

    iput-object v2, v0, Lo2/D$k;->H:Ljava/lang/Object;

    iput v4, v0, Lo2/D$k;->I:I

    iput p1, v0, Lo2/D$k;->J:I

    iput v3, v0, Lo2/D$k;->M:I

    invoke-static {p2, v5, v0}, Lo2/C;->a(Lo2/k;Ljava/lang/String;Lm7/e;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, p2

    move p2, v4

    :goto_2
    add-int/lit8 v4, p2, 0x1

    move-object p2, v5

    goto :goto_1

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method


# virtual methods
.method public final i(Ly2/b;)V
    .locals 7

    .prologue
    const-string v0, "connection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PRAGMA query_only"

    invoke-interface {p1, v0}, Ly2/b;->e(Ljava/lang/String;)Ly2/e;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ly2/e;->p()Z

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ly2/e;->m(I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ly2/e;->close()V

    if-nez v1, :cond_1

    const-string v0, "PRAGMA temp_store = MEMORY"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    const-string v0, "PRAGMA recursive_triggers = 1"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS room_table_modification_log"

    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    iget-boolean v0, p0, Lo2/D;->d:Z

    if-eqz v0, :cond_0

    const-string v0, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    :goto_0
    invoke-static {p1, v0}, Ly2/a;->a(Ly2/b;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    const-string v2, "TEMP"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->R(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lo2/D;->h:Lo2/i;

    invoke-virtual {p1}, Lo2/i;->a()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ly2/e;->close()V

    throw p1
.end method

.method public final j([Ljava/lang/String;[IZ)LZ8/f;
    .locals 7

    const-string v0, "resolvedTableNames"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableIds"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo2/D$d;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p2

    move v4, p3

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lo2/D$d;-><init>(Lo2/D;[IZ[Ljava/lang/String;Lm7/e;)V

    invoke-static {v0}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p1

    return-object p1
.end method

.method public final l([I)Z
    .locals 1

    const-string v0, "tableIds"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/D;->h:Lo2/i;

    invoke-virtual {v0, p1}, Lo2/i;->c([I)Z

    move-result p1

    return p1
.end method

.method public final m([I)Z
    .locals 1

    const-string v0, "tableIds"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/D;->h:Lo2/i;

    invoke-virtual {v0, p1}, Lo2/i;->d([I)Z

    move-result p1

    return p1
.end method

.method public final n([Ljava/lang/String;Lx7/a;Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, Lo2/D$h;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lo2/D$h;

    iget v1, v0, Lo2/D$h;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$h;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$h;

    invoke-direct {v0, p0, p4}, Lo2/D$h;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lo2/D$h;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$h;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lo2/D$h;->G:Ljava/lang/Object;

    check-cast p1, [I

    iget-object p2, v0, Lo2/D$h;->F:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Lx7/a;

    :try_start_0
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lo2/D;->v([Ljava/lang/String;)Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    :try_start_1
    iput-object p3, v0, Lo2/D$h;->F:Ljava/lang/Object;

    iput-object p1, v0, Lo2/D$h;->G:Ljava/lang/Object;

    iput v3, v0, Lo2/D$h;->J:I

    invoke-direct {p0, v0}, Lo2/D;->k(Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ljava/util/Set;

    array-length p2, p1

    const/4 v0, 0x0

    if-nez p2, :cond_4

    move p2, v3

    goto :goto_2

    :cond_4
    move p2, v0

    :goto_2
    xor-int/2addr p2, v3

    if-eqz p2, :cond_7

    array-length p2, p1

    move v1, v0

    :goto_3
    if-ge v1, p2, :cond_6

    aget v2, p1, v1

    invoke-static {v2}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_6
    move v3, v0

    goto :goto_4

    :cond_7
    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    :goto_4
    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    return-object p1

    :goto_5
    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    throw p1
.end method

.method public final o(Lx7/a;Lx7/a;)V
    .locals 6

    .prologue
    const-string v0, "onRefreshScheduled"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRefreshCompleted"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/D;->j:LV8/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LV8/a;->a(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    iget-object p1, p0, Lo2/D;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->q()LW8/N;

    move-result-object v0

    new-instance v1, LW8/M;

    const-string p1, "Room Invalidation Tracker Refresh"

    invoke-direct {v1, p1}, LW8/M;-><init>(Ljava/lang/String;)V

    new-instance v3, Lo2/D$i;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p2, p1}, Lo2/D$i;-><init>(Lo2/D;Lx7/a;Lm7/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lo2/D;->h:Lo2/i;

    invoke-virtual {v0}, Lo2/i;->e()V

    return-void
.end method

.method public final r(Lx7/a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo2/D;->k:Lx7/a;

    return-void
.end method

.method public final u(Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p1, Lo2/D$l;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo2/D$l;

    iget v1, v0, Lo2/D$l;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo2/D$l;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo2/D$l;

    invoke-direct {v0, p0, p1}, Lo2/D$l;-><init>(Lo2/D;Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lo2/D$l;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo2/D$l;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lo2/D$l;->F:Ljava/lang/Object;

    check-cast v0, Lp2/a;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo2/D;->a:Lo2/n;

    invoke-virtual {p1}, Lo2/n;->p()Lp2/a;

    move-result-object p1

    invoke-virtual {p1}, Lp2/a;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    :try_start_1
    iget-object v2, p0, Lo2/D;->a:Lo2/n;

    new-instance v4, Lo2/D$m;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lo2/D$m;-><init>(Lo2/D;Lm7/e;)V

    iput-object p1, v0, Lo2/D$l;->F:Ljava/lang/Object;

    iput v3, v0, Lo2/D$l;->I:I

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v4, v0}, Lo2/n;->O(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-virtual {v0}, Lp2/a;->c()V

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    :goto_2
    invoke-virtual {v0}, Lp2/a;->c()V

    throw p1

    :cond_4
    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final v([Ljava/lang/String;)Li7/u;
    .locals 7

    .prologue
    const-string v0, "names"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo2/D;->q([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    iget-object v4, p0, Lo2/D;->f:Ljava/util/Map;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "There is no table with name "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p1

    return-object p1
.end method
