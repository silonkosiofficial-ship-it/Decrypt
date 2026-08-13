.class public abstract Lx9/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/h;
.implements Lw9/d;


# instance fields
.field private final b:Ljava/util/ArrayList;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx9/B0;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic G(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lx9/B0;->I(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lx9/B0;->J(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-interface {p1}, Lt9/a;->a()Lv9/f;

    move-result-object v0

    invoke-interface {v0}, Lv9/f;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, Lw9/h;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lw9/h;->n()Ljava/lang/Void;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lx9/B0;->K(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method private static final J(Lx9/B0;Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lx9/B0;->K(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b0(Ljava/lang/Object;Lx7/a;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-virtual {p0, p1}, Lx9/B0;->a0(Ljava/lang/Object;)V

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    iget-boolean p2, p0, Lx9/B0;->c:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    :cond_0
    const/4 p2, 0x0

    iput-boolean p2, p0, Lx9/B0;->c:Z

    return-object p1
.end method


# virtual methods
.method public final A()S
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->U(Ljava/lang/Object;)S

    move-result v0

    return v0
.end method

.method public final B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Lx9/z0;

    invoke-direct {p2, p0, p3, p4}, Lx9/z0;-><init>(Lx9/B0;Lt9/a;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lx9/B0;->b0(Ljava/lang/Object;Lx7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final C()F
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->Q(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method public final D(Lv9/f;I)B
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->M(Ljava/lang/Object;)B

    move-result p1

    return p1
.end method

.method public final E(Lv9/f;I)Lw9/h;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lx9/B0;->R(Ljava/lang/Object;Lv9/f;)Lw9/h;

    move-result-object p1

    return-object p1
.end method

.method public final F()D
    .locals 2

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->O(Ljava/lang/Object;)D

    move-result-wide v0

    return-wide v0
.end method

.method protected K(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "deserializer"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx9/B0;->x(Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract L(Ljava/lang/Object;)Z
.end method

.method protected abstract M(Ljava/lang/Object;)B
.end method

.method protected abstract N(Ljava/lang/Object;)C
.end method

.method protected abstract O(Ljava/lang/Object;)D
.end method

.method protected abstract P(Ljava/lang/Object;Lv9/f;)I
.end method

.method protected abstract Q(Ljava/lang/Object;)F
.end method

.method protected R(Ljava/lang/Object;Lv9/f;)Lw9/h;
    .locals 1

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx9/B0;->a0(Ljava/lang/Object;)V

    return-object p0
.end method

.method protected abstract S(Ljava/lang/Object;)I
.end method

.method protected abstract T(Ljava/lang/Object;)J
.end method

.method protected abstract U(Ljava/lang/Object;)S
.end method

.method protected abstract V(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method protected final W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx9/B0;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected abstract X(Lv9/f;I)Ljava/lang/Object;
.end method

.method public final Y()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lx9/B0;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected final Z()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx9/B0;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lx9/B0;->c:Z

    return-object v0
.end method

.method protected final a0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lx9/B0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->V(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lv9/f;I)Z
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->L(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Z
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->L(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final f()C
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->N(Ljava/lang/Object;)C

    move-result v0

    return v0
.end method

.method public final g(Lv9/f;I)F
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->Q(Ljava/lang/Object;)F

    move-result p1

    return p1
.end method

.method public final h(Lv9/f;I)S
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->U(Ljava/lang/Object;)S

    move-result p1

    return p1
.end method

.method public final i(Lv9/f;I)C
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->N(Ljava/lang/Object;)C

    move-result p1

    return p1
.end method

.method public final j(Lv9/f;I)D
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->O(Ljava/lang/Object;)D

    move-result-wide p1

    return-wide p1
.end method

.method public final k(Lv9/f;)I
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/B0;->P(Ljava/lang/Object;Lv9/f;)I

    move-result p1

    return p1
.end method

.method public final m()I
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->S(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final n()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->V(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p(Lv9/f;)Lw9/h;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lx9/B0;->R(Ljava/lang/Object;Lv9/f;)Lw9/h;

    move-result-object p1

    return-object p1
.end method

.method public final q()J
    .locals 2

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->T(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final t(Lv9/f;I)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->S(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final u(Lv9/f;I)J
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lx9/B0;->T(Ljava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic v()Z
    .locals 1

    invoke-static {p0}, Lw9/c;->b(Lw9/d;)Z

    move-result v0

    return v0
.end method

.method public synthetic w(Lv9/f;)I
    .locals 0

    invoke-static {p0, p1}, Lw9/c;->a(Lw9/d;Lv9/f;)I

    move-result p1

    return p1
.end method

.method public abstract synthetic x(Lt9/a;)Ljava/lang/Object;
.end method

.method public final y()B
    .locals 1

    invoke-virtual {p0}, Lx9/B0;->Z()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx9/B0;->M(Ljava/lang/Object;)B

    move-result v0

    return v0
.end method

.method public final z(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lx9/B0;->X(Lv9/f;I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, Lx9/A0;

    invoke-direct {p2, p0, p3, p4}, Lx9/A0;-><init>(Lx9/B0;Lt9/a;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lx9/B0;->b0(Ljava/lang/Object;Lx7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
