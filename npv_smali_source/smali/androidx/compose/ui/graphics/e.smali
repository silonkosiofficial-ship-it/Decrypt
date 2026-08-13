.class final Landroidx/compose/ui/graphics/e;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:F

.field private Q:F

.field private R:F

.field private S:F

.field private T:F

.field private U:F

.field private V:F

.field private W:F

.field private X:F

.field private Y:F

.field private Z:J

.field private a0:Lo0/e2;

.field private b0:Z

.field private c0:J

.field private d0:J

.field private e0:I

.field private f0:Lx7/l;


# direct methods
.method private constructor <init>(FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJI)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    move v1, p1

    iput v1, v0, Landroidx/compose/ui/graphics/e;->P:F

    move v1, p2

    iput v1, v0, Landroidx/compose/ui/graphics/e;->Q:F

    move v1, p3

    iput v1, v0, Landroidx/compose/ui/graphics/e;->R:F

    move v1, p4

    iput v1, v0, Landroidx/compose/ui/graphics/e;->S:F

    move v1, p5

    iput v1, v0, Landroidx/compose/ui/graphics/e;->T:F

    move v1, p6

    iput v1, v0, Landroidx/compose/ui/graphics/e;->U:F

    move v1, p7

    iput v1, v0, Landroidx/compose/ui/graphics/e;->V:F

    move v1, p8

    iput v1, v0, Landroidx/compose/ui/graphics/e;->W:F

    move v1, p9

    iput v1, v0, Landroidx/compose/ui/graphics/e;->X:F

    move v1, p10

    iput v1, v0, Landroidx/compose/ui/graphics/e;->Y:F

    move-wide v1, p11

    iput-wide v1, v0, Landroidx/compose/ui/graphics/e;->Z:J

    move-object/from16 v1, p13

    iput-object v1, v0, Landroidx/compose/ui/graphics/e;->a0:Lo0/e2;

    move/from16 v1, p14

    iput-boolean v1, v0, Landroidx/compose/ui/graphics/e;->b0:Z

    move-wide/from16 v1, p16

    iput-wide v1, v0, Landroidx/compose/ui/graphics/e;->c0:J

    move-wide/from16 v1, p18

    iput-wide v1, v0, Landroidx/compose/ui/graphics/e;->d0:J

    move/from16 v1, p20

    iput v1, v0, Landroidx/compose/ui/graphics/e;->e0:I

    new-instance v1, Landroidx/compose/ui/graphics/e$a;

    invoke-direct {v1, p0}, Landroidx/compose/ui/graphics/e$a;-><init>(Landroidx/compose/ui/graphics/e;)V

    iput-object v1, v0, Landroidx/compose/ui/graphics/e;->f0:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p20}, Landroidx/compose/ui/graphics/e;-><init>(FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJI)V

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/ui/graphics/e;)Lx7/l;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/graphics/e;->f0:Lx7/l;

    return-object p0
.end method


# virtual methods
.method public final A(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/graphics/e;->b0:Z

    return-void
.end method

.method public final B()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->V:F

    return v0
.end method

.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final D(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/graphics/e;->d0:J

    return-void
.end method

.method public final E()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->Q:F

    return v0
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->b(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final N0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/e;->Z:J

    return-wide v0
.end method

.method public final T0(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/graphics/e;->Z:J

    return-void
.end method

.method public final U1()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->R:F

    return v0
.end method

.method public final V1()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/e;->c0:J

    return-wide v0
.end method

.method public final W1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/graphics/e;->b0:Z

    return v0
.end method

.method public final X1()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->e0:I

    return v0
.end method

.method public final Y1()Lo0/Z1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z1()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->U:F

    return v0
.end method

.method public final a2()Lo0/e2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/graphics/e;->a0:Lo0/e2;

    return-object v0
.end method

.method public final b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->R:F

    return-void
.end method

.method public final b2()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/graphics/e;->d0:J

    return-wide v0
.end method

.method public final c(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->W:F

    return-void
.end method

.method public final c2()V
    .locals 3

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-static {p0, v0}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->o2()LF0/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/ui/graphics/e;->f0:Lx7/l;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LF0/d0;->c3(Lx7/l;Z)V

    :cond_0
    return-void
.end method

.method public final d(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->X:F

    return-void
.end method

.method public final e(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->T:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/ui/graphics/e$b;

    invoke-direct {v4, p2, p0}, Landroidx/compose/ui/graphics/e$b;-><init>(LD0/X;Landroidx/compose/ui/graphics/e;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final g(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->Q:F

    return-void
.end method

.method public final h(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->P:F

    return-void
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->S:F

    return-void
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->a(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final l(Lo0/Z1;)V
    .locals 0

    return-void
.end method

.method public final l0(Lo0/e2;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/graphics/e;->a0:Lo0/e2;

    return-void
.end method

.method public final m(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->Y:F

    return-void
.end method

.method public final n(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->V:F

    return-void
.end method

.method public final o()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->P:F

    return v0
.end method

.method public final p(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->U:F

    return-void
.end method

.method public final q(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/graphics/e;->e0:I

    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->W:F

    return v0
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->c(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SimpleGraphicsLayerModifier(scaleX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->P:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", scaleY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->Q:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", alpha = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->R:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", translationX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->S:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", translationY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->T:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", shadowElevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->U:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotationX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->V:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotationY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->W:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rotationZ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->X:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cameraDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->Y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", transformOrigin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/e;->Z:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->i(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/graphics/e;->a0:Lo0/e2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/graphics/e;->b0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", renderEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ambientShadowColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/e;->c0:J

    invoke-static {v1, v2}, Lo0/y0;->v(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spotShadowColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/graphics/e;->d0:J

    invoke-static {v1, v2}, Lo0/y0;->v(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", compositingStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/graphics/e;->e0:I

    invoke-static {v1}, Landroidx/compose/ui/graphics/a;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->X:F

    return v0
.end method

.method public final v()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->T:F

    return v0
.end method

.method public final w(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/graphics/e;->c0:J

    return-void
.end method

.method public final x()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->Y:F

    return v0
.end method

.method public y1()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final z()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/graphics/e;->S:F

    return v0
.end method
