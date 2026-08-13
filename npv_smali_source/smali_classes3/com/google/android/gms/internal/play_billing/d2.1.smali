.class final Lcom/google/android/gms/internal/play_billing/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/android/gms/internal/play_billing/d2;

.field static final c:Lcom/google/android/gms/internal/play_billing/d2;


# instance fields
.field final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    sget-boolean v0, Lcom/google/android/gms/internal/play_billing/R4;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lcom/google/android/gms/internal/play_billing/d2;->c:Lcom/google/android/gms/internal/play_billing/d2;

    sput-object v1, Lcom/google/android/gms/internal/play_billing/d2;->b:Lcom/google/android/gms/internal/play_billing/d2;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/play_billing/d2;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/d2;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/d2;->c:Lcom/google/android/gms/internal/play_billing/d2;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/d2;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/d2;-><init>(ZLjava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/d2;->b:Lcom/google/android/gms/internal/play_billing/d2;

    return-void
.end method

.method constructor <init>(ZLjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/d2;->a:Ljava/lang/Throwable;

    return-void
.end method
