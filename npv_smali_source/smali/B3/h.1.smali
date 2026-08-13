.class public final synthetic LB3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:LB3/w;

.field public final synthetic b:[Lcom/google/android/gms/internal/ads/PL;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LB3/w;[Lcom/google/android/gms/internal/ads/PL;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/h;->a:LB3/w;

    iput-object p2, p0, LB3/h;->b:[Lcom/google/android/gms/internal/ads/PL;

    iput-object p3, p0, LB3/h;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 3

    iget-object v0, p0, LB3/h;->a:LB3/w;

    iget-object v1, p0, LB3/h;->b:[Lcom/google/android/gms/internal/ads/PL;

    iget-object v2, p0, LB3/h;->c:Ljava/lang/String;

    check-cast p1, Lcom/google/android/gms/internal/ads/PL;

    invoke-virtual {v0, v1, v2, p1}, LB3/w;->Z6([Lcom/google/android/gms/internal/ads/PL;Ljava/lang/String;Lcom/google/android/gms/internal/ads/PL;)LP4/d;

    move-result-object p1

    return-object p1
.end method
