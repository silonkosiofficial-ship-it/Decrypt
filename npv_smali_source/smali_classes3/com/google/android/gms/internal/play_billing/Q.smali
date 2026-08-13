.class public abstract Lcom/google/android/gms/internal/play_billing/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/play_billing/Q;

.field private static final b:Lcom/google/android/gms/internal/play_billing/Q;

.field private static final c:Lcom/google/android/gms/internal/play_billing/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/M;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/M;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/Q;->a:Lcom/google/android/gms/internal/play_billing/Q;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/N;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/N;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/Q;->b:Lcom/google/android/gms/internal/play_billing/Q;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/N;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/N;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/Q;->c:Lcom/google/android/gms/internal/play_billing/Q;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/O;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic c()Lcom/google/android/gms/internal/play_billing/Q;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/Q;->a:Lcom/google/android/gms/internal/play_billing/Q;

    return-object v0
.end method

.method static bridge synthetic d()Lcom/google/android/gms/internal/play_billing/Q;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/Q;->c:Lcom/google/android/gms/internal/play_billing/Q;

    return-object v0
.end method

.method static bridge synthetic e()Lcom/google/android/gms/internal/play_billing/Q;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/Q;->b:Lcom/google/android/gms/internal/play_billing/Q;

    return-object v0
.end method

.method public static f()Lcom/google/android/gms/internal/play_billing/Q;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/Q;->a:Lcom/google/android/gms/internal/play_billing/Q;

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/gms/internal/play_billing/Q;
.end method
