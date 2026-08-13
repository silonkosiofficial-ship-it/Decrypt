.class final Lcom/google/android/gms/internal/ads/VQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ads/WQ;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/WQ;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/VQ;->a:Lcom/google/android/gms/internal/ads/WQ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/WQ;->d()Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VQ;->a:Lcom/google/android/gms/internal/ads/WQ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/WQ;->b(Lcom/google/android/gms/internal/ads/WQ;)Lcom/google/android/gms/internal/ads/DS;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/DS;->i(I)V

    :cond_0
    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 3

    .prologue
    check-cast p1, Lcom/google/android/gms/internal/ads/e70;

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->b6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VQ;->a:Lcom/google/android/gms/internal/ads/WQ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/WQ;->b(Lcom/google/android/gms/internal/ads/WQ;)Lcom/google/android/gms/internal/ads/DS;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget v1, v1, Lcom/google/android/gms/internal/ads/U60;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/DS;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/VQ;->a:Lcom/google/android/gms/internal/ads/WQ;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/WQ;->b(Lcom/google/android/gms/internal/ads/WQ;)Lcom/google/android/gms/internal/ads/DS;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e70;->b:Lcom/google/android/gms/internal/ads/c70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/c70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/U60;->g:J

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/DS;->j(J)V

    :cond_0
    return-void
.end method
