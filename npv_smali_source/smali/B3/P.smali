.class public final LB3/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZG;


# instance fields
.field private final C:LB3/C;

.field private final D:I

.field private final E:Ljava/lang/String;


# direct methods
.method public constructor <init>(LB3/C;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/P;->C:LB3/C;

    iput p2, p0, LB3/P;->D:I

    iput-object p3, p0, LB3/P;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final G(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(LB3/N;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_1

    iget v0, p0, LB3/P;->D:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LB3/P;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LB3/O;

    invoke-direct {v0, p0, p1}, LB3/O;-><init>(LB3/P;LB3/N;)V

    invoke-static {v0}, Lv3/E0;->M(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method final synthetic b(LB3/N;)V
    .locals 2

    iget-object v0, p0, LB3/P;->C:LB3/C;

    iget-object v1, p0, LB3/P;->E:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, LB3/C;->d(Ljava/lang/String;LB3/N;)V

    return-void
.end method
