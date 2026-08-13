.class final Lv3/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/f7;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lv3/M;


# direct methods
.method constructor <init>(Lv3/Q;Ljava/lang/String;Lv3/M;)V
    .locals 0

    iput-object p2, p0, Lv3/K;->a:Ljava/lang/String;

    iput-object p3, p0, Lv3/K;->b:Lv3/M;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/k7;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to load URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv3/K;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lv3/K;->b:Lv3/M;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv3/M;->b(Ljava/lang/Object;)V

    return-void
.end method
