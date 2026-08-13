.class public Lj1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj1/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/a$a;,
        Lj1/a$b;
    }
.end annotation


# static fields
.field public static final m0:Lj1/a$a;

.field public static final n0:I


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private E:F

.field private F:F

.field private G:F

.field private H:F

.field private I:F

.field private J:I

.field private K:Ljava/lang/Object;

.field private L:Ljava/lang/Object;

.field private M:Ljava/lang/Object;

.field private N:Ljava/lang/Object;

.field private O:Ljava/lang/Object;

.field private P:Ljava/lang/Object;

.field private Q:Ljava/lang/Object;

.field private R:Ljava/lang/Object;

.field private S:Ljava/lang/Object;

.field private T:Ljava/lang/Object;

.field private U:Ljava/lang/Object;

.field private V:Ljava/lang/Object;

.field private W:Ljava/lang/Object;

.field private X:Ljava/lang/Object;

.field private Y:Ljava/lang/Object;

.field private Z:Ljava/lang/Object;

.field private a:Ljava/lang/Object;

.field private a0:Ljava/lang/Object;

.field private b:Lj1/g;

.field private b0:Ljava/lang/Object;

.field private c:Ljava/lang/String;

.field private c0:F

.field private d:Lk1/e;

.field private d0:F

.field private e:I

.field private e0:Lj1/g$c;

.field private f:I

.field private f0:Lj1/d;

.field private g:F

.field private g0:Lj1/d;

.field private h:F

.field private h0:Ljava/lang/Object;

.field private i:F

.field private i0:Lm1/e;

.field private j:F

.field private final j0:Ljava/util/HashMap;

.field private k:I

.field private k0:Ljava/util/HashMap;

.field private l:I

.field private l0:Lh1/a;

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lj1/a;->m0:Lj1/a$a;

    const/16 v0, 0x8

    sput v0, Lj1/a;->n0:I

    return-void
.end method

.method public constructor <init>(Lj1/g;)V
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lj1/a;->g:F

    iput v0, p0, Lj1/a;->h:F

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lj1/a;->i:F

    iput v0, p0, Lj1/a;->j:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lj1/a;->y:F

    iput v0, p0, Lj1/a;->z:F

    iput v0, p0, Lj1/a;->A:F

    iput v0, p0, Lj1/a;->B:F

    iput v0, p0, Lj1/a;->C:F

    iput v0, p0, Lj1/a;->D:F

    iput v0, p0, Lj1/a;->E:F

    iput v0, p0, Lj1/a;->F:F

    iput v0, p0, Lj1/a;->G:F

    iput v0, p0, Lj1/a;->H:F

    iput v0, p0, Lj1/a;->I:F

    sget-object v0, Lj1/d;->i:Lj1/d$a;

    const-string v1, "WRAP_DIMENSION"

    invoke-virtual {v0, v1}, Lj1/d$a;->b(Ljava/lang/Object;)Lj1/d;

    move-result-object v2

    iput-object v2, p0, Lj1/a;->f0:Lj1/d;

    invoke-virtual {v0, v1}, Lj1/d$a;->b(Ljava/lang/Object;)Lj1/d;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->g0:Lj1/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj1/a;->j0:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj1/a;->k0:Ljava/util/HashMap;

    iput-object p1, p0, Lj1/a;->b:Lj1/g;

    return-void
.end method

.method private final A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of v0, p1, Lj1/a;

    if-nez v0, :cond_1

    iget-object v0, p0, Lj1/a;->b:Lj1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/g;->u(Ljava/lang/Object;)Lj1/f;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private final c0(Ljava/lang/Object;)Lm1/e;
    .locals 1

    .prologue
    instance-of v0, p1, Lj1/f;

    if-eqz v0, :cond_0

    check-cast p1, Lj1/f;

    invoke-interface {p1}, Lj1/f;->a()Lm1/e;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V
    .locals 6

    .prologue
    invoke-direct {p0, p2}, Lj1/a;->c0(Ljava/lang/Object;)Lm1/e;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object p2, Lj1/a$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    const/4 p3, 0x0

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_a

    :pswitch_0
    iget p2, p0, Lj1/a;->c0:F

    iget p3, p0, Lj1/a;->d0:F

    float-to-int p3, p3

    invoke-virtual {p1, v2, p2, p3}, Lm1/e;->i(Lm1/e;FI)V

    goto/16 :goto_a

    :pswitch_1
    sget-object v3, Lm1/d$b;->H:Lm1/d$b;

    iget v4, p0, Lj1/a;->w:I

    iget v5, p0, Lj1/a;->x:I

    move-object v0, p1

    move-object v1, v3

    :goto_0
    invoke-virtual/range {v0 .. v5}, Lm1/e;->I0(Lm1/d$b;Lm1/e;Lm1/d$b;II)V

    goto/16 :goto_a

    :pswitch_2
    sget-object v1, Lm1/d$b;->H:Lm1/d$b;

    sget-object v3, Lm1/d$b;->E:Lm1/d$b;

    :goto_1
    iget v4, p0, Lj1/a;->w:I

    iget v5, p0, Lj1/a;->x:I

    :goto_2
    move-object v0, p1

    goto :goto_0

    :pswitch_3
    sget-object v1, Lm1/d$b;->H:Lm1/d$b;

    sget-object v3, Lm1/d$b;->G:Lm1/d$b;

    goto :goto_1

    :pswitch_4
    sget-object v1, Lm1/d$b;->G:Lm1/d$b;

    sget-object v3, Lm1/d$b;->H:Lm1/d$b;

    iget v4, p0, Lj1/a;->p:I

    iget v5, p0, Lj1/a;->v:I

    goto :goto_2

    :pswitch_5
    sget-object p2, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->p:I

    iget v1, p0, Lj1/a;->v:I

    :goto_4
    invoke-virtual {p1, p2, v0, v1, p3}, Lm1/d;->b(Lm1/d;IIZ)Z

    goto/16 :goto_a

    :pswitch_6
    sget-object p2, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->E:Lm1/d$b;

    goto :goto_3

    :pswitch_7
    sget-object v1, Lm1/d$b;->E:Lm1/d$b;

    sget-object v3, Lm1/d$b;->H:Lm1/d$b;

    iget v4, p0, Lj1/a;->o:I

    iget v5, p0, Lj1/a;->u:I

    goto :goto_2

    :pswitch_8
    sget-object p2, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->G:Lm1/d$b;

    :goto_5
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->o:I

    iget v1, p0, Lj1/a;->u:I

    goto :goto_4

    :pswitch_9
    sget-object p2, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_a
    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_6
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->n:I

    iget v1, p0, Lj1/a;->t:I

    goto :goto_4

    :pswitch_b
    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    goto :goto_6

    :pswitch_c
    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    :goto_7
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->m:I

    iget v1, p0, Lj1/a;->s:I

    goto :goto_4

    :pswitch_d
    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_7

    :pswitch_e
    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_8
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->l:I

    iget v1, p0, Lj1/a;->r:I

    goto/16 :goto_4

    :pswitch_f
    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    goto :goto_8

    :pswitch_10
    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object p2, Lm1/d$b;->F:Lm1/d$b;

    :goto_9
    invoke-virtual {v2, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p2

    iget v0, p0, Lj1/a;->k:I

    iget v1, p0, Lj1/a;->q:I

    goto/16 :goto_4

    :pswitch_11
    sget-object p2, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {p1, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_9

    :goto_a
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final w()V
    .locals 1

    iget-object v0, p0, Lj1/a;->K:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->K:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->L:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->L:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->M:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->M:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->N:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->N:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->O:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->O:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->P:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->P:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->Q:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->Q:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->R:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->R:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->S:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->S:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->T:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->T:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->V:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->V:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->W:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->W:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->Y:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->Y:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->Z:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->Z:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->a0:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj1/a;->a0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lj1/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public final B()Lj1/d;
    .locals 1

    iget-object v0, p0, Lj1/a;->g0:Lj1/d;

    return-object v0
.end method

.method public final B0(Lh1/a;)V
    .locals 0

    iput-object p1, p0, Lj1/a;->l0:Lh1/a;

    return-void
.end method

.method protected final C()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->W:Ljava/lang/Object;

    return-object v0
.end method

.method public final C0(Ljava/lang/String;)V
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/a;->c:Ljava/lang/String;

    return-void
.end method

.method protected final D()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->V:Ljava/lang/Object;

    return-object v0
.end method

.method public final D0(I)V
    .locals 0

    iput p1, p0, Lj1/a;->f:I

    return-void
.end method

.method protected final E()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->R:Ljava/lang/Object;

    return-object v0
.end method

.method public final E0(F)V
    .locals 0

    iput p1, p0, Lj1/a;->h:F

    return-void
.end method

.method protected final F()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->Q:Ljava/lang/Object;

    return-object v0
.end method

.method public final F0(Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/a;->h0:Ljava/lang/Object;

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lm1/e;->b1(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected final G()F
    .locals 1

    iget v0, p0, Lj1/a;->i:F

    return v0
.end method

.method public final G0(Lj1/d;)Lj1/a;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/a;->f0:Lj1/d;

    return-object p0
.end method

.method protected final H()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public final H0()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->O:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->G:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->H:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method protected final I()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->L:Ljava/lang/Object;

    return-object v0
.end method

.method public final I0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->H:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->P:Ljava/lang/Object;

    return-object p0
.end method

.method protected final J()I
    .locals 1

    iget v0, p0, Lj1/a;->p:I

    return v0
.end method

.method public final J0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->G:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->O:Ljava/lang/Object;

    return-object p0
.end method

.method protected final K()I
    .locals 1

    iget v0, p0, Lj1/a;->v:I

    return v0
.end method

.method public final K0()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->S:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->K:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->L:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method protected final L()I
    .locals 1

    iget v0, p0, Lj1/a;->n:I

    return v0
.end method

.method public final L0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->M:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->U:Ljava/lang/Object;

    return-object p0
.end method

.method protected final M()I
    .locals 1

    iget v0, p0, Lj1/a;->t:I

    return v0
.end method

.method public final M0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->L:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->T:Ljava/lang/Object;

    return-object p0
.end method

.method protected final N()I
    .locals 1

    iget v0, p0, Lj1/a;->k:I

    return v0
.end method

.method public final N0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->K:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->S:Ljava/lang/Object;

    return-object p0
.end method

.method protected final O()I
    .locals 1

    iget v0, p0, Lj1/a;->q:I

    return v0
.end method

.method public final O0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->D:F

    return-object p0
.end method

.method protected final P()I
    .locals 1

    iget v0, p0, Lj1/a;->l:I

    return v0
.end method

.method public final P0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->E:F

    return-object p0
.end method

.method protected final Q()I
    .locals 1

    iget v0, p0, Lj1/a;->r:I

    return v0
.end method

.method public final Q0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->F:F

    return-object p0
.end method

.method protected final R()I
    .locals 1

    iget v0, p0, Lj1/a;->m:I

    return v0
.end method

.method public final R0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->j:F

    return-object p0
.end method

.method protected final S()I
    .locals 1

    iget v0, p0, Lj1/a;->s:I

    return v0
.end method

.method public final S0(I)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->J:I

    return-object p0
.end method

.method protected final T()I
    .locals 1

    iget v0, p0, Lj1/a;->o:I

    return v0
.end method

.method protected final U()I
    .locals 1

    iget v0, p0, Lj1/a;->u:I

    return v0
.end method

.method protected final V()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->M:Ljava/lang/Object;

    return-object v0
.end method

.method protected final W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->N:Ljava/lang/Object;

    return-object v0
.end method

.method protected final X()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->P:Ljava/lang/Object;

    return-object v0
.end method

.method protected final Y()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->O:Ljava/lang/Object;

    return-object v0
.end method

.method protected final Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->T:Ljava/lang/Object;

    return-object v0
.end method

.method public a()Lm1/e;
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj1/a;->v()Lm1/e;

    move-result-object v0

    iget-object v1, p0, Lj1/a;->h0:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lm1/e;->b1(Ljava/lang/Object;)V

    iput-object v0, p0, Lj1/a;->i0:Lm1/e;

    :cond_0
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    return-object v0
.end method

.method protected final a0()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->S:Ljava/lang/Object;

    return-object v0
.end method

.method public apply()V
    .locals 5

    .prologue
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lj1/a;->d:Lk1/e;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Lk1/e;->apply()V

    :cond_1
    iget-object v0, p0, Lj1/a;->f0:Lj1/d;

    iget-object v1, p0, Lj1/a;->b:Lj1/g;

    iget-object v2, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    iget-object v0, p0, Lj1/a;->g0:Lj1/d;

    iget-object v1, p0, Lj1/a;->b:Lj1/g;

    iget-object v2, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    invoke-direct {p0}, Lj1/a;->w()V

    invoke-virtual {p0}, Lj1/a;->h()V

    iget v0, p0, Lj1/a;->e:I

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->e:I

    invoke-virtual {v0, v1}, Lm1/e;->p1(I)V

    :cond_2
    iget v0, p0, Lj1/a;->f:I

    if-eqz v0, :cond_3

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->f:I

    invoke-virtual {v0, v1}, Lm1/e;->N1(I)V

    :cond_3
    iget v0, p0, Lj1/a;->g:F

    const/high16 v1, -0x40800000    # -1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v2, p0, Lj1/a;->g:F

    invoke-virtual {v0, v2}, Lm1/e;->u1(F)V

    :goto_0
    iget v0, p0, Lj1/a;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->h:F

    invoke-virtual {v0, v1}, Lm1/e;->S1(F)V

    :goto_1
    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->i:F

    invoke-virtual {v0, v1}, Lm1/e;->n1(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->j:F

    invoke-virtual {v0, v1}, Lm1/e;->L1(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->y:F

    invoke-virtual {v0, v1}, Lj1/h;->z(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->z:F

    invoke-virtual {v0, v1}, Lj1/h;->A(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->A:F

    invoke-virtual {v0, v1}, Lj1/h;->B(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->B:F

    invoke-virtual {v0, v1}, Lj1/h;->C(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->C:F

    invoke-virtual {v0, v1}, Lj1/h;->D(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->D:F

    invoke-virtual {v0, v1}, Lj1/h;->G(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->E:F

    invoke-virtual {v0, v1}, Lj1/h;->H(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->F:F

    invoke-virtual {v0, v1}, Lj1/h;->I(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->H:F

    invoke-virtual {v0, v1}, Lj1/h;->E(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->I:F

    invoke-virtual {v0, v1}, Lj1/h;->F(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->G:F

    invoke-virtual {v0, v1}, Lj1/h;->v(F)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget v1, p0, Lj1/a;->J:I

    invoke-virtual {v0, v1}, Lj1/h;->J(I)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lj1/a;->J:I

    invoke-virtual {v0, v1}, Lm1/e;->T1(I)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    iget-object v1, p0, Lj1/a;->l0:Lh1/a;

    invoke-virtual {v0, v1}, Lj1/h;->y(Lh1/a;)V

    iget-object v0, p0, Lj1/a;->j0:Ljava/util/HashMap;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lj1/a;->j0:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v3, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->u()Lj1/h;

    move-result-object v3

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/16 v4, 0x386

    invoke-virtual {v3, v1, v4, v2}, Lj1/h;->x(Ljava/lang/String;II)V

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lj1/a;->k0:Ljava/util/HashMap;

    if-eqz v0, :cond_7

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lj1/a;->k0:Ljava/util/HashMap;

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->u()Lj1/h;

    move-result-object v3

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    const/16 v4, 0x385

    invoke-virtual {v3, v1, v4, v2}, Lj1/h;->w(Ljava/lang/String;IF)V

    goto :goto_3

    :cond_7
    return-void
.end method

.method public b(Lm1/e;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lj1/a;->h0:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lm1/e;->b1(Ljava/lang/Object;)V

    return-void
.end method

.method protected final b0()F
    .locals 1

    iget v0, p0, Lj1/a;->j:F

    return v0
.end method

.method public c()Lk1/e;
    .locals 1

    iget-object v0, p0, Lj1/a;->d:Lk1/e;

    return-object v0
.end method

.method public final d(Ljava/lang/String;I)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lj1/a;->j0:Ljava/util/HashMap;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d0()Lj1/d;
    .locals 1

    iget-object v0, p0, Lj1/a;->f0:Lj1/d;

    return-object v0
.end method

.method public final e(Ljava/lang/String;F)V
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->k0:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj1/a;->k0:Ljava/util/HashMap;

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget-object v0, p0, Lj1/a;->k0:Ljava/util/HashMap;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final e0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->i:F

    return-object p0
.end method

.method public final f(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->G:F

    return-object p0
.end method

.method public final f0()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->K:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->C:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->D:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public final g0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->C:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->K:Ljava/lang/Object;

    return-object p0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj1/a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->K:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->C:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->L:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->D:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->M:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->E:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->N:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->F:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->O:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->G:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->P:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->H:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->Q:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->I:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->R:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->J:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->S:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->K:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->T:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->L:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->U:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->M:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->V:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->N:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->W:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->O:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->X:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->P:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->Y:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->Q:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->Z:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->R:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->a0:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->S:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    iget-object v0, p0, Lj1/a;->i0:Lm1/e;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Lj1/a;->b0:Ljava/lang/Object;

    sget-object v2, Lj1/g$c;->V:Lj1/g$c;

    invoke-direct {p0, v0, v1, v2}, Lj1/a;->g(Lm1/e;Ljava/lang/Object;Lj1/g$c;)V

    return-void
.end method

.method public final h0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->D:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->L:Ljava/lang/Object;

    return-object p0
.end method

.method public final i()Lj1/a;
    .locals 1

    sget-object v0, Lj1/g$c;->Q:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public i0(I)Lj1/a;
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lj1/a$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    int-to-float p1, p1

    iput p1, p0, Lj1/a;->d0:F

    goto :goto_2

    :pswitch_1
    iput p1, p0, Lj1/a;->w:I

    goto :goto_2

    :goto_1
    :pswitch_2
    iput p1, p0, Lj1/a;->p:I

    goto :goto_2

    :pswitch_3
    iput p1, p0, Lj1/a;->o:I

    goto :goto_2

    :pswitch_4
    iput p1, p0, Lj1/a;->n:I

    goto :goto_2

    :pswitch_5
    iput p1, p0, Lj1/a;->m:I

    goto :goto_2

    :pswitch_6
    iput p1, p0, Lj1/a;->l:I

    goto :goto_2

    :pswitch_7
    iput p1, p0, Lj1/a;->k:I

    goto :goto_2

    :cond_1
    iput p1, p0, Lj1/a;->k:I

    iput p1, p0, Lj1/a;->l:I

    iput p1, p0, Lj1/a;->m:I

    iput p1, p0, Lj1/a;->n:I

    iput p1, p0, Lj1/a;->o:I

    goto :goto_1

    :goto_2
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->Q:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->Y:Ljava/lang/Object;

    return-object p0
.end method

.method public j0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "marginValue"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/a;->b:Lj1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lj1/a;->i0(I)Lj1/a;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->S:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->a0:Ljava/lang/Object;

    return-object p0
.end method

.method public final k0(I)Lj1/a;
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lj1/a$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iput p1, p0, Lj1/a;->x:I

    goto :goto_2

    :goto_1
    :pswitch_1
    iput p1, p0, Lj1/a;->v:I

    goto :goto_2

    :pswitch_2
    iput p1, p0, Lj1/a;->u:I

    goto :goto_2

    :pswitch_3
    iput p1, p0, Lj1/a;->t:I

    goto :goto_2

    :pswitch_4
    iput p1, p0, Lj1/a;->s:I

    goto :goto_2

    :pswitch_5
    iput p1, p0, Lj1/a;->r:I

    goto :goto_2

    :pswitch_6
    iput p1, p0, Lj1/a;->q:I

    goto :goto_2

    :cond_1
    iput p1, p0, Lj1/a;->q:I

    iput p1, p0, Lj1/a;->r:I

    iput p1, p0, Lj1/a;->s:I

    iput p1, p0, Lj1/a;->t:I

    iput p1, p0, Lj1/a;->u:I

    goto :goto_1

    :goto_2
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->R:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->Z:Ljava/lang/Object;

    return-object p0
.end method

.method public final l0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "marginGoneValue"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/a;->b:Lj1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lj1/a;->k0(I)Lj1/a;

    move-result-object p1

    return-object p1
.end method

.method public final m()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->V:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->N:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->O:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public final m0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->y:F

    return-object p0
.end method

.method public final n(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->P:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->X:Ljava/lang/Object;

    return-object p0
.end method

.method public final n0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->z:F

    return-object p0
.end method

.method public final o(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->O:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->W:Ljava/lang/Object;

    return-object p0
.end method

.method public final o0()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->M:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->E:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->F:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public final p(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->N:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->V:Ljava/lang/Object;

    return-object p0
.end method

.method public final p0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->E:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->M:Ljava/lang/Object;

    return-object p0
.end method

.method public final q(Ljava/lang/Object;FF)Lj1/a;
    .locals 0

    invoke-direct {p0, p1}, Lj1/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj1/a;->b0:Ljava/lang/Object;

    iput p2, p0, Lj1/a;->c0:F

    iput p3, p0, Lj1/a;->d0:F

    sget-object p1, Lj1/g$c;->V:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public final q0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->F:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->N:Ljava/lang/Object;

    return-object p0
.end method

.method public final r()Lj1/a;
    .locals 3

    .prologue
    iget-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lj1/a$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    :pswitch_1
    iput-object v2, p0, Lj1/a;->b0:Ljava/lang/Object;

    goto :goto_1

    :pswitch_2
    iput-object v2, p0, Lj1/a;->Y:Ljava/lang/Object;

    goto :goto_1

    :pswitch_3
    iput-object v2, p0, Lj1/a;->V:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->W:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->X:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->p:I

    iput v1, p0, Lj1/a;->v:I

    goto :goto_1

    :pswitch_4
    iput-object v2, p0, Lj1/a;->S:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->T:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->U:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->o:I

    iput v1, p0, Lj1/a;->u:I

    goto :goto_1

    :pswitch_5
    iput-object v2, p0, Lj1/a;->Q:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->R:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->n:I

    iput v1, p0, Lj1/a;->t:I

    goto :goto_1

    :pswitch_6
    iput-object v2, p0, Lj1/a;->O:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->P:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->m:I

    iput v1, p0, Lj1/a;->s:I

    goto :goto_1

    :pswitch_7
    iput-object v2, p0, Lj1/a;->M:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->N:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->l:I

    iput v1, p0, Lj1/a;->r:I

    goto :goto_1

    :pswitch_8
    iput-object v2, p0, Lj1/a;->K:Ljava/lang/Object;

    iput-object v2, p0, Lj1/a;->L:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->k:I

    iput v1, p0, Lj1/a;->q:I

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lj1/a;->s()Lj1/a;

    :goto_1
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final r0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->A:F

    return-object p0
.end method

.method public final s()Lj1/a;
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lj1/a;->K:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->L:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lj1/a;->k:I

    iput-object v0, p0, Lj1/a;->M:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->N:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->l:I

    iput-object v0, p0, Lj1/a;->O:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->P:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->m:I

    iput-object v0, p0, Lj1/a;->Q:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->R:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->n:I

    iput-object v0, p0, Lj1/a;->S:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->T:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->o:I

    iput-object v0, p0, Lj1/a;->V:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->W:Ljava/lang/Object;

    iput v1, p0, Lj1/a;->p:I

    iput-object v0, p0, Lj1/a;->Y:Ljava/lang/Object;

    iput-object v0, p0, Lj1/a;->b0:Ljava/lang/Object;

    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lj1/a;->i:F

    iput v0, p0, Lj1/a;->j:F

    iput v1, p0, Lj1/a;->q:I

    iput v1, p0, Lj1/a;->r:I

    iput v1, p0, Lj1/a;->s:I

    iput v1, p0, Lj1/a;->t:I

    iput v1, p0, Lj1/a;->u:I

    iput v1, p0, Lj1/a;->v:I

    return-object p0
.end method

.method public final s0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->B:F

    return-object p0
.end method

.method public final t()Lj1/a;
    .locals 1

    invoke-virtual {p0}, Lj1/a;->H0()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->x()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->f0()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->o0()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    return-object p0
.end method

.method public final t0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->C:F

    return-object p0
.end method

.method public final u()Lj1/a;
    .locals 1

    invoke-virtual {p0}, Lj1/a;->K0()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->i()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->m()Lj1/a;

    move-result-object v0

    invoke-virtual {v0}, Lj1/a;->r()Lj1/a;

    return-object p0
.end method

.method public final u0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->H:F

    return-object p0
.end method

.method public final v()Lm1/e;
    .locals 3

    new-instance v0, Lm1/e;

    invoke-virtual {p0}, Lj1/a;->d0()Lj1/d;

    move-result-object v1

    invoke-virtual {v1}, Lj1/d;->d()I

    move-result v1

    invoke-virtual {p0}, Lj1/a;->B()Lj1/d;

    move-result-object v2

    invoke-virtual {v2}, Lj1/d;->d()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lm1/e;-><init>(II)V

    return-object v0
.end method

.method public final v0(F)Lj1/a;
    .locals 0

    iput p1, p0, Lj1/a;->I:F

    return-object p0
.end method

.method public final w0(Lk1/e;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lj1/a;->d:Lk1/e;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lk1/e;->a()Lm1/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj1/a;->b(Lm1/e;)V

    :cond_0
    return-void
.end method

.method public final x()Lj1/a;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/a;->Q:Ljava/lang/Object;

    if-eqz v0, :cond_0

    sget-object v0, Lj1/g$c;->I:Lj1/g$c;

    goto :goto_0

    :cond_0
    sget-object v0, Lj1/g$c;->J:Lj1/g$c;

    :goto_0
    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    return-object p0
.end method

.method public final x0(Lj1/d;)Lj1/a;
    .locals 1

    const-string v0, "dimension"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lj1/a;->g0:Lj1/d;

    return-object p0
.end method

.method public final y(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->J:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->R:Ljava/lang/Object;

    return-object p0
.end method

.method public final y0(I)V
    .locals 0

    iput p1, p0, Lj1/a;->e:I

    return-void
.end method

.method public final z(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$c;->I:Lj1/g$c;

    iput-object v0, p0, Lj1/a;->e0:Lj1/g$c;

    iput-object p1, p0, Lj1/a;->Q:Ljava/lang/Object;

    return-object p0
.end method

.method public final z0(F)V
    .locals 0

    iput p1, p0, Lj1/a;->g:F

    return-void
.end method
