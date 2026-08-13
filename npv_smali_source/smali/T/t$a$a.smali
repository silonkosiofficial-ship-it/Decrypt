.class public final LT/t$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT/t$a;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;

.field final synthetic D:LT/t;


# direct methods
.method public constructor <init>(LZ8/g;LT/t;)V
    .locals 0

    iput-object p1, p0, LT/t$a$a;->C:LZ8/g;

    iput-object p2, p0, LT/t$a$a;->D:LT/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LT/t$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LT/t$a$a$a;

    iget v1, v0, LT/t$a$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LT/t$a$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LT/t$a$a$a;

    invoke-direct {v0, p0, p2}, LT/t$a$a$a;-><init>(LT/t$a$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LT/t$a$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LT/t$a$a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LT/t$a$a;->C:LZ8/g;

    check-cast p1, Lz/i;

    instance-of v2, p1, Lz/n$b;

    if-eqz v2, :cond_3

    iget-object v2, p0, LT/t$a$a;->D:LT/t;

    move-object v4, p1

    check-cast v4, Lz/n$b;

    invoke-static {v2, v4}, LT/t;->e(LT/t;Lz/n$b;)Lz/n$b;

    move-result-object v2

    iget-object v4, p0, LT/t$a$a;->D:LT/t;

    invoke-static {v4}, LT/t;->d(LT/t;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v2

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lz/n$a;

    if-eqz v2, :cond_5

    iget-object v2, p0, LT/t$a$a;->D:LT/t;

    invoke-static {v2}, LT/t;->d(LT/t;)Ljava/util/Map;

    move-result-object v2

    check-cast p1, Lz/n$a;

    invoke-virtual {p1}, Lz/n$a;->a()Lz/n$b;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/n$b;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lz/n$a;

    invoke-direct {p1, v2}, Lz/n$a;-><init>(Lz/n$b;)V

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lz/n$c;

    if-eqz v2, :cond_7

    iget-object v2, p0, LT/t$a$a;->D:LT/t;

    invoke-static {v2}, LT/t;->d(LT/t;)Ljava/util/Map;

    move-result-object v2

    check-cast p1, Lz/n$c;

    invoke-virtual {p1}, Lz/n$c;->a()Lz/n$b;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz/n$b;

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    new-instance p1, Lz/n$c;

    invoke-direct {p1, v2}, Lz/n$c;-><init>(Lz/n$b;)V

    :cond_7
    :goto_1
    iput v3, v0, LT/t$a$a$a;->G:I

    invoke-interface {p2, p1, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
