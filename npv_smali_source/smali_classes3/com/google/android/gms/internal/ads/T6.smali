.class final Lcom/google/android/gms/internal/ads/T6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/d7;

.field private final D:Lcom/google/android/gms/internal/ads/h7;

.field private final E:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/T6;->D:Lcom/google/android/gms/internal/ads/h7;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/T6;->E:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/d7;->F()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->D:Lcom/google/android/gms/internal/ads/h7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/h7;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/h7;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/d7;->x(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/h7;->c:Lcom/google/android/gms/internal/ads/k7;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/d7;->w(Lcom/google/android/gms/internal/ads/k7;)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->D:Lcom/google/android/gms/internal/ads/h7;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/h7;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->C:Lcom/google/android/gms/internal/ads/d7;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/d7;->y(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/T6;->E:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method
