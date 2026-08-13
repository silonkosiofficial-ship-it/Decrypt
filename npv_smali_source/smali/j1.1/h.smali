.class public final Lj1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/h$a;
    }
.end annotation


# static fields
.field public static final v:Lj1/h$a;

.field public static final w:I


# instance fields
.field private a:Lm1/e;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:F

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:I

.field private final t:Ljava/util/HashMap;

.field private u:Lh1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj1/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lj1/h;->v:Lj1/h$a;

    const/16 v0, 0x8

    sput v0, Lj1/h;->w:I

    return-void
.end method

.method public constructor <init>(Lj1/h;)V
    .locals 1

    const-string v0, "frame"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lj1/h;->f:F

    iput v0, p0, Lj1/h;->g:F

    iput v0, p0, Lj1/h;->h:F

    iput v0, p0, Lj1/h;->i:F

    iput v0, p0, Lj1/h;->j:F

    iput v0, p0, Lj1/h;->k:F

    iput v0, p0, Lj1/h;->l:F

    iput v0, p0, Lj1/h;->m:F

    iput v0, p0, Lj1/h;->n:F

    iput v0, p0, Lj1/h;->o:F

    iput v0, p0, Lj1/h;->p:F

    iput v0, p0, Lj1/h;->q:F

    iput v0, p0, Lj1/h;->r:F

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    iget-object v0, p1, Lj1/h;->a:Lm1/e;

    iput-object v0, p0, Lj1/h;->a:Lm1/e;

    iget v0, p1, Lj1/h;->b:I

    iput v0, p0, Lj1/h;->b:I

    iget v0, p1, Lj1/h;->c:I

    iput v0, p0, Lj1/h;->c:I

    iget v0, p1, Lj1/h;->d:I

    iput v0, p0, Lj1/h;->d:I

    iget v0, p1, Lj1/h;->e:I

    iput v0, p0, Lj1/h;->e:I

    invoke-virtual {p0, p1}, Lj1/h;->L(Lj1/h;)V

    return-void
.end method

.method public constructor <init>(Lm1/e;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lj1/h;->f:F

    iput v0, p0, Lj1/h;->g:F

    iput v0, p0, Lj1/h;->h:F

    iput v0, p0, Lj1/h;->i:F

    iput v0, p0, Lj1/h;->j:F

    iput v0, p0, Lj1/h;->k:F

    iput v0, p0, Lj1/h;->l:F

    iput v0, p0, Lj1/h;->m:F

    iput v0, p0, Lj1/h;->n:F

    iput v0, p0, Lj1/h;->o:F

    iput v0, p0, Lj1/h;->p:F

    iput v0, p0, Lj1/h;->q:F

    iput v0, p0, Lj1/h;->r:F

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    iput-object p1, p0, Lj1/h;->a:Lm1/e;

    return-void
.end method

.method private final a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V
    .locals 1

    .prologue
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    .locals 0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ",\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final u(Ljava/lang/StringBuilder;Lm1/d$b;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/h;->a:Lm1/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    return-void

    :cond_2
    const-string v1, "Anchor"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": [\'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/d;->m()Lm1/e;

    move-result-object p2

    invoke-virtual {p2}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_3

    const-string p2, "#PARENT"

    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\', \'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->p()Lm1/d$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lm1/d;->f()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "\'],\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final A(F)V
    .locals 0

    iput p1, p0, Lj1/h;->g:F

    return-void
.end method

.method public final B(F)V
    .locals 0

    iput p1, p0, Lj1/h;->h:F

    return-void
.end method

.method public final C(F)V
    .locals 0

    iput p1, p0, Lj1/h;->i:F

    return-void
.end method

.method public final D(F)V
    .locals 0

    iput p1, p0, Lj1/h;->j:F

    return-void
.end method

.method public final E(F)V
    .locals 0

    iput p1, p0, Lj1/h;->o:F

    return-void
.end method

.method public final F(F)V
    .locals 0

    iput p1, p0, Lj1/h;->p:F

    return-void
.end method

.method public final G(F)V
    .locals 0

    iput p1, p0, Lj1/h;->k:F

    return-void
.end method

.method public final H(F)V
    .locals 0

    iput p1, p0, Lj1/h;->l:F

    return-void
.end method

.method public final I(F)V
    .locals 0

    iput p1, p0, Lj1/h;->m:F

    return-void
.end method

.method public final J(I)V
    .locals 0

    iput p1, p0, Lj1/h;->s:I

    return-void
.end method

.method public final K()Lj1/h;
    .locals 2

    .prologue
    iget-object v0, p0, Lj1/h;->a:Lm1/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm1/e;->C()I

    move-result v1

    iput v1, p0, Lj1/h;->b:I

    invoke-virtual {v0}, Lm1/e;->t0()I

    move-result v1

    iput v1, p0, Lj1/h;->c:I

    invoke-virtual {v0}, Lm1/e;->q0()I

    move-result v1

    iput v1, p0, Lj1/h;->d:I

    invoke-virtual {v0}, Lm1/e;->o()I

    move-result v1

    iput v1, p0, Lj1/h;->e:I

    invoke-virtual {v0}, Lm1/e;->u()Lj1/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj1/h;->L(Lj1/h;)V

    :cond_0
    return-object p0
.end method

.method public final L(Lj1/h;)V
    .locals 3

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lj1/h;->f:F

    iput v0, p0, Lj1/h;->f:F

    iget v0, p1, Lj1/h;->g:F

    iput v0, p0, Lj1/h;->g:F

    iget v0, p1, Lj1/h;->h:F

    iput v0, p0, Lj1/h;->h:F

    iget v0, p1, Lj1/h;->i:F

    iput v0, p0, Lj1/h;->i:F

    iget v0, p1, Lj1/h;->j:F

    iput v0, p0, Lj1/h;->j:F

    iget v0, p1, Lj1/h;->k:F

    iput v0, p0, Lj1/h;->k:F

    iget v0, p1, Lj1/h;->l:F

    iput v0, p0, Lj1/h;->l:F

    iget v0, p1, Lj1/h;->m:F

    iput v0, p0, Lj1/h;->m:F

    iget v0, p1, Lj1/h;->o:F

    iput v0, p0, Lj1/h;->o:F

    iget v0, p1, Lj1/h;->p:F

    iput v0, p0, Lj1/h;->p:F

    iget v0, p1, Lj1/h;->q:F

    iput v0, p0, Lj1/h;->q:F

    iget v0, p1, Lj1/h;->s:I

    iput v0, p0, Lj1/h;->s:I

    iget-object v0, p1, Lj1/h;->u:Lh1/a;

    invoke-virtual {p0, v0}, Lj1/h;->y(Lh1/a;)V

    iget-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object p1, p1, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/a;

    iget-object v1, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {v0}, Lg1/a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lg1/a;->a()Lg1/a;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lj1/h;->q:F

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    iget-object v0, p0, Lj1/h;->a:Lm1/e;

    if-nez v0, :cond_0

    const-string v0, "unknown"

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lj1/h;->b:I

    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lj1/h;->f:F

    return v0
.end method

.method public final g()F
    .locals 1

    iget v0, p0, Lj1/h;->g:F

    return v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, Lj1/h;->h:F

    return v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, Lj1/h;->i:F

    return v0
.end method

.method public final j()F
    .locals 1

    iget v0, p0, Lj1/h;->j:F

    return v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Lj1/h;->o:F

    return v0
.end method

.method public final l()F
    .locals 1

    iget v0, p0, Lj1/h;->p:F

    return v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Lj1/h;->c:I

    return v0
.end method

.method public final n()F
    .locals 1

    iget v0, p0, Lj1/h;->k:F

    return v0
.end method

.method public final o()F
    .locals 1

    iget v0, p0, Lj1/h;->l:F

    return v0
.end method

.method public final p()F
    .locals 1

    iget v0, p0, Lj1/h;->m:F

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Lj1/h;->s:I

    return v0
.end method

.method public final r()Lm1/e;
    .locals 1

    iget-object v0, p0, Lj1/h;->a:Lm1/e;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    .prologue
    iget v0, p0, Lj1/h;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->j:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->k:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->l:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->o:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->p:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lj1/h;->q:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;
    .locals 6

    .prologue
    const-string v0, "ret"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "{\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "left"

    iget v1, p0, Lj1/h;->b:I

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    const-string v0, "top"

    iget v1, p0, Lj1/h;->c:I

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    const-string v0, "right"

    iget v1, p0, Lj1/h;->d:I

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    const-string v0, "bottom"

    iget v1, p0, Lj1/h;->e:I

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    const-string v0, "pivotX"

    iget v1, p0, Lj1/h;->f:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "pivotY"

    iget v1, p0, Lj1/h;->g:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "rotationX"

    iget v1, p0, Lj1/h;->h:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "rotationY"

    iget v1, p0, Lj1/h;->i:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "rotationZ"

    iget v1, p0, Lj1/h;->j:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "translationX"

    iget v1, p0, Lj1/h;->k:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "translationY"

    iget v1, p0, Lj1/h;->l:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "translationZ"

    iget v1, p0, Lj1/h;->m:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "scaleX"

    iget v1, p0, Lj1/h;->o:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "scaleY"

    iget v1, p0, Lj1/h;->p:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "alpha"

    iget v1, p0, Lj1/h;->q:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    const-string v0, "visibility"

    iget v1, p0, Lj1/h;->s:I

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->b(Ljava/lang/StringBuilder;Ljava/lang/String;I)V

    const-string v0, "interpolatedPos"

    iget v1, p0, Lj1/h;->r:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    iget-object v0, p0, Lj1/h;->a:Lm1/e;

    if-eqz v0, :cond_0

    invoke-static {}, Lm1/d$b;->g()Lp7/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/d$b;

    invoke-direct {p0, p1, v1}, Lj1/h;->u(Ljava/lang/StringBuilder;Lm1/d$b;)V

    goto :goto_0

    :cond_0
    const-string v0, "phone_orientation"

    if-eqz p2, :cond_1

    iget v1, p0, Lj1/h;->n:F

    invoke-direct {p0, p1, v0, v1}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    :cond_1
    if-eqz p2, :cond_2

    iget p2, p0, Lj1/h;->n:F

    invoke-direct {p0, p1, v0, p2}, Lj1/h;->a(Ljava/lang/StringBuilder;Ljava/lang/String;F)V

    :cond_2
    iget-object p2, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result p2

    const-string v0, "}\n"

    if-eqz p2, :cond_4

    const-string p2, "custom : {\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v2, Lg1/a;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lg1/a;->g()I

    move-result v1

    const-string v3, ",\n"

    const-string v4, "\',\n"

    const-string v5, "\'"

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lg1/a;->b()Z

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    goto :goto_3

    :pswitch_1
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lg1/a;->f()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lg1/a;->g:Lg1/a$a;

    invoke-virtual {v2}, Lg1/a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lg1/a$a;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :pswitch_3
    invoke-virtual {v2}, Lg1/a;->c()F

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :goto_4
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    invoke-virtual {v2}, Lg1/a;->d()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final v(F)V
    .locals 0

    iput p1, p0, Lj1/h;->q:F

    return-void
.end method

.method public final w(Ljava/lang/String;IF)V
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, Lg1/a;

    invoke-virtual {p1, p3}, Lg1/a;->h(F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    new-instance v1, Lg1/a;

    invoke-direct {v1, p1, p2, p3}, Lg1/a;-><init>(Ljava/lang/String;IF)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final x(Ljava/lang/String;II)V
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lj1/h;->t:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast p1, Lg1/a;

    invoke-virtual {p1, p3}, Lg1/a;->i(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj1/h;->t:Ljava/util/HashMap;

    new-instance v1, Lg1/a;

    invoke-direct {v1, p1, p2, p3}, Lg1/a;-><init>(Ljava/lang/String;II)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final y(Lh1/a;)V
    .locals 0

    iput-object p1, p0, Lj1/h;->u:Lh1/a;

    return-void
.end method

.method public final z(F)V
    .locals 0

    iput p1, p0, Lj1/h;->f:F

    return-void
.end method
