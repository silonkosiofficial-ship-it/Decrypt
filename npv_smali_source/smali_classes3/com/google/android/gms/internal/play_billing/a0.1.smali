.class public final Lcom/google/android/gms/internal/play_billing/a0;
.super Lcom/google/android/gms/internal/play_billing/X;
.source "SourceFile"


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/X;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/a0;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/play_billing/X;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/X;

    return-object p0
.end method

.method public final f()Lcom/google/android/gms/internal/play_billing/e0;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/X;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/X;->a:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/X;->b:I

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/e0;->C([Ljava/lang/Object;I)Lcom/google/android/gms/internal/play_billing/e0;

    move-result-object v0

    return-object v0
.end method
