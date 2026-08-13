.class final Lcom/google/android/gms/measurement/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic C:Lcom/google/android/gms/measurement/internal/y3;

.field private final synthetic D:Lcom/google/android/gms/measurement/internal/t;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/t;Lcom/google/android/gms/measurement/internal/y3;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/w;->C:Lcom/google/android/gms/measurement/internal/y3;

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/w;->D:Lcom/google/android/gms/measurement/internal/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w;->C:Lcom/google/android/gms/measurement/internal/y3;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/y3;->f()Lcom/google/android/gms/measurement/internal/c;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w;->C:Lcom/google/android/gms/measurement/internal/y3;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/y3;->l()Lcom/google/android/gms/measurement/internal/P2;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/measurement/internal/P2;->D(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w;->D:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/t;->e()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/w;->D:Lcom/google/android/gms/measurement/internal/t;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/t;->c(Lcom/google/android/gms/measurement/internal/t;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/w;->D:Lcom/google/android/gms/measurement/internal/t;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/t;->d()V

    :cond_1
    return-void
.end method
