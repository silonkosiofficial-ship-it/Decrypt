.class final Lcom/google/android/gms/internal/measurement/E1;
.super Lcom/google/android/gms/internal/measurement/e1$a;
.source "SourceFile"


# instance fields
.field private final synthetic G:Landroid/app/Activity;

.field private final synthetic H:Lcom/google/android/gms/internal/measurement/e1$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1$c;Landroid/app/Activity;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/E1;->G:Landroid/app/Activity;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/E1;->H:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/E1;->H:Lcom/google/android/gms/internal/measurement/e1$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/e1$c;->C:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->e(Lcom/google/android/gms/internal/measurement/e1;)Lcom/google/android/gms/internal/measurement/P0;

    move-result-object v0

    invoke-static {v0}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/P0;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/E1;->G:Landroid/app/Activity;

    invoke-static {v1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/e1$a;->D:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/P0;->onActivityStopped(LX3/a;J)V

    return-void
.end method
