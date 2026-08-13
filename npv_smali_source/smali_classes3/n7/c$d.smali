.class public final Ln7/c$d;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/c;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private F:I

.field final synthetic G:Lx7/p;

.field final synthetic H:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm7/e;Lm7/i;Lx7/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p3, p0, Ln7/c$d;->G:Lx7/p;

    iput-object p4, p0, Ln7/c$d;->H:Ljava/lang/Object;

    const-string p3, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p3}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lo7/d;-><init>(Lm7/e;Lm7/i;)V

    return-void
.end method


# virtual methods
.method protected B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    iget v0, p0, Ln7/c$d;->F:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Ln7/c$d;->F:I

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Ln7/c$d;->F:I

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ln7/c$d;->G:Lx7/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ln7/c$d;->G:Lx7/p;

    invoke-static {p1, v1}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/p;

    iget-object v0, p0, Ln7/c$d;->H:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
