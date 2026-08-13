.class final Lcom/google/android/gms/internal/ads/Ja0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/E90;

.field final synthetic b:Lcom/google/android/gms/internal/ads/Q90;

.field final synthetic c:Lcom/google/android/gms/internal/ads/La0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/E90;Lcom/google/android/gms/internal/ads/Q90;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Ja0;->b:Lcom/google/android/gms/internal/ads/Q90;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->c:Lcom/google/android/gms/internal/ads/La0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->c:Lcom/google/android/gms/internal/ads/La0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/La0;->b(Lcom/google/android/gms/internal/ads/La0;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 1

    .prologue
    check-cast p1, Lw3/u;

    sget-object v0, Lw3/u;->C:Lw3/u;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/E90;->K0(Z)Lcom/google/android/gms/internal/ads/E90;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->b:Lcom/google/android/gms/internal/ads/Q90;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Ja0;->c:Lcom/google/android/gms/internal/ads/La0;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/La0;->b(Lcom/google/android/gms/internal/ads/La0;)Lcom/google/android/gms/internal/ads/T90;

    move-result-object p1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/E90;->m()Lcom/google/android/gms/internal/ads/J90;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/T90;->b(Lcom/google/android/gms/internal/ads/J90;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ja0;->a:Lcom/google/android/gms/internal/ads/E90;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Q90;->a(Lcom/google/android/gms/internal/ads/E90;)Lcom/google/android/gms/internal/ads/Q90;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Q90;->h()V

    return-void
.end method
