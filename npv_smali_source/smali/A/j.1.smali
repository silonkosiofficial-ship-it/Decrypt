.class public final LA/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;
.implements LA/F;


# instance fields
.field private final a:LA/b$m;

.field private final b:Lh0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LA/b$m;Lh0/c$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/j;->a:LA/b$m;

    iput-object p2, p0, LA/j;->b:Lh0/c$b;

    return-void
.end method

.method public static final synthetic k(LA/j;LD0/X;LA/H;IILY0/v;)I
    .locals 0

    invoke-direct/range {p0 .. p5}, LA/j;->l(LD0/X;LA/H;IILY0/v;)I

    move-result p0

    return p0
.end method

.method private final l(LD0/X;LA/H;IILY0/v;)I
    .locals 1

    .prologue
    if-eqz p2, :cond_0

    invoke-virtual {p2}, LA/H;->a()LA/n;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result v0

    sub-int/2addr p3, v0

    invoke-virtual {p2, p3, p5, p1, p4}, LA/n;->a(ILY0/v;LD0/X;I)I

    move-result p1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LA/j;->b:Lh0/c$b;

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p1

    sub-int/2addr p3, p1

    const/4 p1, 0x0

    invoke-interface {p2, p1, p3, p5}, Lh0/c$b;->a(IILY0/v;)I

    move-result p1

    :goto_1
    return p1
.end method


# virtual methods
.method public a(LD0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, LA/x;->a:LA/x;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    invoke-interface {v1}, LA/b$m;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LA/x;->f(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 16

    invoke-static/range {p3 .. p4}, LY0/b;->m(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static/range {p3 .. p4}, LY0/b;->k(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v4

    move-object/from16 v15, p0

    iget-object v0, v15, LA/j;->a:LA/b$m;

    invoke-interface {v0}, LA/b$m;->a()F

    move-result v0

    move-object/from16 v6, p1

    invoke-interface {v6, v0}, LY0/e;->S0(F)I

    move-result v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v8, v0, [LD0/X;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/16 v13, 0xc00

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v14}, LA/G;->b(LA/F;IIIIILD0/M;Ljava/util/List;[LD0/X;II[IIILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
.end method

.method public c(LD0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, LA/x;->a:LA/x;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    invoke-interface {v1}, LA/b$m;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LA/x;->h(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public d(IIIIZ)J
    .locals 0

    invoke-static {p5, p1, p2, p3, p4}, LA/i;->b(ZIIII)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(LD0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, LA/x;->a:LA/x;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    invoke-interface {v1}, LA/b$m;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LA/x;->g(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA/j;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    iget-object v3, p1, LA/j;->a:LA/b$m;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LA/j;->b:Lh0/c$b;

    iget-object p1, p1, LA/j;->b:Lh0/c$b;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public f(I[I[ILD0/M;)V
    .locals 1

    iget-object v0, p0, LA/j;->a:LA/b$m;

    invoke-interface {v0, p4, p1, p2, p3}, LA/b$m;->b(LY0/e;I[I[I)V

    return-void
.end method

.method public g(LD0/X;)I
    .locals 0

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p1

    return p1
.end method

.method public h([LD0/X;LD0/M;I[III[IIII)LD0/K;
    .locals 8

    new-instance v7, LA/j$a;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p0

    move v3, p6

    move v4, p3

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, LA/j$a;-><init>([LD0/X;LA/j;IILD0/M;[I)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move v1, p6

    move v2, p5

    move-object v4, v7

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LA/j;->a:LA/b$m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LA/j;->b:Lh0/c$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i(LD0/X;)I
    .locals 0

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result p1

    return p1
.end method

.method public j(LD0/o;Ljava/util/List;I)I
    .locals 2

    sget-object v0, LA/x;->a:LA/x;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    invoke-interface {v1}, LA/b$m;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, LA/x;->e(Ljava/util/List;II)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColumnMeasurePolicy(verticalArrangement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA/j;->a:LA/b$m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalAlignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA/j;->b:Lh0/c$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
