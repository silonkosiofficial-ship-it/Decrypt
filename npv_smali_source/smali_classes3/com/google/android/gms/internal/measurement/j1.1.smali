.class final Lcom/google/android/gms/internal/measurement/j1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Ljava/lang/String;

.field private final synthetic H:Ljava/lang/String;

.field private final synthetic I:Landroid/os/Bundle;

.field private final synthetic J:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/j1;->G:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/j1;->H:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/j1;->I:Landroid/os/Bundle;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/j1;->J:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j1;->J:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/j1;->G:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/j1;->H:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/j1;->I:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
