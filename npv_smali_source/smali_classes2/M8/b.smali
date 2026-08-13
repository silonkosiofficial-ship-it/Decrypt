.class public abstract LM8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LO7/y;)LM8/g;
    .locals 3

    .prologue
    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/b;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM8/h;

    invoke-virtual {v1, p1}, LM8/h;->b(LO7/y;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, LM8/h;->a(LO7/y;)LM8/g;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, LM8/g$a;->b:LM8/g$a;

    return-object p1
.end method

.method public abstract b()Ljava/util/List;
.end method
