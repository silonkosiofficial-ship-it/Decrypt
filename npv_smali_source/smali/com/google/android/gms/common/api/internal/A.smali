.class final Lcom/google/android/gms/common/api/internal/A;
.super LP3/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/app/Dialog;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/B;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/B;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/A;->b:Lcom/google/android/gms/common/api/internal/B;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/A;->a:Landroid/app/Dialog;

    invoke-direct {p0}, LP3/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/A;->b:Lcom/google/android/gms/common/api/internal/B;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/B;->D:Lcom/google/android/gms/common/api/internal/C;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/C;->r(Lcom/google/android/gms/common/api/internal/C;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/A;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/A;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
