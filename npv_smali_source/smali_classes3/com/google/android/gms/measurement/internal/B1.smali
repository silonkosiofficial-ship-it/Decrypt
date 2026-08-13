.class final Lcom/google/android/gms/measurement/internal/B1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Li4/p;


# direct methods
.method constructor <init>(Li4/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/B1;->a:Li4/p;

    return-void
.end method

.method static a(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/B1;
    .locals 2

    .prologue
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/A3;->g(C)Li4/p;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Li4/p;->D:Li4/p;

    :goto_1
    new-instance v0, Lcom/google/android/gms/measurement/internal/B1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/measurement/internal/B1;-><init>(Li4/p;)V

    return-object v0
.end method


# virtual methods
.method final b()Li4/p;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B1;->a:Li4/p;

    return-object v0
.end method

.method final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B1;->a:Li4/p;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/A3;->a(Li4/p;)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
