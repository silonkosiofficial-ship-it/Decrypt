.class final Lb9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private C:Ljava/lang/Runnable;

.field final synthetic D:Lb9/k;


# direct methods
.method public constructor <init>(Lb9/k;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lb9/k$a;->D:Lb9/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb9/k$a;->C:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lb9/k$a;->C:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lm7/j;->C:Lm7/j;

    invoke-static {v2, v1}, LW8/L;->a(Lm7/i;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v1, p0, Lb9/k$a;->D:Lb9/k;

    invoke-static {v1}, Lb9/k;->A1(Lb9/k;)Ljava/lang/Runnable;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    iput-object v1, p0, Lb9/k$a;->C:Ljava/lang/Runnable;

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Lb9/k$a;->D:Lb9/k;

    invoke-static {v1}, Lb9/k;->z1(Lb9/k;)LW8/J;

    move-result-object v1

    iget-object v2, p0, Lb9/k$a;->D:Lb9/k;

    invoke-virtual {v1, v2}, LW8/J;->v1(Lm7/i;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lb9/k$a;->D:Lb9/k;

    invoke-static {v0}, Lb9/k;->z1(Lb9/k;)LW8/J;

    move-result-object v0

    iget-object v1, p0, Lb9/k$a;->D:Lb9/k;

    invoke-virtual {v0, v1, p0}, LW8/J;->t1(Lm7/i;Ljava/lang/Runnable;)V

    return-void
.end method
