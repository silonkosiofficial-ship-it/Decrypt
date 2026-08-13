.class public final Lj1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/d$a;
    }
.end annotation


# static fields
.field public static final i:Lj1/d$a;

.field public static final j:I


# instance fields
.field private final a:I

.field private b:I

.field private c:I

.field private d:F

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/Object;

.field private h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/d$a;-><init>(Ly7/k;)V

    sput-object v0, Lj1/d;->i:Lj1/d$a;

    const/16 v0, 0x8

    sput v0, Lj1/d;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Lj1/d;->a:I

    const v0, 0x7fffffff

    iput v0, p0, Lj1/d;->c:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lj1/d;->d:F

    const-string v0, "WRAP_DIMENSION"

    iput-object v0, p0, Lj1/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Lj1/d;->a:I

    const v0, 0x7fffffff

    iput v0, p0, Lj1/d;->c:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lj1/d;->d:F

    iput-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lj1/g;Lm1/e;I)V
    .locals 6

    .prologue
    const-string p1, "constraintWidget"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lj1/d;->f:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lm1/e;->e1(Ljava/lang/String;)V

    :cond_0
    const-string p1, "PARENT_DIMENSION"

    const v0, 0x7fffffff

    const/4 v1, 0x2

    const-string v2, "PERCENT_DIMENSION"

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "WRAP_DIMENSION"

    if-nez p3, :cond_8

    iget-boolean p3, p0, Lj1/d;->h:Z

    if-eqz p3, :cond_3

    sget-object p1, Lm1/e$b;->E:Lm1/e$b;

    invoke-virtual {p2, p1}, Lm1/e;->r1(Lm1/e$b;)V

    iget-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    iget p1, p0, Lj1/d;->b:I

    iget p3, p0, Lj1/d;->c:I

    iget v0, p0, Lj1/d;->d:F

    invoke-virtual {p2, v1, p1, p3, v0}, Lm1/e;->t1(IIIF)V

    goto/16 :goto_4

    :cond_3
    iget p3, p0, Lj1/d;->b:I

    if-lez p3, :cond_4

    invoke-virtual {p2, p3}, Lm1/e;->H1(I)V

    :cond_4
    iget p3, p0, Lj1/d;->c:I

    if-ge p3, v0, :cond_5

    invoke-virtual {p2, p3}, Lm1/e;->D1(I)V

    :cond_5
    iget-object p3, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    :goto_1
    invoke-virtual {p2, p1}, Lm1/e;->r1(Lm1/e$b;)V

    goto/16 :goto_4

    :cond_6
    invoke-static {p3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lm1/e$b;->F:Lm1/e$b;

    goto :goto_1

    :cond_7
    if-nez p3, :cond_10

    sget-object p1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p2, p1}, Lm1/e;->r1(Lm1/e$b;)V

    iget p1, p0, Lj1/d;->e:I

    invoke-virtual {p2, p1}, Lm1/e;->U1(I)V

    goto :goto_4

    :cond_8
    iget-boolean p3, p0, Lj1/d;->h:Z

    if-eqz p3, :cond_b

    sget-object p1, Lm1/e$b;->E:Lm1/e$b;

    invoke-virtual {p2, p1}, Lm1/e;->P1(Lm1/e$b;)V

    iget-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p1, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move v1, v3

    goto :goto_2

    :cond_9
    iget-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    :cond_a
    move v1, v4

    :goto_2
    iget p1, p0, Lj1/d;->b:I

    iget p3, p0, Lj1/d;->c:I

    iget v0, p0, Lj1/d;->d:F

    invoke-virtual {p2, v1, p1, p3, v0}, Lm1/e;->R1(IIIF)V

    goto :goto_4

    :cond_b
    iget p3, p0, Lj1/d;->b:I

    if-lez p3, :cond_c

    invoke-virtual {p2, p3}, Lm1/e;->G1(I)V

    :cond_c
    iget p3, p0, Lj1/d;->c:I

    if-ge p3, v0, :cond_d

    invoke-virtual {p2, p3}, Lm1/e;->C1(I)V

    :cond_d
    iget-object p3, p0, Lj1/d;->g:Ljava/lang/Object;

    invoke-static {p3, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    sget-object p1, Lm1/e$b;->D:Lm1/e$b;

    :goto_3
    invoke-virtual {p2, p1}, Lm1/e;->P1(Lm1/e$b;)V

    goto :goto_4

    :cond_e
    invoke-static {p3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    sget-object p1, Lm1/e$b;->F:Lm1/e$b;

    goto :goto_3

    :cond_f
    if-nez p3, :cond_10

    sget-object p1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p2, p1}, Lm1/e;->P1(Lm1/e$b;)V

    iget p1, p0, Lj1/d;->e:I

    invoke-virtual {p2, p1}, Lm1/e;->m1(I)V

    :cond_10
    :goto_4
    return-void
.end method

.method public final b(I)Lj1/d;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lj1/d;->g:Ljava/lang/Object;

    iput p1, p0, Lj1/d;->e:I

    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Lj1/d;
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Lj1/d;->e:I

    const/4 p1, 0x0

    iput-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lj1/d;->e:I

    return v0
.end method

.method public final e(I)Lj1/d;
    .locals 1

    .prologue
    iget v0, p0, Lj1/d;->c:I

    if-ltz v0, :cond_0

    iput p1, p0, Lj1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public final f(Ljava/lang/Object;)Lj1/d;
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "WRAP_DIMENSION"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lj1/d;->h:Z

    if-eqz p1, :cond_0

    iput-object v0, p0, Lj1/d;->g:Ljava/lang/Object;

    const p1, 0x7fffffff

    iput p1, p0, Lj1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public final g(I)Lj1/d;
    .locals 0

    .prologue
    if-ltz p1, :cond_0

    iput p1, p0, Lj1/d;->b:I

    :cond_0
    return-object p0
.end method

.method public final h(Ljava/lang/Object;)Lj1/d;
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "WRAP_DIMENSION"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lj1/d;->a:I

    iput p1, p0, Lj1/d;->b:I

    :cond_0
    return-object p0
.end method

.method public final i(Ljava/lang/Object;F)Lj1/d;
    .locals 0

    iput p2, p0, Lj1/d;->d:F

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lj1/d;
    .locals 1

    const-string v0, "ratio"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/d;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final k(I)Lj1/d;
    .locals 1

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lj1/d;->h:Z

    if-ltz p1, :cond_0

    iput p1, p0, Lj1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public final l(Ljava/lang/Object;)Lj1/d;
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/d;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj1/d;->h:Z

    return-object p0
.end method
