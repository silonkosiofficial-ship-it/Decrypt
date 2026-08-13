.class public abstract Lw9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw9/h;
.implements Lw9/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract A()S
.end method

.method public B(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deserializer"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p4}, Lw9/a;->G(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public C()F
    .locals 2

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public final D(Lv9/f;I)B
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->y()B

    move-result p1

    return p1
.end method

.method public E(Lv9/f;I)Lw9/h;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lv9/f;->h(I)Lv9/f;

    move-result-object p1

    invoke-virtual {p0, p1}, Lw9/a;->p(Lv9/f;)Lw9/h;

    move-result-object p1

    return-object p1
.end method

.method public F()D
    .locals 2

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Double"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public G(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "deserializer"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lw9/a;->x(Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public H()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lt9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " can\'t retrieve untyped values"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lv9/f;)Lw9/d;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public b(Lv9/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Lv9/f;I)Ljava/lang/String;
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->o()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lv9/f;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->e()Z

    move-result p1

    return p1
.end method

.method public e()Z
    .locals 2

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f()C
    .locals 2

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Char"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0
.end method

.method public final g(Lv9/f;I)F
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->C()F

    move-result p1

    return p1
.end method

.method public final h(Lv9/f;I)S
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->A()S

    move-result p1

    return p1
.end method

.method public final i(Lv9/f;I)C
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->f()C

    move-result p1

    return p1
.end method

.method public final j(Lv9/f;I)D
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->F()D

    move-result-wide p1

    return-wide p1
.end method

.method public k(Lv9/f;)I
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public abstract m()I
.end method

.method public n()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lw9/a;->H()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public p(Lv9/f;)Lw9/h;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public abstract q()J
.end method

.method public s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final t(Lv9/f;I)I
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->m()I

    move-result p1

    return p1
.end method

.method public final u(Lv9/f;I)J
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lw9/a;->q()J

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

.method public synthetic x(Lt9/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw9/g;->a(Lw9/h;Lt9/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract y()B
.end method

.method public final z(Lv9/f;ILt9/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    const-string p2, "descriptor"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "deserializer"

    invoke-static {p3, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Lt9/a;->a()Lv9/f;

    move-result-object p1

    invoke-interface {p1}, Lv9/f;->c()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p0}, Lw9/h;->s()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lw9/h;->n()Ljava/lang/Void;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p3, p4}, Lw9/a;->G(Lt9/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
