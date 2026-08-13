.class final Lcom/google/android/gms/internal/play_billing/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/u3;


# static fields
.field private static final b:Lcom/google/android/gms/internal/play_billing/g3;


# instance fields
.field private final a:Lcom/google/android/gms/internal/play_billing/g3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/Z2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/Z2;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/b3;->b:Lcom/google/android/gms/internal/play_billing/g3;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/play_billing/a3;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/I2;->a()Lcom/google/android/gms/internal/play_billing/I2;

    move-result-object v1

    sget v2, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/play_billing/g3;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    sget-object v1, Lcom/google/android/gms/internal/play_billing/b3;->b:Lcom/google/android/gms/internal/play_billing/g3;

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/a3;-><init>([Lcom/google/android/gms/internal/play_billing/g3;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/play_billing/Q2;->b:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/b3;->a:Lcom/google/android/gms/internal/play_billing/g3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/t3;
    .locals 8

    .prologue
    sget v0, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    const-class v0, Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/b3;->a:Lcom/google/android/gms/internal/play_billing/g3;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/play_billing/g3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/f3;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/f3;->b()Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/o3;->a()Lcom/google/android/gms/internal/play_billing/n3;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/X2;->a()Lcom/google/android/gms/internal/play_billing/V2;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/v3;->r()Lcom/google/android/gms/internal/play_billing/z3;

    move-result-object v5

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/f3;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/D2;->a()Lcom/google/android/gms/internal/play_billing/B2;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e3;->a()Lcom/google/android/gms/internal/play_billing/d3;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/play_billing/l3;->A(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/f3;Lcom/google/android/gms/internal/play_billing/n3;Lcom/google/android/gms/internal/play_billing/V2;Lcom/google/android/gms/internal/play_billing/z3;Lcom/google/android/gms/internal/play_billing/B2;Lcom/google/android/gms/internal/play_billing/d3;)Lcom/google/android/gms/internal/play_billing/l3;

    move-result-object p1

    return-object p1

    :cond_2
    sget p1, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/v3;->r()Lcom/google/android/gms/internal/play_billing/z3;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/D2;->a()Lcom/google/android/gms/internal/play_billing/B2;

    move-result-object v0

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/f3;->a()Lcom/google/android/gms/internal/play_billing/i3;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/m3;->j(Lcom/google/android/gms/internal/play_billing/z3;Lcom/google/android/gms/internal/play_billing/B2;Lcom/google/android/gms/internal/play_billing/i3;)Lcom/google/android/gms/internal/play_billing/m3;

    move-result-object p1

    return-object p1
.end method
