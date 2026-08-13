.class final Lh2/z$i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$i$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lh2/T;


# direct methods
.method constructor <init>(Lh2/T;)V
    .locals 0

    iput-object p1, p0, Lh2/z$i$a$a;->C:Lh2/T;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh2/x;

    invoke-virtual {p0, p1, p2}, Lh2/z$i$a$a;->b(Lh2/x;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lh2/x;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, Lh2/z$i$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/z$i$a$a$a;

    iget v1, v0, Lh2/z$i$a$a$a;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/z$i$a$a$a;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/z$i$a$a$a;

    invoke-direct {v0, p0, p2}, Lh2/z$i$a$a$a;-><init>(Lh2/z$i$a$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/z$i$a$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/z$i$a$a$a;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch LY8/u; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lh2/z$i$a$a;->C:Lh2/T;

    iput v3, v0, Lh2/z$i$a$a$a;->H:I

    invoke-interface {p2, p1, v0}, LY8/C;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch LY8/u; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_0
    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
