.class public final Lcom/google/android/gms/internal/measurement/l2$a;
.super Lcom/google/android/gms/internal/measurement/t4$b;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/c5;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/l2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/l2;->S()Lcom/google/android/gms/internal/measurement/l2;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/t4$b;-><init>(Lcom/google/android/gms/internal/measurement/t4;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/E2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/l2$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/measurement/n2$a;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/t4$b;->q()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/t4;

    check-cast p1, Lcom/google/android/gms/internal/measurement/n2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->K(Lcom/google/android/gms/internal/measurement/l2;Lcom/google/android/gms/internal/measurement/n2;)V

    return-object p0
.end method

.method public final B(Lcom/google/android/gms/internal/measurement/n2;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->K(Lcom/google/android/gms/internal/measurement/l2;Lcom/google/android/gms/internal/measurement/n2;)V

    return-object p0
.end method

.method public final C(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->L(Lcom/google/android/gms/internal/measurement/l2;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->M(Lcom/google/android/gms/internal/measurement/l2;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->P()J

    move-result-wide v0

    return-wide v0
.end method

.method public final G(J)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/l2;->O(Lcom/google/android/gms/internal/measurement/l2;J)V

    return-object p0
.end method

.method public final H(I)Lcom/google/android/gms/internal/measurement/n2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->F(I)Lcom/google/android/gms/internal/measurement/n2;

    move-result-object p1

    return-object p1
.end method

.method public final I()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->Q()J

    move-result-wide v0

    return-wide v0
.end method

.method public final J()Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/l2;->G(Lcom/google/android/gms/internal/measurement/l2;)V

    return-object p0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->T()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->U()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final M()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->X()Z

    move-result v0

    return v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/l2;->N()I

    move-result v0

    return v0
.end method

.method public final w(I)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/l2;->H(Lcom/google/android/gms/internal/measurement/l2;I)V

    return-object p0
.end method

.method public final x(ILcom/google/android/gms/internal/measurement/n2$a;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/t4$b;->q()Lcom/google/android/gms/internal/measurement/a5;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/t4;

    check-cast p2, Lcom/google/android/gms/internal/measurement/n2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/l2;->I(Lcom/google/android/gms/internal/measurement/l2;ILcom/google/android/gms/internal/measurement/n2;)V

    return-object p0
.end method

.method public final y(ILcom/google/android/gms/internal/measurement/n2;)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/l2;->I(Lcom/google/android/gms/internal/measurement/l2;ILcom/google/android/gms/internal/measurement/n2;)V

    return-object p0
.end method

.method public final z(J)Lcom/google/android/gms/internal/measurement/l2$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/t4$b;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/t4$b;->D:Lcom/google/android/gms/internal/measurement/t4;

    check-cast v0, Lcom/google/android/gms/internal/measurement/l2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/l2;->J(Lcom/google/android/gms/internal/measurement/l2;J)V

    return-object p0
.end method
