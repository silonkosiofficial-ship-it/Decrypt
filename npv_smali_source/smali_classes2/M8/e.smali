.class public abstract LM8/e;
.super LM8/a;
.source "SourceFile"


# instance fields
.field private C:LM8/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LM8/i;->C:LM8/i;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LM8/e;-><init>(LM8/c;)V

    return-void
.end method

.method protected constructor <init>(LM8/c;)V
    .locals 1

    const-string v0, "arrayMap"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LM8/a;-><init>()V

    iput-object p1, p0, LM8/e;->C:LM8/c;

    return-void
.end method


# virtual methods
.method protected final d()LM8/c;
    .locals 1

    iget-object v0, p0, LM8/e;->C:LM8/c;

    return-object v0
.end method

.method protected final g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    const-string v0, "keyQualifiedName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM8/a;->e()LM8/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LM8/s;->e(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, LM8/e;->C:LM8/c;

    invoke-virtual {v0}, LM8/c;->d()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM8/e;->C:LM8/c;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LM8/o;

    invoke-virtual {v0}, LM8/o;->f()I

    move-result v1

    if-ne v1, p1, :cond_1

    new-instance v0, LM8/o;

    invoke-direct {v0, p2, p1}, LM8/o;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LM8/e;->C:LM8/c;

    return-void

    :cond_1
    new-instance v1, LM8/d;

    invoke-direct {v1}, LM8/d;-><init>()V

    iput-object v1, p0, LM8/e;->C:LM8/c;

    invoke-virtual {v0}, LM8/o;->f()I

    move-result v2

    invoke-virtual {v0}, LM8/o;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, LM8/c;->e(ILjava/lang/Object;)V

    :goto_0
    iget-object v0, p0, LM8/e;->C:LM8/c;

    invoke-virtual {v0, p1, p2}, LM8/c;->e(ILjava/lang/Object;)V

    return-void

    :cond_2
    new-instance v0, LM8/o;

    invoke-direct {v0, p2, p1}, LM8/o;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LM8/e;->C:LM8/c;

    return-void
.end method
