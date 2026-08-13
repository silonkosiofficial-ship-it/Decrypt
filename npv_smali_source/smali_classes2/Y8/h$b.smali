.class final synthetic LY8/h$b;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY8/h;->H(Lx7/l;)LF7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V"

    const/4 v6, 0x0

    const/4 v1, 0x3

    const-class v3, LY8/h;

    const-string v4, "onCancellationImplDoNotCall"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Ly7/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p3, Lm7/i;

    invoke-virtual {p0, p1, p2, p3}, LY8/h$b;->s(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final s(Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, LY8/h;

    invoke-static {v0, p1, p2, p3}, LY8/h;->y(LY8/h;Ljava/lang/Throwable;Ljava/lang/Object;Lm7/i;)V

    return-void
.end method
