.class public final Lcom/google/android/gms/internal/measurement/U1$a;
.super Lcom/google/android/gms/internal/measurement/t4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/c5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/U1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/U1;->M()Lcom/google/android/gms/internal/measurement/U1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/t4$b;-><init>(Lcom/google/android/gms/internal/measurement/t4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/e2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/U1$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/U1;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/U1;->S()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/U1;->I()I

    move-result v0

    return v0
.end method

.method public final w(I)Lcom/google/android/gms/internal/measurement/T1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/U1;->F(I)Lcom/google/android/gms/internal/measurement/T1;

    move-result-object p1

    return-object p1
.end method

.method public final x(ILcom/google/android/gms/internal/measurement/T1$a;)Lcom/google/android/gms/internal/measurement/U1$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/t4$b;->q()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/t4;

    check-cast p2, Lcom/google/android/gms/internal/measurement/T1;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/U1;->H(Lcom/google/android/gms/internal/measurement/U1;ILcom/google/android/gms/internal/measurement/T1;)V

    return-object p0
.end method

.method public final y()Lcom/google/android/gms/internal/measurement/U1$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/U1;->G(Lcom/google/android/gms/internal/measurement/U1;)V

    return-object p0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/U1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/U1;->Q()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
