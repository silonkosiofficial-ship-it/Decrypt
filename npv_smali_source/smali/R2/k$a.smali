.class LR2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final C:LR2/k;

.field final D:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(LR2/k;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR2/k$a;->C:LR2/k;

    iput-object p2, p0, LR2/k$a;->D:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, LR2/k$a;->D:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LR2/k$a;->C:LR2/k;

    invoke-virtual {v0}, LR2/k;->c()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, LR2/k$a;->C:LR2/k;

    invoke-virtual {v1}, LR2/k;->c()V

    throw v0
.end method
