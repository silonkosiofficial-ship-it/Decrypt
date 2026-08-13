.class public final Lcom/google/android/gms/internal/measurement/r2$a;
.super Lcom/google/android/gms/internal/measurement/t4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/c5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/r2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/r2;->H()Lcom/google/android/gms/internal/measurement/r2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/t4$b;-><init>(Lcom/google/android/gms/internal/measurement/t4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/E2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/r2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final v(Lcom/google/android/gms/internal/measurement/m2$a;)Lcom/google/android/gms/internal/measurement/r2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/r2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/t4$b;->q()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/t4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/m2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/r2;->G(Lcom/google/android/gms/internal/measurement/r2;Lcom/google/android/gms/internal/measurement/m2;)V

    return-object p0
.end method
