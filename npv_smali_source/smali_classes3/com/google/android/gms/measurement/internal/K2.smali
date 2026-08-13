.class final Lcom/google/android/gms/measurement/internal/K2;
.super Lr/x;
.source "SourceFile"


# instance fields
.field private final synthetic j:Lcom/google/android/gms/measurement/internal/I2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/I2;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/K2;->j:Lcom/google/android/gms/measurement/internal/I2;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lr/x;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LQ3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/K2;->j:Lcom/google/android/gms/measurement/internal/I2;

    invoke-static {v0, p1}, Lcom/google/android/gms/measurement/internal/I2;->z(Lcom/google/android/gms/measurement/internal/I2;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/C;

    move-result-object p1

    return-object p1
.end method
