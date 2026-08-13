.class public final LC/K$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/K;-><init>(IILC/B;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/K;


# direct methods
.method constructor <init>(LC/K;)V
    .locals 0

    iput-object p1, p0, LC/K$d;->a:LC/K;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 13

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lf0/k;->e:Lf0/k$a;

    iget-object v2, p0, LC/K$d;->a:LC/K;

    invoke-virtual {v1}, Lf0/k$a;->d()Lf0/k;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lf0/k;->h()Lx7/l;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1, v3}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v5

    :try_start_0
    invoke-static {v2}, LC/K;->f(LC/K;)LV/w0;

    move-result-object v6

    invoke-interface {v6}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC/u;

    invoke-virtual {v6}, LC/u;->r()Lx7/l;

    move-result-object v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v6, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_1

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li7/u;

    invoke-virtual {v2}, LC/K;->w()Landroidx/compose/foundation/lazy/layout/d;

    move-result-object v9

    invoke-virtual {v8}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v8}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LY0/b;

    invoke-virtual {v8}, LY0/b;->r()J

    move-result-wide v11

    invoke-virtual {v9, v10, v11, v12}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, v3, v5, v4}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    return-object v0

    :goto_2
    invoke-virtual {v1, v3, v5, v4}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw p1
.end method
