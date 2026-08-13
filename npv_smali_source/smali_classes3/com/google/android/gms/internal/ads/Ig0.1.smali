.class final Lcom/google/android/gms/internal/ads/Ig0;
.super Lcom/google/android/gms/internal/ads/Og0;
.source "SourceFile"


# instance fields
.field final synthetic H:Lcom/google/android/gms/internal/ads/lg0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Jg0;Lcom/google/android/gms/internal/ads/Qg0;Ljava/lang/CharSequence;Lcom/google/android/gms/internal/ads/lg0;)V
    .locals 0

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Ig0;->H:Lcom/google/android/gms/internal/ads/lg0;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/Og0;-><init>(Lcom/google/android/gms/internal/ads/Qg0;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ig0;->H:Lcom/google/android/gms/internal/ads/lg0;

    check-cast p1, Lcom/google/android/gms/internal/ads/qg0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/qg0;->a:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result p1

    return p1
.end method

.method public final d(I)I
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ig0;->H:Lcom/google/android/gms/internal/ads/lg0;

    check-cast v0, Lcom/google/android/gms/internal/ads/qg0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/qg0;->a:Ljava/util/regex/Matcher;

    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ig0;->H:Lcom/google/android/gms/internal/ads/lg0;

    check-cast p1, Lcom/google/android/gms/internal/ads/qg0;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/qg0;->a:Ljava/util/regex/Matcher;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
