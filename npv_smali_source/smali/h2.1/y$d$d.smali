.class final synthetic Lh2/y$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;
.implements Ly7/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/T;


# direct methods
.method constructor <init>(Lh2/T;)V
    .locals 0

    iput-object p1, p0, Lh2/y$d$d;->C:Lh2/T;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/F;

    invoke-virtual {p0, p1, p2}, Lh2/y$d$d;->c(Lh2/F;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Li7/i;
    .locals 8

    new-instance v7, Ly7/q;

    iget-object v2, p0, Lh2/y$d$d;->C:Lh2/T;

    const-string v5, "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v1, 0x2

    const-class v3, Lh2/T;

    const-string v4, "send"

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v7
.end method

.method public final c(Lh2/F;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, Lh2/y$d$d;->C:Lh2/T;

    invoke-interface {v0, p1, p2}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, LZ8/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ly7/n;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh2/y$d$d;->b()Li7/i;

    move-result-object v0

    check-cast p1, Ly7/n;

    invoke-interface {p1}, Ly7/n;->b()Li7/i;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lh2/y$d$d;->b()Li7/i;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
