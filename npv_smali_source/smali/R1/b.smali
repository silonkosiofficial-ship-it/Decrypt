.class public abstract LR1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR1/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR1/b$o;,
        LR1/b$p;
    }
.end annotation


# static fields
.field public static final m:LR1/b$p;

.field public static final n:LR1/b$p;

.field public static final o:LR1/b$p;

.field public static final p:LR1/b$p;

.field public static final q:LR1/b$p;

.field public static final r:LR1/b$p;

.field public static final s:LR1/b$p;

.field public static final t:LR1/b$p;

.field public static final u:LR1/b$p;

.field public static final v:LR1/b$p;

.field public static final w:LR1/b$p;

.field public static final x:LR1/b$p;

.field public static final y:LR1/b$p;

.field public static final z:LR1/b$p;


# instance fields
.field a:F

.field b:F

.field c:Z

.field final d:Ljava/lang/Object;

.field final e:LR1/c;

.field f:Z

.field g:F

.field h:F

.field private i:J

.field private j:F

.field private final k:Ljava/util/ArrayList;

.field private final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR1/b$f;

    const-string v1, "translationX"

    invoke-direct {v0, v1}, LR1/b$f;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->m:LR1/b$p;

    new-instance v0, LR1/b$g;

    const-string v1, "translationY"

    invoke-direct {v0, v1}, LR1/b$g;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->n:LR1/b$p;

    new-instance v0, LR1/b$h;

    const-string v1, "translationZ"

    invoke-direct {v0, v1}, LR1/b$h;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->o:LR1/b$p;

    new-instance v0, LR1/b$i;

    const-string v1, "scaleX"

    invoke-direct {v0, v1}, LR1/b$i;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->p:LR1/b$p;

    new-instance v0, LR1/b$j;

    const-string v1, "scaleY"

    invoke-direct {v0, v1}, LR1/b$j;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->q:LR1/b$p;

    new-instance v0, LR1/b$k;

    const-string v1, "rotation"

    invoke-direct {v0, v1}, LR1/b$k;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->r:LR1/b$p;

    new-instance v0, LR1/b$l;

    const-string v1, "rotationX"

    invoke-direct {v0, v1}, LR1/b$l;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->s:LR1/b$p;

    new-instance v0, LR1/b$m;

    const-string v1, "rotationY"

    invoke-direct {v0, v1}, LR1/b$m;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->t:LR1/b$p;

    new-instance v0, LR1/b$n;

    const-string v1, "x"

    invoke-direct {v0, v1}, LR1/b$n;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->u:LR1/b$p;

    new-instance v0, LR1/b$a;

    const-string v1, "y"

    invoke-direct {v0, v1}, LR1/b$a;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->v:LR1/b$p;

    new-instance v0, LR1/b$b;

    const-string v1, "z"

    invoke-direct {v0, v1}, LR1/b$b;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->w:LR1/b$p;

    new-instance v0, LR1/b$c;

    const-string v1, "alpha"

    invoke-direct {v0, v1}, LR1/b$c;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->x:LR1/b$p;

    new-instance v0, LR1/b$d;

    const-string v1, "scrollX"

    invoke-direct {v0, v1}, LR1/b$d;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->y:LR1/b$p;

    new-instance v0, LR1/b$e;

    const-string v1, "scrollY"

    invoke-direct {v0, v1}, LR1/b$e;-><init>(Ljava/lang/String;)V

    sput-object v0, LR1/b;->z:LR1/b$p;

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;LR1/c;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LR1/b;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, LR1/b;->b:F

    const/4 v1, 0x0

    iput-boolean v1, p0, LR1/b;->c:Z

    iput-boolean v1, p0, LR1/b;->f:Z

    iput v0, p0, LR1/b;->g:F

    neg-float v0, v0

    iput v0, p0, LR1/b;->h:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LR1/b;->i:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LR1/b;->k:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LR1/b;->l:Ljava/util/ArrayList;

    iput-object p1, p0, LR1/b;->d:Ljava/lang/Object;

    iput-object p2, p0, LR1/b;->e:LR1/c;

    sget-object p1, LR1/b;->r:LR1/b$p;

    if-eq p2, p1, :cond_4

    sget-object p1, LR1/b;->s:LR1/b$p;

    if-eq p2, p1, :cond_4

    sget-object p1, LR1/b;->t:LR1/b$p;

    if-ne p2, p1, :cond_0

    goto :goto_2

    :cond_0
    sget-object p1, LR1/b;->x:LR1/b$p;

    const/high16 v0, 0x3b800000    # 0.00390625f

    if-ne p2, p1, :cond_2

    :cond_1
    :goto_0
    iput v0, p0, LR1/b;->j:F

    goto :goto_3

    :cond_2
    sget-object p1, LR1/b;->p:LR1/b$p;

    if-eq p2, p1, :cond_1

    sget-object p1, LR1/b;->q:LR1/b$p;

    if-ne p2, p1, :cond_3

    goto :goto_0

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_1
    iput p1, p0, LR1/b;->j:F

    goto :goto_3

    :cond_4
    :goto_2
    const p1, 0x3dcccccd    # 0.1f

    goto :goto_1

    :goto_3
    return-void
.end method

.method private b(Z)V
    .locals 2

    .prologue
    const/4 p1, 0x0

    iput-boolean p1, p0, LR1/b;->f:Z

    invoke-static {}, LR1/a;->d()LR1/a;

    move-result-object v0

    invoke-virtual {v0, p0}, LR1/a;->g(LR1/a$b;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LR1/b;->i:J

    iput-boolean p1, p0, LR1/b;->c:Z

    :goto_0
    iget-object v0, p0, LR1/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, LR1/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LR1/b;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    iget-object p1, p0, LR1/b;->k:Ljava/util/ArrayList;

    invoke-static {p1}, LR1/b;->f(Ljava/util/ArrayList;)V

    return-void
.end method

.method private c()F
    .locals 2

    iget-object v0, p0, LR1/b;->e:LR1/c;

    iget-object v1, p0, LR1/b;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1}, LR1/c;->a(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method private static f(Ljava/util/ArrayList;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private j()V
    .locals 3

    .prologue
    iget-boolean v0, p0, LR1/b;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, LR1/b;->f:Z

    iget-boolean v0, p0, LR1/b;->c:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, LR1/b;->c()F

    move-result v0

    iput v0, p0, LR1/b;->b:F

    :cond_0
    iget v0, p0, LR1/b;->b:F

    iget v1, p0, LR1/b;->g:F

    cmpl-float v1, v0, v1

    if-gtz v1, :cond_1

    iget v1, p0, LR1/b;->h:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, LR1/a;->d()LR1/a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p0, v1, v2}, LR1/a;->a(LR1/a$b;J)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Starting value need to be in between min value and max value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 4

    .prologue
    iget-wide v0, p0, LR1/b;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iput-wide p1, p0, LR1/b;->i:J

    iget p1, p0, LR1/b;->b:F

    invoke-virtual {p0, p1}, LR1/b;->g(F)V

    return v3

    :cond_0
    sub-long v0, p1, v0

    iput-wide p1, p0, LR1/b;->i:J

    invoke-virtual {p0, v0, v1}, LR1/b;->k(J)Z

    move-result p1

    iget p2, p0, LR1/b;->b:F

    iget v0, p0, LR1/b;->g:F

    invoke-static {p2, v0}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, LR1/b;->b:F

    iget v0, p0, LR1/b;->h:F

    invoke-static {p2, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, LR1/b;->b:F

    invoke-virtual {p0, p2}, LR1/b;->g(F)V

    if-eqz p1, :cond_1

    invoke-direct {p0, v3}, LR1/b;->b(Z)V

    :cond_1
    return p1
.end method

.method d()F
    .locals 2

    iget v0, p0, LR1/b;->j:F

    const/high16 v1, 0x3f400000    # 0.75f

    mul-float/2addr v0, v1

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LR1/b;->f:Z

    return v0
.end method

.method g(F)V
    .locals 2

    .prologue
    iget-object v0, p0, LR1/b;->e:LR1/c;

    iget-object v1, p0, LR1/b;->d:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, LR1/c;->b(Ljava/lang/Object;F)V

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, LR1/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, LR1/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LR1/b;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    iget-object p1, p0, LR1/b;->l:Ljava/util/ArrayList;

    invoke-static {p1}, LR1/b;->f(Ljava/util/ArrayList;)V

    return-void
.end method

.method public h(F)LR1/b;
    .locals 0

    iput p1, p0, LR1/b;->b:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LR1/b;->c:Z

    return-object p0
.end method

.method public i()V
    .locals 2

    .prologue
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LR1/b;->f:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, LR1/b;->j()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Animations may only be started on the main thread"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method abstract k(J)Z
.end method
