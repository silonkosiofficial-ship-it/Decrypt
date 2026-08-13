.class Landroidx/databinding/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/databinding/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroidx/databinding/g;


# direct methods
.method constructor <init>(Landroidx/databinding/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/databinding/g;->b(Landroidx/databinding/g;Z)Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroidx/databinding/g;->c()V

    iget-object v0, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    invoke-static {v0}, Landroidx/databinding/g;->d(Landroidx/databinding/g;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    invoke-static {v0}, Landroidx/databinding/g;->d(Landroidx/databinding/g;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Landroidx/databinding/g;->e()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    invoke-static {v0}, Landroidx/databinding/g;->d(Landroidx/databinding/g;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Landroidx/databinding/g;->e()Landroid/view/View$OnAttachStateChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/databinding/g$g;->C:Landroidx/databinding/g;

    invoke-virtual {v0}, Landroidx/databinding/g;->i()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
