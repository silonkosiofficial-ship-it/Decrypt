.class final Lcom/google/android/gms/common/api/internal/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:I

.field final synthetic D:Lcom/google/android/gms/common/api/internal/n;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/n;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/k;->D:Lcom/google/android/gms/common/api/internal/n;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/k;->C:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/k;->D:Lcom/google/android/gms/common/api/internal/n;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/k;->C:I

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/n;->x(Lcom/google/android/gms/common/api/internal/n;I)V

    return-void
.end method
