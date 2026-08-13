.class public final synthetic LB3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:LB3/C;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:LB3/w;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/Fq;


# direct methods
.method public synthetic constructor <init>(LB3/C;Ljava/lang/String;LB3/w;Lcom/google/android/gms/internal/ads/Fq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/b;->C:LB3/C;

    iput-object p2, p0, LB3/b;->D:Ljava/lang/String;

    iput-object p3, p0, LB3/b;->E:LB3/w;

    iput-object p4, p0, LB3/b;->F:Lcom/google/android/gms/internal/ads/Fq;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LB3/b;->C:LB3/C;

    iget-object v1, p0, LB3/b;->D:Ljava/lang/String;

    iget-object v2, p0, LB3/b;->E:LB3/w;

    iget-object v3, p0, LB3/b;->F:Lcom/google/android/gms/internal/ads/Fq;

    invoke-virtual {v0, v1, v2, v3}, LB3/C;->c(Ljava/lang/String;LB3/w;Lcom/google/android/gms/internal/ads/Fq;)V

    return-void
.end method
