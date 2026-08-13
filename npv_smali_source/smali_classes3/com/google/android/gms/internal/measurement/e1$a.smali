.class abstract Lcom/google/android/gms/internal/measurement/e1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/e1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation


# instance fields
.field final C:J

.field final D:J

.field private final E:Z

.field private final synthetic F:Lcom/google/android/gms/internal/measurement/e1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/e1$a;-><init>(Lcom/google/android/gms/internal/measurement/e1;Z)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/measurement/e1;Z)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/e1$a;->F:Lcom/google/android/gms/internal/measurement/e1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/e1;->b:LV3/f;

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->C:J

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/e1;->b:LV3/f;

    invoke-interface {p1}, LV3/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->D:J

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/e1$a;->E:Z

    return-void
.end method


# virtual methods
.method abstract a()V
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e1$a;->F:Lcom/google/android/gms/internal/measurement/e1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/e1;->D(Lcom/google/android/gms/internal/measurement/e1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/e1$a;->F:Lcom/google/android/gms/internal/measurement/e1;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/e1$a;->E:Z

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/e1;->p(Lcom/google/android/gms/internal/measurement/e1;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/e1$a;->b()V

    return-void
.end method
