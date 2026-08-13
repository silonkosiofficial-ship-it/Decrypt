.class public final LD0/b0;
.super LF0/J$f;
.source "SourceFile"


# static fields
.field public static final b:LD0/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/b0;

    invoke-direct {v0}, LD0/b0;-><init>()V

    sput-object v0, LD0/b0;->b:LD0/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "Undefined intrinsics block and it is required"

    invoke-direct {p0, v0}, LF0/J$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 11

    .prologue
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3, p4}, LY0/b;->n(J)I

    move-result v2

    invoke-static {p3, p4}, LY0/b;->m(J)I

    move-result v3

    sget-object v5, LD0/b0$a;->D:LD0/b0$a;

    :goto_0
    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    goto/16 :goto_3

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LD0/G;

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v0

    invoke-static {p3, p4, v0}, LY0/c;->i(JI)I

    move-result v2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v0

    invoke-static {p3, p4, v0}, LY0/c;->h(JI)I

    move-result v3

    new-instance v5, LD0/b0$b;

    invoke-direct {v5, p2}, LD0/b0$b;-><init>(LD0/X;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/G;

    invoke-interface {v4, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    move v1, v2

    move v3, v1

    :goto_2
    if-ge v2, p2, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/X;

    invoke-virtual {v4}, LD0/X;->I0()I

    move-result v5

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v4}, LD0/X;->w0()I

    move-result v4

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    invoke-static {p3, p4, v1}, LY0/c;->i(JI)I

    move-result v5

    invoke-static {p3, p4, v3}, LY0/c;->h(JI)I

    move-result v6

    new-instance v8, LD0/b0$c;

    invoke-direct {v8, v0}, LD0/b0$c;-><init>(Ljava/util/List;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    :goto_3
    return-object p1
.end method
