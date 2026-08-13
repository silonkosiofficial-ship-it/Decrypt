.class public final synthetic Lcom/google/android/gms/internal/ads/e30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 7

    .prologue
    check-cast p1, Landroidx/privacysandbox/ads/adservices/topics/b;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/i30;

    const-string v2, ""

    invoke-direct {p1, v2, v1, v0}, Lcom/google/android/gms/internal/ads/i30;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/ads/h30;)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/fx0;->b0()Lcom/google/android/gms/internal/ads/ex0;

    move-result-object v2

    invoke-virtual {p1}, Landroidx/privacysandbox/ads/adservices/topics/b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/privacysandbox/ads/adservices/topics/c;

    invoke-static {}, Lcom/google/android/gms/internal/ads/dx0;->b0()Lcom/google/android/gms/internal/ads/bx0;

    move-result-object v4

    invoke-virtual {v3}, Landroidx/privacysandbox/ads/adservices/topics/c;->c()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/bx0;->B(I)Lcom/google/android/gms/internal/ads/bx0;

    invoke-virtual {v3}, Landroidx/privacysandbox/ads/adservices/topics/c;->a()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/ads/bx0;->z(J)Lcom/google/android/gms/internal/ads/bx0;

    invoke-virtual {v3}, Landroidx/privacysandbox/ads/adservices/topics/c;->b()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/google/android/gms/internal/ads/bx0;->A(J)Lcom/google/android/gms/internal/ads/bx0;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/dx0;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ex0;->z(Lcom/google/android/gms/internal/ads/dx0;)Lcom/google/android/gms/internal/ads/ex0;

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fx0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object p1

    invoke-static {p1, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/ads/i30;

    invoke-direct {v2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/i30;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/ads/h30;)V

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    :goto_1
    return-object p1
.end method
