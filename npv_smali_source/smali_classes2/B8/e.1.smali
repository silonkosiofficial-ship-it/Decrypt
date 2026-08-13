.class public final LB8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/e$a;
    }
.end annotation


# instance fields
.field private final a:LO7/G;

.field private final b:LO7/J;


# direct methods
.method public constructor <init>(LO7/G;LO7/J;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/e;->a:LO7/G;

    iput-object p2, p0, LB8/e;->b:LO7/J;

    return-void
.end method

.method private final b(Lt8/g;LF8/E;Li8/b$b$c;)Z
    .locals 6

    .prologue
    invoke-virtual {p3}, Li8/b$b$c;->S()Li8/b$b$c$c;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, LB8/e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/16 v1, 0xa

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_6

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    iget-object p3, p0, LB8/e;->a:LO7/G;

    invoke-virtual {p1, p3}, Lt8/g;->a(LO7/G;)LF8/E;

    move-result-object p1

    invoke-static {p1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto/16 :goto_3

    :cond_1
    instance-of v0, p1, Lt8/b;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lt8/b;

    invoke-virtual {v0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p3}, Li8/b$b$c;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_5

    invoke-direct {p0}, LB8/e;->c()LL7/g;

    move-result-object v0

    invoke-virtual {v0, p2}, LL7/g;->k(LF8/E;)LF8/E;

    move-result-object p2

    const-string v0, "getArrayElementType(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lt8/b;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lj7/v;->n(Ljava/util/Collection;)LE7/i;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    :goto_1
    move v2, v3

    goto :goto_3

    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lj7/O;

    invoke-virtual {v1}, Lj7/O;->b()I

    move-result v1

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt8/g;

    invoke-virtual {p3, v1}, Li8/b$b$c;->H(I)Li8/b$b$c;

    move-result-object v1

    const-string v5, "getArrayElement(...)"

    invoke-static {v1, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v4, p2, v1}, LB8/e;->b(Lt8/g;LF8/E;Li8/b$b$c;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of p2, p1, LO7/e;

    if-eqz p2, :cond_7

    check-cast p1, LO7/e;

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_2

    invoke-static {p1}, LL7/g;->l0(LO7/e;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    :cond_8
    :goto_3
    return v2
.end method

.method private final c()LL7/g;
    .locals 1

    iget-object v0, p0, LB8/e;->a:LO7/G;

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    return-object v0
.end method

.method private final d(Li8/b$b;Ljava/util/Map;Lk8/c;)Li7/u;
    .locals 3

    .prologue
    invoke-virtual {p1}, Li8/b$b;->w()I

    move-result v0

    invoke-static {p3, v0}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO7/j0;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Li7/u;

    invoke-virtual {p1}, Li8/b$b;->w()I

    move-result v1

    invoke-static {p3, v1}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v1

    invoke-interface {p2}, LO7/i0;->getType()LF8/E;

    move-result-object p2

    const-string v2, "getType(...)"

    invoke-static {p2, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/b$b;->x()Li8/b$b$c;

    move-result-object p1

    const-string v2, "getValue(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1, p3}, LB8/e;->g(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final e(Ln8/b;)LO7/e;
    .locals 2

    iget-object v0, p0, LB8/e;->a:LO7/G;

    iget-object v1, p0, LB8/e;->b:LO7/J;

    invoke-static {v0, p1, v1}, LO7/x;->c(LO7/G;Ln8/b;LO7/J;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method private final g(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;
    .locals 2

    .prologue
    invoke-virtual {p0, p1, p2, p3}, LB8/e;->f(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;

    move-result-object p3

    invoke-direct {p0, p3, p1, p2}, LB8/e;->b(Lt8/g;LF8/E;Li8/b$b$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-nez p3, :cond_1

    sget-object p3, Lt8/k;->b:Lt8/k$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected argument value: actual type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Li8/b$b$c;->S()Li8/b$b$c$c;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " != expected type "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lt8/k$a;->a(Ljava/lang/String;)Lt8/k;

    move-result-object p3

    :cond_1
    return-object p3
.end method


# virtual methods
.method public final a(Li8/b;Lk8/c;)LP7/c;
    .locals 5

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/b;->A()I

    move-result v0

    invoke-static {p2, v0}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object v0

    invoke-direct {p0, v0}, LB8/e;->e(Ln8/b;)LO7/e;

    move-result-object v0

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Li8/b;->x()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, LH8/k;->m(LO7/m;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v0}, Lr8/f;->t(LO7/m;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, LO7/e;->r()Ljava/util/Collection;

    move-result-object v2

    const-string v3, "getConstructors(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lj7/v;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7/d;

    if-eqz v2, :cond_3

    invoke-interface {v2}, LO7/a;->n()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lj7/S;->d(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, LE7/j;->d(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LO7/j0;

    invoke-interface {v4}, LO7/I;->getName()Ln8/f;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li8/b;->y()Ljava/util/List;

    move-result-object p1

    const-string v1, "getArgumentList(...)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/b$b;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, v2, v3, p2}, LB8/e;->d(Li8/b$b;Ljava/util/Map;Lk8/c;)Li7/u;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lj7/S;->q(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    :cond_3
    new-instance p1, LP7/d;

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object p2

    sget-object v0, LO7/a0;->a:LO7/a0;

    invoke-direct {p1, p2, v1, v0}, LP7/d;-><init>(LF8/E;Ljava/util/Map;LO7/a0;)V

    return-object p1
.end method

.method public final f(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;
    .locals 5

    .prologue
    const-string v0, "expectedType"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk8/b;->P:Lk8/b$b;

    invoke-virtual {p2}, Li8/b$b$c;->O()I

    move-result v1

    invoke-virtual {v0, v1}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2}, Li8/b$b$c;->S()Li8/b$b$c$c;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, LB8/e$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Li8/b$b$c;->S()Li8/b$b$c$c;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (expected "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :pswitch_0
    sget-object v0, Lt8/h;->a:Lt8/h;

    invoke-virtual {p2}, Li8/b$b$c;->J()Ljava/util/List;

    move-result-object p2

    const-string v1, "getArrayElementList(...)"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/b$b$c;

    invoke-direct {p0}, LB8/e;->c()LL7/g;

    move-result-object v3

    invoke-virtual {v3}, LL7/g;->i()LF8/M;

    move-result-object v3

    const-string v4, "getAnyType(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v3, v2, p3}, LB8/e;->f(LF8/E;Li8/b$b$c;Lk8/c;)Lt8/g;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p1}, Lt8/h;->a(Ljava/util/List;LF8/E;)Lt8/b;

    move-result-object p1

    goto/16 :goto_5

    :pswitch_1
    new-instance p1, Lt8/a;

    invoke-virtual {p2}, Li8/b$b$c;->F()Li8/b;

    move-result-object p2

    const-string v0, "getAnnotation(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object p2

    invoke-direct {p1, p2}, Lt8/a;-><init>(LP7/c;)V

    goto/16 :goto_5

    :pswitch_2
    new-instance p1, Lt8/j;

    invoke-virtual {p2}, Li8/b$b$c;->K()I

    move-result v0

    invoke-static {p3, v0}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object v0

    invoke-virtual {p2}, Li8/b$b$c;->N()I

    move-result p2

    invoke-static {p3, p2}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lt8/j;-><init>(Ln8/b;Ln8/f;)V

    goto/16 :goto_5

    :pswitch_3
    new-instance p1, Lt8/p;

    invoke-virtual {p2}, Li8/b$b$c;->K()I

    move-result v0

    invoke-static {p3, v0}, LB8/y;->a(Lk8/c;I)Ln8/b;

    move-result-object p3

    invoke-virtual {p2}, Li8/b$b$c;->G()I

    move-result p2

    invoke-direct {p1, p3, p2}, Lt8/p;-><init>(Ln8/b;I)V

    goto/16 :goto_5

    :pswitch_4
    new-instance p1, Lt8/u;

    invoke-virtual {p2}, Li8/b$b$c;->R()I

    move-result p2

    invoke-interface {p3, p2}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lt8/u;-><init>(Ljava/lang/String;)V

    goto/16 :goto_5

    :pswitch_5
    new-instance p1, Lt8/c;

    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    invoke-direct {p1, p2}, Lt8/c;-><init>(Z)V

    goto/16 :goto_5

    :pswitch_6
    new-instance p1, Lt8/i;

    invoke-virtual {p2}, Li8/b$b$c;->M()D

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Lt8/i;-><init>(D)V

    goto/16 :goto_5

    :pswitch_7
    new-instance p1, Lt8/l;

    invoke-virtual {p2}, Li8/b$b$c;->P()F

    move-result p2

    invoke-direct {p1, p2}, Lt8/l;-><init>(F)V

    goto :goto_5

    :pswitch_8
    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p1

    if-eqz v0, :cond_3

    new-instance p3, Lt8/y;

    invoke-direct {p3, p1, p2}, Lt8/y;-><init>(J)V

    :goto_3
    move-object p1, p3

    goto :goto_5

    :cond_3
    new-instance p3, Lt8/q;

    invoke-direct {p3, p1, p2}, Lt8/q;-><init>(J)V

    goto :goto_3

    :pswitch_9
    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p1

    long-to-int p1, p1

    if-eqz v0, :cond_4

    new-instance p2, Lt8/x;

    invoke-direct {p2, p1}, Lt8/x;-><init>(I)V

    :goto_4
    move-object p1, p2

    goto :goto_5

    :cond_4
    new-instance p2, Lt8/m;

    invoke-direct {p2, p1}, Lt8/m;-><init>(I)V

    goto :goto_4

    :pswitch_a
    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p1

    long-to-int p1, p1

    int-to-short p1, p1

    if-eqz v0, :cond_5

    new-instance p2, Lt8/z;

    invoke-direct {p2, p1}, Lt8/z;-><init>(S)V

    goto :goto_4

    :cond_5
    new-instance p2, Lt8/t;

    invoke-direct {p2, p1}, Lt8/t;-><init>(S)V

    goto :goto_4

    :pswitch_b
    new-instance p1, Lt8/e;

    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p2

    long-to-int p2, p2

    int-to-char p2, p2

    invoke-direct {p1, p2}, Lt8/e;-><init>(C)V

    goto :goto_5

    :pswitch_c
    invoke-virtual {p2}, Li8/b$b$c;->Q()J

    move-result-wide p1

    long-to-int p1, p1

    int-to-byte p1, p1

    if-eqz v0, :cond_6

    new-instance p2, Lt8/w;

    invoke-direct {p2, p1}, Lt8/w;-><init>(B)V

    goto :goto_4

    :cond_6
    new-instance p2, Lt8/d;

    invoke-direct {p2, p1}, Lt8/d;-><init>(B)V

    goto :goto_4

    :goto_5
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
