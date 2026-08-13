.class public final Lcom/google/android/gms/internal/ads/NI0;
.super Lcom/google/android/gms/internal/ads/yH0;
.source "SourceFile"


# instance fields
.field private final c:Lcom/google/android/gms/internal/ads/Q7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/qm;Lcom/google/android/gms/internal/ads/Q7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/yH0;-><init>(Lcom/google/android/gms/internal/ads/qm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/NI0;->c:Lcom/google/android/gms/internal/ads/Q7;

    return-void
.end method


# virtual methods
.method public final e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yH0;->b:Lcom/google/android/gms/internal/ads/qm;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/qm;->e(ILcom/google/android/gms/internal/ads/Ql;J)Lcom/google/android/gms/internal/ads/Ql;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/NI0;->c:Lcom/google/android/gms/internal/ads/Q7;

    iput-object p1, p2, Lcom/google/android/gms/internal/ads/Ql;->c:Lcom/google/android/gms/internal/ads/Q7;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/Q7;->b:Lcom/google/android/gms/internal/ads/o5;

    const/4 p1, 0x0

    iput-object p1, p2, Lcom/google/android/gms/internal/ads/Ql;->b:Ljava/lang/Object;

    return-object p2
.end method
