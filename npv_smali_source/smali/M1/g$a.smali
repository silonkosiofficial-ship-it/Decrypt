.class public final LM1/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LM1/g$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LM1/g$a;Ljava/util/List;LM1/m;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LM1/g$a;->c(Ljava/util/List;LM1/m;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/util/List;LM1/m;Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p3, LM1/g$a$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LM1/g$a$b;

    iget v1, v0, LM1/g$a$b;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/g$a$b;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/g$a$b;

    invoke-direct {v0, p0, p3}, LM1/g$a$b;-><init>(LM1/g$a;Lm7/e;)V

    :goto_0
    iget-object p3, v0, LM1/g$a$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/g$a$b;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LM1/g$a$b;->G:Ljava/lang/Object;

    check-cast p1, Ljava/util/Iterator;

    iget-object p2, v0, LM1/g$a$b;->F:Ljava/lang/Object;

    check-cast p2, Ly7/O;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p3

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LM1/g$a$b;->F:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, LM1/g$a$c;

    const/4 v5, 0x0

    invoke-direct {v2, p1, p3, v5}, LM1/g$a$c;-><init>(Ljava/util/List;Ljava/util/List;Lm7/e;)V

    iput-object p3, v0, LM1/g$a$b;->F:Ljava/lang/Object;

    iput v4, v0, LM1/g$a$b;->J:I

    invoke-interface {p2, v2, v0}, LM1/m;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p3

    :goto_1
    new-instance p2, Ly7/O;

    invoke-direct {p2}, Ly7/O;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx7/l;

    :try_start_1
    iput-object p2, v0, LM1/g$a$b;->F:Ljava/lang/Object;

    iput-object p1, v0, LM1/g$a$b;->G:Ljava/lang/Object;

    iput v3, v0, LM1/g$a$b;->J:I

    invoke-interface {p3, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p3, v1, :cond_5

    return-object v1

    :goto_3
    iget-object v2, p2, Ly7/O;->C:Ljava/lang/Object;

    if-nez v2, :cond_6

    iput-object p3, p2, Ly7/O;->C:Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Throwable;

    invoke-static {v2, p3}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_7
    iget-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    if-nez p1, :cond_8

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_8
    throw p1
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lx7/p;
    .locals 2

    const-string v0, "migrations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LM1/g$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LM1/g$a$a;-><init>(Ljava/util/List;Lm7/e;)V

    return-object v0
.end method
