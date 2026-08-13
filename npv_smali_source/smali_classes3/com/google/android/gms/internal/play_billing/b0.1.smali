.class final Lcom/google/android/gms/internal/play_billing/b0;
.super Lcom/google/android/gms/internal/play_billing/w;
.source "SourceFile"


# instance fields
.field private final E:Lcom/google/android/gms/internal/play_billing/e0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/play_billing/e0;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/play_billing/w;-><init>(II)V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/b0;->E:Lcom/google/android/gms/internal/play_billing/e0;

    return-void
.end method


# virtual methods
.method protected final b(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/b0;->E:Lcom/google/android/gms/internal/play_billing/e0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
