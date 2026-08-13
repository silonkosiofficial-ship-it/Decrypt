.class public abstract Lj1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/g$a;,
        Lj1/g$b;,
        Lj1/g$c;,
        Lj1/g$d;,
        Lj1/g$e;,
        Lj1/g$f;,
        Lj1/g$g;
    }
.end annotation


# static fields
.field public static final k:Lj1/g$b;

.field public static final l:I


# instance fields
.field private a:Lj1/c;

.field private b:Z

.field private c:Ljava/util/HashMap;

.field private d:Ljava/util/HashMap;

.field private e:Ljava/util/HashMap;

.field private final f:Lj1/a;

.field private g:I

.field private h:Ljava/util/ArrayList;

.field private i:Ljava/util/ArrayList;

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/g$b;-><init>(Ly7/k;)V

    sput-object v0, Lj1/g;->k:Lj1/g$b;

    const/16 v0, 0x8

    sput v0, Lj1/g;->l:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/g;->b:Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lj1/g;->c:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lj1/g;->d:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lj1/g;->e:Ljava/util/HashMap;

    new-instance v1, Lj1/a;

    invoke-direct {v1, p0}, Lj1/a;-><init>(Lj1/g;)V

    iput-object v1, p0, Lj1/g;->f:Lj1/a;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lj1/g;->h:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lj1/g;->i:Ljava/util/ArrayList;

    iput-boolean v0, p0, Lj1/g;->j:Z

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj1/a;->A0(Ljava/lang/Object;)V

    iget-object v2, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final g()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lj1/g;->g:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lj1/g;->g:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "__HELPER_KEY_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "__"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A(Lj1/d;)Lj1/g;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/g;->f:Lj1/a;

    invoke-virtual {v0, p1}, Lj1/a;->G0(Lj1/d;)Lj1/a;

    return-object p0
.end method

.method public final B()Lk1/j;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lj1/g$e;->D:Lj1/g$e;

    invoke-virtual {p0, v0, v1}, Lj1/g;->o(Ljava/lang/Object;Lj1/g$e;)Lj1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.VerticalChainReference"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lk1/j;

    return-object v0
.end method

.method public final C(Ljava/lang/Object;)Lk1/h;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lj1/g;->m(Ljava/lang/Object;I)Lk1/h;

    move-result-object p1

    return-object p1
.end method

.method public final D(Lj1/d;)Lj1/g;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->A(Lj1/d;)Lj1/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lm1/f;)V
    .locals 7

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lm1/m;->g2()V

    iget-object v0, p0, Lj1/g;->f:Lj1/a;

    invoke-virtual {v0}, Lj1/a;->d0()Lj1/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    iget-object v0, p0, Lj1/g;->f:Lj1/a;

    invoke-virtual {v0}, Lj1/a;->B()Lj1/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, p1, v1}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    iget-object v0, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/e;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lj1/e;->V0()Lm1/j;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_0

    iget-object v3, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/f;

    if-nez v3, :cond_2

    invoke-virtual {p0, v1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v3

    :cond_2
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v2}, Lj1/f;->b(Lm1/e;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/f;

    iget-object v4, p0, Lj1/g;->f:Lj1/a;

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3}, Lj1/f;->c()Lk1/e;

    move-result-object v4

    instance-of v4, v4, Lj1/e;

    if-eqz v4, :cond_4

    invoke-interface {v3}, Lj1/f;->c()Lk1/e;

    move-result-object v3

    check-cast v3, Lj1/e;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lj1/e;->V0()Lm1/j;

    move-result-object v3

    goto :goto_2

    :cond_5
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_4

    iget-object v4, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj1/f;

    if-nez v4, :cond_6

    invoke-virtual {p0, v1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v4

    :cond_6
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v4, v3}, Lj1/f;->b(Lm1/e;)V

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj1/f;

    iget-object v3, p0, Lj1/g;->f:Lj1/a;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Lj1/f;->a()Lm1/e;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Lj1/f;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lm1/e;->c1(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lm1/e;->I1(Lm1/e;)V

    invoke-interface {v1}, Lj1/f;->c()Lk1/e;

    move-result-object v4

    instance-of v4, v4, Lk1/h;

    if-eqz v4, :cond_8

    invoke-interface {v1}, Lj1/f;->apply()V

    :cond_8
    invoke-virtual {p1, v3}, Lm1/m;->a2(Lm1/e;)V

    goto :goto_3

    :cond_9
    invoke-interface {v1, p1}, Lj1/f;->b(Lm1/e;)V

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/e;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lj1/e;->V0()Lm1/j;

    move-result-object v1

    goto :goto_5

    :cond_c
    move-object v1, v2

    :goto_5
    if-eqz v1, :cond_e

    invoke-virtual {v0}, Lj1/e;->X0()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/f;

    invoke-virtual {v0}, Lj1/e;->V0()Lm1/j;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3}, Lj1/f;->a()Lm1/e;

    move-result-object v3

    invoke-virtual {v4, v3}, Lm1/j;->a2(Lm1/e;)V

    goto :goto_6

    :cond_d
    :goto_7
    invoke-virtual {v0}, Lj1/e;->apply()V

    goto :goto_4

    :cond_e
    if-eqz v0, :cond_b

    goto :goto_7

    :cond_f
    iget-object p1, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_10
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/f;

    iget-object v1, p0, Lj1/g;->f:Lj1/a;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lj1/f;->c()Lk1/e;

    move-result-object v1

    instance-of v1, v1, Lj1/e;

    if-eqz v1, :cond_10

    invoke-interface {v0}, Lj1/f;->c()Lk1/e;

    move-result-object v1

    check-cast v1, Lj1/e;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lj1/e;->V0()Lm1/j;

    move-result-object v3

    goto :goto_9

    :cond_11
    move-object v3, v2

    :goto_9
    if-eqz v3, :cond_10

    invoke-virtual {v1}, Lj1/e;->X0()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj1/f;

    if-eqz v5, :cond_12

    invoke-interface {v5}, Lj1/f;->a()Lm1/e;

    move-result-object v4

    :goto_b
    invoke-virtual {v3, v4}, Lm1/j;->a2(Lm1/e;)V

    goto :goto_a

    :cond_12
    instance-of v5, v4, Lj1/f;

    if-eqz v5, :cond_13

    check-cast v4, Lj1/f;

    invoke-interface {v4}, Lj1/f;->a()Lm1/e;

    move-result-object v4

    goto :goto_b

    :cond_13
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "couldn\'t find reference for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_a

    :cond_14
    invoke-interface {v0}, Lj1/f;->apply()V

    goto :goto_8

    :cond_15
    iget-object p1, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_16
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj1/f;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1}, Lj1/f;->apply()V

    invoke-interface {v1}, Lj1/f;->a()Lm1/e;

    move-result-object v1

    if-eqz v1, :cond_16

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm1/e;->J1(Ljava/lang/String;)V

    goto :goto_c

    :cond_17
    return-void
.end method

.method public final b(Ljava/lang/Object;Lj1/g$d;)Lk1/c;
    .locals 2

    .prologue
    const-string v0, "direction"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    instance-of v1, v1, Lk1/c;

    if-nez v1, :cond_2

    :cond_1
    new-instance v1, Lk1/c;

    invoke-direct {v1, p0}, Lk1/c;-><init>(Lj1/g;)V

    invoke-virtual {v1, p2}, Lk1/c;->Z0(Lj1/g$d;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Lj1/a;->w0(Lk1/e;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v0

    :cond_3
    check-cast v0, Lk1/c;

    return-object v0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/g;->j:Z

    return-void
.end method

.method public final d(Ljava/lang/Object;)Lj1/a;
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/f;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lj1/g;->f(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    iget-object v1, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lj1/a;->A0(Ljava/lang/Object;)V

    :cond_0
    instance-of p1, v0, Lj1/a;

    if-eqz p1, :cond_1

    check-cast v0, Lj1/a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(Ljava/lang/Object;)Lj1/a;
    .locals 0

    new-instance p1, Lj1/a;

    invoke-direct {p1, p0}, Lj1/a;-><init>(Lj1/g;)V

    return-object p1
.end method

.method public final h()Lj1/c;
    .locals 1

    iget-object v0, p0, Lj1/g;->a:Lj1/c;

    return-object v0
.end method

.method public final i(Ljava/lang/Object;Z)Lk1/f;
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    instance-of v1, v1, Lk1/f;

    if-nez v1, :cond_3

    :cond_1
    if-eqz p2, :cond_2

    new-instance p2, Lk1/f;

    sget-object v1, Lj1/g$e;->J:Lj1/g$e;

    invoke-direct {p2, p0, v1}, Lk1/f;-><init>(Lj1/g;Lj1/g$e;)V

    goto :goto_1

    :cond_2
    new-instance p2, Lk1/f;

    sget-object v1, Lj1/g$e;->I:Lj1/g$e;

    invoke-direct {p2, p0, v1}, Lk1/f;-><init>(Lj1/g;Lj1/g$e;)V

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1, p2}, Lj1/a;->w0(Lk1/e;)V

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v0

    :cond_4
    check-cast v0, Lk1/f;

    return-object v0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/String;)Lk1/g;
    .locals 5

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gridType"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    instance-of v1, v1, Lk1/g;

    if-nez v1, :cond_4

    :cond_1
    sget-object v1, Lj1/g$e;->K:Lj1/g$e;

    const/4 v2, 0x0

    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x72

    if-ne v3, v4, :cond_2

    sget-object v1, Lj1/g$e;->L:Lj1/g$e;

    goto :goto_1

    :cond_2
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v2, 0x63

    if-ne p2, v2, :cond_3

    sget-object v1, Lj1/g$e;->M:Lj1/g$e;

    :cond_3
    :goto_1
    new-instance p2, Lk1/g;

    invoke-direct {p2, p0, v1}, Lk1/g;-><init>(Lj1/g;Lj1/g$e;)V

    if-eqz p1, :cond_4

    invoke-virtual {p1, p2}, Lj1/a;->w0(Lk1/e;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lj1/a;->c()Lk1/e;

    move-result-object v0

    :cond_5
    check-cast v0, Lk1/g;

    return-object v0
.end method

.method public final k(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final l()Lj1/a;
    .locals 1

    iget-object v0, p0, Lj1/g;->f:Lj1/a;

    return-object v0
.end method

.method public final m(Ljava/lang/Object;I)Lk1/h;
    .locals 3

    .prologue
    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj1/a;->c()Lk1/e;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lj1/a;->c()Lk1/e;

    move-result-object v2

    instance-of v2, v2, Lk1/h;

    if-nez v2, :cond_2

    :cond_1
    new-instance v2, Lk1/h;

    invoke-direct {v2, p0}, Lk1/h;-><init>(Lj1/g;)V

    invoke-virtual {v2, p2}, Lk1/h;->g(I)V

    invoke-virtual {v2, p1}, Lk1/h;->f(Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Lj1/a;->w0(Lk1/e;)V

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lj1/a;->c()Lk1/e;

    move-result-object v1

    :cond_3
    check-cast v1, Lk1/h;

    return-object v1
.end method

.method public final n(Lj1/d;)Lj1/g;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->x(Lj1/d;)Lj1/g;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljava/lang/Object;Lj1/g$e;)Lj1/e;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    invoke-direct {p0}, Lj1/g;->g()Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj1/e;

    if-nez v0, :cond_2

    if-nez p2, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lj1/g$f;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    :goto_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Lj1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, p0, p2}, Lj1/e;-><init>(Lj1/g;Lj1/g$e;)V

    goto :goto_2

    :pswitch_0
    new-instance v0, Lk1/g;

    invoke-direct {v0, p0, p2}, Lk1/g;-><init>(Lj1/g;Lj1/g$e;)V

    goto :goto_2

    :pswitch_1
    new-instance v0, Lk1/f;

    invoke-direct {v0, p0, p2}, Lk1/f;-><init>(Lj1/g;Lj1/g$e;)V

    goto :goto_2

    :pswitch_2
    new-instance p2, Lk1/c;

    invoke-direct {p2, p0}, Lk1/c;-><init>(Lj1/g;)V

    :goto_1
    move-object v0, p2

    goto :goto_2

    :pswitch_3
    new-instance p2, Lk1/b;

    invoke-direct {p2, p0}, Lk1/b;-><init>(Lj1/g;)V

    goto :goto_1

    :pswitch_4
    new-instance p2, Lk1/a;

    invoke-direct {p2, p0}, Lk1/a;-><init>(Lj1/g;)V

    goto :goto_1

    :pswitch_5
    new-instance p2, Lk1/j;

    invoke-direct {p2, p0}, Lk1/j;-><init>(Lj1/g;)V

    goto :goto_1

    :pswitch_6
    new-instance p2, Lk1/i;

    invoke-direct {p2, p0}, Lk1/i;-><init>(Lj1/g;)V

    goto :goto_1

    :goto_2
    invoke-virtual {v0, p1}, Lj1/a;->A0(Ljava/lang/Object;)V

    iget-object p2, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final p()Lk1/i;
    .locals 2

    const/4 v0, 0x0

    sget-object v1, Lj1/g$e;->C:Lj1/g$e;

    invoke-virtual {p0, v0, v1}, Lj1/g;->o(Ljava/lang/Object;Lj1/g$e;)Lj1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.state.helpers.HorizontalChainReference"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lk1/i;

    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Lk1/h;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj1/g;->m(Ljava/lang/Object;I)Lk1/h;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lm1/e;)Z
    .locals 3

    .prologue
    iget-boolean v0, p0, Lj1/g;->j:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lj1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lj1/f;

    invoke-interface {v1}, Lj1/f;->a()Lm1/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lj1/g;->i:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lj1/g;->j:Z

    :cond_2
    iget-object v0, p0, Lj1/g;->i:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lj1/g;->b:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final t(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "view"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lj1/a;->F0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final u(Ljava/lang/Object;)Lj1/f;
    .locals 1

    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj1/f;

    return-object p1
.end method

.method public final v()V
    .locals 3

    .prologue
    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lj1/f;

    invoke-interface {v1}, Lj1/f;->a()Lm1/e;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->W0()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lj1/g;->c:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lj1/g;->f:Lj1/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lj1/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lj1/g;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/g;->j:Z

    return-void
.end method

.method public final w(Lj1/c;)V
    .locals 0

    iput-object p1, p0, Lj1/g;->a:Lj1/c;

    return-void
.end method

.method public final x(Lj1/d;)Lj1/g;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/g;->f:Lj1/a;

    invoke-virtual {v0, p1}, Lj1/a;->x0(Lj1/d;)Lj1/a;

    return-object p0
.end method

.method public final y(Z)V
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lj1/g;->b:Z

    return-void
.end method

.method public final z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    instance-of v1, v0, Lj1/a;

    if-eqz v1, :cond_1

    invoke-virtual {v0, p2}, Lj1/a;->C0(Ljava/lang/String;)V

    iget-object v0, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj1/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/ArrayList;

    :goto_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
