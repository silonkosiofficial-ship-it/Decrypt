.class final LM1/j$r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j$r;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LM1/j;


# direct methods
.method constructor <init>(LM1/j;)V
    .locals 0

    iput-object p1, p0, LM1/j$r$a;->C:LM1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li7/M;

    invoke-virtual {p0, p1, p2}, LM1/j$r$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Li7/M;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object p1, p0, LM1/j$r$a;->C:LM1/j;

    invoke-static {p1}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object p1

    invoke-virtual {p1}, LM1/k;->a()LM1/v;

    move-result-object p1

    instance-of p1, p1, LM1/l;

    if-nez p1, :cond_1

    iget-object p1, p0, LM1/j$r$a;->C:LM1/j;

    const/4 v0, 0x1

    invoke-static {p1, v0, p2}, LM1/j;->l(LM1/j;ZLm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
