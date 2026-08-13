.class public final LH/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LH/w;

.field private final b:LN/F;

.field private final c:LS0/V;

.field private final d:Z

.field private final e:Z

.field private final f:LN/I;

.field private final g:LS0/L;

.field private final h:LH/Y;

.field private final i:LH/i;

.field private final j:LH/q;

.field private final k:Lx7/l;

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/L;->a:LH/w;

    iput-object p2, p0, LH/L;->b:LN/F;

    iput-object p3, p0, LH/L;->c:LS0/V;

    iput-boolean p4, p0, LH/L;->d:Z

    iput-boolean p5, p0, LH/L;->e:Z

    iput-object p6, p0, LH/L;->f:LN/I;

    iput-object p7, p0, LH/L;->g:LS0/L;

    iput-object p8, p0, LH/L;->h:LH/Y;

    iput-object p9, p0, LH/L;->i:LH/i;

    iput-object p10, p0, LH/L;->j:LH/q;

    iput-object p11, p0, LH/L;->k:Lx7/l;

    iput p12, p0, LH/L;->l:I

    return-void
.end method

.method public synthetic constructor <init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;IILy7/k;)V
    .locals 23

    .prologue
    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    new-instance v1, LS0/V;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LS0/V;-><init>(Ljava/lang/String;JLM0/N;ILy7/k;)V

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v13, v1

    goto :goto_1

    :cond_1
    move/from16 v13, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v14, v1

    goto :goto_2

    :cond_2
    move/from16 v14, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    sget-object v1, LS0/L;->a:LS0/L$a;

    invoke-virtual {v1}, LS0/L$a;->a()LS0/L;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_3

    :cond_3
    move-object/from16 v16, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move-object/from16 v17, v1

    goto :goto_4

    :cond_4
    move-object/from16 v17, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    invoke-static {}, LH/s;->a()LH/q;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_5

    :cond_5
    move-object/from16 v19, p10

    :goto_5
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    sget-object v0, LH/L$a;->D:LH/L$a;

    move-object/from16 v20, v0

    goto :goto_6

    :cond_6
    move-object/from16 v20, p11

    :goto_6
    const/16 v22, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v15, p6

    move-object/from16 v18, p9

    move/from16 v21, p12

    invoke-direct/range {v9 .. v22}, LH/L;-><init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;ILy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;ILy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p12}, LH/L;-><init>(LH/w;LN/F;LS0/V;ZZLN/I;LS0/L;LH/Y;LH/i;LH/q;Lx7/l;I)V

    return-void
.end method

.method public static final synthetic a(LH/L;LS0/i;)V
    .locals 0

    invoke-direct {p0, p1}, LH/L;->e(LS0/i;)V

    return-void
.end method

.method public static final synthetic b(LH/L;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, LH/L;->f(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic c(LH/L;)I
    .locals 0

    iget p0, p0, LH/L;->l:I

    return p0
.end method

.method public static final synthetic d(LH/L;)Lx7/l;
    .locals 0

    iget-object p0, p0, LH/L;->k:Lx7/l;

    return-object p0
.end method

.method private final e(LS0/i;)V
    .locals 0

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LH/L;->f(Ljava/util/List;)V

    return-void
.end method

.method private final f(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, LH/L;->a:LH/w;

    invoke-virtual {v0}, LH/w;->n()LS0/k;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    new-instance v1, LS0/n;

    invoke-direct {v1}, LS0/n;-><init>()V

    const/4 v2, 0x0

    invoke-interface {p1, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, LS0/k;->b(Ljava/util/List;)LS0/V;

    move-result-object p1

    iget-object v0, p0, LH/L;->k:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final g(Lx7/l;)V
    .locals 5

    .prologue
    new-instance v0, LN/E;

    iget-object v1, p0, LH/L;->c:LS0/V;

    iget-object v2, p0, LH/L;->g:LS0/L;

    iget-object v3, p0, LH/L;->a:LH/w;

    invoke-virtual {v3}, LH/w;->j()LH/V;

    move-result-object v3

    iget-object v4, p0, LH/L;->f:LN/I;

    invoke-direct {v0, v1, v2, v3, v4}, LN/E;-><init>(LS0/V;LS0/L;LH/V;LN/I;)V

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LN/b;->u()J

    move-result-wide v1

    iget-object p1, p0, LH/L;->c:LS0/V;

    invoke-virtual {p1}, LS0/V;->h()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LM0/N;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LN/b;->e()LM0/d;

    move-result-object p1

    iget-object v1, p0, LH/L;->c:LS0/V;

    invoke-virtual {v1}, LS0/V;->f()LM0/d;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, LH/L;->k:Lx7/l;

    invoke-virtual {v0}, LN/E;->Z()LS0/V;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private final m(Landroid/view/KeyEvent;)LS0/a;
    .locals 2

    .prologue
    invoke-static {p1}, LH/N;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LH/L;->i:LH/i;

    invoke-virtual {v0, p1}, LH/i;->a(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p1}, LH/B;->a(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LS0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LS0/a;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final h()LN/F;
    .locals 1

    iget-object v0, p0, LH/L;->b:LN/F;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LH/L;->e:Z

    return v0
.end method

.method public final j()LH/w;
    .locals 1

    iget-object v0, p0, LH/L;->a:LH/w;

    return-object v0
.end method

.method public final k()LH/Y;
    .locals 1

    iget-object v0, p0, LH/L;->h:LH/Y;

    return-object v0
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    invoke-direct {p0, p1}, LH/L;->m(Landroid/view/KeyEvent;)LS0/a;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, LH/L;->d:Z

    if-eqz p1, :cond_0

    invoke-direct {p0, v0}, LH/L;->e(LS0/i;)V

    iget-object p1, p0, LH/L;->f:LN/I;

    invoke-virtual {p1}, LN/I;->b()V

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    invoke-static {p1}, Lx0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v3, Lx0/c;->a:Lx0/c$a;

    invoke-virtual {v3}, Lx0/c$a;->a()I

    move-result v3

    invoke-static {v0, v3}, Lx0/c;->e(II)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, LH/L;->j:LH/q;

    invoke-interface {v0, p1}, LH/q;->a(Landroid/view/KeyEvent;)LH/o;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LH/o;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LH/L;->d:Z

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    iput-boolean v1, v0, Ly7/K;->C:Z

    new-instance v1, LH/L$b;

    invoke-direct {v1, p1, p0, v0}, LH/L$b;-><init>(LH/o;LH/L;Ly7/K;)V

    invoke-direct {p0, v1}, LH/L;->g(Lx7/l;)V

    iget-object p1, p0, LH/L;->h:LH/Y;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LH/Y;->a()V

    :cond_4
    iget-boolean p1, v0, Ly7/K;->C:Z

    return p1

    :cond_5
    :goto_1
    return v2
.end method
