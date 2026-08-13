.class abstract Lcom/google/android/gms/internal/play_billing/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# instance fields
.field final C:Ljava/lang/Comparable;


# direct methods
.method constructor <init>(Ljava/lang/Comparable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, ""

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/U;->C:Ljava/lang/Comparable;

    return-void
.end method


# virtual methods
.method public abstract e(Lcom/google/android/gms/internal/play_billing/U;)I
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/U;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/internal/play_billing/U;

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/U;->e(Lcom/google/android/gms/internal/play_billing/U;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v1
.end method

.method abstract g(Ljava/lang/StringBuilder;)V
.end method

.method public abstract hashCode()I
.end method

.method abstract i(Ljava/lang/StringBuilder;)V
.end method
