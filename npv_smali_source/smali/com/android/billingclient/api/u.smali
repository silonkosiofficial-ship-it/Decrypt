.class final Lcom/android/billingclient/api/u;
.super Lcom/google/android/gms/internal/play_billing/k;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/play_billing/S4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/S4;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/k;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/u;->C:Lcom/google/android/gms/internal/play_billing/S4;

    return-void
.end method


# virtual methods
.method public final r(I)V
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/u;->C:Lcom/google/android/gms/internal/play_billing/S4;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/S4;->b(Ljava/lang/Object;)Z

    return-void
.end method
