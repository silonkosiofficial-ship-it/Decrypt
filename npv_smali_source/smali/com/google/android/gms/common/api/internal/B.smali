.class final Lcom/google/android/gms/common/api/internal/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Lcom/google/android/gms/common/api/internal/z;

.field final synthetic D:Lcom/google/android/gms/common/api/internal/C;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/C;Lcom/google/android/gms/common/api/internal/z;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/B;->C:Lcom/google/android/gms/common/api/internal/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    iget-boolean v0, v0, Lcom/google/android/gms/common/api/internal/C;->D:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/B;->C:Lcom/google/android/gms/common/api/internal/z;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/z;->b()LN3/b;

    move-result-object v0

    invoke-virtual {v0}, LN3/b;->w()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->C:LP3/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, LN3/b;->s()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/B;->C:Lcom/google/android/gms/common/api/internal/z;

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/z;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, LP3/e;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0}, LN3/b;->e()I

    move-result v3

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/C;->G:LN3/g;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, LN3/g;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v3

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->C:LP3/e;

    invoke-virtual {v0}, LN3/b;->e()I

    move-result v5

    iget-object v7, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/C;->G:LN3/g;

    const/4 v6, 0x2

    invoke-virtual/range {v2 .. v7}, LN3/g;->v(Landroid/app/Activity;LP3/e;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, LN3/b;->e()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/C;->G:LN3/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, LN3/g;->q(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/common/api/internal/A;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/common/api/internal/A;-><init>(Lcom/google/android/gms/common/api/internal/B;Landroid/app/Dialog;)V

    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/C;->G:LN3/g;

    invoke-virtual {v0, v2, v3}, LN3/g;->r(Landroid/content/Context;LP3/r;)LP3/s;

    return-void

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/B;->C:Lcom/google/android/gms/common/api/internal/z;

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/z;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/C;->q(Lcom/google/android/gms/common/api/internal/C;LN3/b;I)V

    return-void
.end method
