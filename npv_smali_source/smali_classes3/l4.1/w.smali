.class final Ll4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ll4/l;

.field final synthetic D:Ll4/x;


# direct methods
.method constructor <init>(Ll4/x;Ll4/l;)V
    .locals 0

    iput-object p1, p0, Ll4/w;->D:Ll4/x;

    iput-object p2, p0, Ll4/w;->C:Ll4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Ll4/w;->C:Ll4/l;

    invoke-virtual {v0}, Ll4/l;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v0}, Ll4/x;->b(Ll4/x;)Ll4/P;

    move-result-object v0

    invoke-virtual {v0}, Ll4/P;->t()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v0}, Ll4/x;->a(Ll4/x;)Ll4/c;

    move-result-object v0

    iget-object v1, p0, Ll4/w;->C:Ll4/l;

    invoke-interface {v0, v1}, Ll4/c;->a(Ll4/l;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ll4/j; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v1}, Ll4/x;->b(Ll4/x;)Ll4/P;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll4/P;->s(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    iget-object v1, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v1}, Ll4/x;->b(Ll4/x;)Ll4/P;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v1}, Ll4/x;->b(Ll4/x;)Ll4/P;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Ll4/w;->D:Ll4/x;

    invoke-static {v1}, Ll4/x;->b(Ll4/x;)Ll4/P;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll4/P;->r(Ljava/lang/Exception;)V

    return-void
.end method
