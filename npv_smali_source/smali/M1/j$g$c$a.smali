.class public final LM1/j$g$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j$g$c;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;


# direct methods
.method public constructor <init>(LZ8/g;)V
    .locals 0

    iput-object p1, p0, LM1/j$g$c$a;->C:LZ8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LM1/j$g$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LM1/j$g$c$a$a;

    iget v1, v0, LM1/j$g$c$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LM1/j$g$c$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LM1/j$g$c$a$a;

    invoke-direct {v0, p0, p2}, LM1/j$g$c$a$a;-><init>(LM1/j$g$c$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LM1/j$g$c$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM1/j$g$c$a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LM1/j$g$c$a;->C:LZ8/g;

    check-cast p1, LM1/v;

    instance-of v2, p1, LM1/q;

    if-nez v2, :cond_7

    instance-of v2, p1, LM1/e;

    if-eqz v2, :cond_4

    check-cast p1, LM1/e;

    invoke-virtual {p1}, LM1/e;->c()Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, LM1/j$g$c$a$a;->G:I

    invoke-interface {p2, p1, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    instance-of p2, p1, LM1/l;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    instance-of v3, p1, LM1/z;

    :goto_2
    if-eqz v3, :cond_6

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_7
    check-cast p1, LM1/q;

    invoke-virtual {p1}, LM1/q;->b()Ljava/lang/Throwable;

    move-result-object p1

    throw p1
.end method
